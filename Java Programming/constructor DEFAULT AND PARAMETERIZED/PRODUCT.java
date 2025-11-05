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


    void setProductID()
    {
        this.productID =productID ;
    }
    void setPName()
    {
        this.pName =pName ;
    }
    void setPrice( )
    {
        this.price = price;
    }
    void setQuantity()
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
        Product p1 = new Product();
 Product p2= new Product(2233,"Mobile",50000,4);

     

 p1.DisplayProduct();
 p2.DisplayProduct();


        // System.out.println("Product ID:"+p1.productID+"\nProduct Name:"+p1.pName+"\nProduct Price:"+p1.price+"\nProduct Quantity:"+p1.quantity);
    }
}//testProduct class ends here
