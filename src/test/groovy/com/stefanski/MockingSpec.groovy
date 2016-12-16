package com.stefanski

import spock.lang.Specification


/**
 * @author Dariusz Stefanski
 * @since 16 Dec 2016
 */
class MockingSpec extends Specification {

    def 'should stubbing work'() {
        given:
            // stub
            Dog dog = Mock(Dog)
            dog.bark() >> 'Moo'
        expect:
            dog.bark() == 'Moo'
    }
}