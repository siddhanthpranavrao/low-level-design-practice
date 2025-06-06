class Singleton {
	private static volatile Singleton uniqueInstance;
	
	private Singleton()	{}
	
	public static Singleton getInstance() {
		if (uniqueInstance == null ) {
			synchronized (Singleton.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}
	
	
}

public class Main {
	
	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		System.out.println(s);
	}
}