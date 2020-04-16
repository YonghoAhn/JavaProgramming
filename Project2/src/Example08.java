import java.util.Arrays;
import java.util.Scanner;

public class Example08 {
    public static void main(String[] args)
    {
        int n = new Scanner(System.in).nextInt();
        Integer[] nums = new Integer[n];
        for(int i = 0; i < n; i++)
        {
            int r = (int)(Math.random()*100 +1);
            if(!Arrays.asList(nums).contains(r)) {
                nums[i] = r;
                System.out.printf("%5d",r);
                if((i+1)%5==0)
                    System.out.println("");
            }
            else
                i--;
        }
    }
}
