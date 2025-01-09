package legendryjavaprograms.streams;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
public class Java8Employeedemo {
	public static void main(String[] args) {
		List<Employee> emplist = new ArrayList<Employee>();
		
		emplist.add(new Employee(1,"Nikhitha",70000,"Female"));
		emplist.add(new Employee(2,"Richi",72000,"male"));
		emplist.add(new Employee(3,"Ricky",74000,"male"));
		emplist.add(new Employee(5,"Nithin",76000,"male"));
		emplist.add(new Employee(8,"Nisha",80000,"Female"));
		emplist.add(new Employee(9,"Swapnil",90000,"male"));
		emplist.add(new Employee(10,"Nihal",100000,"male"));
				
//1) Given an Employee list, sort employees based on their salaries in desc order using sequential stream ?
		List<Employee> sortedemployeesindescorder = emplist.stream().sorted((a,b) -> b.getSalary()-a.getSalary()).collect(Collectors.toList());
		System.out.println(sortedemployeesindescorder);
		System.out.println(" ");
		System.out.println(" ");		
//Given an Employee list, sort employees based on their salaries in desc order using parallel stream?
		List<Employee> sortedemployeesindescorderparallel = emplist.parallelStream().sorted((a,b) -> b.getSalary()-a.getSalary()).collect(Collectors.toList());
		System.out.println(sortedemployeesindescorderparallel);		
		System.out.println(" ");
		System.out.println(" ");		
//We can also convert normal sequential stream in to parallel as below
		List<Employee> sortedemployeesindescorderstreamtoparallel = emplist.stream().parallel().sorted((a,b) -> b.getSalary()-a.getSalary()).collect(Collectors.toList());
		System.out.println(sortedemployeesindescorderstreamtoparallel);
		
		System.out.println(" ");
		System.out.println(" ");
				
//2) Fetch top 3 salaried employees details ?
		List<Employee> top3sortedemployeesindescorder = emplist.stream().sorted((a,b) -> b.getSalary()-a.getSalary()).limit(3).collect(Collectors.toList());
		System.out.println(top3sortedemployeesindescorder);
		
		System.out.println(" ");
		System.out.println(" ");
		
//3) Fetch all employees having salary less than 3rd highest salary ?
		List<Employee> lessthantop3sortedemployeesindescorder = emplist.stream().sorted((a,b) -> b.getSalary()-a.getSalary()).skip(3).collect(Collectors.toList());
		System.out.println(lessthantop3sortedemployeesindescorder);
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Optional demonstration");
		
//4)optional demonstration
		
        // Demonstrate Optional with Employee
        Optional<Employee> employee = findEmployeeById(emplist, 6); //This method searches the emplist for an Employee with the given id
        
        // If employee is present, print the employee details
        employee.ifPresent(System.out::println);

        // OrElse: Provide a default Employee object if no match is found
        Employee defaultEmployee = employee.orElse(new Employee(0, "Default", 0, "N/A"));
        System.out.println("Employee found or default: " + defaultEmployee);

        // OrElseThrow: Throw an exception if no match is found
        try {
            Employee emp = employee.orElseThrow(() -> new RuntimeException("Employee not found!"));
            System.out.println("Employee found: " + emp);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    // Method to find an employee by ID using Optional
    private static Optional<Employee> findEmployeeById(List<Employee> emplist, int id) {
        return emplist.stream()
                      .filter(emp -> emp.getId() == id)
                      .findFirst();
	}

}
