package buider;

public class Main {
    public static void main(String[] args) {
        Account kieuanh = new Account("KieuAnh").withAddress("Ha Nam").withCode("CG01").build();
        System.out.println(kieuanh);
    }
}