public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 7, 9};
        int target = 7;
        System.out.println(linearSearch(nums, target));
        System.out.println(binarySearch(nums, target));
    }

    public static int linearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == target) return i;
        return -1;
    }

    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {
            int mid = (left + right) / 2;

            if (target == nums[mid]) {
                return mid;
            }

            if (target > nums[mid]) {
                left = mid + 1;
            }

            if (target < nums[mid]) {
                right = mid - 1;
            }
        }
        return -1;
    }
}