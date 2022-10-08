import java.util.*;
public class BinarySearchForSortedMatrices
{
	public static void main(String[] args) {
		System.out.println("Binary Search for sorted Matrices.");
		System.out.println("Complexity: log(n) + log(m)");
		int[][] arr = {
		    {1,2,3,4},
		    {5,6,7,8},
		    {9,10,11,12},
		    {13,14,15,16}
		};
		int target = 11;
		System.out.println(Arrays.toString(search(arr, target)));
	};
	
	static int[] search(int[][] arr, int target){
	    int rstart = 0;
	    int rend = arr.length;
	    int cols = arr[0].length-1;
	    
	    
	    //contract the search space upto two rows
	    while(rstart<rend - 1){
	        int rmid = rstart + (rend - rstart)/2;
	        int cmid = cols/2;
	        if(arr[rmid][cmid] == target){
	            return new int[]{rmid,cmid};
	        }else if(arr[rmid][cmid] < target){
	            rstart = rmid;
	        }else if(arr[rmid][cmid] > target){
	            rend = rmid;
	        }
	    };
	    
	   // Now we have just two rows. These rows are divided into 4 parts by their middle element and those four parts are binary searched individually.
	   int colMid = cols/2;
	   if(arr[rstart][colMid] > target && arr[rstart][0] < target){
	       return binarySearch(arr, rstart, 0, colMid - 1, target);
	   }else if(arr[rstart][colMid] < target) {
	       return binarySearch(arr, rstart, colMid + 1, arr[0].length - 1, target);
	   }else if(arr[rend][colMid] > target ){
	       return binarySearch(arr, rend, 0, colMid - 1, target);
	   }else if(arr[rend][colMid] < target && arr[rend][cols] > target){
	       return binarySearch(arr, rend, colMid + 1, arr[0].length - 1, target);
	   };
	   
	   return new int[]{-1,-1};
	};
	
	static int[] binarySearch(int[][] arr,int row, int cstart, int cend, int target){
	    while(cstart<=cend){
	        int mid = cstart + (cend - cstart )/2;
	        if(arr[row][mid] == target){
	            return new int[]{row, mid};
	        }else if(target < arr[row][mid]){
	            cend = mid - 1; 
	        }else if(target > arr[row][mid]){
	             cstart = mid + 1; 
	        };
	    };
	    
	    return new int[]{-1,-1};
	}
}
