import java.util.HashMap;
import java.util.Map;

public class Question3 {

    public  int getRepeatedSum(int[] nums){
        int ans=0;
        if (nums==null || nums.length==0)
            return ans;

        Map<Integer, Integer> map=new HashMap<>();
        for(int num:nums){
            if (!map.containsKey(num)){
                map.put(num,1);
            }
            else{
                map.put(num,map.get(num)+1);
            }
        }
        for( int num: map.keySet()){
           if (map.get(num)>1)
               ans+=num;
        }
        return  ans;
    }
}
