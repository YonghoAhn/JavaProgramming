import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 원의 중심과 반지름 입력>>");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        double r = scanner.nextDouble();

        System.out.print("두번째 원의 중심과 반지름 입력>>");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        double r1 = scanner.nextDouble();
        if (Math.sqrt(Math.pow((x1 - y1),2) + Math.pow((x2 - y2),2)) <= (r + r1)) System.out.println("두 원은 서로 겹친다.");
    }
}

