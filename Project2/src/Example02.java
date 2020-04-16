public class Example02 {
    public static void main(String[] args)
    {
        int n[][] = {{1}, {1,2,3}, {1}, {1,2,3,4}, {1,2}};
        for(int[] i : n)
        {
            for(int j : i)
            {
                System.out.printf("%3d",j);
            }
            System.out.println("");
        }
    }
}
