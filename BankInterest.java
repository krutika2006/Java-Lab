class Bank {
    void interestRate() {
        System.out.println("Bank interest rate");
    }
}
class SBI extends Bank {
    @Override
    void interestRate() {
        System.out.println("SBI Interest Rate: 7.00%");
    }
}
class HDFC extends Bank {
    @Override
    void interestRate() {
        System.out.println("HDFC Interest Rate: 7.25%");
    }
}
class ICICI extends Bank {
    @Override
    void interestRate() {
        System.out.println("ICICI Interest Rate: 7.20%");
    }
}
public class BankInterest {
    public static void main(String[] args) {
        Bank bank1 = new SBI();
        Bank bank2 = new HDFC();
        Bank bank3 = new ICICI();
        bank1.interestRate();
        bank2.interestRate();
        bank3.interestRate();
    }
}