import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Example14 {
    public static void main(String[] args)
    {
        String course[] = {"Java","C++","HTML5","컴퓨터구조","안드로이드"};
        int score[] = {95,88,76,62,55};
        Scanner scanner = new Scanner(System.in);
        String input = "";
        List<String> list = Arrays.asList(course);
        System.out.print("과목 이름>>");
        while(!(input = scanner.next()).equals("그만"))
        {
            if(list.contains(input))
                System.out.println(input + "의 점수는 "+score[list.indexOf(input)]);
            else
                System.out.println("없는 과목입니다.");
            System.out.print("과목 이름>>");
        }
    }
}
