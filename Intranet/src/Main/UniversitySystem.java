package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Vector;

public class UniversitySystem {
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static User sessionUser = null;

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		/*
		Database.users.add(new Student("Alice", "Smith", "C41423", "abobikus", "password", Sex.FEMALE, 20,
				"alice@gmail.com", 3.5, Faculty.FGGE, new Date(), false, 1, Semester.FALL, AcademicDegree.BACHELOR));
		Database.courses.add(new Course("Java Programming", 3, "Introduction to Java programming language", "JAVA101",
				new Vector<Course>(), true, Semester.FALL, Faculty.FGGE, 20));
		Database.courses.add(new Course("Calculus", 3, "Introduction to calculus", "MATH101", new Vector<Course>(),
				true, Semester.FALL, Faculty.FGGE, 30));
				*/
		Database.deserialize();
		while (sessionUser == null) {
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
			for (User user : Database.users) {
				if (user.login(username, password)) {
					sessionUser = user;
					System.out.println("Login successful!");
					break;
				}
			}
			if (sessionUser == null) {
				System.out.println("Invalid username or password.");
			}
			break;
		case "2":
			System.out.println("Goodbye!");
			Database.serialize();
			System.exit(0);
			break;
		default:
			System.out.println("Invalid choice. Try again.");
			break;
		}
	}

	private static void displayStudentView() throws IOException {
		System.out.println("Welcome, " + sessionUser.getFirstName() + "!");
		while (true) {
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
				Vector<Course> availableCourses = new Vector<Course>();
				for (Course course : courses) {
					if (!((Student) sessionUser).getCourses().contains(course)) {
						availableCourses.add(course);
					}
				}
				if (availableCourses.isEmpty()) {
					System.out.println("There are no available courses for you to enroll in.");
					break;
				}
				System.out.println("Available courses:");
				for (int i = 0; i < availableCourses.size(); i++) {
					System.out.println((i + 1) + ". " + availableCourses.get(i).getName());
				}
				System.out.println("Add course: ");
				int courseIndex = Integer.parseInt(reader.readLine()) - 1;
				Course selectedCourse = availableCourses.get(courseIndex);
				if (selectedCourse.getLimit() <= 0) {
					System.out.println("Sorry, this course is full.");
					break;
				}
				((Student) sessionUser).addCourse(selectedCourse);
				break;
			case "4":
				System.out.println(((Student) sessionUser).viewTranscript());
				break;
			case "5":
				sessionUser.logout();
				displayCredentialsMenu();
			default:
				System.out.println("Invalid choice. Try again.");
				break;
			}
		}
	}

}