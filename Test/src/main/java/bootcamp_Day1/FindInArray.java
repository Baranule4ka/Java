package bootcamp_Day1;

public class FindInArray {
    static void main() {
        //Activity8
        System.out.println("Activity8");
        int[] nums = {10,9,11,9,5};
        int largest = nums[0];
        for (int i=1; i<nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }
        System.out.println("Largest number = " + largest);
    }
}
