import java.util.Scanner;
class Main{
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		int n2= in.nextInt();
        int n= ((n2/10)%10);
		System.out.println(n);
	}
}