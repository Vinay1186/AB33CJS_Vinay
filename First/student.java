package First;

class Teacher
{
	void teaching_java()
	{
		
		System.out.println("i am teaching java");
	}
	void teaching_selenium()
	{
		
		System.out.println("i am teaching selenium");
		
	}
	
}
public class student extends Teacher 
{
	void java() 
	{
		
		System.out.println("i am learning java");
		
	}
	
	void selenium() 
	{
		
		System.out.println("i am learning selenium");
		
	}
	
	public static void main(String[] args) 
	{
        Teacher t1 = new student();    //upcasting
        t1.teaching_java();
        t1.teaching_selenium();
		
		
	}

}
