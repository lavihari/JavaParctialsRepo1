package AssignmentArrayOfObject;

class bank
 {
	 int bno;
	 String bname;
	 String blocation;
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBlocation() {
		return blocation;
	}
	public void setBlocation(String blocation) {
		this.blocation = blocation;
	}
	 
 }
class customer
{
	public static final int getaccountno = 0;
	int customerid;
	String customername;
	int customeracno;
	double customeramount;
	public char[] sgetCustomeracno;
	public String getCustomerid;
	public customer() {
		// TODO Auto-generated constructor stub
	}
	public customer(int customerid, String customername, int customeracno, double customeramount) {
		// TODO Auto-generated constructor stub
		this.customerid = customerid;
		this.customername = customername;
		this.customeracno = customeracno;
		this.customeramount = customeramount;
	}

	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public int getCustomeracno() {
		return customeracno;
	}
	public int setCustomeracno(int customeracno)
	{
		return this.customeracno = customeracno;
	}

	public double getCustomeramount() {
		return customeramount;
	}
	public void setCustomeramount(int customeramount) {
		this.customeramount = customeramount;
	}
	public char[] sgetCustomeracno(customer customer) {
		// TODO Auto-generated method stub
		return null;
	}
	public String getaccountno() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
public class AssignmentArrayOfObject {

	private static final String Arrays = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank ban = new bank();
		ban.setBno(10);
		System.out.println(ban.getBno());
		ban.setBname("srinath");
		System.out.println(ban.getBname());
		ban.setBlocation("india");
		System.out.println(ban.getBlocation());
		
		
		customer[] Customer = new customer[10];
		for(int i=0; i<10; i++)
		{
			Customer[i] = new customer(i+1, "customer" + (i+1), 100+1, 1000.0);
		}
		for(customer customer: Customer)
		{
			System.out.println("customerid:" + customer.getCustomerid());
			System.out.println("customername:" + customer.getCustomername());
			System.out.println("accountno:" + customer.getCustomeracno());
			System.out.println("amount:" + customer.getCustomeramount());
	
		}
	}

}
