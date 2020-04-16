import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Example04 {
    public static void main(String[] args)
    {
        Character[] ch = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        List<Character> list = Arrays.asList(ch);
        System.out.println("소문자 알파벳 하나를 입력하시오.>>");
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        for(int i = list.indexOf(c)+1; i > -1; i--)
        {
            System.out.println(list.subList(0,i).toString().replaceAll(", ", "").replaceAll("\\[","").replaceAll("]",""));
        }
    }
}
