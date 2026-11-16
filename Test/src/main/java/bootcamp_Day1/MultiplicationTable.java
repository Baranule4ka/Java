package bootcamp_Day1;

public class MultiplicationTable {
    static void main() {
    //Activity6
        System.out.println("Activity6");
        for (int i = 11; i <=20; i++){
        System.out.println("Multiplication table of " + i);
        for (int j = 1; j <=10; j++){
            System.out.println(i + " x " + j + " = " + (i * j));
        }
        System.out.println();
    }
}
}