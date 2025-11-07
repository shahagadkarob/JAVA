import java.util.Scanner;
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




    void setReal(double real)
    {
        this.real = real;
    }
    void setImaginary(double imaginary)
    {
        this.imaginary = imaginary;
    }

void Display(){
	System.out.println("Complex Number is: "+this.real+" + "+this.imaginary+"i");
}

}//Complex class ends here

class testComplex {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter real part of Complex Number:");
        double r = sc.nextDouble();
        System.out.print("Enter imaginary part of Complex Number:");
        double i = sc.nextDouble();

    Complex c1 = new Complex();
	Complex c2 = new Complex(4,3);
    Complex c3 = new Complex(r,i);

	c1.Display();
	c2.Display();
    c3.Display();

    }
}//testComplex class ends here
