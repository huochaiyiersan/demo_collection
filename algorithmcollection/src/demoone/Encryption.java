package demoone;

import java.util.Scanner;
/**
 * �������������ܽ���
 * @author hui
 *
 */
public class Encryption {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		//��ÿ���ַ�����
		for(int i=0;i<ch.length;i++){
			ch[i] = (char)(ch[i]^20);
		}
		System.out.println("������ܽ����"+new String(ch));
		
		//��ÿ���ַ�����
		for(int i=0;i<ch.length;i++){
			ch[i] = (char)(20^ch[i]);
		}
		
		System.out.println("������ܽ��"+new String(ch));

	}

}
