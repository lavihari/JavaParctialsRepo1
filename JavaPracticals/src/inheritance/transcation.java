package inheritance;

public class transcation extends customer
{ 
	int tid;
	double tamount;
	
	public transcation(int i, double d) 
	{
		// TODO Auto-generated constructor stub
		this.tid = tid;
		this.tamount = tamount;
	}
	public transcation() {
		// TODO Auto-generated constructor stub
	}
	public double getTamount() 
	{
		return tamount;
	}
	public void setTamount(double tamount) 
	{
		this.tamount = tamount;
	}
	public int getTid() 
	{
		return tid;
	}
	public void setTid(int tid) 
	{
		this.tid = tid;
	}
	public void transcation1()
	{
		transcation obj2 = new transcation();
		obj2.setTid(1);
		System.out.println("tarnscation id:" +obj2.getTid());
		obj2.setTamount(100.0);
		System.out.println("transcation amount:" +obj2.getTamount());
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
			transcation ta = new transcation();
			ta.customer1();
			ta.bank1();
			ta.transcation1();
			
			transcation obj2 = new transcation();	
			 for(int i=1; i<10; i++)
			 {
				 System.out.println("transcationid:" + i);
				 System.out.println("transcation amount:" +i );
			 }
	}
}


