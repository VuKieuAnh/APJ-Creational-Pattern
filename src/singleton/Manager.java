package singleton;

public class Manager {
    public static void main(String[] args) {
        Admin kieuanh = Admin.getAdmin("Kieu Anh");
        System.out.println(kieuanh.getName());
        Admin oanh = Admin.getAdmin("Oanh");
        System.out.println(oanh.getName());
    }
}