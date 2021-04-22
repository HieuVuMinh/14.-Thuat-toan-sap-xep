import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = inputElementArray(sc);
        displayArray(array);
        insertionSort(array);
        System.out.println("\n");
        displayArray(array);

    }

    public static void insertionSort(int[] array) {
        int pos, x;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]){
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = x;
        }

    }

    private static void displayArray(int[] array) {
        for (Integer arr : array) {
            System.out.print(arr + " ");
        }
    }

    private static int[] inputElementArray(Scanner sc) {
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + i + " : ");
            array[i] = sc.nextInt();
        }
        return array;
    }
}
