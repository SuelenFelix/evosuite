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

public class Vote_getTurnsToVote_68312354527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22940;

    public Vote_getTurnsToVote_68312354527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22940 = newInstance(Class.forName("org.openRealmOfStars.starMap.vote.Vote"));
        setField(term22940, term22940.getClass(), "type", null);
        setField(term22940, term22940.getClass(), "choices", null);
        setField(term22940, term22940.getClass(), "numberOfVotes", null);
        setIntField(term22940, term22940.getClass(), "turnsToVote", 0);
        setIntField(term22940, term22940.getClass(), "organizerIndex", 0);
        setIntField(term22940, term22940.getClass(), "secondCandidateIndex", 0);
        setField(term22940, term22940.getClass(), "planetName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.vote.Vote");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTurnsToVote", argTypes, term22940, args);
    }

};


