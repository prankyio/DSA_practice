import java.util.Scanner;
import java.util.Arrays;

class Solution {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int test[]=new int[6]; 

        for (int i =0;i<6;i++)
        {
            test[i]=sc.nextInt();
        }

        int[] ans = buildArray(test);


        System.out.println(Arrays.toString(ans));
    }




    public static int[] buildArray(int[] nums)
     {

        int []ans = new int[nums.length];
        for (int i =0;i<nums.length;i++)
        {
            ans[i]=nums[nums[i]];
        }

        return ans;
    


    }
}