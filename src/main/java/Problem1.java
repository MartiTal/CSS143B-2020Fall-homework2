public class Problem1 {

    /*
    In this algorithm, I will switch a non-zero number in the current spot of the array with the number in front of the last known location of said number.
    If this number has no last known location, I will switch the current number with the number at the end of the array.
    An exception to this is that I will switch a "1" with the number before the first "2" in the array provided a "2" has already been encountered.
    This process will continue until a number does not move (or would move backwards), that is to say I would be switching it with the position it either is currently in or behind it.
     */

    // Do not change signature (function name, parameters type, and return type)
    public static void colorSort(int[] nums) {
        int oneGoesHere = nums.length-1;
        int twoGoesHere = nums.length-1;
        int temp;
        int i = 0; //Index value as we pass through the array

        while (i < nums.length) { //I switched to using a while loop, because incrementing at the end of every loop did not work well for this strategy.
            if (nums[i] == 1) {
                if (i >= oneGoesHere) { //Stop if the 1 would be switched with its current location or a location behind it
                    return;
                }
                temp = nums[i];
                nums[i] = nums[oneGoesHere];
                nums[oneGoesHere] = temp;
                oneGoesHere--; //The next 1 will be placed at the position before where this one exists


            } else if (nums[i] == 2) {
                if (i >= twoGoesHere) { //Stop if the 2 would be switched with its current location or a location behind it
                    return;
                }
                temp = nums[i];
                nums[i] = nums[twoGoesHere];
                nums[twoGoesHere] = temp;
                twoGoesHere--;
                oneGoesHere = twoGoesHere; //The next non-0 number belongs in this location, before the last 2 in the array.


            } else { //If this number is a 0, move to the next number in the array.
                i++;
            }

        }
    }
}
