import java.util.Scanner;

public class Example06 {
    public static void main(String[] args)
    {
        System.out.print("1~99 사이의 정수를 입력하시오>>");
        int val = new Scanner(System.in).nextInt();
        int cnt = 0;
        if(val < 10) {
            if (val % 3 == 0) cnt++;
        }
        else {
            if((val % 10) % 3 == 0) cnt++;
            if((val / 10) % 3 == 0) cnt++;
        }
        if(cnt == 1)
                System.out.println("박수짝");
        else if(cnt == 2)
                System.out.println("박수짝짝");
    }
}
