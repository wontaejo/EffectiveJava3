package chapter02.item01;

public class Phone {
    private String name;

    // 장점3. 하위 타입 객체 반환 가능
    public static Phone getIPhone() {
        return new IPhone();
    }

    // 장점3. 하위 타입 객체 반환 가능
    public static Phone getGalaxy() {
        return new Galaxy();
    }

    // 장점4. 인자에 따라 다른 클래스 객체 반환
    public static Phone getPhoneByName(String manufacturer) {
        return manufacturer.equals("SAMSUNG") ? new Galaxy() : new IPhone();
    }

    // TODO 장점 5번 CASE 는 아무리 봐도 이해가 잘 안 된다.
    public String getName() {
        return name;
    }
}
