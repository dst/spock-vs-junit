package com.stefanski;

import com.google.common.collect.ImmutableSet;
import org.junit.Test;

import static com.stefanski.RequiresNormaliser.Require.COMMENT;
import static com.stefanski.RequiresNormaliser.Require.ISSUE;
import static com.stefanski.RequiresNormaliser.Require.USER;
import static java.util.Collections.emptySet;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class RequiresNormaliserNotGoodTest {

    private RequiresNormaliser normaliser = new RequiresNormaliser();

    @Test
    public void shouldNormalise() {
        assertThat(normaliser.normalise(null), equalTo(ImmutableSet.of("issue")));
        assertThat(normaliser.normalise(emptySet()), equalTo(ImmutableSet.of("issue")));
        assertThat(normaliser.normalise(ImmutableSet.of(ISSUE)), equalTo(ImmutableSet.of("issue")));
        assertThat(normaliser.normalise(ImmutableSet.of(COMMENT)), equalTo(ImmutableSet.of("comment")));
        assertThat(normaliser.normalise(ImmutableSet.of(ISSUE, COMMENT)), equalTo(ImmutableSet.of("issue", "comment")));
        assertThat(normaliser.normalise(ImmutableSet.of(USER, COMMENT)), equalTo(ImmutableSet.of("user", "comment")));
    }
}
