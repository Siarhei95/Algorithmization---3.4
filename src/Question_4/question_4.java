package Question_4;

import java.util.*;

public class question_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = random.nextInt(30);
        }
        System.out.println("Original array:" + Arrays.toString(a));//произвольный массив
        int k;
        System.out.println("Counter: ");
        do {
            k = 0;
            for (int i = 0; i < size - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int tmp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = tmp;
                    k++;
                }
            }
            System.out.println(k); //cчетчик, показыает количество замен от 0 до к;
        }while (k > 0);
        for (int i = 0; i < size; i++) {
        }
        System.out.print("Sorted array: " + Arrays.toString(a));
        System.out.println();
    }
}




