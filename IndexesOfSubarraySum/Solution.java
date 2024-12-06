package IndexesOfSubarraySum;

//Given an unsorted array arr containing only non-negative integers, your task is to find a continuous subarray (a contiguous
//sequence of elements) whose sum equals a specified value target. You need to return the 1-based indices of the leftmost and
//rightmost elements of this subarray.
//examples:
//1
//Input: arr[] = [1,2,3,7,5], target = 12
//Output: [2, 4]
//Explanation: The sum of elements from 2nd to 4th position is 12.

//2
//Input: arr[] = [1,2,3,4,5,6,7,8,9,10], target = 15,
//Output: [1, 5]
//Explanation: The sum of elements from 1st to 5th position is 15.

//3
//Input: arr[] = [7,2,1], target = 2
//Output: [2, 2]
//Explanation: The sum of elements from 2nd to 2nd position is 2.

//4
//Input: arr[] = [5,3,4], target = 2
//Output: [-1]
//Explanation: There is no subarray with sum 2.
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i = 0 ; i < arr.length ; i++){
            int sum = arr[i];
            if(arr[i] == target){
                result.add(i+1);
                result.add(i+1);
                return result;
            }
            for(int j = i+1 ; j <arr.length ; j++){
                sum = sum + arr[j];
                if(sum<=target){
                    if(sum == target){
                        result.add(i+1);
                        result.add(j+1);
                        return result;
                    }
                }
            }
        }
        result.add(-1);
        return result;
    }
}
