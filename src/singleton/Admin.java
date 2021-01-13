package singleton;

public class Admin {
    private String name;

    private Admin(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private static Admin admin;

    public static Admin getAdmin(String name){
        if (admin == null)
            synchronized (Admin.class){
            if (admin == null) admin = new Admin(name);
            }
        return admin;
    }
}