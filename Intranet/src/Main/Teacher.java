package Main;

import java.util.Vector;

public class Teacher extends Employee implements ViewInfoStudents, Create {
	private String department;
	private Vector<Course> courses;
	private TeacherTitle teacherTitle;
	private Semester semester;
	private Faculty faculty;

	public Teacher(String firstName, String lastName, String id, String username, String password, Sex sex, int age,
			String email, double salary, String department, Vector<Course> courses, TeacherTitle teacherTitle,
			Semester semester, Faculty faculty) {
		super(firstName, lastName, id, username, password, sex, age, email, salary);
		this.department = department;
		this.courses = courses;
		this.teacherTitle = teacherTitle;
		this.semester = semester;
		this.faculty = faculty;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Vector<Course> getCourses() {
		return courses;
	}

	public void addCourse(Course course) {
		if (!courses.contains(course)) {
			courses.add(course);
			course.addTeacher(this);
		}
	}

	public TeacherTitle getTeacherTitle() {
		return teacherTitle;
	}

	public void setTeacherTitle(TeacherTitle teacherTitle) {
		this.teacherTitle = teacherTitle;
	}

	public Semester getSemester() {
		return semester;
	}

	public void setSemester(Semester semester) {
		this.semester = semester;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	public boolean putMark(Student student, Course course) {
		return false;
	}

	public boolean manageCourseFiles() {
		return false;
	}

	public void viewStrudentInfo() {

	}

	public void viewCourses() {
	}

	public void viewMarks() {
	}

	public boolean addCourse() {
		return false;
	}

	public boolean removeCourse(Course course) {
		if (courses.contains(course)) {
			courses.remove(course);
			return true;
		}
		return false;
	}

	public void manageFiles() {
	}

	public boolean sendMessage() {
		return false;
	}

	public void setAttendance() {
	}

	public void putAttendance() {
	}

	public void viewAttendance() {
	}

	public Faculty getFaculty() {
		return null;
	}

	public boolean addToDB() {
		return false;
	}

	public void viewStudents() {

	}

	public void viewStudentInfo() {
	}

}
