
package readVal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class ReadValue {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int age;
		String name;
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("enter your age:");
		age = Integer.parseInt(br.readLine());
		
		System.out.println("enter your name:");
		name =br.readLine();
		
		System.out.println("your name is:" + name);
		System.out.println("your age is:" + age);
	}

	}

