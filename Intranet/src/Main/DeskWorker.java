package Main;

public class DeskWorker extends Employee {
	private State workingState;

	public DeskWorker(String firstName, String lastName, String id, String username, String password, Sex sex, int age,
			String email, double salary, State workingState) {
		super(firstName, lastName, id, username, password, sex, age, email, salary);
		this.setWorkingState(workingState);
	}

	public boolean reviewCase() {
		return false;
	}

	public State getWorkingState() {
		return workingState;
	}

	public void setWorkingState(State workingState) {
		this.workingState = workingState;
	}
}
