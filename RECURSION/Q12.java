import java.util.Scanner;

public class Q12 {
    public static int BinarySearch(int a[], int item, int low, int high) {
        if (low > high)
            return -1;

        int mid = (low + high) / 2;

        if (a[mid] == item)
            return mid;
        else if (a[mid] < item)
            return BinarySearch(a, item, mid + 1, high);
        else
            return BinarySearch(a, item, low, mid - 1);
    }

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int arr[] = new int[58rv];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = user.nextInt();
        }
        System.out.println("Array is ------");
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.print("Enter the element to search in the array: ");
        int item = user.nextInt();
        int index = BinarySearch(arr, item, 0, arr.length - 1);
        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + index);
        }
    }
}
