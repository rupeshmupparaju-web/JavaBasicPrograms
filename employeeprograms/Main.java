package employeeprograms;
public class Main {
	public static void main(String[]args){
	
	Employee emp1 = new Employee("Rupesh",26,10000,Location.GUNTUR);
	Employee emp2 = new Employee("Vinay",25,20000,Location.GUNTUR);

	emp1.raiseSalary();

	}

}
