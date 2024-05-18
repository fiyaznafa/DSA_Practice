package arraysPrograms;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
27. https://leetcode.com/problems/remove-element
 */
public class RemoveElementTest {
    @Test
    public void test1(){
      int[] nums = {3,2,2,3};
      int val=3;
      Assert.assertEquals(removeElement(nums,val),2);

    }

    @Test
    public void test2(){
        int[] nums = {0,1,2,2,3,0,4,2};
        int val=2;
        Assert.assertEquals(removeElement(nums,val),5);

    }

    private int removeElement(int[] nums, int val) {
        int left=0,right=nums.length-1,temp;
        while (left<=right){
            if(nums[left]==val&&nums[right]!=val){
                temp=nums[left];
                nums[left++]=nums[right];
                nums[right--]=temp;
            }
            else if(nums[left]==val && nums[right]==val) right--;
            else if(nums[left]!=val && nums[right]==val) right--;
            else left++;
        }
        return left;
    }
}
