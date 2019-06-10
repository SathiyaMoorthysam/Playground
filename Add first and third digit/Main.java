import java.util.Scanner;
class Main{
	public static void main (String[] args) 
    {
		// Type your code here
     Scanner in = new Scanner(System.in);
      int num1 = in.nextInt();
      int f=num1/100;
      int a=num1%10;
      int sum=f+a;
      System.out.println(sum);
      
	}
}