//2420030322-P.Kavya Sai

class Bank {
    double getInterestRate() {
        return 0.0; 
    }
}

class SBI extends Bank {
    @Override
    double getInterestRate() {
        return 6.5;
    }
}

class HDFC extends Bank {
    @Override
    double getInterestRate() {
        return 7.0; 
    }
}
public class MethodOverriding_322{
    public static void main(String[] args) {
        Bank bank1 = new SBI();
        Bank bank2 = new HDFC();
        System.out.println("SBI Interest Rate: " + bank1.getInterestRate() + "%");
        System.out.println("HDFC Interest Rate: " + bank2.getInterestRate() + "%");
    }
}
