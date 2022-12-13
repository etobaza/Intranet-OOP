import java.lang.*;
/**
*/
public class Teacher extends Employee   implements ViewInfoStudents , Researcher , Advisor  {
/**
*/
private String department;
/**
*/
private String course;
/**
*/
private TeacherTitle  teacherTitle;
/**
*/
private Semester  semester;
/**
*/
private Faculty faculty;
/**
*/
private Vector<Student> studentList;
/**
 * @return 
*/
public boolean putMarks() {
    return false;
}
/**
 * @return 
*/
public boolean manageCourseFiles() {
    return false;
}
/**
*/
public void viewStudentsInfo() {
}
/**
*/
public void viewCourses:void() {
}
/**
*/
public void viewMarks() {
}
/**
 * @return 
*/
public boolean addCourse() {
    return false;
}
/**
 * @return 
*/
public boolean removeCourse() {
    return false;
}
/**
*/
public void manageFiles() {
}
/**
 * @return 
*/
public boolean sendMessage() {
    return false;
}
/**
*/
public void setAttendance() {
}
/**
*/
public void putAttendance() {
}
/**
*/
public void viewAttendance() {
}
/**
 * @return 
*/
public Faculty getFaculty() {
    return null;
}
}

