package MazimumSumOfSubArrayWithKadanesAlgoritham;

// User function Template for Java
//----------------------------------------------------------------------------------------------
//question:
//Given an integer array arr[]. You need to find the maximum sum of a subarray.
//
//        Examples:
//
//        Input: arr[] = [2, 3, -8, 7, -1, 2, 3]
//        Output: 11
//        Explanation: The subarray {7, -1, 2, 3} has the largest sum 11.

//        Input: arr[] = [-2, -4]
//        Output: -2
//        Explanation: The subarray {-2} has the largest sum -2.

//        Input: arr[] = [5, 4, 1, 7, 8]
//        Output: 25
//        Explanation: The subarray {5, 4, 1, 7, 8} has the largest sum 25.
//----------------------------------------------------------------------------------------------
class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] arr) {

        // Your code here
        int max = arr[0];
        int sum = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            // int sum =  0;
            sum =  Math.max(arr[i], sum + arr[i]);
            max = Math.max(max, sum);

            // for(int j =  i ; j < arr.length ; j++){
            //     for(int x = j ; x < j+1 ; x++){
            //         sum = sum + arr[x];
            //     }
            //     // sum = sum + (arr[j]);
            //     if(sum>max){
            //     max = sum;
            //     }
            // }

        }
        return max;
    }
}
