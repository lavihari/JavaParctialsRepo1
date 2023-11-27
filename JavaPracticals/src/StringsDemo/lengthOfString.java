package StringsDemo;

public class lengthOfString {

	public static void main(String[] args)
	{
		StringBuffer obj = new StringBuffer("srinath");
		obj.append("chandru");
		System.out.println("length =" + obj.capacity());
	}
}
