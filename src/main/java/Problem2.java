public class Problem2 {

    /*
    This algorithm starts with the first number in the array and compares it to each other number as it passes through.
    When it encounters a larger number, it will do three things.
    1. The new, larger number will be saved for future comparisons (this works because we assume the array is sorted).
    2. Starting with index 1, the array will be overwritten with each new number.
    3. The numeric value representing the length of the new array, aka the total number of unique numbers, will be incremented.
     */

    // Do not change signature (function name, parameters and return type)
    // Do not use extra space for another array. Solution to be in-pace with O(1) extra memory
    public static int remove(int[] nums) {

        if (nums == null) {
            return -1;
        } else if (nums.length == 0) {
            return 0;
        }

        int newlength = 1; //The length of the "new" array
        int biggest = nums[0]; //Keeps track of the largest number encountered in the array for comparison reasons

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > biggest) { //When a new number is found in the array, save it and then alter the array
                biggest = nums[i];
                nums[newlength] = nums[i]; //The newlength variable is also handy for keeping track of the next index to replace
                newlength++; //The length of the new array increases with every new unique number
            }
        }
        return newlength;
    }
}
