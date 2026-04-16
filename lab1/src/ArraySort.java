import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();

        double[] arr = new double[n];

        // Nhap mang
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            arr[i] = sc.nextDouble();
        }

        // Tinh tong
        double sum = 0;
        for (double x : arr) {
            sum += x;
        }

        // Tinh trung binh
        double avg = sum / n;

        // Sap xep mang
        Arrays.sort(arr);

        // In ket qua
        System.out.println("Mang sau khi sap xep: " + Arrays.toString(arr));
        System.out.println("Tong: " + sum);
        System.out.println("Trung binh: " + avg);

        sc.close();
    }
}