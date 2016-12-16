package com.stefanski.basic

import groovy.transform.ToString
import spock.lang.Specification

/**
 * @author Dariusz Stefanski
 * @since 16 Dec 2016
 */
class MatchersSpec extends Specification {

    def 'min'() {
        expect:
            Math.min(1, 6) == 6
    }

    def 'string'() {
        expect:
            'asdfdsghfsfadgfdhaffdfsadafasgdasgdsag' == 'asdfdsghfsfadgfdhagfdfsadafasgdasgdsag'
    }

    def 'map'() {
        given:
            def realDarek = ['name': 'Darek', 'surname': 'Stefanski', 'role': 'Dev']
        expect:
            ['surname': 'Stefanski', 'name': 'Derek', 'role': 'Dev'] == realDarek

    }

    @ToString
    class Person {
        String name
        Animal animal
    }

    @ToString
    class Animal {
        String type
    }

    def 'darek should have a cat'() {
        def darek = new Person(name: 'Darek', animal: new Animal(type: 'dog'))
        expect:
            darek.animal.type == 'cat'
    }

}