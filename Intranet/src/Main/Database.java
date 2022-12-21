package Main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Vector;

public final class Database implements Serializable {
	private static final long serialVersionUID = 1L;
	private final static String BASE_PATH = "C:\\Users\\rblxx\\git\\intranetTwo\\Intranet\\src";
	private static Database instance = new Database(BASE_PATH);
	private final String path;
	private static Database obj;
	public static Vector<User> users = new Vector<User>();
	public static Vector<Employee> employees = new Vector<Employee>();
	public static Vector<Course> courses = new Vector<Course>();
	public static Vector<Message> messages = new Vector<Message>();
	public static Vector<Journal> journals = new Vector<Journal>();
	public static Vector<Mark> marks = new Vector<Mark>();
	public static Vector<News> newss = new Vector<News>();
	public static Vector<Organization> organizations = new Vector<Organization>();
	public static Vector<Transcript> transcripts = new Vector<Transcript>();

	public static boolean updateUser(User user) {
		if (user == null) {
			System.out.println("Error: cannot be null");
			return false;
		}
		int index = users.indexOf(user);
		if (index >= 0) {
			users.set(index, user);
			return true;
		} else {
			users.add(user);
			return false;
		}
	}

	public static boolean updateEmployee(Employee employee) {
		if (employee == null) {
			System.out.println("Error: cannot be null");
			return false;
		}
		int index = users.indexOf(employee);
		if (index >= 0) {
			users.set(index, employee);
			return true;
		} else {
			users.add(employee);
			return false;
		}
	}

	public static boolean updateCourse(Course course) {
		if (course == null) {
			System.out.println("Error: cannot be null");
			return false;
		}
		int index = courses.indexOf(course);
		if (index >= 0) {
			courses.set(index, course);
			return true;
		} else {
			courses.add(course);
			return false;
		}
	}

	public static boolean updateMessage(Message message) {
		if (message == null) {
			System.out.println("Error: cannot be null");
			return false;
		}
		int index = messages.indexOf(message);
		if (index >= 0) {
			messages.set(index, message);
			return true;
		} else {
			messages.add(message);
			return false;
		}
	}

	public static boolean updateJournal(Journal journal) {
		if (journal == null) {
			System.out.println("Error: cannot be null");
			return false;
		}
		int index = journals.indexOf(journal);
		if (index >= 0) {
			journals.set(index, journal);
			return true;
		} else {
			journals.add(journal);
			return false;
		}
	}

	public static boolean updateMark(Mark mark) {
		if (mark == null) {
			System.out.println("Error: cannot be null");
			return false;
		}
		int index = marks.indexOf(mark);
		if (index >= 0) {
			marks.set(index, mark);
			return true;
		} else {
			marks.add(mark);
			return false;
		}
	}

	public static boolean updateNews(News news) {
		if (news == null) {
			System.out.println("Error: cannot be null");
			return false;
		}
		int index = newss.indexOf(news);
		if (index >= 0) {
			newss.set(index, news);
			return true;
		} else {
			newss.add(news);
			return false;
		}
	}

	public static boolean updateOrganization(Organization organization) {
		if (organization == null) {
			System.out.println("Error: cannot be null");
			return false;
		}
		int index = organizations.indexOf(organization);
		if (index >= 0) {
			organizations.set(index, organization);
			return true;
		} else {
			organizations.add(organization);
			return false;
		}
	}

	public static boolean updateTranscript(Transcript transcript) {
		if (transcript == null) {
			System.out.println("Error: cannot be null");
			return false;
		}
		int index = transcripts.indexOf(transcript);
		if (index >= 0) {
			transcripts.set(index, transcript);
			return true;
		} else {
			transcripts.add(transcript);
			return false;
		}
	}

	public static Vector<User> getUsers() {
		return users;
	}

	public static Vector<Employee> getEmployees() {
		return employees;
	}

	public static Vector<Course> getCourses() {
		return courses;
	}

