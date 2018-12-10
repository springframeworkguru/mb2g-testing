package guru.springframework;



public class JavaHelloWorldTest {

    public void testGetHello() {

        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();

        assert("Hello World".equals(javaHelloWorld.getHello()));
    }
}