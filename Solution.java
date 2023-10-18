import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] number = {0,0,1};
        sol.moveZeroes(number);
    }
    public void moveZeroes(int[] nums){
        int nonZeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                nums[nonZeroIndex] = nums[i];
                if(i != nonZeroIndex){
                    nums[i] = 0;
                }
                nonZeroIndex++;
            }
        }
        System.out.println("nums = " + Arrays.toString(nums));
    }
}
