import java.util.Arrays;

public class MergeBrute {
    public static void main(String[] args) {
        int nums1[] = {1,2,3};
        int nums2[] = {2,5,6};

        int result[] = new int[nums1.length + nums2.length];

        int k = 0;
        for (int num : nums1) result[k++] = num;
        for (int num : nums2) result[k++] = num;

        Arrays.sort(result);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
