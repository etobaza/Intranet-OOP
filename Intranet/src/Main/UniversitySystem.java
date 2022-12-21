package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Vector;

public class UniversitySystem {
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static Vector<User> users = new Vector<>();
	private static User sessionUser = null;

	public static void main(String[] args) throws IOException {
		users.add(new Student("Alice", "Smith", "C41423", "abobikus", "password", Sex.FEMALE, 20, "alice@gmail.com",
				3.5, Faculty.FGGE, new Date(), false, 1, Semester.FALL, AcademicDegree.BACHELOR));

		while (!sessionUser.isLoginStatus()) {
			displayCredentialsMenu();
		}
		if (sessionUser instanceof Student) {
			displayStudentView();
		} /*
			 * else if (sessionUser instanceof Teacher) { displayTeacherView(); }
			 */ else {
			System.out.println("Oops, fiddlesticks! What now?");
		}
	}

	private static void displayCredentialsMenu() throws IOException {
		System.out.println("Welcome to Saint Martin University System");
		System.out.println("1. Log In");
		System.out.println("2. Exit");
		System.out.print("Enter prompt: ");
		String choice = reader.readLine();
		switch (choice) {
		case "1":
			System.out.print("Enter your username: ");
			String username = reader.readLine();
			System.out.print("Enter your password: ");
			String password = reader.readLine();
			for (User user : users) {
				if (user.login(username, password)) {
					sessionUser = user;
					System.out.println("Login successful!");
					break;
				}
			}
			if (!sessionUser.isLoginStatus()) {
				System.out.println("Invalid username or password.");
			}
			break;
		case "2":
			System.out.println("Goodbye!");
			System.exit(0);
			break;
		default:
			System.out.println("Invalid choice. Try again.");
			break;
		}
	}

	private static void displayStudentView() throws IOException {
		while (true) {
			System.out.println("Welcome, " + sessionUser.getFirstName() + "!");
			System.out.println("1. View news");
			System.out.println("2. View schedule");
			System.out.println("3. Register for courses");
			System.out.println("4. View transcript");
			System.out.println("5. Logout");
			System.out.print("Enter your choice: ");
			String choice = reader.readLine();
			switch (choice) {
			case "1":
				sessionUser.viewNews();
				break;
			case "2":
				sessionUser.viewSchedule();
				break;
			case "3":
				Vector<Course> courses = Database.getCourses();
				System.out.println("Available courses:");
				for (int i = 0; i < courses.size(); i++) {
					System.out.println((i + 1) + ". " + courses.get(i).getName());
				}
				System.out.print("Enter the number of the course you want to enroll in: ");
				int courseIndex = Integer.parseInt(reader.readLine()) - 1;
				((Student) sessionUser).addCourse(courses.get(courseIndex));
				break;
			case "4":
				((Student) sessionUser).viewTranscript();
				break;
			case "5":
				sessionUser.logout();
				sessionUser = null;
				return;
			default:
				System.out.println("Invalid choice. Try again.");
				break;
			}
		}
	}

}