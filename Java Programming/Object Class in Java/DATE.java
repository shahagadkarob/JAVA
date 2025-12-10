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
		this.dow = "Friday";
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
    public String toString(){
        return "Date is:"+this.day+"/"+this.month+"/"+this.year+" and Day is:"+this.dow;
    }

	}//Date class ends here
class Test {
	public static void main(String args[]){
		Date d1= new Date();
        System.out.println(d1);
		System.out.println(d1.toString()); 


		

		
	}//main ends here
}//test class ends here
