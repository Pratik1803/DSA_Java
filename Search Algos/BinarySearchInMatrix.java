import java.util.*;
public class BinarySearchInMatrix
{
	public static void main(String[] args) {
		System.out.println("Binary search in 2D Arrays or Matrices.");
		System.out.println("Complexity: O(n)");
		System.out.println("");
		int[][] matrix = {
		    {10,20,30,40},
		    {15,25,35,45},
		    {28,29,37,49},
		    {33,34,38,50}
		};
		int target = 38;
		System.out.println(Arrays.toString(search(matrix, target)));
	};
	
	static int[] search(int[][] matrix, int target){
	    int row = 0;
	    int col = matrix[0].length - 1;
	    while(row<matrix.length && col>=0){
	        if(matrix[row][col] == target){
	            return new int[] {row, col};
	        }else if(matrix[row][col] > target){
	            col--;
	        }else{
	            row++;
	        };
	    };
	    return new int[]{-1, -1};
	}
}
