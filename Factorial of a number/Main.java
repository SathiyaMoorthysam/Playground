import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    int a = 1;
        for(int count = 1; count <= n; count++)
	    {
	        a = a * count;
	    }
	    System.out.print(a);
	}
}

