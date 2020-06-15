package JavaLeetCodeSolutions.LeetCodingJava;

import java.util.HashMap;
import java.util.Map;

/**
 * <h1>Problem Statement:</h1>
 * <p>
 * Given an array of integers, return indices of the two numbers such that they
 * add up to a specific target. You may assume that each input would have
 * exactly one solution, and you may not use the same element twice.
 * </p>
 * 
 * <b>Example:</b>
 * <p>
 * Given nums = [2, 7, 11, 15], target = 9, Because nums[0] + nums[1] = 2 + 7 =
 * 9, return [0, 1].
 * </p>
 * 
 * @author SagarHMehta
 */
public class Two_Sum_1 {
	/**
	 * <p>Return an Integer array with Two Indices holding values that add up to given target number.</p>
	 * 
	 * @param nums - Array Holding Numbers
	 * @param target - Target Value
	 * @return
	 */
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int tempSm = target - nums[i];
			if (map1.containsKey(tempSm)) {
				return new int[] { map1.get(tempSm), i };
			}
			map1.put(nums[i], i);
		}
		throw new IllegalArgumentException("No Two Number Solution present.");
		//Alternately You can return null as No Two Number Solution exists.
	}
}
