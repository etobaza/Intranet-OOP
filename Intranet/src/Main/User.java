package Main;

import java.io.Serializable;

public class User implements Comparable<User>, Serializable, Cloneable {
	private String firstName;
	private String lastName;
	private String id;
	private String username;
	private String password;
	private Sex sex;
	private int age;
	private String email;
	private boolean loginStatus;

	public User(String firstName, String lastName, String id, String username, String password, Sex sex, int age,
			String email) {
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

	public boolean setPassword(String newPassword) {
		this.password = newPassword;
		return true;
	}

	public boolean login(String username, String password) {
		if (username.equals(this.username) && password.equals(this.password)) {
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
			return;
		}
	}

	public void viewSchedule() {
		if (!loginStatus) {
			return;
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(boolean loginStatus) {
		this.loginStatus = loginStatus;
	}

	public String getPassword() {
		return password;
	}

	public int compareTo(User other) {
		int usernameComparison = username.compareTo(other.username);
		return usernameComparison;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof User))
			return false;
		User user = (User) o;
		return username.equals(user.username) && password.equals(user.password) && firstName.equals(user.firstName)
				&& lastName.equals(user.lastName) && id.equals(user.id) && sex.equals(user.sex) && age == user.age
				&& email.equals(user.email);
	}

}