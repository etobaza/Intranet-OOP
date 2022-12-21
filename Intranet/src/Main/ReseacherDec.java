package Main;

import java.util.*;

public class ReseacherDec implements Researcher {
	private HashMap<Student, Enum> students;
	private HashMap<Teacher, Enum> teachers;

	public void ResearchDecorator() {
	}

	public boolean doReserch(Student student, Teacher teacher) {
		if (((Map<Teacher, Enum>) teacher).containsValue(TeacherTitle.PROFESSOR)
				&& ((Map<Student, Enum>) student).containsValue(AcademicDegree.PHD)) {
			if (students.containsKey(student) && teachers.containsKey(teacher))
				return true;
		} else
			return false;
		return false;
	}

	public void publishResearch() {

	}

	public void doReserch() {

	}

}
