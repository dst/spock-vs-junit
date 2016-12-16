package com.stefanski

import spock.lang.Specification
import spock.util.environment.RestoreSystemProperties

import static Dog.FORCE_DOG_TO_BE_CAT

/**
 * @author Dariusz Stefanski
 * @since 16 Dec 2016
 */
class DogSpec extends Specification {

    Dog animal = new Dog()

    @RestoreSystemProperties
    def 'Magician can transform a dog into a cat'() {
        given:
            new Magician().abracadabra()
        expect:
            animal.bark() == "Meow!"
    }

    def 'A dog should be a dog'() {
        expect:
            animal.bark() == "Woof!"
    }

    class Magician {
        void abracadabra() {
            System.setProperty(FORCE_DOG_TO_BE_CAT, "Do it bitch!")
        }
    }
}
