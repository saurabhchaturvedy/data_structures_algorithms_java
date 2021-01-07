package main.java.DynamicProgramming;

public class FibonacciDP {


    private int nthFibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int left = nthFibonacci(n - 1);
        int right = nthFibonacci(n - 2);
        return left + right;
    }

    private int nthFibonacciBottomUp(int n) {
        int table[] = new int[n + 1];
        table[0] = 0;
        table[1] = 1;

        for (int i = 2; i <= n; i++) {
            table[i] = table[i - 1] + table[i - 2];
        }

        return table[n];
    }

    private int nthFibonacciTopDown(int[] memo, int n) {
        if (memo[n] == 0) {
            if (n < 2) {
                memo[n] = n;
            } else {
                int left = nthFibonacciTopDown(memo, n - 1);
                int right = nthFibonacciTopDown(memo, n - 2);
                memo[n] = left + right;
            }

        }
        return memo[n];

    }


    public static void main(String[] args) {

        FibonacciDP fibonacciDP = new FibonacciDP();
        System.out.println(fibonacciDP.nthFibonacci(5));

        System.out.println("Bottom-up: " + fibonacciDP.nthFibonacciBottomUp(5));
        System.out.println("Top-down: " + fibonacciDP.nthFibonacciTopDown(new int[5+1],5));
    }
}
