import java.util.*;

public class Example04 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        Collections.sort(arrayList);
        System.out.println(arrayList.get(arrayList.size()/2));
    }
}
