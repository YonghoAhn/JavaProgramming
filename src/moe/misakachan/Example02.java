import java.util.*;

public class Example02 {
    public static void main(String[] args) {
        System.out.print("2자리수 정수 입력(10~99)>>");
        int val = new Scanner(System.in).nextInt();
        if(val / 10 == val % 10)
            System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
        //if(new HashSet<>(new ArrayList<>(Arrays.asList(new Scanner(System.in).next().split("")))).size() == 1)
            //System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
    }
}
