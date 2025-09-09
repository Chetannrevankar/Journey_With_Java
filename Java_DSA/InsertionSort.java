public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={2,5,3,4,1};
        for(int i=1;i<arr.length;i++){
            int key=arr[i]; // The element to be inserted
            int j=i-1; // Index of the last sorted element
            
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key; // Insert the key at the correct position
        }
        System.out.println("Sorted array in Ascending order: ");   
        for(int num:arr){
            System.out.print(num + " "); // Print the sorted array
        }
    }
    
}
