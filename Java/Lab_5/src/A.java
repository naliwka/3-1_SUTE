import java.util.Scanner;

class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int counter = 1;
        boolean pin_code_coincided;
        String correct = sc.nextLine();
        while (true){
            if(counter > 5){
                pin_code_coincided = false;
                break;
            }
            System.out.print("Enter the pin code: ");
            String vasya = sc.nextLine();

            if(correct.equals(vasya)){
                System.out.println("СORRECT");
                pin_code_coincided = true;
                break;
            }
            else{
                System.out.println("INCORRECT " + counter);
            }
            counter++;
        }

        if (!pin_code_coincided){
            System.out.println("Error");
        }
    }
}
