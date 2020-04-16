import java.util.*;

public class Example16 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] str = {"가위", "바위", "보"};
        Map<Integer, String> roundTable = new HashMap<Integer, String>()
        {
            {
                put(1, "사용자가 이겼습니다.");
                put(0,"비겼습니다.");
                put(2,"사용자가 졌습니다.");
                put(-1,"사용자가 졌습니다.");
                put(-2, "사용자가 이겼습니다.");
            }
        };
        String userSelect;
        int n;
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
        System.out.print("가위 바위 보! >> ");
        while(!(userSelect = sc.next()).equals("그만"))
        {
            n = new Random().nextInt(3);
            int c = Arrays.asList(str).indexOf(userSelect);
            System.out.println("사용자 = " + userSelect + ", " + " 컴퓨터 = " + str[n] + ", " + roundTable.get(c - n));
            System.out.print("가위 바위 보! >> ");
        }
        System.out.println("게임을 종료합니다...");
        sc.close();
    }
}
