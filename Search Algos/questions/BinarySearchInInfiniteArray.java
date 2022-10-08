public class BinarySearchInInfiniteArray
{
	public static void main(String[] args) {
		System.out.println("Position of the target element in Infinite Array");
		int[] arr = {1,4,5,7,9,12,15,22,34};
		int target = 9;
		System.out.println(ans(arr, target));
	};
	
	static int ans(int[] arr, int target){
	    int start = 0;
	    int end = 1;
	    while(target > arr[end]){
	        int newStart = end + 1;
	        end = end + (end - start + 1)*2;
	        start = newStart;
	    };
	    return binarySearch(arr, start, end, target);
	};
	
	static int binarySearch(int[] arr, int start, int end, int target){
	    while(start<=end){
	        int mid = start + (end - start)/2;
	        if(arr[mid] == target){
	            return mid;
	        }else if(target < arr[mid]){
	            end = mid - 1;
	        }else{
	            start = mid + 1;
	        };
	    };
	    return -1;
	}	
}
