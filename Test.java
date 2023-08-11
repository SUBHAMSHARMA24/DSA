public class Test {

     public static void main(String[] args) {
        // int arr[] = {10,20,90,100,1,44,55,4};
        // int mid=arr.length/2;
        //  System.out.println(mid);
        // int midvalue=arr[mid];
        // System.out.println(midvalue);
        // int a[]={2,4,5,6};
        // int b[]={1,9,7,2};
        int a[]={1,2,3,4};
        int b[]={5,6,7,8};
        int size=a.length;
        int c[]=new int[5];
        int d;
        int carry=0;
        int e=0;
        if(size>=1){
       for(int i=1;i<=a.length;i++){
           d=(a[size-i]+b[size-i]+carry);
           carry=d/10;
           e=d%10; 
           c[i]=e;             //for(int j=a.length;j<=0;j--)
           //System.out.print(c[i]+" ");

           }
           System.out.println();
           for(int i=0;i<=a.length-1;i++){
           System.out.print(a[i]+" ");
           }

           System.out.println();
           for(int i=0;i<=a.length-1;i++){
           System.out.print(b[i]+" ");

           }
           System.out.println();
           System.out.println("-------- ");
            for(int i=a.length;i>0;i--){ // for reverse of array
            System.out.print(c[i]+" ");
        }
      }
    }
}
