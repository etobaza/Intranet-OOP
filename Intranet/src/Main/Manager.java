package Main;

import java.util.ArrayList;
import java.util.Vector;

public class Manager extends Employee implements ViewInfoStudents, ViewTransript, ViewTeachers, Create {
	private ManagerType type;
	private ArrayList<News> news;
	private Vector<Teacher> teachers;
	private Vector<Student> students;

	public Manager(String firstName, String lastName, String id, String username, String password, Sex sex, int age,
			String email, double salary) {
		super(firstName, lastName, id, username, password, sex, age, email, salary);
	}

	public boolean approveStrudentRegistr() {
		return false;
	}

	public boolean assignCoursesTeacher() {
		return false;
	}

	public boolean addCoursesForRegistr() {
		return false;
	}

	public void viewStrudentInfo() {
	}

	public void manageNews() {
	}

	public boolean addNews(News news) {
		return false;
	}

	public boolean removeNews(News news) {
		return false;
	}

	public boolean updateNews(News news) {
		return false;
	}

	public String generateReport() {
		return null;
	}

	public void assignTeacher() {
	}

	public boolean addOrganisation() {
		return false;
	}

	public boolean updateOrganisation() {
		return false;
	}

	public boolean removeOrganisation() {
		return false;
	}

	public boolean assignOrgLeader() {
		return false;
	}

	public boolean removerOrgLeader() {
		return false;
	}

	public boolean sendMessage() {
		return false;
	}

	public void viewTeacher() {
	}

	public boolean addToDB() {

	}

	public void viewStudents() {

	}
}
