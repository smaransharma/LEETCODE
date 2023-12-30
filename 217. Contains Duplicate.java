import java.util.HashSet;
import java.util.Set;

class Solution 
{
    public boolean containsDuplicate(int[] nums)
    {
        Set<Integer> cont = new HashSet<>();
        
        for(int i = 0; i<nums.length; i++)
        {
            if(cont.contains(nums[i]))
            {
                return true;
            }
            
            cont.add(nums[i]);
        }
        return false;
        
    }
}