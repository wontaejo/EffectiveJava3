package chapter02.item01;

public class IPhone extends Phone {
    private String name;

    public IPhone() {
        this.name = "IPhone";
    }

    @Override
    public String getName() {
        return name;
    }
}
