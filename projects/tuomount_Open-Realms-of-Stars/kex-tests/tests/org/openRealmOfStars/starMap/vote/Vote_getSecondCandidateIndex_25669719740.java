package org.openRealmOfStars.starMap.vote;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.openRealmOfStars.starMap.vote.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Vote_getSecondCandidateIndex_25669719740 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23006;

    public Vote_getSecondCandidateIndex_25669719740() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23006 = newInstance(Class.forName("org.openRealmOfStars.starMap.vote.Vote"));
        setField(term23006, term23006.getClass(), "type", null);
        setField(term23006, term23006.getClass(), "choices", null);
        setField(term23006, term23006.getClass(), "numberOfVotes", null);
        setIntField(term23006, term23006.getClass(), "turnsToVote", 0);
        setIntField(term23006, term23006.getClass(), "organizerIndex", 0);
        setIntField(term23006, term23006.getClass(), "secondCandidateIndex", 0);
        setField(term23006, term23006.getClass(), "planetName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.vote.Vote");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSecondCandidateIndex", argTypes, term23006, args);
    }

};


