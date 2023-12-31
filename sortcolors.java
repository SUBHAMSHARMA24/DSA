public class sortcolors {
    int arr[] = {};
    void swap(int firstIndex, int secondIndex){
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int mid = 0;
        arr= nums;
        while(mid<=high){
            int value = nums[mid];
            switch(value){
                case 0:
                swap(low, mid);
                low++;
                mid++;
                break;
             case 1:
                mid++;
                break;
             case 2:
               swap(mid, high);
               high--;
               break;    
            }
        }
        
    }
}
