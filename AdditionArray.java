public class AdditionArray {

    static void reverse(int a[], int b[]){
        int size=a.length;
        int c[]=new int[size+1];
        int d;
       // int carry=0;
        int e=0;
        if(size>=1){
       for(int i=1;i<=a.length;i++){
           d=(a[size-i]-b[size-i]);//+carry//);
          // carry=d/10;
           e=d%10; 
           c[i]=e;   
         }         
        System.out.println();
        for(int i=a.length;i>0;i--){ // for reverse of array
            System.out.print(c[i]+" ");
        }
      }
    }
     public static void main(String[] args) {
        int a[]={1,2,3,4,9,7};
        int b[]={5,6,7,8,5,4};
        for(int i=0;i<=a.length-1;i++){
            System.out.print(a[i]+" ");
           }
        System.out.println();
        for(int i=0;i<=a.length-1;i++){
           System.out.print(b[i]+" ");
           }
        System.out.println();
        System.out.print("------------");
        reverse(a,b);

      }
    }
