package StringsDemo;

public class changeExistingStringValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "lavanya";
		String s2 = s1.replace("lavanya" , "srinath");
		System.out.println(s2);
		s2= s2.replace("srinath" , "lavanya");
		System.out.println(s2);
	}

}