	public static Vector<Message> getMessages() {
		return messages;
	}

	public static Vector<Journal> getJournals() {
		return journals;
	}

	public static Vector<Mark> getMarks() {
		return marks;
	}

	public static Vector<News> getNewss() {
		return newss;
	}

	public static Vector<Organization> getOrganizations() {
		return organizations;
	}

	public static Vector<Transcript> getTranscripts() {
		return transcripts;
	}

	/*
	 * public static boolean updateStudent(Student student) { if (student == null) {
	 * System.out.println("Error: cannot be null"); return false; } int index =
	 * students.indexOf(student); if (index >= 0) { students.set(index, student);
	 * return true; } else { students.add(student); return false; } }
	 * 
	 * 
	 * 
	 * public static boolean updateAdmin(Admin admin) { if (admin == null) {
	 * System.out.println("Error: cannot be null"); return false; } int index =
	 * admins.indexOf(admin); if (index >= 0) { admins.set(index, admin); return
	 * true; } else { admins.add(admin); return false; } }
	 * 
	 * 
	 * public static boolean updateDeskworker(DeskWorker deskworker) { if
	 * (deskworker == null) { System.out.println("Error: cannot be null"); return
	 * false; } int index = deskworkers.indexOf(deskworker); if (index >= 0) {
	 * deskworkers.set(index, deskworker); return true; } else {
	 * deskworkers.add(deskworker); return false; } }
	 * 
	 * public static boolean updateManager(Manager manager) { if (manager == null) {
	 * System.out.println("Error: cannot be null"); return false; } int index =
	 * managers.indexOf(manager); if (index >= 0) { managers.set(index, manager);
	 * return true; } else { managers.add(manager); return false; } }
	 * 
	 * public static boolean updateTeacher(Teacher teacher) { if (teacher == null) {
	 * System.out.println("Error: cannot be null"); return false; } int index =
	 * teachers.indexOf(teacher); if (index >= 0) { teachers.set(index, teacher);
	 * return true; } else { teachers.add(teacher); return false; } }
	 * 
	 * public static Vector<Admin> getAdmins() { return admins; }
	 * 
	 * 
	 * 
	 * public static Vector<Student> getStudents() { return students; }
	 * 
	 * public static Vector<DeskWorker> getDeskworkers() { return deskworkers; }
	 * 
	 * public static Vector<Manager> getManagers() { return managers; }
	 * 
	 * public static Vector<Teacher> getTeachers() { return teachers; }
	 */

	public static void serialize() throws IOException {
		File file = new File("database.txt");
		file.createNewFile();
		if (!file.exists()) {
			file.createNewFile();
		}
		if (!file.canWrite()) {
			file.setWritable(true);
		}

		try {
			FileOutputStream fos = new FileOutputStream("database.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
			oos.writeObject(users);
			oos.writeObject(students);
			oos.writeObject(admins);
			oos.writeObject(deskworkers);
			oos.writeObject(managers);
			oos.writeObject(teachers);
			oos.writeObject(courses);
			oos.writeObject(messages);
			oos.writeObject(journals);
			oos.writeObject(marks);
			oos.writeObject(newss);
			oos.writeObject(organizations);
			oos.writeObject(transcripts);
			oos.flush();
			oos.close();
			System.out.println("Serialization complete");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void deserialize() throws IOException, ClassNotFoundException {
		File file = new File("database.txt");
		if (!file.exists()) {
			System.out.println("Error: file does not exist");
			return;
		}
		if (!file.canRead()) {
			file.setReadable(true);
		}

		FileInputStream fis = new FileInputStream("database.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		instance = (Database) ois.readObject();
		ois.close();
	}

	private Database(String path) {
		this.path = path;
	}

	public String getPath() {
		return this.path;
	}

	public static Database getInstance() {

		if (obj == null) {
			obj = new Database(BASE_PATH);
		}

		return obj;
	}
}