package org.example;

public class Fibonacci {

    public static int generateFibonacciRecursive(int n) {
        if(n==0) return 0;
        else if (n==1 || n==2) return 1;
        else
            return generateFibonacci(n-1) + generateFibonacci(n-2);
    }

    public static int generateFibonacci(int n){
        if(n==0) return 0;
        else if (n==1|| n==2) return 1;
        else {
            int fib1 = 1;
            int fib2 = 1;
            int fibonacci = 0;

            for (int i =3; i<=n; i++){
                fibonacci = fib1 + fib2;
                fib1 = fib2;
                fib2 = fibonacci;
            }
            return fibonacci;
        }
    }

    public static void main(String[] args){
        int count = 10;
        int sum = 0;
        System.out.println("fibonacci: ");
        for(int i =0; i<= count; i++){
            int fNumber = generateFibonacciRecursive(i);
            System.out.println(fNumber);
            sum +=fNumber;
            System.out.println("sum : " + sum);
        }

    }
}
