class Product {
    int productID;
    String pName;
    double price;
    int quantity;

    void setProductID(int productID)
    {
        this.productID = productID;
    }
    void setPName(String str)
    {
        this.pName = str;
    }
    void setPrice(double price)
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
        Product p1 = new Product();

        p1.setProductID(101);
        p1.setPName("Laptop");
        p1.setPrice(60000);
        p1.setQuantity(5);

        p1.DisplayProduct();

        // System.out.println("Product ID:"+p1.productID+"\nProduct Name:"+p1.pName+"\nProduct Price:"+p1.price+"\nProduct Quantity:"+p1.quantity);
    }
}//testProduct class ends here
