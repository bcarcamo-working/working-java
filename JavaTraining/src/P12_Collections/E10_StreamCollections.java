package P12_Collections;

import java.util.ArrayList;
import java.util.List;


public class E10_StreamCollections {

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
		
		employees.add(new Employee(1, "Juan Sosa", "Trainer"));
		employees.add(new Employee(2, "Carlos Concha", "Operation"));
		employees.add(new Employee(3, "Manuel Perez", "Sales"));
		employees.add(new Employee(4, "Maria Fernandez", "IT"));
		employees.add(new Employee(5, "Laura Gomez", "Trainer"));
		
		employees.forEach(e -> System.out.println(e));
		
	}
	
	private static class Employee {

		public int id;
		public String name;
		public String role;
		
		public Employee(int id, String name, String role) {
			this.id = id;
			this.name = name;
			this.role = role;
		}
		
		@Override
		public String toString() {
			return this.id + " : " + this.name + " - " + this.role;
		}
		
	}

}
