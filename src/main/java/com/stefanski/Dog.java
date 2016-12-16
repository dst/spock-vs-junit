package com.stefanski;

/**
 * @author Dariusz Stefanski
 * @since 16 Dec 2016
 */
class Dog {

    static final String FORCE_DOG_TO_BE_CAT = "animal.force.cat";
    static final String DOG_SOUND = "Woof!";
    static final String CAT_SOUND = "Meow!";

    String bark() {
        if (System.getProperty(FORCE_DOG_TO_BE_CAT) == null) {
            return DOG_SOUND;
        } else {
//            if (true) {
//                throw new RuntimeException("WTF!?");
//            }
            return CAT_SOUND;
        }
    }
}
