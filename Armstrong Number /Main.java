import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    int copy = n;
	    int d = 0;
	    if(n == 0){
	        System.out.print(n);
	    }
	    else{
	        while(n > 0){
	            d++;
	            n = n / 10;
	        }
	    }
	    n = copy;
	    int sum = 0;
	    int pow = 1;
	    while(n > 0)
	    {
	        int rem = n % 10;
	        for(int count = 1; count <= d; count++){
	            pow = pow * rem;
	        }
	        sum = sum  + pow;
	        pow = 1;
	        n = n / 10;
	    }
	    if(sum == copy){
	        System.out.print("Armstrong Number");
	    }
	    else{
	        System.out.print("Not a Armstrong Number");
	    }
	}
}
