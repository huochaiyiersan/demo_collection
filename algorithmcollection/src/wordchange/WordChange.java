package wordchange;

import java.util.Scanner;

public class WordChange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("������Ҫת�����ַ�");
		char ch = sc.next().charAt(0);
		
		
		if(ch>='A'&&ch<='Z'){
			
			ch+=32;
			System.out.println((char)(ch-32)+"ת����"+ch);
		}
		
		if(ch>='a'&&ch<='z'){
			
			ch-=32;
			System.out.println((char)(ch+32)+"ת���� "+ch);
		}
		
		
	}

}
