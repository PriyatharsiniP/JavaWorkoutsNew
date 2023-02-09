package SingletonDesignPatterns;

public class StaticBlock {
	
	private static StaticBlock staticBlock;
	
	private StaticBlock() {
		
	}
	static {
		staticBlock = new StaticBlock();
	}
	public static StaticBlock getInstance() {
		return staticBlock;
	}

}
