/**
 * @author RakhmedovRS
 * @created 07-Mar-20
 */
@LeetCode(id = 53, name = "Maximum Subarray", url = "https://leetcode.com/problems/maximum-subarray/")
public class MaximumSubarray
{
	public int maxSubArray(int[] nums)
	{
		if (nums == null || nums.length == 0)
		{
			return 0;
		}

		int currentMax = nums[0];
		int totalMax = nums[0];
		for (int i = 1; i < nums.length; i++)
		{
			currentMax = Math.max(currentMax + nums[i], nums[i]);
			totalMax = Math.max(totalMax, currentMax);
		}

		return totalMax;
	}

	public int maxSubArray1(int[] nums)
	{
		if (nums == null || nums.length == 0)
		{
			return 0;
		}

		int currentMax = nums[0];
		int totalMax = nums[0];
		for (int i = 1; i < nums.length; i++)
		{
			currentMax = Math.max(currentMax + nums[i], nums[i]);
			totalMax = Math.max(totalMax, currentMax);
		}

		return totalMax;
	}
}