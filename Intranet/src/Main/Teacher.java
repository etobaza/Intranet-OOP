package Main;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Vector;

public class Teacher extends Employee implements Create, Serializable {
	private String department;
	private Vector<Course> courses;
	private TeacherTitle teacherTitle;
	private Semester semester;
	private Faculty faculty;
	private HashMap<Lesson, HashMap<Student, Boolean>> attendanceRecords;
	private Vector<Lesson> hostedLessons;

	public Teacher(String firstName, String lastName, String id, String username, String password, Sex sex, int age,
			String email, double salary, String department, Vector<Course> courses, TeacherTitle teacherTitle,
			Semester semester, Faculty faculty) {
		super(firstName, lastName, id, username, password, sex, age, email, salary);
		this.department = department;
		this.courses = courses;
		this.teacherTitle = teacherTitle;
		this.semester = semester;
		this.faculty = faculty;
		this.attendanceRecords = new HashMap<Lesson, HashMap<Student, Boolean>>();
		this.hostedLessons = new Vector<Lesson>();
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

	public boolean sendMessage(Employee employee, String text) {
		return false;
	}

	public void hostLesson(Course course, Day day, Format format, LessonType lessonType, int room) {
		Lesson lesson = new Lesson(course, day, format, lessonType, room, this);
		hostedLessons.add(lesson);
	}

	public void openAttendance(Lesson lesson) {
		if (!attendanceRecords.containsKey(lesson)) {
			HashMap<Student, Boolean> attendance = new HashMap<>();
			attendanceRecords.put(lesson, attendance);
		}
		lesson.setAttendance(true);
	}

	public void closeAttendance(Lesson lesson) {
		lesson.setAttendance(false);
	}

	public void recordAttendance(Lesson lesson, Student student) {
		HashMap<Student, Boolean> attendance = attendanceRecords.get(lesson);
		attendance.put(student, true);
		attendanceRecords.put(lesson, attendance);
	}

	public HashMap<Student, Boolean> getAttendanceRecords(Lesson lesson) {
		return attendanceRecords.get(lesson);
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public boolean addToDB() {
		return false;
	}

	public void viewStudents(Course course) {
		if (courses.contains(course)) {
			System.out.println(course.getEnrolled());
		}
	}

	public void viewStudentInfo(Student student, Course course) {
		if (this.getCourses().contains(course)) {
			student.viewJournal(course);
		}
	}

}
