import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
       int mark = sc.nextInt();
      if(mark>=75)
      {
        System.out.println("A");
      }
      else if(mark>=65)
      {
        System.out.println("B");
      }
      else if(mark>=55)
      {
        System.out.println("C");
      }
      else if(mark>=45)
      {
        System.out.println("D");
      }
      else
      {
        System.out.println("Fail");
      }
    }
    }