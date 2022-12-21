package Main;

import java.io.Serializable;

public class Admin extends Employee implements Create, Serializable{
	private static final long serialVersionUID = -7996409021489032879L;

	public Admin(String firstName, String lastName, String id, String username, String password, Sex sex, int age,
			String email, double salary) {
		super(firstName, lastName, id, username, password, sex, age, email, salary);
	}

	public void viewLogs() {
	}

	public boolean addUser(int User) {
		return false;
	}

	public boolean updateUser(int User) {
		return false;
	}

	public boolean removeUser(int User) {
		return false;
	}

	public boolean sendMessage() {
		return false;
	}

	public boolean addToDB() {
		return false;
	}
}
