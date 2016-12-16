package com.stefanski;

import com.google.common.collect.ImmutableSet;
import com.stefanski.RequiresNormaliser.Require;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Set;

import static com.stefanski.RequiresNormaliser.Require.COMMENT;
import static com.stefanski.RequiresNormaliser.Require.ISSUE;
import static com.stefanski.RequiresNormaliser.Require.USER;
import static java.util.Collections.emptySet;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@RunWith(Parameterized.class)
public class RequiresNormaliserTest {

//    @Parameters(name = "{index}: normalise({0})={1}")
    @Parameters
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {null, ImmutableSet.of("issue")},
                {emptySet(), ImmutableSet.of("issue")},
                {ImmutableSet.of(ISSUE), ImmutableSet.of("issue")},
                {ImmutableSet.of(COMMENT), ImmutableSet.of("comment")},
                {ImmutableSet.of(ISSUE, COMMENT), ImmutableSet.of("issue", "comment")},
                {ImmutableSet.of(USER, COMMENT), ImmutableSet.of("user", "comment")}
        });
    }

    private RequiresNormaliser normaliser = new RequiresNormaliser();

    private Set<Require> requires;
    private Set<String> normalisedRequires;

    public RequiresNormaliserTest(Set<Require> requires, Set<String> normalisedRequires) {
        this.requires = requires;
        this.normalisedRequires = normalisedRequires;
    }

    @Test
    public void shouldNormalise() {
        assertThat(normaliser.normalise(requires), equalTo(normalisedRequires));
    }
}
