import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num = console.nextInt();
        int i = 1;
        int result = 0;

        while(i <= num){
            result+=i;
            i++;
        }
        System.out.println(result);
    }
}