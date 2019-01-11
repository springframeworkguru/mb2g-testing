package guru.springframework;

import org.junit.jupiter.api.Test;

class JavaHelloWorldTest {

    @Test
    void getHello() {

        System.out.println("#####################");
        System.out.println(System.getenv("TEST_HOST"));
    }
}