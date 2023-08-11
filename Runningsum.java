public class Runningsum{

    // static int[] runningsum(int a[]){
    //  int sum=0;
    // for(int i=0;i<=a.length-1;i++){
    //     sum=sum+a[i];
    //     a[i]=sum;
    //    }
    // return a;

    // }
 public static void main(String[] args) {
    int a[]= {1,2,3,4};
   // int sum[]=new int[a.length];
    for(int i=1;i<=a.length;i++){
        a[i]=a[i-1]+a[i];
        //a[i]=sum;
               System.out.println(a[i]);
       }

   // runningsum(a);

 }
}