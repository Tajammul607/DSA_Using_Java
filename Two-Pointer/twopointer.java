import java.util.Arrays;

public class twopointer {

    public static int[] findTwoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[]{left, right}; // Found the indices of the two numbers
            } else if (sum < target) {
                left++; // Move the left pointer to increase the sum
            } else {
                right--; // Move the right pointer to decrease the sum
            }
        }

        // If no such pair found
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] indices = findTwoSum(nums, target);
        if (indices[0] != -1) {
            System.out.println("Indices of the two numbers: " + indices[0] + ", " + indices[1]);
            System.out.println("Numbers: " + nums[indices[0]] + ", " + nums[indices[1]]);
        } else {
            System.out.println("No such pair found.");
        }
    }
}
