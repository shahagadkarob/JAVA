class Admin {
	int id;
    String name;
    double salary;
    double allowance;
	Admin(){
		this.id = 101;
		this.name = "Khushi";
		this.salary = 25000;
		this.allowance = 3000;

		System.out.println("Run");
	}
	Admin(int id,String name,double salary,double allowance){
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.allowance = allowance;
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
    void setAllowance(double allowance)
	{ 
		this.allowance = allowance;
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
	double getAllowance(){
		return this.allowance;
	}

	void DisplayAdmin(){
		System.out.println("Admin Id:"+this.id+"\nAdmin Name:"+this.name+"\nAdmin Salary:"+this.salary+"\nAllowance:"+this.allowance);
	}
	}//Employee class ends here
class TestAdmin {
	public static void main(String args[]){
		Admin a1;
		a1= new Admin();
		Admin a2;
		a2= new Admin();
		Admin a3;
		a3= new Admin(102,"Onkar",20000,4000);
		// a1.setId(123);
		// a1.setName("Onkar");
		// a1.setSalary(20000);
        // a1.setAllowance(5000);

		a1.DisplayAdmin();
		a2.DisplayAdmin();
		a3.DisplayAdmin();
		
		

		
	}//main ends here
}//TestAdmin class ends here
