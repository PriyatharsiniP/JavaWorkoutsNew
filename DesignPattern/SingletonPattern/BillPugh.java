package SingletonDesignPatterns;

public class BillPugh {

	private BillPugh() {
		
	}
	
	private static class Inner{
		private static BillPugh billPugh = new BillPugh();
	}
	
	public static BillPugh getInstance() {
		return Inner.billPugh;
	}

}
