package guru.springframework

import spock.lang.Specification


/**
 * Created by jt on 2018-12-12.
 */
class JavaHelloWorldSpecTest extends Specification {

    def "GetHello"() {

        when:
        def foo = "123"

        then:
        true
    }
}
