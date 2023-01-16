package chapter02.item01;

public class Example01 {
    public static final Example01 BENZ = new Example01("밴츠", 999, 999, 999);

    private String name;
    private int option1;
    private int option2;
    private int option3;


    public Example01() {
    }

    // 생성자 방식
    public Example01(String name, int option1, int option2, int option3) {
        this.name = name;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
    }

    // 정적 팩터리 메서드 방식 ( 장점 1. 이름을 가질 수 있다. )
    public static Example01 FullOptionCar(String name, int option1, int option2, int option3) {
        return new Example01(name, option1, option2, option3);
    }

    // 정적 팩터리 메서드 방식 ( 장점 2. 호출될 때마다 인스턴스를 새로 생성하지 않아도 된다. )
    public static Example01 getBenz() {
        return BENZ;
    }

    public static void main(String[] args) {
        Example01 example01 = new Example01("자동차", 1, 2, 3 );

        Example01 fullOptionCar = Example01.FullOptionCar("자동차", 1, 2, 3);

        Example01 Benz = Example01.getBenz();
    }
}
