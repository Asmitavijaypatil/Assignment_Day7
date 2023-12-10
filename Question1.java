import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of x in radians: ");
        double x = scanner.nextDouble();
         x = (3.14/180)*x;

        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();

        double sum = 0.0;
        double sign = 1;
        double fact = 1;
        
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
            if (i % 2 != 0 ) {
             sum = sum + sign * (Math.pow(x,i)) / fact;
             sign = sign * -1;
        }
       
    }
        System.out.printf("%.2f Sum of the series: " , sum);

    }
}