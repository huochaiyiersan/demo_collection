package hui.com.thread;

import hui.com.thread.a.MyAThread;

public class ThreadTest {

	public static void main(String[] args) {
		MyAThread myAThread = new MyAThread("a");

		MyAThread myBThread = new MyAThread("b");

		
			myAThread.start();
			myBThread.start();
		
	}

}
