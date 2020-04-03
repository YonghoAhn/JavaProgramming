import java.util.Scanner;

public class Example08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x1 = s.nextInt();
        int y1 = s.nextInt();
        int x2 = s.nextInt();
        int y2 = s.nextInt();
        if (inRect(x1, y1, 100, 100, 200, 200)
                || inRect(x2, y2, 100, 100, 200, 200)
                || inRect(x1, y2, 100, 100, 200, 200)
                || inRect(x2, y1, 100, 100, 200, 200))
            System.out.println("사각형이 겹칩니다.");
        else if ((inRect(x1, y1, 100, 100, 200, 200))
                && inRect(x2, y2, 100, 100, 200, 200)
                && inRect(x2, y1, 100, 100, 200, 200)
                && inRect(x1, y2, 100, 100, 200, 200))
            System.out.println("사각형이 겹칩니다.");
        else if ((inRect(100, 100, x1, y1, x2, y2))
                && inRect(100, 200, x1, y1, x2, y2)
                && inRect(200, 100, x1, y1, x2, y2)
                && inRect(200, 200, x1, y1, x2, y2))
            System.out.println("사각형이 겹칩니다.");
    }

    public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
        return (x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2);
    }
}
