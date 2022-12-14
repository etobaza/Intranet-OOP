package Main;

import java.util.Date;
import java.util.HashMap;
import java.util.Objects;
import java.util.Vector;

public class Student extends User implements ViewTranscript {
	private double gpa;
	private Faculty faculty;
	private Date enrollmentDate;
	private boolean dormNeed;
	private int year;
	private OrganizationName organisation;
	private Semester semester;
	private AcademicDegree academicDegree;
	private HashMap<Course, Double> marksForCourses;
	private Vector<Course> courses;

	public Student(String firstName, String lastName, String id, String username, String password, Sex sex, int age,
			String email, double gpa, Faculty faculty, Date enrollmentDate, boolean dormNeed, int year,
			OrganizationName organisation, Semester semester, AcademicDegree academicDegree) {
		super(firstName, lastName, id, username, password, sex, age, email);
		this.gpa = gpa;
		this.faculty = faculty;
		this.enrollmentDate = enrollmentDate;
		this.dormNeed = dormNeed;
		this.year = year;
		this.organisation = organisation;
		this.semester = semester;
		this.academicDegree = academicDegree;
	}

	public void viewCourses() {
	}

	public void viewStudentInfo() {
	}

	public void viewMarks() {
	}

	public void viewAttendance() {
	}

	public boolean addCourse() {
		return false;
	}

	public boolean dropCourse() {
		return false;
	}

	public void confirmAttendance() {
	}

	public void viewOrganization() {
	}

	public boolean joinOrganization() {
		return false;
	}

	public boolean leaveOrganization() {
		return false;
	}

	public void viewTranscript() {
	}

	public void getTranscript() {
	}

	public HashMap<Course, Double> getMarksForCourses() {
		return marksForCourses;
	}

	public void setMarksForCourses(String courseName, double value) {
		for (Course course : courses) {
			if (course.getName().equals(courseName)) {
				double existingValue = marksForCourses.get(course);
				double updatedValue = existingValue + value;
				marksForCourses.put(course, updatedValue);
				return;
			}
		}
	}

	public Vector<Course> getCourses() {
		return courses;
	}

	public void addCourse(Course course) {
		courses.add(course);
	}

	public void dropCourse(Course course) {
		if (courses.contains(course)) {
			courses.remove(course);
		}
	}

	public String toString() {
		return "Student [gpa=" + gpa + ", faculty=" + faculty + ", dateOfJoin=" + enrollmentDate + ", dormNeed="
				+ dormNeed + ", course=" + year + ", organisation=" + organisation + ", semester=" + semester
				+ ", academicDegree=" + academicDegree + "]";
	}

	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ Objects.hash(academicDegree, year, enrollmentDate, dormNeed, faculty, gpa, organisation, semester);
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return academicDegree == other.academicDegree && year == other.year
				&& Objects.equals(enrollmentDate, other.enrollmentDate) && dormNeed == other.dormNeed
				&& faculty == other.faculty && Double.doubleToLongBits(gpa) == Double.doubleToLongBits(other.gpa)
				&& organisation == other.organisation && semester == other.semester;
	}
}
