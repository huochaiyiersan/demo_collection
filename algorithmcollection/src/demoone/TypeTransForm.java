package demoone;

public class TypeTransForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b =50;
		char c = 'G';
		short s = 12345;
		int i = 6789;
		long l = 1000L;
		float f = 3.14159F;
		double d = 2.5689745;
		
		System.out.println(b);	
		System.out.println(b+c);
		System.out.println(b+c+s);
		System.out.println(b+c+s+i);
		System.out.println(b+c+s+i+l);
		System.out.println(b+c+s+i+l+f);
		System.out.println(b+c+s+i+l+f+d);
		System.out.println((int)l);
		System.out.println((short)i);
		System.out.println((int)d);
		
		System.out.println((char)s);
	}

}
