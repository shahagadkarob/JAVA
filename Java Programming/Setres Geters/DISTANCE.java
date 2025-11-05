class Distance {
	int km;
	int m;

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
		Distance d1 = new Distance();
		d1.setKM(123);
		d1.setM(23);
		d1.Display();


		// System.out.println("Distance is: "+d1.km+" KiloMeter "+d1.m+" Meter");

		
	}//main ends here
}// CalDistance class ends here
