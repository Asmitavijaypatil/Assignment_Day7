import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int n = sc.nextInt();
      
        double fact = 1, sum = 0;
        for (int i = 1; i <= n; i ++) {  
          fact = fact * i;
          sum = sum + (i / fact); 
        }
        System.out.println("Sum of the series is: "+sum); 
    }
}
  