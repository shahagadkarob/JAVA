import java.util.Scanner;
class Date {
	int day,month,year;
	String dow;

	Date(){
		this.day = 24;
		this.month = 12;
		this.year = 2003;
		this.dow = "wednesday";
	}
	Date(int day,int month,int year,String dow)
	{
		this.day = day;
		this.month = month;
		this.year = year;
		this.dow = dow;
	}



	void setDay(int d)
	{ 
		this.day = d;
	}
	void setMonth(int m)
	{ 
		this.month = m;
	}
	void setYear(int y)
	{ 
		this.year = y;
	}
	void setDow(String str )
	{ 
		this.dow = str;
	}
	int getDay(){
		return this.day;
	}
	int getMonth(){
		return this.month;
	}
	int getYear(){
		return this.year;
	}
	String getDow(){
		return this.dow;
	}

	void DisplayDate(){
		System.out.println("Date is:"+this.day+"/"+this.month+"/"+this.year+" and Day is:"+this.dow);
	}

	}//Date class ends here
class Test {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Day:");
		int d = sc.nextInt();
		System.out.print("Enter Month:");
		int m = sc.nextInt();
		System.out.print("Enter Year:");
		int y = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the day of Week:");
		String da = sc.nextLine();
		

		Date[] darr = new Date[5];
		darr[0] = new Date();
		darr[1] = new Date();
		darr[2]= new Date(24,12,2003,"Wednesday");
		darr[3] = new Date(d,m,y,da);
		darr[4] = new Date();
		darr[5] = new Date();

		


		for(int i=0;i<6;i++){
			darr[i].DisplayDate();

		}

		

		

		
	}//main ends here
}//test class ends here