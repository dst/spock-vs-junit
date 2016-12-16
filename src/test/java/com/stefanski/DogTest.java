package com.stefanski;

import org.junit.Test;

import static com.stefanski.Dog.CAT_SOUND;
import static com.stefanski.Dog.DOG_SOUND;
import static com.stefanski.Dog.FORCE_DOG_TO_BE_CAT;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author Dariusz Stefanski
 * @since 16 Dec 2016
 */
public class DogTest {

    private Dog dog = new Dog();

    /**
     * Almost copy-pasted from our code base
     */
    @Test
    public void aSystemPropertyCanForceDogToBeACat() {
        // given:
        System.setProperty(FORCE_DOG_TO_BE_CAT, "true");

        // expect:
        assertThat(dog.bark(), is(CAT_SOUND));

        // cleanup:
        System.clearProperty(FORCE_DOG_TO_BE_CAT);
    }

    @Test
    public void dogShouldBeDog() {
        // expect:
        assertThat(dog.bark(), is(DOG_SOUND));
    }
}