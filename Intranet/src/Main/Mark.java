package Main;

import java.io.Serializable;

public class Mark implements Serializable{
	private static final long serialVersionUID = -221375337781799843L;
	private Course course;
	private double firstAttestation;
	private double secondAttestation;
	private double finalExam;

	public Mark(Course course, double firstAttestation, double secondAttestation, double finalExam) {
		this.course = course;
		this.firstAttestation = firstAttestation;
		this.secondAttestation = secondAttestation;
		this.finalExam = finalExam;
	}

	public double getFirstAttestation() {
		return firstAttestation;
	}

	public double getSecondAttestation() {
		return secondAttestation;
	}

	public double getTotal() {
		return firstAttestation * 0.3 + secondAttestation * 0.3 + finalExam * 0.4;
	}

	public Course getCourse() {
		return course;
	}

	public double getFinalExam() {
		return finalExam;
	}
}
