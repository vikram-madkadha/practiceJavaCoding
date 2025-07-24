package dev.lpa.javaPractice;

import java.util.HashSet;
import java.util.Set;

public class PairSumInArray {
    public static void main(String[] args) {
      sumPairsHash(new int[]{4,3,6,2,4,9,12,10}, 12);
        sumPairsHashLoop(new int[]{5,2,1,7,9,3,6,1,2,4}, 10);
    }
    //Efficient hashing O(n)
    public static void sumPairsHash(int[] arr, int target){
        Set<Integer> seen = new HashSet<>();
        Set<String> printPairs = new HashSet<>();
        for(int num : arr){
            int complement = target - num;
            if(seen.contains(complement)){
             printPairs.add("("+complement+","+num+")");
            }
            seen.add(num);
        }
        System.out.println("Pairs found are: " + printPairs.toString());
    }
    //Brute force O(n^2)
    public static void sumPairsHashLoop(int[] arr, int expectedSum){
     for(int i = 0; i< arr.length; i++){
         for(int j = i+1;j< arr.length; j++){
             if(arr[i]+arr[j] == expectedSum){
                 System.out.println("Pairs found: (" +arr[i]+ "," +arr[j]+ ")");
             }
         }
     }
    }

}
