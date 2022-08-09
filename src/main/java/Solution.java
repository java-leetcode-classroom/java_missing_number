public class Solution {
  public int missingNumber(int[] nums) {
    int n = nums.length;
    int sum = n * (n + 1)/2;
    int res = sum;
    for (int num: nums) {
      res -= num;
    }
    return res;
  }
  public int missingNumberXOR(int[] nums) {
    int n = nums.length;
    int res = 0;
    for (int pos = 0; pos < n; pos++) {
      res ^=((pos+1)^(nums[pos]));
    }
    return res;
  }
}
