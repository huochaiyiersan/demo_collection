package wordchange;

import java.util.Scanner;

public class WordChange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入要转换的字符");
		char ch = sc.next().charAt(0);
		
		
		if(ch>='A'&&ch<='Z'){
			
			ch+=32;
			System.out.println((char)(ch-32)+"转换成"+ch);
		}
		
		if(ch>='a'&&ch<='z'){
			
			ch-=32;
			System.out.println((char)(ch+32)+"转换成 "+ch);
		}
		
		
	}

}
