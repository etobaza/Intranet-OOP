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
		try {
			for (Course course : courses) {
				gradeJournal.put(course, new TreeMap<>());
			}
		} catch (java.lang.NullPointerException E) {
			System.out.println("No userCourses in Journal.");
		}

	}

	public void addGrade(Course course, double grade) {
		if (userCourses.contains(course)) {
			Map<Date, Double> grades = gradeJournal.get(course);
			grades.put(new Date(), grade);
		}
	}

	public String viewGrades(Course course) {
		if (gradeJournal.containsKey(course)) {
			Map<Date, Double> grades = gradeJournal.get(course);
			String result = "Grades for " + course.getName() + ":\n";
			for (Map.Entry<Date, Double> entry : grades.entrySet()) {
				Date date = entry.getKey();
				Double grade = entry.getValue();
				result += date + ": " + grade + "\n";
			}
			return result;
		}
		return "No such course.";
	}

	public Map<Date, Double> getGrades(Course course) {
		return gradeJournal.get(course);
	}

}
