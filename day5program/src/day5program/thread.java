package day5program;
class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("Thread is running");
	}
	
}
public class thread {
	public static void main (String[]args) {
		MyThread thread= new MyThread();
		thread.start();
	}
}
