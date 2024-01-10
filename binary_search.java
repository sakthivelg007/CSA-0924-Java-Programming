import java.util.Scanner;

public class binary_search {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter the size of the sorted array: ");
        int size = scanner.nextInt();

                int[] sortedArray = new int[size];

                System.out.println("Enter the sorted elements of the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            sortedArray[i] = scanner.nextInt();
        }

                System.out.print("Enter the element to search for: ");
        int target = scanner.nextInt();

                scanner.close();

                int result = binarySearch(sortedArray, target);

                if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
        	result=result+1;
            System.out.println("Element found at index " + result);
        }
    }

        static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;             } else if (arr[mid] < target) {
                low = mid + 1;             } else {
                high = mid - 1;             }
        }

        return -1;     }
}
