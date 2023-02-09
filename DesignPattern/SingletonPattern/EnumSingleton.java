package SingletonDesignPatterns;

public enum EnumSingleton {
	
	EnumSingletonInstance;
	 
	private EnumSingleton() {
		System.out.println("I am enum constructor");
	}

}
