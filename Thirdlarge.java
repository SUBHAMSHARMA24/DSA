public class Thirdlarge {
    public static void main(String[] args) {
        int arr[] = {10,20,90,100,1,44,55};
        // First Largest
        int firstLargest = 0; // 0th index
        int secondLargest = -1;
        int thirdlargest = Integer.MIN_VALUE;
        // get the first largest
        for(int i= 1; i<arr.length; i++){
            if(arr[i]>arr[firstLargest]){
                firstLargest = i;
            }
        }
        // now get the second largest
        for(int i = 0; i<arr.length; i++){
            if(arr[i]!=arr[firstLargest]){
                if(secondLargest==-1){
                    secondLargest = i;
                }
                else if (arr[i]>arr[secondLargest]){
                    secondLargest = i;
                }
            }
        }


	    for (int i= 0;i <arr.length ; i++){
		if (arr[i] > thirdlargest && arr[i] < arr[secondLargest]){
			thirdlargest = arr[i];
        }
    }

        System.out.println("First Largest "+arr[firstLargest]);
        System.out.println("Second Largest "+arr[secondLargest]);
        System.out.printf("Third Largest " + thirdlargest);


    }
}