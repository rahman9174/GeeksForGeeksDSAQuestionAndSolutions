package ArrayDuplicateNumbersSolution;

/*Problem statements :
        Given an array arr of integers, find all the elements that occur more than once in the array. Return the result in ascending order. If no element repeats, return an empty array.

        Examples:

        Input: arr[] = [2, 3, 1, 2, 3]
        Output: [2, 3]
        Explanation: 2 and 3 occur more than once in the given array.

        Input: arr[] = [0, 3, 1, 2]
        Output: []
        Explanation: There is no repeating element in the array, so the output is empty.

        Input: arr[] = [2]
        Output: []
        Explanation: There is single element in the array. Therefore output is empty.

        Constraints:
        1 <= arr.size() <= 106
        0 <= arr[i] <= 106
        Note :
        Time Complexity: O(n log n)
        Space Complexity: O(1)
*/

class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        // code here
        Arrays.sort(arr);
        List<Integer> duplicateList = new ArrayList<>();

        // Sort the array
        Arrays.sort(arr);

        // Traverse the sorted array to find duplicates
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                // Avoid adding duplicate duplicates
                if (duplicateList.isEmpty() || duplicateList.get(duplicateList.size() - 1) != arr[i]) {
                    duplicateList.add(arr[i]);
                }
            }
        }
        return duplicateList;
    }
}
