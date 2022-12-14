package Main;

public class UserFactory {
	public Create getUser(String userType) {
		if (userType == null) {
			return null;
		}
		if (userType.equalsIgnoreCase("STUDENT")) {
			return new Student(userType, userType, userType, userType, userType, null, 0, userType, 0, null, null,
					false, 0, null, null);

		} else if (userType.equalsIgnoreCase("TEACHER")) {
			return new Teacher(userType, userType, null, null, null, null);

		} else if (userType.equalsIgnoreCase("MANAGER")) {
			return new Manager();

		} else if (userType.equalsIgnoreCase("ADMIN")) {
			return new Admin();
		}

		return null;
	}
}
