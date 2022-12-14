package Main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Database {
	private String basePath;
	private String path;
	private List<User> users;
	private List<Student> students;
	private List<Teacher> teachers;
	private List<Admin> admins;
	private List<Manager> managers;
	private Map<String, Course> courses;
	private Map<String, List<LogFile>> logFiles;

	public Database() {
		this.users = new ArrayList<>();
		this.students = new ArrayList<>();
		this.teachers = new ArrayList<>();
		this.admins = new ArrayList<>();
		this.managers = new ArrayList<>();
		this.courses = new HashMap<>();
		this.logFiles = new HashMap<>();
	}

}
