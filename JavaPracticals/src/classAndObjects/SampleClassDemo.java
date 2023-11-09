package classAndObjects;

class bike
{
	private int bid;
	private String bname;
	private double cost;
	
	public void readValues()
	{
		bid=100;
		bname="pulsar";
		cost=100000;
	}
	public void showValues()
	{
		System.out.println("bike id:" +bid);
		System.out.println("bike name:" +bname);
		System.out.println("bike cost:" +cost);
	}
}	
	
public class SampleClassDemo {
	
	public static void main(String args[])
	{
		bike bikeObj = new bike();
		bikeObj.readValues();
		bikeObj.showValues();
	}

}
