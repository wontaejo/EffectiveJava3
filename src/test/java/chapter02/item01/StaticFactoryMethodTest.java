package chapter02.item01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StaticFactoryMethodTest {

    @Test
    @DisplayName("하위 타입 객체 반환 가능")
    public void TestStaticFactoryMethodAdvantages3() {
        Phone iPhone = Phone.getIPhone();
        Phone galaxy = Phone.getGalaxy();

        assertEquals(iPhone.getName(), "IPhone");
        assertEquals(galaxy.getName(), "Galaxy");
    }

    @Test
    @DisplayName("인자에 따라 다른 클래스 객체 반환")
    public void TestStaticFactoryMethodAdvantages4() {
        Phone iPhone = Phone.getPhoneByName("SAMSUNG");

        assertEquals(iPhone.getName(), "Galaxy");
    }
}
