package ex2;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] arrayNumber = {10, 4, 5, 3, 6, 19, 8, 5, 6, 11};
        System.out.println("Tổng của mảng là: " + getSum(arrayNumber));
        System.out.println("Số lớn nhất trong mảng là: " + getMax(arrayNumber));
    }

    public static int getSum(int[] arr) {
        int result = 0;
        for (int i : arr) {
            result += i;
        }
        return result;
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }
}
