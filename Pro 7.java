import java.util.Scanner;
import java.lang.*;
public class Lift {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
	    int liftA=0;
	    int liftB=7;
	    int t;
	    int call;
	    t=sc.nextInt();
	    for(int i=1;i<=t;i++)
	    {

	        call=sc.nextInt();
	        if(Math.abs(liftA-call)<Math.abs(liftB-call))
	        {
	            System.out.println("A");
	            liftA=call;
	        }
	        else if(Math.abs(liftA-call)>Math.abs(liftB-call))
	        {
	        	System.out.println("B");
	            liftB=call;
	        }
	        else
	        {
	            if(liftA<liftB)
	            {
	            	System.out.println("A");
	                liftA=call;
	            }
	            else
	            {
	            	System.out.println("B");
	                liftB=call;
	}

}
	    }
	}
}
