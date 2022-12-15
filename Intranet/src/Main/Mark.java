package Main;

public class Mark {
	private Course course;
	private int gpa;
	private int firstAttestation;
	private int secondAttestation;
	private int finalExam;

	public Mark(Course course, int gpa, int firstAttestation, int secondAttestation, int finalExam) {
		this.course = course;
		this.gpa = gpa;
		this.firstAttestation = firstAttestation;
		this.secondAttestation = secondAttestation;
		this.finalExam = finalExam;
	}

}
