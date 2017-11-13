
public class ThreadTest implements Runnable {
	
	@Override
	public synchronized void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String []args) {
		Thread t1 = new Thread(new ThreadTest());
		t1.setName("THREAD-1");
		t1.start();
		Thread t2 = new Thread(new ThreadTest());
		t2.setName("THREAD-2");
		t2.start();
		Thread t3 = new Thread(new ThreadTest());
		t3.setName("THREAD-3");
		t3.start();
	}
}
