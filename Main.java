import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int total=0;

        Scanner scan= new Scanner(System.in);

        do{
            System.out.print("Enter number :");
            n=scan.nextInt();
            if(n%2==1){
                total+=n;
            }
        }while (n>0);

        System.out.println("Sum of odd numbers " +total);

    }
}
