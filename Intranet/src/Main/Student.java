package Main;

import java.util.Date;
import java.util.HashMap;
import java.util.Objects;
import java.util.Vector;

public class Student extends User implements ViewTranscript, Create, Advisor {
	private double gpa;
	private Faculty faculty;
	private Date enrollmentDate;
	private boolean dormNeed;
	private int year;
	private Semester semester;
	private AcademicDegree academicDegree;
	private Vector<Course> courses;
	private Transcript transcript;
	private Journal journal;
	private HashMap<Course, Mark> marks;
	private HashMap<Course, Vector<Boolean>> attendances;

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
		this.journal = new Journal(courses);
		this.transcript = new Transcript(this, journal);
		this.attendances = new HashMap<>();
		for (Course course : courses) {
			attendances.put(course, new Vector<>());
		}
	}

	public String viewStudentInfo() {
		return String.format(
				"First name: %s\nLast name: %s\nID: %s\nUsername: %s\nSex: %s\nAge: %d\nEmail: %s\nFaculty: %s\nEnrollment date: %s\nYear: %d\nSemester: %s\nAcademic degree: %s",
				this.getFirstName(), this.getLastName(), this.getId(), this.getUsername(), this.getSex(), this.getAge(),
				this.getEmail(), this.faculty, this.enrollmentDate, this.year, this.semester, this.academicDegree);
	}

	public Vector<Boolean> attendedList(Course course) {
		return attendances.get(course);
	}

	public boolean attendLesson(Lesson lesson) {
		if (lesson.isAttendance()) {
			Vector<Boolean> attendanceRecord = attendances.get(lesson.getCourse());
			attendanceRecord.add(true);
			attendances.put(lesson.getCourse(), attendanceRecord);
			lesson.getTeacher().recordAttendance(lesson, this);
			return true;
		}
		return false;
	}

	public Vector<Organization> viewOrganizations() {
		Vector<Organization> orgs = new Vector<>();
		for (Organization org : Database.organizations) {
			if (org.getMembers().contains(this)) {
				orgs.add(org);
			}
		}
		return orgs;
	}

	public void joinOrganization(Organization org) {
		org.addCandidate(this);
		Database.updateOrganization(org);
	}

	public void leaveOrganization(Organization org) {
		org.leaveOrganization(this);
		Database.updateOrganization(org);
	}

	public Vector<Course> getCourses() {
		return courses;
	}

	public boolean addCourse(Course course) {
		if (course.getLimit() > course.getEnrolled().size() && !this.getCourses().contains(course)) {
			this.courses.add(course);
			this.transcript = new Transcript(this, journal);
			this.journal = new Journal(courses);
			this.attendances.put(course, new Vector<Boolean>());
			Database.updateStudent(this);
			return true;
		}
		return false;
	}

	public boolean dropCourse(Course course) {
		if (this.getCourses().contains(course)) {
			courses.remove(course);
			this.transcript = new Transcript(this, journal);
			this.journal = new Journal(courses);
			Database.updateStudent(this);
			return true;
		}
		return false;
	}

	public String viewTranscript() {
		return transcript.viewTranscript();
	}

	public String viewJournal(Course course) {
		return journal.viewGrades(course);
	}

	public Journal getJournal() {
		return journal;
	}

	public Transcript getTranscript() {
		return transcript;
	}

	public boolean addToDB() {
		return true;
	}

	public String toString() {
		return "Student [gpa=" + gpa + ", faculty=" + faculty + ", enrollmentDate=" + enrollmentDate + ", dormNeed="
				+ dormNeed + ", year=" + year + ", semester=" + semester + ", academicDegree=" + academicDegree
				+ ", courses=" + courses + ", transcript=" + transcript + ", journal=" + journal + ", marks=" + marks
				+ ", attendances=" + attendances + "]";
	}

	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(academicDegree, attendances, courses, dormNeed, enrollmentDate, faculty,
				gpa, journal, marks, semester, transcript, year);
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
		return academicDegree == other.academicDegree && Objects.equals(attendances, other.attendances)
				&& Objects.equals(courses, other.courses) && dormNeed == other.dormNeed
				&& Objects.equals(enrollmentDate, other.enrollmentDate) && faculty == other.faculty
				&& Double.doubleToLongBits(gpa) == Double.doubleToLongBits(other.gpa)
				&& Objects.equals(journal, other.journal) && Objects.equals(marks, other.marks)
				&& semester == other.semester && Objects.equals(transcript, other.transcript) && year == other.year;
	}

}
