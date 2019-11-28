package Lesson11Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Array11 {

    private ArrayList<int[]> in;
    private ArrayList<Integer> out;
    private String id;

    Array11(ArrayList<int[]> i, ArrayList<Integer> o, String inid) {
        in = i;
        out = o;
        id = inid;
    }

    public static void main(String[] args) {
        ArrayList<int[]> testData = new ArrayList();
        ArrayList<Integer> expected = new ArrayList();

        testData.add(new int[]{1, 2, 11});
        testData.add(new int[]{11, 11});
        testData.add(new int[]{1, 2, 3, 4});
        testData.add(new int[]{1, 11, 3, 11, 11});
        testData.add(new int[]{11});

        expected.add(1);
        expected.add(2);
        expected.add(0);
        expected.add(3);
        expected.add(1);

        Array11 problem = new Array11(testData, expected, "Array11");
        problem.solve();
    }

    public int Array11(int[] nums, int index) {
        if (index < nums.length) {
            if (nums[index] == 11) {
                return 1 + Array11(nums, index + 1);
            } else {
                return 0 + Array11(nums, index + 1);
            }
        } else {
            return 0;
        }
    }

    public void solve() {
        for (int i = 1; i < in.size(); i++) {
            System.out.print(id + " (" + Arrays.toString(in.get(i)) + ") -> ");
            System.out.print(out.get(i) + "\tResult: ");
            int result = Array11(in.get(i), 0);
            System.out.print(result + "\t\t");
            System.out.print("Expected: " + out.get(i) + " Result: " + result);
            if (result == (out.get(i))) {
                System.out.println(" OK");
            } else {
                System.out.println(" FAIL");
            }
        }
    }

}
