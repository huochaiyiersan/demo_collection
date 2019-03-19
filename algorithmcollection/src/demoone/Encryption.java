package demoone;

import java.util.Scanner;
/**
 * 利用异或运算加密解密
 * @author hui
 *
 */
public class Encryption {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		//对每个字符加密
		for(int i=0;i<ch.length;i++){
			ch[i] = (char)(ch[i]^20);
		}
		System.out.println("输出加密结果："+new String(ch));
		
		//对每个字符解密
		for(int i=0;i<ch.length;i++){
			ch[i] = (char)(20^ch[i]);
		}
		
		System.out.println("输出解密结果"+new String(ch));

	}

}
