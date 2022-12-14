package Main;

import java.util.Date;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

public class Journal {
	Map<Course, Map<Date, Double>> gradeJournal;
	Vector<Course> userCourses;

	public Journal(Vector<Course> courses) {
		this.userCourses = courses;
		gradeJournal = new TreeMap<>();
		for (Course course : courses) {
			gradeJournal.put(course, new TreeMap<>());
		}
	}

	public void addGrade(Course course, double grade) {
		if (userCourses.contains(course)) {
			Map<Date, Double> grades = gradeJournal.get(course);
			grades.put(new Date(), grade);
		}
	}

	public Map<Date, Double> getGrades(Course course) {
		return gradeJournal.get(course);
	}

}
