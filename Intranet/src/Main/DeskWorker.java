package Main;

public class DeskWorker extends Employee {

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
