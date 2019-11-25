package Lesson11Recursion;

public class Fibonacci {

    static int reccount = 0;
    static int count = 0;
    public static void main(String[] args) {
        System.out.println("The 10th fib is " + fib1(10));
        System.out.println("The 10th fib is (recursive) " + recfib(10));
        System.out.println("recursionFib was called a total of " + reccount + " times.");
        System.out.println("normal fib was called a total of " + count + " times.");
    }
    
    public static int recfib(int num){
        reccount++;
        if(num==1 || num==2) return 1;
        else
            return recfib(num-1) + recfib(num-2);
    }

    public static int fib1(int num) {
        if (num == 1 || num == 2) {
            count++;
            return 1;
        }
        int num1 = 1, num2 = 1;
        int fib = 2;
        for (int i = 3; i <= num; i++) {
            fib = num1 + num2;
            num1 = num2;
            num2 = fib;
            count++;
        }
        return fib;
    }
}
