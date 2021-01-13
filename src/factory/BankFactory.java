package factory;

public class BankFactory {
    private BankFactory() {
    }
    public static Bank getBank(BankType bankType){
        switch (bankType){
            case TPBank:
                return new TPBank();
            case VPBank:
                return new VPBank();
            default:
                throw new IllegalArgumentException("Khong ton tai");
        }
    }

}