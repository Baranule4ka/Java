package Bootcamp_day3_module7;
public class TryCatchFinallyActivity {
    public static void main(String[] args) {
        TryCatchFinallyActivity obj = new TryCatchFinallyActivity();
        obj.catchMeIfYouCan();
    }
    void catchMeIfYouCan() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println(arr[i]);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Oops! You tried to access an element that does not exist in the array.");
        } finally {
            System.out.println("This should get printed even if there is an exception");
        }
    }
}