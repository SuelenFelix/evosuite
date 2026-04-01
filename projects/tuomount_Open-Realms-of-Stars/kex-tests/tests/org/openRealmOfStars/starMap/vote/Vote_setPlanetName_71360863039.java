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

public class Vote_setPlanetName_71360863039 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23002;

    public Vote_setPlanetName_71360863039() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23002 = newInstance(Class.forName("org.openRealmOfStars.starMap.vote.Vote"));
        setField(term23002, term23002.getClass(), "type", null);
        setField(term23002, term23002.getClass(), "choices", null);
        setField(term23002, term23002.getClass(), "numberOfVotes", null);
        setIntField(term23002, term23002.getClass(), "turnsToVote", 0);
        setIntField(term23002, term23002.getClass(), "organizerIndex", 0);
        setIntField(term23002, term23002.getClass(), "secondCandidateIndex", 0);
        setField(term23002, term23002.getClass(), "planetName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.vote.Vote");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPlanetName", argTypes, term23002, args);
    }

};


