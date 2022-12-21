package Main;

import java.io.Serializable;

public class Mark implements Serializable{
	private Course course;
	private int firstAttestation;
	private int secondAttestation;
	private int finalExam;

	public Mark(Course course, int firstAttestation, int secondAttestation, int finalExam) {
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
}
