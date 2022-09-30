public class BinarySearch{
    // BinarySearch
    public static void main(String[] args) {
		System.out.println("Binary Search");
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int target = 5; 
		System.out.println(binarySearch(arr, target));
	}
	
	static int binarySearch(int[] arr, int target){
	    int start = 0;
	    int end = arr.length;
	    while(start <= end){
	        int mid = start + ((end-start)/2);
	        if(arr[mid] == target){
	            return mid;
	        }else if(target<arr[mid]){
	            end = mid-1;
	            
	        }else if(target>arr[mid]){
	            start = mid+1;
	        };
	    }
	    return -1;
	}
}