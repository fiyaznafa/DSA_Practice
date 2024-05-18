package arraysPrograms;

import org.testng.annotations.Test;

import java.util.Arrays;

/*
https://leetcode.com/problems/remove-duplicates-from-sorted-array/description
 Pseudo code - Two pointers
 1. Keeping one pointer on first element and second pointer second element iterate the array
 2. If value of the right pointer element is same as that of first element move right pointer
 3. If value of both element are different move both the pointer
 4. Iterate till right pointer reaches the end of the array
 5. Return the value of left pointer
 */
public class RemoveDuplicatesTest {

    @Test
    public void test1(){
        int[] nums ={1,1,2};
        System.out.println(removeDuplicates(nums));
    }

    @Test
    public void test2(){
        int[] nums ={1};
        System.out.println(removeDuplicates(nums));
    }


    @Test
    public void test3(){
        int[] nums ={1,2,3,3,3,4,5,6,6};
        System.out.println(removeDuplicates(nums));
    }

    private int removeDuplicates(int[] nums) {
        int left=0,right=1;
        while ((right< nums.length)){
            if(nums[left]==nums[right])right++;
            else if(nums[left]!=nums[right]){
                nums[++left]=nums[right++];
            }
        }
        System.out.println(Arrays.toString(nums));
        return left+1;
    }
}
