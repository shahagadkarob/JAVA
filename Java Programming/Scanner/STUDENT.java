import java.util.Scanner;
class Student {
     int rollNo;
    String name;
    int marks;


Student(){
 this.rollNo = 012;
    this.name = "Isha";
    this.marks=550;
}

Student(int rollNo,String name,int marks){
 this.rollNo = rollNo;
    this.name = name;
    this.marks=marks;
}


	void setRollNo(int rollNo)
	{ 
		this.rollNo = rollNo;
	}
	void setName(String str)
	{ 
		this.name = str;
	}
    void setMarks(int marks)
	{ 
		this.marks = marks;
	}
    int getRollNo(){
		return this.rollNo;
	}
	String getName(){
		return this.name;
	}
	int getMarks(){
		return this.marks;
	}
	void DisplayStudent(){
		System.out.println("Student Roll No:"+this.rollNo+"\nStudent Name:"+this.name+"\nStudent Marks:"+this.marks);
	}

	void Display(){
		System.out.println("Student Roll No:"+this.rollNo+"\nStudent Name:"+this.name+"\nStudent Marks:"+this.marks);
	}

}//Student class ends here
class testStudent{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);

		System.out.print("Enter Roll No:");
		int rollNo = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Name:");
		String name = sc.next();
		System.out.print("Enter Marks:");
		int marks = sc.nextInt();


		Student s1 = new Student();
		s1.setRollNo(023);
		s1.setName("Onkar");
		s1.setMarks(85);
		
Student s2 = new Student();
Student s3 = new Student();
Student s4= new Student(rollNo,name,marks);

s1.DisplayStudent();
s2.DisplayStudent();
s3.DisplayStudent();
s4.DisplayStudent();
	

		// System.out.println("Student Roll No is :"+s1.rollNo+" Student Name:"+s1.name+" Student marks :"+s1.marks );
		

		
	}//main ends here
}//TestAdmin class ends here
