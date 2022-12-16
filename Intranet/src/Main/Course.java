package Main;

import java.util.Date;
import java.util.HashMap;
import java.util.Objects;
import java.util.Vector;

public class Course {
	private String name;
	private int credits;
	private String description;
	private String courseId;
	// private Vector<Student> enrolled;
	// private Vector<Teacher> teachers;
	// Vector<Teacher> getTeachers() {
	// Database.users.stream().filet(u->u instanceof Teacher)
	// Database.teachers.stream().filter(t->t.courses.contains(this)).collect(Collectors.toList())
	private HashMap<Student, Mark> marks;
	private Vector<Course> prerequisite;
	private boolean isElective;
	private Semester semester;
	private Faculty faculty;
	private int maxNumberOfStudents;

	public Course(String name, int credits, String description, String courseId, Vector<Course> prerequisite,
			boolean isElective, Semester semester, Faculty faculty, int maxNumberOfStudents) {
		this.name = name;
		this.credits = credits;
		this.setDescription(description);
		this.setCourseId(courseId);
		this.prerequisite = prerequisite;
		this.semester = semester;
		this.isElective = isElective;
		this.faculty = faculty;
		this.teachers = new Vector<Teacher>();
		enrolled = new Vector<Student>();
		this.maxNumberOfStudents = maxNumberOfStudents;

	}

	public boolean addStudent(Student student) {
		if (!enrolled.contains(student) && enrolled.size() < maxNumberOfStudents) {
			for (Course course : prerequisite) {
				if (!student.getCourses().contains(course)) {
					return false;
				}
			}
			enrolled.add(student);
			student.addCourse(this);
			return true;
		}
		return false;
	}

	public Vector<Student> getEnrolled() {
		return enrolled;
	}

	public String getName() {
		return name;
	}

	public boolean removeStudent(Student student) {
		return enrolled.remove(student) && student.dropCourse(this);
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public boolean isElective() {
		return isElective;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public HashMap<Date, Mark> getMark(Student student) {
		return null;
	}

	public void addMark(Student student, Mark mark) {
	}

	public void removeMark(Student student, Date date) {
	}

	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}

	public void removeTeacher(Teacher teacher) {
		if (teachers.contains(teacher)) {
			teachers.remove(teacher);
			teacher.removeCourse(this);
		}
	}

	public Vector<Teacher> getTeachers() {
		return teachers;
	}

	public String toString() {
		return "Course [name=" + name + ", credits=" + credits + ", description=" + description + ", courseId="
				+ courseId + ", enrolled=" + enrolled + ", teachers=" + teachers + ", marks=" + marks
				+ ", prerequisite=" + prerequisite + ", isElective=" + isElective + ", semester=" + semester
				+ ", faculty=" + faculty + ", maxNumberOfStudents=" + maxNumberOfStudents + "]";
	}

	public int hashCode() {
		return Objects.hash(courseId, credits, description, enrolled, faculty, isElective, marks, maxNumberOfStudents,
				name, prerequisite, semester, teachers);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(courseId, other.courseId) && credits == other.credits
				&& Objects.equals(description, other.description) && Objects.equals(enrolled, other.enrolled)
				&& faculty == other.faculty && isElective == other.isElective && Objects.equals(marks, other.marks)
				&& maxNumberOfStudents == other.maxNumberOfStudents && Objects.equals(name, other.name)
				&& Objects.equals(prerequisite, other.prerequisite) && semester == other.semester
				&& Objects.equals(teachers, other.teachers);
	}

}