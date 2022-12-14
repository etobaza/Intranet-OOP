package Main;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Transcript {
	private Student student;
	private Journal journal;
	private HashMap<Course, Double> transcript;

	public Transcript(Student student, Journal journal) {
		this.student = student;
		this.journal = journal;
		this.transcript = new HashMap<>();

		for (Course course : student.getCourses()) {
			transcript.put(course, gpaForCourse(course));
		}
	}

	public double gpaForCourse(Course course) {
		Map<Date, Double> grades = journal.getGrades(course);
		double total = 0;
		for (double grade : grades.values()) {
			total += grade;
		}
		return total / grades.size();
	}

	public double totalGpa() {
		double total = 0;
		for (double gpa : transcript.values()) {
			total += gpa;
		}
		return total / transcript.size();
	}

	public String viewTranscript() {
		String output = "";
		output += "Total GPA: " + this.totalGpa() + "\n";
		for (Map.Entry<Course, Double> trans : transcript.entrySet()) {
			output += "Course: " + trans.getKey() + "GPA " + trans.getValue() + "\n";
		}
		return output;
	}

	public HashMap<Course, Double> getTranscript() {
		return transcript;
	}
}
