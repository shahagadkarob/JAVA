class Book {
    int ISBN;
    String bName;
    String category;
    double price;

    void setISBN(int ISBN)
    {
        this.ISBN = ISBN;
    }
    void setbName(String str)
    {
        this.bName = str;
    }
    void setCategory(String cat)
    {
        this.category = cat;
    }
    void setPrice(double price)
    {
        this.price = price;
    }
    int getISBN(){
        return this.ISBN;
    }
    String getName(){
        return this.bName;
    }
    String getCategory(){
        return this.category;
    }
    double getPrice(){
        return this.price;
    }
    void displayBook(){
        System.out.println("Book ISBN:"+this.ISBN+"\nBook Name:"+this.bName+"\nBook Category:"+this.category+"\nBook Price:"+this.price);
    }

}//Book class ends here

class testBook {
    public static void main(String args[]){
        Book b1 = new Book();

        b1.setISBN(101);
        b1.setbName("Java Programming");
        b1.setCategory("Education");
        b1.setPrice(550.50);

        b1.displayBook();
        
    }
}//testBook class ends here
