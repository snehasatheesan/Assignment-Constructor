2.Similiarly, add constructor to the Employee class already created to add and display.

package constructors;

public class Employee {
	    String name;
	    int employeeId;
	    float salary;
	    int empNum = 0;

	    {
	    	empNum++;
	    }
	    public Employee(String name, int employeeId,float salary) {
	        this.name = name;
	        this.employeeId = employeeId;
	        this.salary = salary;
	    }
	    public void Name(String name) {
	        this.name = name;
	    }

	    public void Salary(float salary) {
	        this.salary = salary;
	    }

	    public void EmployeeId(int employeeId) {
	        this.employeeId = employeeId;
	    }

	    public String getName() {
	        return name;
	    }

	    public float getSalary() {
	        return salary;
	    }

	    public int getEmpId() {
	        return employeeId;
	    }

	    public int getEmpCount() {
	        return empNum;
	    }
	    public void display(){
	        System.out.println("Name is: "+this.name);
	        System.out.println("Employee ID is: "+this.employeeId);
	        System.out.println("Salary is : "+this.salary);
	    }

	    public static void main(String[] args) {
	        Employee sc[]=new Employee[3];
	        sc[0]=new Employee("Helen",101,30000);
	        sc[1]=new Employee("Joey",102,35000);
	        sc[2]=new Employee("Charlie",103,4);
	        for (Employee t:sc){
	            t.display();
	            System.out.println();
	        }
	    }
	}

