package buider;

public class Account {
    private String name;
    private String code;
    private String email;
    private String address;

    public Account(String name) {
        this.name = name;
    }
    public Account withCode(String code){
        this.code = code;
        return this;
    }
    public Account withEmail(String email){
        this.email = email;
        return this;
    }
    public Account withAddress(String add){
        this.address = add;
        return this;
    }
    public Account build(){
        return this;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}