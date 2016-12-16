package com.stefanski.basic

import spock.lang.Specification

class BasicSpec extends Specification {

    def standard() {
        given:
            int a = 1
            int b = 2
        when:
            int result = a + b
        then:
            result == 2
    }

    def shortest() {
        expect:
            1 == 2
    }
}