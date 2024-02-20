package command.line.apps;

import java.util.Scanner;

public class A_FibonacciSeries {
    public static void main(String[] args) {
        int n, a = 0, b = 1, c = 0;
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter no of terms of Fibonacci series to print : ");
        n = ip.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.print("\t " + a);
            c = a + b;
            a = b;
            b = c;
        }
    }
}
