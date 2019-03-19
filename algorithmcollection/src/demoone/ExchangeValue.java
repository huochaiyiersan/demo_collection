package demoone;

import java.util.Scanner;

public class ExchangeValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个值");
		long a = sc.nextLong();
		
		System.out.println("请输入第二个值");
		
		long b = sc.nextLong();
		
		System.out.println("a="+a+"\nb="+b);
		System.out.println("a和b的值互换");
		
		a = a^b;
		System.out.println(a);
		b=b^a;
		System.out.println(b);
		a=a^b;
		System.out.println(a);

	}

}
