class Complex {
    double real;
    double imaginary;

Complex(){
this.real = 6;
this.imaginary = 4;
}
Complex( double real,double imaginary){
this.real = real;
this.imaginary = imaginary;
}




    void setReal()
    {
        this.real = real;
    }
    void setImaginary()
    {
        this.imaginary = imaginary;
    }

void Display(){
	System.out.println("Complex Number is: "+this.real+" + "+this.imaginary+"i");
}

}//Complex class ends here

class testComplex {
    public static void main(String args[]){
        Complex c1 = new Complex();
	 Complex c2 = new Complex(4,3);
	c1.Display();
	c2.Display();

    }
}//testComplex class ends here
