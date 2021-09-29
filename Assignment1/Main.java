package com.company;

import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

       //Question1
/*       int[] nums={1,2,3,4,5};
        System.out.println(getUniqueSum(nums));*/

        //Question2
/*        int[] nums={-2,-1,2,2,3,5,7};
        nums=getSqureArray(nums);*/


        //Question3
/*        int[] nums={2,3,4,2,2,3,5,7};
        System.out.println(getFirstUniqueInt(nums));*/

        //Question4
/*        String s1="aa";
        String s2="aab";
        System.out.println(canBeConstructed(s1,s2));*/

        //Question5
/*        String str="A";
        System.out.println(IsLetAndDigCross(str));*/

    }

/*    Question 1:
    You are given an integer array nums. The unique elements of an array are the elements that
    appear exactly once in the array.
    Return the sum of all the unique elements of nums*/

    public  static  int getUniqueSum(int[] nums)
    {
        if (nums == null || nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];

        HashMap<Integer,Integer> map= new HashMap<>();
        for(int num:nums){
            if (map.containsKey(num))
                map.replace(num,map.get(num)+1);
            else
                map.put(num,1);
        }
        int sum=0;
        for (int key: map.keySet()){
            if (map.get(key)==1)
                sum+=key;
        }
        return sum;
    }

/*    //Question2
    Given an integer array nums sorted in non-decreasing order, return an array of the squares of each
    number sorted in non-decreasing order*/
   public  static  int[] getSqureArray(int[] nums){
          int[] result=new int[nums.length];
          for(int i=0; i<nums.length; i++)
              result[i]=nums[i]*nums[i];
          Arrays.sort(result);
          return  result;
   }

   public  static  <T> void printarr(T[] arr){
       for(T value:arr)
           System.out.println(value+",");
   }

    //Question3
//    Find first non repeated integer in an array.
    public static  int getFirstUniqueInt(int[] nums){
       for(int i=0; i<nums.length; i++ ){
           int num=nums[i];
           boolean bUnique=true;
           for(int j=i+1; j<nums.length;j++){
               if (nums[j]==num){
                   bUnique=false;
                   break;}
           }
           if (bUnique)
              return num;
       }
       return Integer.MIN_VALUE;
    }

    //Question 4:
  /*   Given two stings ransomNote  and magazine, returntrueifransomNotecan be constructed from
  magazineandfalseotherwise. Each letter inmagazinecan only be used once inransomNote.
    */

    public static  boolean canBeConstructed(String  ransomNote, String  magazine){
        if (ransomNote.length()>magazine.length())
            return false;
        int[] cntletters=new int[26];
        char[] charsOfNote=ransomNote.toLowerCase().toCharArray();
        char[] charsOfMag=magazine.toLowerCase().toCharArray();
        for (char ch : charsOfMag)
            cntletters[ch-'a']++;
        for (char ch : charsOfNote)
            cntletters[ch-'a']--;
        for( int cnt:cntletters)
            if (cnt<0){
                return false;}
        return true;
    }

//    Question 5:
/*
  Letter followed by Digit: Given a string str write a function which will check
  if the stringno letter followed by another letter, and no digit followed by another digit.
*/
    public static boolean IsLetAndDigCross(String str){
        char ch;
        char nextch;
        for(int i=0; i<str.length()-1;i++) {
            ch = str.charAt(i);
            nextch = str.charAt(i + 1);
            if (Character.isLetter(ch) ==! Character.isDigit(nextch))
                return false;
        }
        return  true;
    }

}
