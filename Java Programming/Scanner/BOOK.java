import java.util.Scanner;
class Book {
    int ISBN;
    String bName;
    String category;
    double price;

    Book(){
        this.ISBN = 119;
        this.bName = "Chava";
        this.category = "Novel";
        this.price = 300;
        
    }
	Book(int ISBN,String bName,String category,double price){
        this.ISBN = ISBN;
        this.bName = bName;
        this.category = category;
        this.price = price;
        
    }

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
        Scanner sc= new Scanner(System.in);
        Book b1 = new Book();
	    Book b2 = new Book(102,"Chava","Novel",400);

        System.out.println("Enter details of first book:");
        System.out.print("Enter ISBN:");
        int isbn = sc.nextInt();
        System.out.print("Enter Book Name:");
        String name = sc.next();
        System.out.print("Enter Book Category:");
        String category = sc.next();
        System.out.print("Enter Book Price:");
        double price = sc.nextDouble();

        Book b3 = new Book(isbn, name, category, price);

        b1.setISBN(101);
        b1.setbName("Java Programming");
        b1.setCategory("Education");
        b1.setPrice(550.50);

        b1.displayBook();
        b2.displayBook();
        b3.displayBook();

        
    }
}//testBook class ends here
