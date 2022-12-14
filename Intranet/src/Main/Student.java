package Main;

import java.util.Date;
import java.util.HashMap;
import java.util.Objects;
import java.util.Vector;

public class Student extends User implements ViewTranscript, Create {
	private double gpa;
	private Faculty faculty;
	private Date enrollmentDate;
	private boolean dormNeed;
	private int year;
	private Semester semester;
	private AcademicDegree academicDegree;
	private HashMap<Course, Double> marksForCourses;
	private Vector<Course> courses;

	public Student(String firstName, String lastName, String id, String username, String password, Sex sex, int age,
			String email, double gpa, Faculty faculty, Date enrollmentDate, boolean dormNeed, int year,
			Semester semester, AcademicDegree academicDegree) {
		super(firstName, lastName, id, username, password, sex, age, email);
		this.gpa = gpa;
		this.faculty = faculty;
		this.enrollmentDate = enrollmentDate;
		this.dormNeed = dormNeed;
		this.year = year;
		this.semester = semester;
		this.academicDegree = academicDegree;
	}

	public String viewStudentInfo() {
		return String.format(
				"First name: %s\nLast name: %s\nID: %s\nUsername: %s\nSex: %s\nAge: %d\nEmail: %s\nFaculty: %s\nEnrollment date: %s\nYear: %d\nSemester: %s\nAcademic degree: %s",
				this.getFirstName(), this.getLastName(), this.getId(), this.getUsername(), this.getSex(), this.getAge(),
				this.getEmail(), this.faculty, this.enrollmentDate, this.year, this.semester, this.academicDegree);
	}

	public void viewAttendance() {
	}

	public void confirmAttendance() {
	}

	public void viewOrganization() {

	}

	public void joinOrganization(Organization org) {
		org.addCandidate(this);
	}

	public void leaveOrganization(Organization org) {
		org.leaveOrganization(this);
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
			marksForCourses.remove(course);
		}
	}

	public String toString() {
		return "Student [gpa=" + gpa + ", faculty=" + faculty + ", dateOfJoin=" + enrollmentDate + ", dormNeed="
				+ dormNeed + ", course=" + year + ", organisation=" + organization + ", semester=" + semester
				+ ", academicDegree=" + academicDegree + "]";
	}

	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ Objects.hash(academicDegree, year, enrollmentDate, dormNeed, faculty, gpa, organization, semester);
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
				&& organization == other.organization && semester == other.semester;
	}
	
	public void addToDB() {
	      System.out.println("User was added.");
	   }
}
