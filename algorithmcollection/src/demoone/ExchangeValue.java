package demoone;

import java.util.Scanner;

public class ExchangeValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ��ֵ");
		long a = sc.nextLong();
		
		System.out.println("������ڶ���ֵ");
		
		long b = sc.nextLong();
		
		System.out.println("a="+a+"\nb="+b);
		System.out.println("a��b��ֵ����");
		
		a = a^b;
		System.out.println(a);
		b=b^a;
		System.out.println(b);
		a=a^b;
		System.out.println(a);

	}

}
