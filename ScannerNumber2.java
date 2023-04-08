package HomeWork;

import java.util.Scanner;

public class ScannerNumber2 {
    public static void main(String[] args) {

        // number - целое число
        // n - степень возведения
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter pls number : ");
        int number = sc.nextInt();
        System.out.println("You´ve entered" + number);
        System.out.print("short way 10->2= " + Integer.toBinaryString(number));


        System.out.println("You´ve entered bynarnynumber");

       sc.close();
    }
}
