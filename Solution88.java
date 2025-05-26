class Solution88 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
//        merge_1(nums1, 0, nums2, nums2.length);
        System.out.println("------------------");
        merge_2(nums1, 3, nums2, nums2.length);
    }

    public static void merge_2(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        for (int l = m + n - 1; l >= 0; l--) {
            if (j >= 0 && (i < 0 || (nums1[i] < nums2[j]))) {
                nums1[l] = nums2[j--];
            } else {
                nums1[l] = nums1[i--];
            }
        }
        for (int i1 : nums1) {
            System.out.println(i1);
        }
    }

    public static void merge_1(int[] nums1, int m, int[] nums2, int n) {
        int[] newSortedArray = new int[n + m];
        int i = 0;
        int j = 0;
        if (m == 0) {
            nums1 = nums2;
        } else if (n != 0) {
            for (int l = 0; l < m + n; l++) {
                if (nums1[i] == 0 || nums1[i] > nums2[j]) {
                    newSortedArray[l] = nums2[j++];
                } else {
                    newSortedArray[l] = nums1[i++];
                }
            }
            nums1 = newSortedArray;
        }
        for (int i1 : nums1) {
            System.out.println(i1);
        }
    }
}