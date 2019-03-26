package hui.com.thread.a;

public class MyAThread implements Runnable {
	private Thread t;
	private String strname;

	public MyAThread(String strname) {
		this.strname = strname;
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			// TODO Auto-generated method stub
			System.out.println("this is" + strname+i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	public void start(){
		
		 System.out.println("Starting " +  strname );
	      if (t == null) {
	         t = new Thread (this, strname);
	         t.start ();
	      }
	}

}
