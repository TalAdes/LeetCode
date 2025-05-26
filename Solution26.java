class Solution26 {

    public static int removeDuplicates(int[] nums) {

        int uniquesCounter = 0;
        if (nums.length == 1) {
            return 1;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[uniquesCounter] != nums[i]) {
                nums[++uniquesCounter] = nums[i];
            }
        }

        return ++uniquesCounter;
    }

    public static void main(String[] args) {
        int[] nums1 = {0, 1, 1, 2, 2, 3, 3, 4, 4, 4, 4, 4, 4, 5, 6, 7, 8};

        System.out.println(removeDuplicates(nums1));


    }
}