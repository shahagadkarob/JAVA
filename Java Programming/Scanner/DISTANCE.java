import java.util.Scanner;
class Distance {
	int km;
	int m;
Distance(){
this.km = 56;
this.m = 500;
}
Distance(int km,int m){
this.km = km;
this.m = m;
}
	void setKM(int km)
	{ 
		this.km= km;
	}
	void setM(int m)
	{ 
		this.m = m;
	}
	int getKM(){
		return this.km;
	}
	int getM(){
		return this.m;
	}

	void Display(){
		System.out.println("Distance is: "+this.km+" KiloMeter "+this.m+" Meter");
	}
}//Distance class ends here
class CalDistance {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter KiloMeter:");
		int k = sc.nextInt();
		System.out.print("Enter Meter:");
		int m = sc.nextInt();
		
		Distance d1 = new Distance();
		d1.setKM(123);
		d1.setM(23);
	Distance d2 = new Distance();
	Distance d3 = new Distance(100,100);
	Distance d4 = new Distance(k,m);
		d1.Display();
		d2.Display();
		d3.Display();
		d4.Display();





		// System.out.println("Distance is: "+d1.km+" KiloMeter "+d1.m+" Meter");

		
	}//main ends here
}// CalDistance class ends here
