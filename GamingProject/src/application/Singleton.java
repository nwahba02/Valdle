package application;

public class Singleton {

	private static final Singleton instance = new Singleton();

	private String difficulty;

	private Singleton() {
	}

	public static Singleton getInstance() {
		return instance;
	}
	
	public String getDifficulty() {
		return difficulty;
	}
	
	public void setdifficulty(String difficulty) {
		this.difficulty = difficulty;

	}
}