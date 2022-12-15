package Main;

import java.util.Vector;

public class StudentAdvisor implements Advisor {
	private final Vector<Student> subordinates;
	private final Student advisor;

	public StudentAdvisor(Student advisor) {
		this.advisor = advisor;
		this.subordinates = new Vector<>();
	}

	public String giveAdvice(String advise) {
		return advisor.getFirstName() + " said: " + advise;
	}

	public void addSubordinate(Student student) {
		subordinates.add(student);
	}

	public String viewStudentJournal(Student student, Course course) {
		return student.viewJournal(course);
	}

	public String viewStudentTranscript(Student student) {
		return student.viewTranscript();
	}
}