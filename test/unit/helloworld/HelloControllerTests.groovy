package helloworld

import spock.lang.Specification
import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(HelloController)
class HelloControllerTests extends Specification {

    void 'test hello'() {
        when:
        controller.index()

        then:
        response.text == "Hello World"
    }
}
