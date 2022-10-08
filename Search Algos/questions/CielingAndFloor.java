public class CielingAndFloor
{
	public static void main(String[] args) {
		System.out.println("Cieling or Floor of a number.");
		int[] arr = {5,10,15,20,25,30,35,40,45,50};
		int target = 4;
		String type = "Floor";
		
// 		We need to find the smallest number in the array which is equal or greater than target.
        
        int res = search(arr, target, type);
        System.out.println(res);
	};
	
	static int search(int[] arr, int target, String type){
	    int start = 0;
	    int end = arr.length - 1;
	    while(start<=end){
	        int mid = start + (end - start)/2;
	        if(arr[mid] == target){
	            return mid;
	        }else if(target< arr[mid]){
	            end = mid - 1;
	        }else{
	            start = mid + 1;
	        }
	    };
	    if(type == "Cieling"){
	        return start;
	    }else{
	        return end;
	    }
	}
}
