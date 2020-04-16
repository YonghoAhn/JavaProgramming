public class Example12 {
    public static void main(String[] args)
    {
        int sum = 0;
        for(String s : args)
        {
            try {
                int t = Integer.parseInt(s);
                sum+=t;
            } catch (NumberFormatException ignored) {}
        }
        System.out.println(sum);
    }
}
