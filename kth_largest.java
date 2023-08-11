
import java.util.Random;
import java.util.Scanner;
 
public class kth_largest 
{
    static int N = 7;
    static int []sequence = new int[N];
    public static void sort()
    {
        System.out.print("The Sequence is: ");
        for(int i=1; i<N; i++)
        System.out.print(sequence[i] + " ");
        System.out.println();
 
        int i, j, temp;
        for (i = 1; i< N; i++) 
        {
            j = i;
            temp = sequence[i];    
            while (j > 0 && temp < sequence[j-1])
            {
                sequence[j] = sequence[j-1];
                j = j-1;
            }
            sequence[j] = temp;            
        }        
    }
 
    public static void main(String args[])
    {
        Random random = new Random();
 
        for(int i=0; i<N; i++)
            sequence[i] = Math.abs(random.nextInt(100));
 
        Scanner sc = new Scanner(System.in);
      

        System.out.print("Enter the kth largest to find: ");
        int k = sc.nextInt();
 
        sort();
        System.out.println(k+"th largest element is " + sequence[N-k]);
        sc.close();
    }
}