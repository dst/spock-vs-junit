package com.stefanski

import spock.lang.Specification
import spock.lang.Unroll

import static com.stefanski.RequiresNormaliser.Require.*

/**
 * @author Dariusz Stefanski
 * @since 16 Dec 2016
 */
class RequiresNormaliserSpec extends Specification {

    RequiresNormaliser normaliser = new RequiresNormaliser()

    // @Unroll then #requires as #normalisedRequires
    def "should normalise"() {
        expect:
            normaliser.normalise(requires as Set) == normalisedRequires as Set
        where:
            requires         || normalisedRequires
            null             || ["issue"]
            []               || ["issue"]
            [ISSUE]          || ["issue"]
            [COMMENT]        || ["comment"]
            [ISSUE, COMMENT] || ["issue", "comment"]
            [USER, COMMENT]  || ["user", "comment"]
    }
}
