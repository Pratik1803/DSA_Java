//find target element in Rotated Sorted array
//https://leetcode.com/problems/search-in-rotated-sorted-array/


public class RotatedSortedArray
{
    // Case1: if mid > mid + 1, Pivot found
    // Case2: if mid < mid - 1, Pivot found
    // Case3: if start > mid, pivot lies in first half of array => end = mid - 1
    // Case4: if start < mid, pivot lies in second half of array => start = mid + 1;
	public static void main(String[] args) {
		int[] arr = {4,5,6,7,8,9,10,0,1,2,3};
		int target = 10;
		int pivot = findPivot(arr); //index of pivot element
		System.out.println("Pivot is at: " + pivot);
		if(pivot == -1){
		    System.out.println(binarySearch(arr, target, 0, arr.length - 1));
		};
		if(target == arr[pivot]){
		    System.out.println(pivot);
		}else if(target < arr[0]){
		    System.out.println(binarySearch(arr, target, pivot + 1, arr.length - 1));
		}else if(target >= arr[0]){
		    System.out.println(binarySearch(arr, target, 0, pivot - 1));
		}
	};
	
	static int findPivot(int[] arr){
	    int start = 0;
	    int end = arr.length - 1;
	    while(start <= end){
	        int mid = start + (end - start)/2;
	        if(mid < end && arr[mid] > arr[mid + 1]){
	            return mid;
	        }else if(mid>start && arr[mid] < arr[mid - 1]){
	            return mid - 1;
	        }else if(arr[start] >= arr[mid]){
	            end = mid - 1;
	        }else if(arr[start]<arr[mid]){
	            start = mid + 1;
	        }
	    };
	    
	    return -1;
	};
	
	static int binarySearch(int[] arr, int target ,int start, int end){
	    while(start <= end){
	        int mid = start + (end - start)/2;
	        if(target == arr[mid]){
	            return mid;
	        }else if(target < arr[mid]){
	            end = mid - 1;
	        }else if(target > arr[mid]){
	            start = mid + 1;
	        }
	    };
	    return -1;
	}
}
