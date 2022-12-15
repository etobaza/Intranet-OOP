package Main;

public class Admin extends Employee implements Create {
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
