import java.util.Scanner;

public class Example06 {
    public static void main(String[] args)
    {
        System.out.println("금액을 입력하시오>>");
        int value = new Scanner(System.in).nextInt();
        int[] unit = {50000,10000,1000,500,100,50,10,1};
        for(int u : unit)
        {
            if(value/u != 0)
                System.out.println(u + "원 짜리 : "+value/u);
            value%=u;
        }
    }
}
