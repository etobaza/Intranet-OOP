package Main;

import java.util.Vector;

public final class Database {
	private final static String BASE_PATH = "memememamomo";
	private static Database instance = new Database(BASE_PATH);
	private final String path;

	public static Vector<User> users = new Vector<User>();
	public static Vector<Student> students = new Vector<Student>();
	public static Vector<Admin> admins = new Vector<Admin>();
	public static Vector<DeskWorker> deskworkers = new Vector<DeskWorker>();
	public static Vector<Manager> managers = new Vector<Manager>();
	public static Vector<Teacher> teachers = new Vector<Teacher>();
	public static Vector<Course> courses = new Vector<Course>();
	public static Vector<Message> messages = new Vector<Message>();
	public static Vector<Journal> journals = new Vector<Journal>();
	public static Vector<Mark> marks = new Vector<Mark>();
	public static Vector<News> news = new Vector<News>();
	public static Vector<Organization> organizations = new Vector<Organization>();
	public static Vector<Transcript> transcripts = new Vector<Transcript>();

	public static boolean updateStudent(Student student) {
		if (students.contains(student)) {
			students.remove(student);
			students.addElement(student);
			return true;
		} else
			students.addElement(student);
		return false;
	}

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