import java.util.Scanner;

class fibnoci {
    //  Correct recursive function
    public int fib_recursion(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib_recursion(n - 1) + fib_recursion(n - 2);
    }

    // Iterative function (prints first n Fibonacci numbers)
    public void fib_normal(int n) {
        int first = 0;
        int second = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int sum = first + second;
            first = second;
            second = sum;
        }
        System.out.println(); // optional: for clean output
    }
}

public class FIBNOCHI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        fibnoci fb = new fibnoci();

        // To print nth Fibonacci number
        // System.out.println("Nth Fibonacci: " + fb.fib_recursion(n));

        //To print first n Fibonacci numbers
        fb.fib_normal(n);
    }
}
