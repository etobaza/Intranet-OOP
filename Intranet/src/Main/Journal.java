package Main;

import java.util.Date;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

public class Journal {
	Map<Course, Map<Date, Double>> gradeJournal;

	public Journal(Vector<Course> courses) {
		gradeJournal = new TreeMap<>();
		for (Course course : courses) {
			gradeJournal.put(course, new TreeMap<>());
		}
	}

	public void addGrade(Course course, double grade) {
		Map<Date, Double> grades = gradeJournal.get(course);
		if (grades == null) {
			grades = new TreeMap<>();
			gradeJournal.put(course, grades);
		}
		grades.put(new Date(System.currentTimeMillis()), grade);
	}

	public Map<Date, Double> getGrades(Course course) {
		return gradeJournal.get(course);
	}

}
