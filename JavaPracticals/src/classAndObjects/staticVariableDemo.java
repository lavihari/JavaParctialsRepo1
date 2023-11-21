package classAndObjects;

class staticdemo
{
	static int x;
	
	public void showx()
	{
		System.out.println("x=" +x);
	}
}
public class staticVariableDemo {
public static void main(String args[])
{
	staticdemo obj1= new staticdemo();
	staticdemo obj2= new staticdemo();
	
	//staticdemo.x=100;
	//staticdemo.x=200;
	
	obj1.x=100;
	obj2.x=200;
	
	obj1.showx();
	obj2.showx();
}
}
