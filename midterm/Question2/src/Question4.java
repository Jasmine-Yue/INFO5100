public class Question4 {

    public  String getLongestSubstring(String s){
        int[] chars= new int[128];
        int left=0;
        int right=0;
        int maxlen=0;
        int startIndex=0;
        while(  right<s.length()){

            char ch=s.charAt(right);
            chars[ch]++;
            if (chars[ch]>1){
                if (maxlen<(right-left)) {
                    maxlen = right - left;
                    startIndex=left;
                }
                left++;
                char chl=s.charAt(left);
                chars[chl]--;
                while(chars[ch]>1){
                    left++;
                    chl=s.charAt(left);
                    chars[chl]--;
                }
            }

            right++;
        }
        if (maxlen<(right-left)) {
            maxlen = right - left;
            startIndex=left;
        }
        return s.substring(startIndex,startIndex+maxlen);
    }
}

