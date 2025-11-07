import java.util.Scanner;
class Product {
    int productID;
    String pName;
    double price;
    int quantity;
Product (){
    this.productID =10023;
    this.pName = "Shooes";
    this.price = 500;
    this.quantity=20;
}
Product (int productID,String pName, double price,int quantity){
 this.productID =productID;
    this.pName = pName;
    this.price = price;
    this.quantity=quantity;
}


    void setProductID(int productID)
    {
        this.productID =productID ;
    }
    void setPName(String pName)
    {
        this.pName =pName ;
    }
    void setPrice( double price)
    {
        this.price = price;
    }
    void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    int getProductID(){
        return this.productID;
    }
    String getPName(){
        return this.pName;
    }
    double getPrice(){
        return this.price;
    }
    int getQuantity(){
        return this.quantity;
    }

    void DisplayProduct(){
        System.out.println("Product ID:"+this.productID+"\nProduct Name:"+this.pName+"\nProduct Price:"+this.price+"\nProduct Quantity:"+this.quantity);
    }
}//Product class ends here


class testProduct {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product Id:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter product Name:");
        String name = sc.nextLine();
        System.out.print("Enter product Price:");
        int price = sc.nextInt();
        System.out.print("Enter product Quantity:");
        int quantity = sc.nextInt();

        Product p1 = new Product();
        Product p2= new Product(2233,"Mobile",50000,4);
        Product p3 = new Product(id,name,price,quantity);

     

 p1.DisplayProduct();
 p2.DisplayProduct();
 p3.DisplayProduct();


        // System.out.println("Product ID:"+p1.productID+"\nProduct Name:"+p1.pName+"\nProduct Price:"+p1.price+"\nProduct Quantity:"+p1.quantity);
    }
}//testProduct class ends here
