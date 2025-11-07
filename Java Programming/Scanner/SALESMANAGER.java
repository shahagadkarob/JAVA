import java.util.Scanner;
class salesManager {
    int id;
    String name;
    double salary;
    int incentive;
    int target;

salesManager(){
 this.id= 9;
    this.name="Onkar";
    this.salary = 29000;
    this.incentive= 5000;
    this.target = 30;

}
salesManager( int id,String name,double salary,int incentive,int target){
 this.id=id ;
    this.name=name;
    this.salary = salary;
    this.incentive= incentive;
    this.target = target;

}
    void setId(int id){
        this.id = id;
    }
    void setName(String name){
        this.name = name;
    }
    void setSalary(int salary){
        this.salary = salary;
    }
    void setIncentive(int incentive){
        this.incentive = incentive;
    }
    void setTarget(int target){
        this.target = target;
    }

    int getId(){
        return this.id;
    }
    String getName(){
        return this.name;
    }
    double getSalary(){
        return this.salary;
    }
    int getIncentive(){
        return this.incentive;
    }
    int getTarget(){
        return this.target;
    }
    
    void DisplaySalesManager(){
        System.out.println("SalesManager Id:"+this.id+"\nSalesManager Name:"+this.name+"\nSalesManager Salary:"+this.salary+"\nSalesManager Incentive:"+this.incentive+"\nSalesManager Targets:"+this.target);
    }
}

class testSalesManager {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Id:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name:");
        String name = sc.next();
        System.out.print("Enter Salary:");
        int salary = sc.nextInt();
        System.out.print("Enter Incentive:");
        int incentive = sc.nextInt();
        System.out.print("Enter Target:");
        int target = sc.nextInt();



    salesManager s1 = new salesManager();
	salesManager s2 = new salesManager();
	salesManager s3 = new salesManager(11,"Guru",50000.00,4000,45);
    salesManager s4 = new salesManager(id,name,salary,incentive,target);
    

        s1.setId(120);
        s1.setName("Prajwal");
        s1.setSalary(40000);
        s1.setIncentive(5000);
        s1.setTarget(20);


        // System.out.println("SalesManager Id:"+s1.id+"\nSalesManager Name:"+s1.name+"\nSalesManager Salary:"+s1.salary+"\nSalesManager Incentive:"+s1.incentive+"\nSalesManager Targets:"+s1.target);
        s1.DisplaySalesManager();
        s2.DisplaySalesManager();
        s3.DisplaySalesManager();
        s4.DisplaySalesManager();

    }
}

