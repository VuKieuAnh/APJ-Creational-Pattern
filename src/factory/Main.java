package factory;

public class Main {
    public static void main(String[] args) {
        Bank bank1 = BankFactory.getBank(BankType.TPBank);
        System.out.println(bank1.getBankName());
    }
}