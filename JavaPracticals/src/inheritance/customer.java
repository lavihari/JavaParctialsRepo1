package inheritance;

public class customer extends bank
{
	int cid;
	int cacno;
	String cname;
	double camount;
	
	public double getCamount() {
		return camount;
	}

	public void setCamount(double camount) {
		this.camount = camount;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getCacno() {
		return cacno;
	}

	public void setCacno(int cacno) {
		this.cacno = cacno;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public void customer1()
	{
		customer obj = new customer();
		obj.setCid(1);
		System.out.println("customer id:" +obj.getCid());
		obj.setCacno(110);
		System.out.println("customer accountno:" +obj.getCacno());
		obj.setCname("sai");
		System.out.println("customer name:" +obj.getCname());
		obj.setCamount(100.0);
		System.out.println("customer amount:" +obj.getCamount());
		
		customer obj1 = new customer();	
		 for(int i=1; i<10; i++)
		 {
			 
			 System.out.println("customer id:" + i);
			 System.out.println("customer accountno:" + i);
			 System.out.println("customer name:" + i);
			 System.out.println("customer amount:" +i );
		 }
	}
}
