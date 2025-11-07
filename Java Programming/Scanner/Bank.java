import java.util.Scanner;
class Bank {
	int AccountNumber;
    String AccountHolderName;
    double CurrentBalance;
    double IntrestRate;

Bank(){
this.AccountNumber = 101;
this.AccountHolderName = "Onkar";
this.CurrentBalance = 200000;
this.IntrestRate = 5.5;
}

Bank(int AccountNumber, String AccountHolderName,double CurrentBalance,double IntrestRate){
this.AccountNumber = AccountNumber;
this.AccountHolderName = AccountHolderName;
this.CurrentBalance = CurrentBalance;
this.IntrestRate = IntrestRate;
}



	void setAccountNumber(int AccountNumber)
    { 
        this.AccountNumber = AccountNumber;
    }
	
	void setAccountHolderNmae(String AccountHolderName)
	{ 
		this.AccountHolderName = AccountHolderName;
	}
    void setCurrentBalance(double CurrentBalance)
	{ 
		this.CurrentBalance = CurrentBalance;
	}
    void setIntrestRate(double IntrestRate){
        this.IntrestRate = IntrestRate;
    }
	int getAccountNumber(){
		return this.AccountNumber;
	}
	String getAccountHolderNmae(){
		return this.AccountHolderName;
	}
	double getCurrentBalance(){
		return this.CurrentBalance;
	}
    double getIntrestRate(){
        return this.IntrestRate;
    }

	void Display(){
		System.out.println("Account Number:"+this.AccountNumber+"\nAccount Holder Name:"+this.AccountHolderName+"\nCurrent Balance:"+this.CurrentBalance+"\nIntrest Rate:"+this.IntrestRate);
	}
}//Employee class ends here
class TestBank{
	
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter details of first bank account:");
    
        System.out.print("Enter account number:");
        int accNo= sc.nextInt();
        sc.nextLine();  

        System.out.print("Enter account holder name:");
        String accHolderName= sc.nextLine();

        System.out.print("Enter current balance:");
        double currBalance= sc.nextDouble();

        System.out.print("Enter intrest rate:");
        double intRate= sc.nextDouble();

    Bank b1= new Bank(accNo, accHolderName, currBalance, intRate);

        // b1.AccountNumber = 202;
        // b1.AccountHolderName = "Rahul";
        // b1.CurrentBalance = 500000;
        // b1.IntrestRate = 6.0;

        b1.Display();




		
		// System.out.println("Employee Id:"+e1.id+" Employee Name:"+e1.name+" Employee Salary:"+e1.salary);
		

		
	}//main ends here
}//TestEmployee class ends here