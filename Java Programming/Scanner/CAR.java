import java.util.Scanner;
class Car {
    String model;
    String brand;
    double price;
    String colour;
    double fuelCapacity;

Car(){
this.model = "Mountain";
this.brand = "BMW";
this.price = 2500000;
this.colour = "Blue";
this.fuelCapacity = 40;
}

Car(String model,String brand, double price,String colour,double fuelCapacity)
{
this.model = model;
this.brand =brand;
this.price = price;
this.colour =colour ;
this.fuelCapacity = fuelCapacity;
}



    void setModel(String model)
    {
        this.model = model;
    }
    void setBrand(String brand)
    {
        this.brand = brand;
    }
    void setPrice(double price)
    {
        this.price = price;
    }
    void setColour(String colour)
    {
        this.colour = colour;
    }
    void setFuelCapacity(double fuelCapacity)
    {
        this.fuelCapacity = fuelCapacity;
    }

    String getModel(){
        return this.model;
    }
    String getBrand(){
        return this.brand;
    }
    double getPrice(){
        return this.price;
    }
    String getColour(){
        return this.colour;
    }
    double getFuelCapacity(){
        return this.fuelCapacity;
    }

    void displayCar(){
        System.out.println("Car Model:"+this.model+"\nCar Brand:"+this.brand+"\nCar Price:"+this.price+"\nCar Colour:"+this.colour+"\nCar Fuel Capacity:"+this.fuelCapacity);
    }
}//Car class ends here

class testCar {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter details of first car:");
        System.out.println("Enter car model:");
        String model= sc.next();
        System.out.println("Enter car brand:");
        String brand= sc.next();
        System.out.println("Enter car price:");
        double price= sc.nextDouble();
        System.out.println("Enter car colour:");
        String colour= sc.next();
        System.out.println("Enter car fuel capacity:");
        double fuelCapacity= sc.nextDouble();

        Car c3 = new Car();
        Car c1 = new Car();
 	    Car c2 = new Car("City","Honda",1500000,"White",40);
        Car c4 = new Car(model,brand,price,colour,fuelCapacity);

        c1.setModel("City");
        c1.setBrand("Honda");
        c1.setPrice(1500000);
        c1.setColour("White");
        c1.setFuelCapacity(40);

        c1.displayCar();
	    c2.displayCar();
        c3.displayCar();
        c4.displayCar();
    }
}//testCar class ends here
