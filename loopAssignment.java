import java.util.Scanner;

public class loopAssignment {
    public static void main(String[] args) {
       // 1)Write a java program to calculate the sum of natural number up to given positive integer 10
        int n =10;
        int sum = 0;
        for(int i = 1; i<=n; i++){
            sum = sum+i;

        }
        System.out.println("Sum of natural numbers up to"+ n + "is:" + sum);

       // 2) Write a java program to print a multiplication table for a given number'n'.

        int n2 = 5;
        for(int i = 1; i<=10; i++){
            System.out.println(n2*i);
        }
      //  3) Write a java program to find the Greatest common divisor of two number using a loop
                Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int number1 = sc.nextInt();
        System.out.println("Enter the second number");
        int number2 = sc.nextInt();
        int gcd = 1;
        for(int i = 1; i<=number1 && i <= number2; i++){
            if (number1 % i == 0 && number2 % i == 0){
                gcd = i;
            }
        }
        System.out.println("Gcd of " + number1 + "and "+ number2 +"is"+gcd);

      //  5)Write a java program to generate and print the first 'n' terms of fibonacci series
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms in fibonacci series :");
        int  n = sc.nextInt();
        System.out.println("fibonacci series of" + n +"terms");
         int firstterm = 0 , secondterm = 1;
         for(int i = 1 ; i<n ; i++){
             int nextterm = firstterm + secondterm;
             System.out.println(" " + nextterm);
             firstterm = secondterm;
             secondterm = nextterm;
         }


    }

}
