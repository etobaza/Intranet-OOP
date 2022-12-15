package Main;

import java.util.Objects;
import java.util.Vector;

public class Employee extends User {
	private double salary;
	private Vector<Message> messages;
	{
		messages = new Vector<Message>();
	}

	public Employee(String firstName, String lastName, String id, String username, String password, Sex sex, int age,
			String email, double salary) {
		super(firstName, lastName, id, username, password, sex, age, email);
		this.salary = salary;
	}

	public void sendMessage(Employee employee, Message message) {
		employee.messages.add(message);
	}

	public Vector<Message> getMessage() {
		return messages;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(salary);
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);

	}

	public String toString() {
		return super.toString() + ", salary= " + salary;
	}

}