import java.util.Scanner;
class Hr {
    int id;
    String name;
    double salary;
    double commition;

 // Default constructor
    Hr() {
 	 this.id = 101;
        this.name = "Onkar";
        this.salary = 20000;
        this.commition = 2333;
    }

    // Parameterized constructor
    Hr(int id, String name, double salary, double commition) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.commition = commition;
    }

   

    void setId(int id) {
        this.id = id;
    }

    void setName(String name) {
        this.name = name;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    void setCommition(double commition) {
        this.commition = commition;
    }

    int getID() {
        return this.id;
    }

    String getName() {
        return this.name;
    }

    double getSalary() {
        return this.salary;
    }

    double getCommition() {
        return this.commition;
    }

    void display() {
        System.out.println("Hr Id: " + this.id);
        System.out.println("Hr Name: " + this.name);
        System.out.println("Hr Salary: " + this.salary);
        System.out.println("Hr Commition: " + this.commition);
    }
}

// Hr class ends here
class TestHr {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Id of HR:");
        int id = sc.nextInt();
        System.out.print("Enter Name of HR:");
        String name = sc.next();
        System.out.print("Enter Salary of HR:");
        double salary = sc.nextDouble();
        System.out.print("Enter Commition of HR:");
        double commition = sc.nextDouble();


        Hr h1 = new Hr();
        Hr h2 = new Hr(111, "Onkar", 25000, 3000);
        Hr h3 = new Hr(id, name, salary, commition);

  

        h1.display();
        h2.display();
        h3.display();
    }
}