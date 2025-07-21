package two_sum.optimize;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    //Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to
    // target.You may assume that each input would have exactly one solution, and you may not use the same element twice.

    public static int[] getResult(int [] nums,int target){
      Map<Integer,Integer> map = new HashMap<>();
    
        for(int i=0;i<nums.length;i++){
          int diff = target -nums[i];
        
          if (map.containsKey(nums[i])) {
            return new int[] {map.get(nums[i]),i};
          }
          map.put(diff, i);
        }

        return new  int[] {-1,-1};
        
    }

    public static void main(String[] args) {
        int [] nums = {1,8,15,2,5};
        int target = 10;
        System.out.println("nums-"+target);

       int[] result = getResult(nums,target);

       System.out.println("result- index 1 = "+result[0]+" , index 2 = "+result[1]);

    }
}

//Time Complexity O(n)  because single loop 
// space complexity because O(n) 