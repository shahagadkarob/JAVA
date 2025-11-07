import java.util.Scanner;
class Employee {
	int id;
    String name;
    double salary;

Employee(){
this.id = 101;
this.name = "Onkar";
this.salary = 200000;
}
Employee(int id, String name,double salary){
this.id = id;
this.name = name;
this.salary = salary;
}


	void setId(int id)
	{ 
		this.id = id;
	}
	void setName(String str)
	{ 
		this.name = str;
	}
    void setSalary(double sal)
	{ 
		this.salary = sal;
	}
	int getId(){
		return this.id;
	}
	String getName(){
		return this.name;
	}
	double getSalary(){
		return this.salary;
	}

	void Display(){
		System.out.println("Employee Id:"+this.id+"\nEmployee Name:"+this.name+"\nEmployee Salary:"+this.salary);
	}
}//Employee class ends here
class TestEmployee {
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter details of first employee:");
		System.out.println("--------------------------------");
		System.out.print("Enter employee id:");
		int id= sc.nextInt();
		sc.nextLine();  
		System.out.print("Enter employee name:");
		String name= sc.next();
		System.out.print("Enter employee salary:");
		double salary= sc.nextDouble();
Employee e1= new Employee();
Employee e2= new Employee();
Employee e3= new Employee(id,name,salary);



		

		e2= new Employee(id,name,salary);
		e1.Display();
		e2.Display();
		e3.Display();
		// System.out.println("Employee Id:"+e1.id+" Employee Name:"+e1.name+" Employee Salary:"+e1.salary);
		

		
	}//main ends here
}//TestEmployee class ends here