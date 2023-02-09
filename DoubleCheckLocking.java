package SingletonDesignPatterns;

public class DoubleCheckLocking {
	
	private static DoubleCheckLocking doubleCheckLocking;
	
	private DoubleCheckLocking() {
		
	}
	
	public static DoubleCheckLocking getInstance() {
		if(doubleCheckLocking == null) {
			synchronized(DoubleCheckLocking.class){
				if(doubleCheckLocking == null) {
					doubleCheckLocking = new DoubleCheckLocking();
				}
			}
		}
		return doubleCheckLocking;
	}

}
