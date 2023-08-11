import java.util.Scanner;
class Main
{
	 char a[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	 int rem;
	 String hexdec="";
	 String hexadecimal(int q)
	 {   
   	 if(q != 0)
    	 {
		rem=q%16;
		hexdec= a[rem] + hexdec;
	    q= q/16;
		hexadecimal(q);  
	}
        return hexdec;
}    
 
    public static void main(String arg[])
    {
    Main var=new Main();
        int oct, decimal=0, i=0;
        Scanner sc = new Scanner(System.in);		
        System.out.print("Enter Octal Number : ");
        oct = sc.nextInt();	
        sc.close();			
        while(oct != 0)
        {
            decimal =decimal + (oct%10) *(int)Math.pow(8, i);
            i++;
            oct = oct/10;
        }		     
        String hex=var.hexadecimal(decimal); 
        System.out.println("Hexadecimal number is :"+hex);   
    }
  
}