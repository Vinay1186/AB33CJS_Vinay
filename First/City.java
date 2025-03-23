package First;

class Country
{

     void NH_Road()
     {
	     System.out.println("NH_Roads");
     }
     
}
class State extends Country
{
	void State_Roads()
	{
		System.out.println("State_Roads");
	}
	
	
}
public class City extends State{

	public static void main(String[] args)
	
	{
        State s1 = new City();   //Upcasting
		s1.State_Roads();
		s1.NH_Road();
		
		City c1 = (City)s1;      //Downcasting
		}

}
