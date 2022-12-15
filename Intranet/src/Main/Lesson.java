package Main;

import java.util.Date;

public class Lesson {
	private Course course;
	private Day day;
	private Format format;
	private LessonType lessonType;
	private Date date;
	private int room;

	public Lesson(Course course, Day day, Format format, LessonType lessonType, int room) {
		this.course = course;
		this.day = day;
		this.format = format;
		this.lessonType = lessonType;
		this.date = new Date();
		this.room = room;
	}
}
