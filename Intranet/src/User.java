import java.util.*;

public class User implements Comparable, Serializable, Cloneable {
	private String firstName;
	private String lastName;
	private String id;
	private String username;
	private char[] password;
	private Sex sex;
	private int age;
	private string email;
	private boolean loginStatus;

	public User(String firstName, String lastName, String id, String username, char[] password, Sex sex, int age,
			string email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.username = username;
		this.password = password;
		this.sex = sex;
		this.age = age;
		this.email = email;
		this.loginStatus = false;

	}

	public boolean setPassword(char[] newPassword) {
		this.password = newPassword;
		return true;
	}

	public boolean login(String username, char[] password) {
		if (username.equals(this.username) && Arrays.equals(password, this.password)) {
			loginStatus = true;
			return true;
		}
		return false;
	}

	public boolean logout() {
		loginStatus = false;
		return true;
	}

	public void viewNews() {
		if (!loginStatus) {
			System.out.println("You must be logged in to view news.");
			return;
		}
	}

	public void viewSchedule() {
		if (!loginStatus) {
			System.out.println("You must be logged in to view your schedule.");
		}
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof User))
			return false;
		User user = (User) o;
		return username.equals(user.username) && Arrays.equals(password, user.password)
				&& loginStatus == user.loginStatus;
	}
}