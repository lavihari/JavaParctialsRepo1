package overridingDemo;

class superClass
{
	public void showval()
	{
		System.out.println("this is super class method");
	}
}
class subClass extends superClass
{
	public void showval()
	{
		System.out.println("this is sub class method");
		super.showval();
	}
}

public class MethodOverridingDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		subClass obj = new subClass();
		obj.showval();
	}
}