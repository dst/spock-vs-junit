package com.stefanski;


import com.google.common.collect.ImmutableSet;
import org.apache.commons.collections4.CollectionUtils;

import java.util.Set;

import static com.stefanski.RequiresNormaliser.Require.ISSUE;
import static java.util.stream.Collectors.toSet;

class RequiresNormaliser {

    private static final ImmutableSet<Require> DEFAULT_REQUIRES = ImmutableSet.of(ISSUE);

    Set<String> normalise(Set<Require> requires) {
        Set<Require> normalisedRequires = CollectionUtils.isEmpty(requires) ? DEFAULT_REQUIRES : requires;
        return normalisedRequires.stream()
                .map(Require::name)
                .map(String::toLowerCase)
                .collect(toSet());
    }


    enum Require {
        COMMENT,
        ISSUE,
        USER
    }
}
