import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a");
        int a = sc.nextInt();

        System.out.print("Enter the value of n");
        int n = sc.nextInt();
        
        double sum = 0;
        double base = a;

        for (int i = 1; i <= n; i++) {  
            sum = sum + (i / base);
            base = base * base ;
        }
        System.out.println("Sum of the series is: "+sum); 
    }
}
  