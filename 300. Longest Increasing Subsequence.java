https://leetcode.com/problems/longest-increasing-subsequence/

class Solution {
    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(nums[0]);
        for(int i=0;i<nums.length;i++)
        {
            int l=ans.size()-1;
            if(ans.get(l)<nums[i])
            {
                ans.add(nums[i]);
            }
            else
            {
                int indx=binarySearch(ans,nums[i]);
                ans.set(indx,nums[i]);
            }
        }

        return ans.size();
    }

    static int binarySearch(ArrayList<Integer> ans, int key) {
        int low = 0;
        int high = ans.size() - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (ans.get(mid) == key) return mid;
            else if (ans.get(mid) < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high + 1;
    }
}
