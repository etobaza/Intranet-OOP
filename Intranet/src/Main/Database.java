package Main;

public final class Database {

	private final static String BASE_PATH = "memememamomo";
	private static Database instance = new Database(BASE_PATH);
	private final String path;

	private Database(String path) {
		this.path = path;
	}

	public String getPath() {
		return this.path;
	}

	public static Database getInstance() {
		return instance;
	}
}
