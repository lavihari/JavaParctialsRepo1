package overridingDemo;

class parent
{
	public int x=10;
}
class child extends parent
{
	public int x=20;
	public void showval()
	{
		System.out.println("x value:" +x);
		System.out.println("parent x value:" +super.x);
	}
}

public class InstanceVariable {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		child obj = new child();
		obj.showval();

	}

}
