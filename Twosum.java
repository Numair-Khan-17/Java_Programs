import java.util.*;
public class Twosum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;
        while (left<right) {
            int sum = nums[left] + nums[right];
            if (sum==target) {
                System.out.println("Indexes: " + left + " " + right);
                return;
            }
            else if (sum<target) {
                left++;
            }
            else {
                right--;
            }
        }
        System.out.println("No solution found");
    }
}