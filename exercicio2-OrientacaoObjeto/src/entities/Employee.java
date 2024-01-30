package entities;

public class Employee {
	public String name;
	public Double grossSalary;
	public double tax;
	
	public double NetSalary() {
	return grossSalary - tax;
	}
	public String toString() {
		return "Employee: " + name + ", $ " + String.format("%.2f", NetSalary());
	}
	public void increaseSalary(double percentage) {
	grossSalary += (grossSalary / 100) * percentage;
	}
	}
	
