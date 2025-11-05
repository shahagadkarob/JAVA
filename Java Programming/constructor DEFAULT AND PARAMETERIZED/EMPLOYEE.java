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
Employee e1= new Employee();
Employee e2= new Employee();
Employee e3= new Employee();

		e1.Display();
		e2.Display();
		// System.out.println("Employee Id:"+e1.id+" Employee Name:"+e1.name+" Employee Salary:"+e1.salary);
		

		
	}//main ends here
}//TestEmployee class ends here