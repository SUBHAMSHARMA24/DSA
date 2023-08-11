public class perfectnum
{   
    static int number = 1000;
    static int sum = 0;
    static int div = 1;
    static int findPerfect(int number, int div) {
        {
            if(div<=number/2)
            {
                if(number%div==0)
                {
                    sum+=div;
                }
                div++;
                findPerfect(number,div);
            }
            return sum; 
        }
    }
    public static void main(String args[]) 
    {
        int result = findPerfect(number,div);
        if(result == number)
            System.out.println("It is Perfect Number");
        else System.out.println("It is not Perfect Number");
    }
}