import java.time.Year;
import java.util.Collections;
import java.util.Scanner;

public class bubbleSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of arrray");
        int size = sc.nextInt();
        int[] list = new int[size];
        System.out.println("Enter element of array");
        for (int i = 0; i < list.length; i++) {
            System.out.print("Element " + i + ": ");
            list[i] = sc.nextInt();
        }
        System.out.println("Array after bubbleSort");
        displayArray(list);

        bubbleSort(list);
        System.out.println("\nArray before bubbleSort");
        displayArray(list);
    }

    private static void displayArray(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(+ list[i] + " ");
        }
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

    }
}
