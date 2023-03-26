package ex3;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng: ");
        int arrLength = scanner.nextInt();
        int[] arr = new int[arrLength];
        System.out.println("Nhập phần tử của mảng: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Phần tử thứ " + i + " :");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Mảng hiện tại: " + Arrays.toString(arr));
    }
}
