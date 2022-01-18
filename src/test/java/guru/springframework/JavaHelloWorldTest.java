package guru.springframework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JavaHelloWorldTest {

    @Test
    public void getHello() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();

        assertEquals("Hello World", javaHelloWorld.getHello());
    }
}