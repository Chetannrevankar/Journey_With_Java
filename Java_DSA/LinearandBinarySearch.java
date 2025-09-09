public class LinearandBinarySearch{
    public static void main(String[] args) {
        int nums[]={5, 6, 7, 8, 9, 10};
        int target = 9;
        int result1= linearSearch(nums, target);
        int result2= binarySearch(nums, target);
        
        if (result1 != -1)
            System.out.println("Element found at index: " + result1);
        else
            System.out.println("Element not found in the array");    
    }
    public static int linearSearch(int[] nums, int target) {   
        int steps=0;         //Bcoz dont wanted to deal with objects
        for(int i=0;i<nums.length;i++){
            steps++; // Increment step count for each iteration
            if(nums[i]==target){
                System.out.println("Steps taken Linear Search: " + steps);
                return i; // Return the index if the target is found
            }
        }
        System.out.println("Steps taken: " + steps);
        return -1;
    }
    public static int binarySearch(int[] nums, int target) { 
        int steps=0;           //Bcoz dont wanted to deal with objects
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            steps++; // Increment step count for each iteration
            int mid = (start + end) / 2; // To avoid overflow
            
            if (nums[mid] == target) {
                System.out.println("Steps taken BinarySearch: " + steps);
                return mid; // Return the index if the target is found
            }
            if (nums[mid] < target) {

                start = mid + 1; // Search in the right half
            } else {
                end = mid - 1; // Search in the left half
            }
        }
        System.out.println("Steps taken: " + steps);
        return -1;
    }
        
}
