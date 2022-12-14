package Main;

import java.util.HashMap;
import java.util.Vector;

/**
 */
public class Course {
	private String name;
	private int credits;
	private String description;
	private String courseId;
	private Vector<Student> student;
	private HashMap<Student, Mark> marks;
	private String prerequisite;
	private boolean isElective;
	private Semester semester;
	private Faculty faculty;

	public Course(String name, int credits, String description, String courseId, String prerequisite, Semester semester,
			Faculty faculty) {
		this.name = name;
		this.credits = credits;
		this.description = description;
		this.courseId = courseId;
		this.prerequisite = prerequisite;
		this.semester = semester;
		this.faculty = faculty;
		student = new Vector<Student>();
	}

	public boolean addStudent() {
		if (!student.contains(student)) {
			student.addAll(student);
			return true;
		}
		return false;
	}

	public void removeStudent() {
		student.remove(student);
	}

	public void dropCourse() {

	}

	/**
	 */
	public void getCredit() {
	}

	/**
	 * @return
	 */
	public boolean isFull() {
		return false;
	}
}
