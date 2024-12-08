package MissingNumberInArray;

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