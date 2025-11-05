class Hr {
    int id;
    String name;
    double salary;
    double commition;

    // Parameterized constructor
    Hr(int id, String name, double salary, double commition) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.commition = commition;
    }

    // Default constructor
    Hr() {
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
        Hr h1 = new Hr();
        Hr h2 = new Hr(111, "Onkar", 25000, 3000);

        h1.setId(110);
        h1.setName("Khushi");
        h1.setSalary(30000);
        h1.setCommition(4000);

        h1.display();
        h2.display();
    }
}