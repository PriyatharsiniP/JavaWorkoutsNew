package SingletonDesignPatterns;

public class ThreadSafe {
	
	private static ThreadSafe threadSafe;
	
	private ThreadSafe() {
		
	}
	
	synchronized public static ThreadSafe getInstance() {
		if(threadSafe == null) {
			threadSafe = new ThreadSafe();
		}
		return threadSafe;
	}

}
