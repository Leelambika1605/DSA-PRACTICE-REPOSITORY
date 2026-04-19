public class MissingNumber {
    public static int find(int arr[]) {
        int n = arr.length;
        int sum = n * (n + 1) / 2;

        int actual = 0;
        for (int num : arr) {
            actual += num;
        }

        return sum - actual;
    }

    public static void main(String[] args) {
        int arr[] = {3, 0, 1};
        System.out.println(find(arr));
    }
}
