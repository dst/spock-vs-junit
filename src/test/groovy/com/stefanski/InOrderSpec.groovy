package com.stefanski

import spock.lang.Specification
import spock.lang.Stepwise

/**
 * @author Dariusz Stefanski
 * @since 16 Dec 2016
 */
// stepwise
class InOrderSpec extends Specification {

    def 'Insert customer'() {
        expect:
        System.out.println('Insert customer')
//        throw new RuntimeException('Insert failed!')
    }

    def 'Find customer'() {
        expect:
        System.out.println('Find customer')
    }
}