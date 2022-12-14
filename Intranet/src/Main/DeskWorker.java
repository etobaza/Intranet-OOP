package Main;

public class DeskWorker extends Employee {

	public DeskWorker(String firstName, String lastName, String id, String username, String password, Sex sex, int age,
			String email, double salary) {
		super(firstName, lastName, id, username, password, sex, age, email, salary);
	}

	private State workingState;

	public boolean supportWorker() {
		return false;
	}

	public void sendReport() {
	}

	public boolean reviewCase() {
		return false;
	}
}
