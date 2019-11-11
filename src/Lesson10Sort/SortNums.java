package Lesson10Sort;

public class SortNums {

    public static void main(String[] args) {
        int nums[] = new int[100];
        for (int i = 0; i < 100; i++) {
            nums[i] = (int) (Math.random() * 1000 + 1);
            if (i % 20 == 0 && i != 0) {
                System.out.println(nums[i] + ", ");
            } else {
                System.out.print(nums[i] + ", ");
            }
        }
        selectionSort(nums);
        System.out.println("\n\n-----Selection-----\n\n");
        for (int i = 0; i < 100; i++) {
            if (i % 20 == 0 && i != 0) {
                System.out.println(nums[i] + ", ");
            } else {
                System.out.print(nums[i] + ", ");
            }
        }
    }

    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = findMinimum(a, i);
            if (minIndex != i) //if lowest is not already in place
            {
                swap(a, i, minIndex);
            }
        } //end for
    }

//supporting findMinimum method
    public static int findMinimum(int[] a, int first) {
        //first=where to start looking from
        //assume first is also the smallest for now
        int minIndex = first;
        for (int i = first + 1; i < a.length; i++) {
            if (a[i] < a[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

//supporting swap method (same as bubble sort swap)
    public static void swap(int[] a, int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

}
