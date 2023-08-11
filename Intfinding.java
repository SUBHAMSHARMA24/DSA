public class Intfinding {

 
     
    // function to count number of values
    // less than equal to n that satisfy
    // the given condition
    public static int countValues (int n)
    {
        int countV = 0;
      
        // Traverse all numbers from 0 to n
        // and increment result only when
        // given condition is satisfied.
        for (int i = 0; i <= n; i++ )
            if ((n + i) == (n ^ i) )
                countV++;
      
        return countV;
    }
     
    /* Driver program to test above function */
    public static void main(String[] args)
    {
        int n = 5;
        System.out.println(countValues(n));
         
    }
}