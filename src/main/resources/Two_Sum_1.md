#1. Two Sum

<p>Given an array of integers, return indices of the two numbers such that they add up to a specific target.<br>You may assume that each input would have exactly one solution, and you may not use the same element twice.</p>

<b>Example:</b>

<pre>Given nums = [2, 7, 11, 15], target = 9,
<br>Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].</pre>

####Approach 1 : One Pass Hash Table
<p>While iterating through elements. We can add elements to Hash table & at the same time check for the complement is present in table or not.</p>

<b>One Pass Hash table Algorithm</b>
<ol>
<li>Create one Hash table with Key-Value pairs of Integers</li>
<li>Loop through each Element of input array.</li>
<li>Find out Complement of Element as per Target value.</li>
<li>If Complement Present in table then return value holding Complement index & Current index.</li>
<li>Else Add Element to table with Key as Element and Value as index.</li>
<li> Repeat Step 3 through 5 until the match has been found</li>
</ol>

<b>Please refer below Java Code snippet.</b>

```
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
		// Alternately You can return null as No Two Number Solution exists.
	}
```

<b>Complexity Analysis - Approach 1</b>
<pre>Time Complexity: O(n) - Iterate through loop only once & at max loop holds n Elements.<br>
Space Complexity: O(n) - Additional Space requirement for Hashtable to hold Key-Value Pairs & at Max table holds n entries.
</pre>