package com.stefanski.basic

import spock.lang.Specification

class BasicSpec extends Specification {

    def 'should name'() {
        expect:
        1 == 2
    }
}