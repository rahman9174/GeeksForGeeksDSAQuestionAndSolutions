package MissingNumberInArray;

//question
//You are given an array arr of size n - 1 that contains distinct integers in the range from 1 to n (inclusive).
//This array represents a permutation of the integers from 1 to n with one element missing. Your task is to identify
//and return the missing element.

//        Examples:
//
//        Input: arr[] = [1, 2, 3, 5]
//        Output: 4
//        Explanation: All the numbers from 1 to 5 are present except 4.

//        Input: arr[] = [8, 2, 4, 5, 3, 7, 1]
//        Output: 6
//        Explanation: All the numbers from 1 to 8 are present except 6.

//        Input: arr[] = [1]
//        Output: 2
//        Explanation: Only 1 is present so the missing element is 2.

// User function Template for Java
class Solution {
    int missingNumber(int arr[]) {
        // code here
        int flag = 0;
        int n =  1;  // for checking the  value from 1 to n
        Arrays.sort(arr); // sorting array
        int count = 0;
        int missingNumber = 1; // to track the missing number

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        // insert the array into arraylist
        for(int i = 0 ; i < arr.length ; i++){
            arrayList.add(arr[i]);
            count++;
        }
        // add one more item, as mentioned the array size is arr[i] <= arr.size()+1,
        // adding one more element in the arraylist
        arrayList.add(arr[count-1]+1);

        for(int i = 0 ; i < arr.length ; i++){
            if(n == arrayList.get(i)){
                flag = 0;
                n++;
            }
            else{
                flag = 1;
                missingNumber = arrayList.get(i)-1;
                break;
            }
        }
        if(flag ==  1){
            return missingNumber;
        }
        else{
            return  arrayList.get(n-1);
        }
    }
}