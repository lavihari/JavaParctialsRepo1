package Assignment2;

public class BiggestOfThreeNumbers {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int x,y,z;
		x=10;
		y=20;
		z=50;
		if(x >=y)
		{
			System.out.println("biggest number is "+x);
		}
		else
			if(y >=z)
			{
				System.out.println("biggest number is "+y);
			}
			else
				if(z >=x)
				{ 
					System.out.println("biggest number is "+z);
				}
	}
}
