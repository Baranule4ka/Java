package bootcamp_Day1;

public class NumToWords {
    static void main() {
        //Activity4
        System.out.println("Activity4");
        int numb = 5;
        String word;
        switch (numb) {
            case 1:
                word = "One";
                break;
            case 2:
                word = "Two";
                break;
            case 3:
                word = "Three";
                break;
            case 4:
                word = "Four";
                break;
            case 5:
                word = "Five";
                break;
            case 6:
                word = "Six";
                break;
            case 7:
                word = "Seven";
                break;
            case 8:
                word = "Eight";
                break;
            case 9:
                word = "Nine";
                break;
            case 10:
                word = "Ten";
                break;
            default:
                word = "Invalid number";

        }
        System.out.println(word);
    }
}
