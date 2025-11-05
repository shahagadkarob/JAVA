class Car {
    String model;
    String brand;
    double price;
    String colour;
    double fuelCapacity;

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
        Car c1 = new Car();

        c1.setModel("City");
        c1.setBrand("Honda");
        c1.setPrice(1500000);
        c1.setColour("White");
        c1.setFuelCapacity(40);

        c1.displayCar();
    }
}//testCar class ends here
