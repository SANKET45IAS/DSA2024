public class Q17{

    public static void rearrange(int[] A, int k, int start, int end) {
        if (start >= end) {
            return;
        }

        if (A[start] <= k) {
            rearrange(A, k, start + 1, end);
        } else {
            swap(A, start, end);
            rearrange(A, k, start, end - 1);
        }
    }

    private static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static void main(String[] args) {
        int[] A = {3, 9, 1, 14, 8, 7, 2, 11};
        int k = 7;

        rearrange(A, k, 0, A.length - 1);

        for (int i : A) {
            System.out.print(i + " ");
        }
    }
}