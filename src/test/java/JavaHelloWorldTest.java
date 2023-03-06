package guru.springframework;

import guru.springframework.JavaHelloWorld;

public class JavaHelloWorldTest {

    public void  testgetHello(){
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();

        assert("Hello World a7".equals(javaHelloWorld.getHello()));
       
    }

}
