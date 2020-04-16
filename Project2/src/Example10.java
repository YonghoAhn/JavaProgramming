import java.util.Random;

public class Example10 {
    public static void main(String[] args)
    {
        int[][] data = new int[4][4];
        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                data[i][j] = (int)(Math.random()*10)+1;
            }
        }
        for(int i = 0; i < 6; i++)
        {
            int r = new Random().nextInt(15);
            if(data[r/4][r%4] == 0)
                i--;
            else
                data[r/4][r%4] = 0;
        }
        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                System.out.printf("%3d",data[i][j]);
            }
            System.out.println("");
        }
    }
}
