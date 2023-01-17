package chapter02.item01;

public class Galaxy extends Phone {
    private String name;

    public Galaxy() {
        this.name = "Galaxy";
    }

    @Override
    public String getName() {
        return name;
    }
}
