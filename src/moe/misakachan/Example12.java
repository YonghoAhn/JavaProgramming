import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        System.out.print("연산>>");
        Scanner scanner = new Scanner(System.in);
        int val1 = scanner.nextInt();
        String operand = scanner.next();
        int val2 = scanner.nextInt();
        int result = 0;
        if ("+".equals(operand)) {
            result = val1 + val2;
        } else if ("-".equals(operand)) {
            result = val1 - val2;
        } else if ("*".equals(operand)) {
            result = val1 * val2;
        } else if ("/".equals(operand)) {
            if (val2 == 0) throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
            else result = val1 / val2;
        }
        System.out.println(val1 + operand + val2 + "의 계산 결과는 " + result);
    }
}
