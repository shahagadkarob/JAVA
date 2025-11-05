class Student {
	int rollNo;
    String name;
    int marks;

    double allowance;

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
		Student s1 = new Student();
		s1.setRollNo(123);
		s1.setName("Onkar");
		s1.setMarks(85);
		s1.DisplayStudent();

		// System.out.println("Student Roll No is :"+s1.rollNo+" Student Name:"+s1.name+" Student marks :"+s1.marks );
		

		
	}//main ends here
}//TestAdmin class ends here
