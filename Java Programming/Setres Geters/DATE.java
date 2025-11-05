class Date {
	int day,month,year;
	String dow;

	Date(){
		this.day = 24;
		this.month = 12;
		this.year = 2003;
		this.dow = "wednesday";
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
		return this.month;
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
		Date d1= new Date();
		Date d2= new Date();
		Date d3= new Date();

		d1.setDay(8);
		d1.setMonth(3);
		d1.setYear(2003);
		d1.setDow("Wednesday");

		d2.setDay(9);
		d2.setMonth(3);
		d2.setYear(2003);
		d2.setDow("Thursday");

		if(d1.getDay() > d2.getDay()){
			System.out.println("D1 is greater");
		}
		else{
			System.out.println("D2 is greater");
		}

		d1.DisplayDate();
		d2.DisplayDate();
		d3.DisplayDate();

		
	}//main ends here
}//test class ends here