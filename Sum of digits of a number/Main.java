import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in  = new Scanner(System.in);
        // Get the value for n
	    int n = in.nextInt();
        // Extract last digit
	    int sum = 0;
        // Repeatedly remove last digit until it reaches the first digit 
		while(n > 0)
		{
          int rem = n % 10;
          sum = sum + rem;
		   n = n / 10;
		}
		System.out.println(sum);
	}
}