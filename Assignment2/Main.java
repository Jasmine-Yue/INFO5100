package com.company;

import org.w3c.dom.ls.LSOutput;

import java.math.BigInteger;
import java.sql.SQLOutput;
import java.util.*;


//20211007 DCL 7,9,10(M)   7，8 easy  9，10 medium， 9 不确定做完了吗
public class Main {
        public static void main(String[] args) {



        //Test Question-Leetcode 1:Transpose Matrix
        int[][] matrix= {{1,2,3},{4,5,6}}  ;   //{{1,2,3},{4,5,6},{7,8,9}};
        int[][] tranMatrix=transpose(matrix);
        System.out.println(Arrays.deepToString(tranMatrix));

        //Test Question-Leetcode 2: shortest Word Distance
/*
        String[] wordsDict={"practice", "makes", "perfect", "coding", "makes"};
        String word1= "makes";
        String word2="coding";
        int dist=getShortestDist(wordsDict, word1, word2);
        System.out.println(dist);
*/


            //Test Question-Leetcode 3 :Move Zeroes
/*        int[] nums={1,0};
        moveZeroes(nums);
        printarr(nums);*/

/*        //Test Question-Leetcode 4:Rotate Image
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        rotate( matrix);
        System.out.println(Arrays.deepToString(matrix));*/

/*        //Test Question-Leetcode 5:Spiral Matrix
        int[][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> list=spiralOrder(matrix);
        System.out.println(list);*/

/*        //Test Question-Leetcode 6:Isomorphic Strings
        String word1 = "paper";
        String word2 = "title";
        System.out.println(isIsomorphic(word1, word2));*/


        //Test Question-Leetcode 7:   415.Add Strings DCL
            System.out.println(addStrings("6","501"));

     //Test Question-Leetcode 8:   125.Valid Palindrome
            System.out.println( isPalindrome(",.") );

      //Test Question-Leetcode 9: reverse words in a string
/*            String s = "  hello world  ";
            System.out.println(reverseWords(s));*/

            //Test Question-Leetcode 10: 443 reverse words in a string DCL
/*            char[] chars={'a','b','b','b','b','b','b','b','b','b','b','b','b'};
            int i=compress( chars) ;
            System.out.println(i);
            System.out.println(chars);*/
        }

    //Test Question-Leetcode 10:443. String Compression

        public static void printarr(int[] nums) {
            for (int i : nums)
                System.out.println(i);
        }

//Assignment2-Question-Leetcode1: 867. Transpose Matrix(easy)
//Time complexity: O(M*N)   Space complexity:O(M*N)


        public static int[][] transpose(int[][] matrix) {
            int m = matrix.length;
            int n = matrix[0].length;
            int[][] tranMatrix = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++)
                    tranMatrix[i][j] = matrix[j][i];
            }
            return tranMatrix;
        }


 //Assignment2-Question-Leetcode 2: 243. shortest Word Distance(easy)
    // Time complexity: O(n)   Space complexity:O(1)

        public static int getShortestDist(String[] wordsDict, String word1, String word2) {
            int i = -1;
            int j = -1;
            int minDistance = wordsDict.length;
            int[] posj;
            for (int k = 0; k < wordsDict.length; k++) {
                if (wordsDict[k] == word1)
                    i = k;
                if (wordsDict[k] == word2)
                    j = k;
                if (i != -1 && j != -1)
                    minDistance = Math.min(Math.abs(i - j), minDistance);
            }
            return minDistance;
        }


 //Assignment2-Question-Leetcode 3: 283.Move Zeroes
    // Time complexity: O(n)   Space complexity: O(1)


        public static void moveZeroes(int[] nums) {
            int posNonzero = 0;
            for (int num : nums) {
                if (num != 0)
                    nums[posNonzero++] = num;
            }
            while (posNonzero < nums.length)
                nums[posNonzero++] = 0;

        }

