import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    int val = n;
	    for(int rownum = 1; rownum <= n; rownum++)
	    {
	        for(int colnum = val; colnum >= 1; colnum--)
	        {
	            System.out.print(colnum);
	        }
	        val--;
	        System.out.println();
	    }
	}
}