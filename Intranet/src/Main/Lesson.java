package Main;

import java.util.Date;

public class Lesson {
	private Course course;
	private Day day;
	private Format format;
	private LessonType lessonType;
	private Date date;
	private int room;
	private boolean attendance;

	public Lesson(Course course, Day day, Format format, LessonType lessonType, int room) {
		this.setCourse(course);
		this.day = day;
		this.format = format;
		this.lessonType = lessonType;
		this.date = new Date();
		this.room = room;
	}

	public boolean getAttendance() {
		return attendance;
	}

	public void setAttendance(boolean attendance) {
		this.attendance = attendance;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

}
