import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int exit = 0;
        while (exit != 1) {
            Scanner console = new Scanner(System.in);
            System.out.println("Enter the first number: ");
            int a = console.nextInt();
            System.out.println("Enter the second number: ");
            int b = console.nextInt();
            System.out.println(a + " * " + b + " = " + a * b);
            System.out.println("If you want to end the program, enter 1, else another number: ");
            exit = console.nextInt();
        }
    }
}