//  Assignment2-Question-Leetcode 4: leetcode 48. Rotate Image(Medium)
//  Time complexity: O(n*n)    Space complexity: O(1)

        public static void rotate(int[][] matrix) {
            int temp;
            for (int i = 0; i < matrix.length; i++)
                for (int j = 0; j < (i + 1) / 2; j++) {
                    temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            for (int i = 0; i < matrix.length; i++) {
                temp = matrix[i][0];
                matrix[i][0] = matrix[i][matrix.length - 1];
                matrix[i][matrix.length - 1] = temp;
            }
        }

//  Assignment2-Question-Leetcode 5: leetcode 54 Spiral Matrix
//  Time complexity:  O(M*N)   Space complexity:(1)

        public static List<Integer> spiralOrder(int[][] matrix) {
            if (matrix == null)
                return null;
            List<Integer> list = new LinkedList<>();
            int top = 0;
            int down = matrix.length - 1;
            int left = 0;
            int right = matrix[0].length - 1;
            while (top <= down && left <= right) {
                if (left > right)
                    break;
                else {
                    for (int j = left; j <= right; j++)
                        list.add(matrix[top][j]);
                    top++;
                }
                if (top > down)
                    break;
                else {
                    for (int i = top; i <= down; i++)
                        list.add(matrix[i][right]);
                    right--;
                }
                if (left > right)
                    break;
                else {
                    for (int j = right; j >= left; j--)
                        list.add(matrix[down][j]);
                    down--;
                }
                if (top > down)
                    break;
                else {
                    for (int i = down; i >= top; i--)
                        list.add(matrix[i][left]);
                    left++;
                }

            }
            return list;
        }


//  Assignment2-Question-Leetcode 6:  leetcode 205 Isomorphic Strings
//  Time complexity: O(n)    Space complexity: O(n)

        public static boolean isIsomorphic(String s, String t) {
            if (s.length() != t.length())
                return false;
            if (s.length() <= 1)
                return true;
            Character ch1, ch2;
            Map<Character, Character> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                ch1 = s.charAt(i);
                ch2 = t.charAt(i);
                if (map.containsKey(ch1)) {  // occured before, but maping is difference
                    if (map.get(ch1) != ch2) {
                        return false;
                    }
                } else {                        //not occured before, but mapping is same
                    if (map.containsValue(ch2))
                        return false;
                    map.put(ch1, ch2);
                }
            }
            return true;
        }


    //    Assignment2-Question-Leetcode 7: 415Add Strings
    //  Time complexity: O(n)    Space complexity:O(n)   n is max Length of num1,num2
    public static String addStrings(String num1, String num2) {
        int i=num1.length()-1;
        int j=num2.length()-1;
        StringBuilder builder = new StringBuilder();
        int carry=0;
        while(i>=0 || j>=0){
            int a= i>=0? Character.getNumericValue(num1.charAt(i)):0;
            int b= j>=0?Character.getNumericValue(num2.charAt(j)):0;
            int sum=a+b+carry;
            if (sum%10>=1){
                carry=sum/10;
                sum=sum%10;
            }
            else
                carry=0;
            builder.append(sum);
            i--;
            j--;
        }

        if (carry>0)
            builder.append(carry);
        return builder.reverse().toString();

    }

    //Assignment2-Question-Leetcode 8: 125.Valid Palindrome
    // Time complexity: O(n)    Space complexity: O(1)


    public static boolean isPalindrome(String s) {

        for(int i=0,j=s.length()-1; i<j;i++,j--){
            while( i<j  && !Character.isLetterOrDigit(s.charAt(i))  ){
                i++;

            }
            while(i<j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }

            if (   Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j)))
                return false;
        }
        return  true;
    }



  //  Assignment2-Question-Leetcode 9:   151. Reverse Words in a String
    //  Time complexity: O(n)    Space complexity: O(n)

    public static  String reverseWords(String s) {
            String[] words=(s.trim()).split("\\s+");
            String result="";
            for(int index= words.length-1;index>=0; index--) {
                if (result.length() > 0)
                    result += " ";
                result += words[index];
            }
            return  result;
    }

    //other approaches:
/*
    public static  String reverseWords1(String s) {
        List<String> list= Arrays.asList((s.trim()).split("\\s+"));
        Collections.reverse(list);
        return  String.join(" ",list);
    }

    public static  String reverseWords2(String s) {

            Deque<String> deque= new LinkedList<>();
            int left=0;
            int right=s.length()-1;
            while(left<=right && s.charAt(left)==' ')
                left++;
            while(left<=right && s.charAt(right)==' ')
                right--;
            int i=left;
            while(i<=right){
                while (s.charAt(i)==' ')
                    i++;
                left=i;
                while (s.charAt(i)!=' ')
                    i++;
                deque.addLast(s.substring(left,i));
            }
            String result="";
            while(deque.isEmpty()!=true){
                if (result.length()>0)
                    result+=" ";
                result+=deque.removeLast();
            }
            return  result;
    }*/


  // Assignment2-Question-Leetcode 10: 443. String Compression
  // Time complexity: O(n)    Space complexity: O(1)
    public static int compress(char[] chars) {

        if (chars.length<=1)
            return chars.length;
        int index=0;
        int i=0;
        int count;
        while(i<chars.length){
            if (i<chars.length)
                chars[index++]=chars[i];
            count=0;
            while(chars[i]==chars[index-1]){
                count++;
                i++;
                if (i==chars.length)
                    break;
            }
            if (count>1) {
                for (char ch : Integer.toString(count).toCharArray()) {
                    chars[index++] = ch;
                }
            }
        }
        return index;
    }



}// end of class
