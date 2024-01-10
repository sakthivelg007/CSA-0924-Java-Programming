import java.util.Scanner;

public class reverse_array {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

                int[] arr = new int[size];

                System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

                scanner.close();

                printArrayInReverse(arr);
    }

        static void printArrayInReverse(int[] arr) {
                int length = arr.length;

                for (int i = length - 1; i >= 0; i--) {
                        System.out.print(arr[i] + " ");
        }
                

            }
}
