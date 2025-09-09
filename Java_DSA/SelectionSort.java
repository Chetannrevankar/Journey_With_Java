public class SelectionSort {
    public static void main(String[] args) {
        int nums[]={9, 8, 7, 6, 5, 4};
        int size=nums.length;
        for (int i=0;i<size;i++){
            int minIndex=i;
            for(int j=i+1;j<size;j++){
                if(nums[j]<nums[minIndex]){
                    minIndex=j; // Find the index of the minimum element
                }
            }

        int temp=nums[i];
        nums[i]=nums[minIndex]; // Swap the found minimum element with the first element
        nums[minIndex]=temp;
    }
    System.out.println("Sorted array in Ascending order: ");
    for(int num:nums){
        System.out.print(num + " "); // Print the sorted array

    }
    
    }
}
