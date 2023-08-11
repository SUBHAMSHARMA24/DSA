import java.util.ArrayList;

public class perfect2
{

    public static ArrayList<Integer> findNPerfectNumbers(int n)
    {
        int sum = 0;
        ArrayList<Integer> perfectList = new ArrayList<>();
        ArrayList<Integer> factorList = new ArrayList<>();
        for (int i = 6; i < n; i++)
        {
            factorList.clear();
            for (int j = 1; j <= i / 2; j++)
            {
                if (i % j == 0)
                {
                    factorList.add(j);
                }
            }
            sum = 0;
            for (int h = 0; h < factorList.size(); h++)
            {
                sum = sum + factorList.get(h);
            }
            if (sum == i)
            {
                perfectList.add(i);
            }
         }
        return perfectList;
    }

    public static void main(String[] args)
    {
        System.out.println(findNPerfectNumbers(1000));
    }
}