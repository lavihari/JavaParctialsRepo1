package inheritance;

public class bank 
{
	private static final bank[] Bank = null;
	int bno;
	String bname;
	String blocation;


	public String getBlocation() 
	{
		return blocation;
	}

	public void setBlocation(String blocation) 
	{
		this.blocation = blocation;
	}

	public String getBname() 
	{
		return bname;
	}

	public void setBname(String bname) 
	{
		this.bname = bname;
	}

	public int getBno() 
	{
		return bno;
	}

	public void setBno(int bno) 
	{
		this.bno = bno;
	}

	public void bank1()
	{
		bank obj1 = new bank();
		obj1.setBno(10);
		System.out.println("bank id:" +obj1.getBno());
		obj1.setBname("indian");
		System.out.println("bank name:" +obj1.getBname());
		obj1.setBlocation("india");
		System.out.println("bank location:" +obj1.getBlocation());
		
		bank obj11 = new bank();
		 for(int i=1; i<10; i++)
		 {
			 System.out.println("bank id:" + i);
			 System.out.println("bank name:" +i);
			 System.out.println("bank location:" +i);
		 }
		
	}
}