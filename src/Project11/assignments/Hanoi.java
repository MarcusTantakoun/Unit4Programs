package Project11.assignments;

import java.util.Scanner;

public class Hanoi {

    static int nummoves = 0;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of rings 3 to 10: ");
        int numrings = s.nextInt();
        if (numrings < 3 || numrings > 10) {
            System.out.println("Invalide input - program will now end.");
            return;
        }
        move(numrings, 1, 3, 2);
        System.out.println("Total moves = " + nummoves);
    }

    public static void move(int n, int i, int j, int k) {
        if (n > 0) {
            nummoves++;
            move(n - 1, i, k, j);
            System.out.println("Move ring " + n + " from peg " + i + " to peg " + j);
            move(n - 1, k, j, i);
        }
    }
}
