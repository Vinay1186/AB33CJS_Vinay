package First;

public class one {

	public static void main(String[] args) 
	{
           double wt = 85.65;
           int your_wt = (int)wt;      //narrowing Explicit
           
           System.out.println(your_wt);
           
           int wt1 = 90;
           double your_wt_new = (double)wt1;   //widening Explicit
           double your_wt3 = wt1;               //widening Implicit
           
           System.out.println(your_wt_new);
           System.out.println(your_wt3);
           
           byte wt4 =  12;
           long your_wt5 = (long)wt4;
           
           System.out.println(your_wt5);
           
           
	}

}
