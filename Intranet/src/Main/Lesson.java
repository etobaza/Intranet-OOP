package Main;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Lesson implements Serializable{
	private static final long serialVersionUID = 6338373096898101263L;
	private Course course;
	private Day day;
	private Format format;
	private LessonType lessonType;
	private Date date;
	private int room;
	private boolean attendance;
	private Teacher teacher;

	public Lesson(Course course, Day day, Format format, LessonType lessonType, int room, Teacher teacher) {
		this.course = course;
		this.setDay(day);
		this.setFormat(format);
		this.setLessonType(lessonType);
		this.setDate(new Date());
		this.setRoom(room);
		this.teacher = teacher;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public boolean isAttendance() {
		return attendance;
	}

	public void setAttendance(boolean attendance) {
		this.attendance = attendance;
	}

	public Course getCourse() {
		return course;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public LessonType getLessonType() {
		return lessonType;
	}

	public void setLessonType(LessonType lessonType) {
		this.lessonType = lessonType;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Format getFormat() {
		return format;
	}

	public void setFormat(Format format) {
		this.format = format;
	}

	public Day getDay() {
		return day;
	}

	public void setDay(Day day) {
		this.day = day;
	}

	public String toString() {
		return "Lesson [course=" + course + ", day=" + day + ", format=" + format + ", lessonType=" + lessonType
				+ ", date=" + date + ", room=" + room + ", attendance=" + attendance + "]";
	}

	public int hashCode() {
		return Objects.hash(attendance, course, date, day, format, lessonType, room);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lesson other = (Lesson) obj;
		return attendance == other.attendance && Objects.equals(course, other.course)
				&& Objects.equals(date, other.date) && day == other.day && format == other.format
				&& lessonType == other.lessonType && room == other.room;
	}

}
