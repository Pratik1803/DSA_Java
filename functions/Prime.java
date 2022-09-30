import java.util.Scanner;

public class Prime
{
	public static void main(String[] args) {
	  int input;
	  Scanner in = new Scanner(System.in);
	  input = in.nextInt();
	  System.out.println(isPrime(input));
	};
	
	static boolean isPrime(int n){
	    int c = 2;
	    if(n <=2){
	        return true;
	    };
	    while(c<=n/2){
	        if(n%c==0){
	            return false;
	        }else{
	            c++;
	        };
	    };
	    return true;
	}
}
