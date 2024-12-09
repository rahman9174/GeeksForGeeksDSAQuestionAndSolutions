// User function Template for Java

class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        if(arr.length < 2){
            return -1;
        }
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]>max){
                secMax =  max;
                max = arr[i];
            }
            else if(secMax < arr[i] && arr[i] != max){
                secMax = arr[i];
            }

        }
        if(secMax == Integer.MIN_VALUE){
            return -1;
        }
        return secMax;
    }
}