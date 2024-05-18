package arraysPrograms;

import org.testng.annotations.Test;

import java.util.Arrays;

public class MergeSortedArrayTest {
    @Test
    public void test1(){
        int[] num1 = {1,2,3,0,0,0};
        int[] num2 = {2,5,6};
        int m=3,n=3;
        mergeSortedArray(num1,m,num2,n);
    }

    @Test
    public void test2(){
        int[] num1 = {0};
        int[] num2 = {2};
        int m=0,n=1;
        mergeSortedArray(num1,m,num2,n);
    }

    @Test
    public void test3(){
        int[] num1 = {2,0};
        int[] num2 = {1};
        int m=1,n=1;
        mergeSortedArray(num1,m,num2,n);
    }

    private void mergeSortedArray(int[] num1, int m, int[] num2, int n) {
        int index=0,i=0,j=0;
        int[] temp;
        temp= Arrays.copyOf(num1,m);
        while(i<m && j<n){
            if(temp[i]>num2[j]){num1[index]=num2[j++];}
            else num1[index]=temp[i++];
            index++;
        }

        while(j<n){
            num1[index++]=num2[j++];
        }

        while(i<m){
            num1[index++]=temp[i++];
        }
        System.out.println(Arrays.toString(num1));
    }

}
