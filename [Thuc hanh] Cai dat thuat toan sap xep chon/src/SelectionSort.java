import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = inputElementArray(sc);
        System.out.println("Mảng trước khi sắp xếp theo SelectionSort");
        displayArray(array);
        selectionSort(array);
        System.out.println("\nMảng sau khi sắp xếp theo SelectionSort");
        displayArray(array);

    }
    public static void selectionSort(int[] list){
        for (int i = 0; i < list.length - 1; i++) {
            int min = list[i];
            int minIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (min > list[j]){
                    min = list[j];
                    minIndex = j;
                }
            }
            if (minIndex != i){
                list[minIndex] = list[i];
                list[i] = min;
            }
        }
    }
    private static int[] inputElementArray(Scanner sc) {
        System.out.println("Nhập độ dài mảng");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập giá trị phần tử " + i + " : ");
            array[i] = sc.nextInt();
        }
        return array;
    }

    private static void displayArray(int[] array) {
        for (Integer arr: array) {
            System.out.print(arr + " ");
        }
    }
}
