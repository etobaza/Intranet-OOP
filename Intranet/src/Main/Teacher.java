package Main;

import java.util.Vector;

public class Teacher extends Employee implements ViewInfoStudents, Create {

	private String department;
	private String course;
	private TeacherTitle teacherTitle;
	private Semester semester;
	private Faculty faculty;
	private Vector<Student> studentList;

	public Teacher(String department, String course, TeacherTitle teacherTitle, Semester semester, Faculty faculty,
			Vector<Student> studentList) {
		super();
		this.department = department;
		this.course = course;
		this.teacherTitle = teacherTitle;
		this.semester = semester;
		this.faculty = faculty;
		this.studentList = studentList;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
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

	public Vector<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(Vector<Student> studentList) {
		this.studentList = studentList;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	public boolean putMarks() {
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

	public boolean removeCourse() {
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

	}

	public void viewStudents() {

	}

}
