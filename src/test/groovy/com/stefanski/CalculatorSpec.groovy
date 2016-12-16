package com.stefanski

import spock.lang.Specification

/**
 * @author Dariusz Stefanski
 * @since 16 Dec 2016
 */
class CalculatorSpec extends Specification {

    def 'should sum two positive numbers'() {
        given:
        Calculator calculator = new Calculator()

        when:
        def sum = calculator.sum(1, 2)

        then:
        sum == 2
    }
}
