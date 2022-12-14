package Main;

import java.util.HashMap;
import java.util.Objects;
import java.util.Vector;

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

	public boolean addStudent(Student students) {
		if (!student.contains(students)) {
			student.addAll(student);
			return true;
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public boolean removeStudent(Vector<Student> student2) {
		return student.remove(student2);
	}

	public boolean dropCourse(Course courses) {
		if (courses.removeStudent(student)) {
			for (int i = 0; i < courses.credits; i++) {
				if (courses == courses)
					courses = null;
			}
			return true;
		} else
			return false;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public boolean isFull() {
		return isElective;
	}

	public int hashCode() {
		return Objects.hash(credits);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return credits == other.credits;
	}

	public String toString() {
		return "Course [ course=" + name + ", faculty=" + faculty + ", number of credits=" + credits + ", prerequisite="
				+ prerequisite + ", semester=" + semester + "]";
	}

}