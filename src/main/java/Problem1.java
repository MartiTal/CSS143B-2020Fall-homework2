public class Problem1 {

    /*
    In this algorithm, I will switch the number in the current spot of the array with the number in front of the last known location of said number.
    If this number has no last known location, I will switch the current number with the number at the end of the array.
    An exception to this is that I will switch a 1 with the number before the first 2 in the array provided a 2 has already been encountered.
    If the number is a 0, I will not touch it.
    This process will continue until a number does not move, that is to say I would be switching it with the position it is currently in.
     */

    // Do not change signature (function name, parameters type, and return type)
    public static void colorSort(int[] nums) {
        int oneGoesHere = nums.length-1;
        int twoGoesHere = nums.length-1;
        int temp;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (i == oneGoesHere) { //Stop when the 1 would be switched with its current location
                    break;
                }
                temp = nums[i];
                nums[i] = nums[oneGoesHere];
                nums[oneGoesHere] = temp;
                oneGoesHere--; //The next 1 will be placed at the position before where this one exists

            } else if (nums[i] == 2) {
                if (i == twoGoesHere) { //Stop when the 2 would be switched with its current location
                    break;
                }
                temp = nums[i];
                nums[i] = nums[twoGoesHere];
                nums[twoGoesHere] = temp;
                twoGoesHere--;
                oneGoesHere = twoGoesHere; //The next non-0 number belongs in this location, before the last 2 in the array.

            }
            //If the number at i is a 0, no further action is required.
        }
    }
}
