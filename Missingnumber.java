import java.util.Arrays;

public class Missingnumber {
static int missing(int a[]){
        int n=a.length;
        int sum=n*(n+1)/2;
        int sum1=0;
        for(int i=0;i<a.length-1;i++)
            sum1=sum1+a[i];
           // System.out.println(sum1);
        return sum-sum1;
}
    public static void main(String[] args) {
        int a[]={1,2,4,5};
        ///int a[]={3,5,6,7,2,1};
        Arrays.sort(a); // sorting the array in case of usorted array
        System.out.println("Missing Number is :"+missing(a));
        
    }
}
