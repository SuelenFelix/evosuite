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
import java.lang.Integer;

public class Vote_setSecondCandidateIndex_110361611141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23010;
     Object term23014;

    public Vote_setSecondCandidateIndex_110361611141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23010 = newInstance(Class.forName("org.openRealmOfStars.starMap.vote.Vote"));
        setField(term23010, term23010.getClass(), "type", null);
        setField(term23010, term23010.getClass(), "choices", null);
        setField(term23010, term23010.getClass(), "numberOfVotes", null);
        setIntField(term23010, term23010.getClass(), "turnsToVote", 0);
        setIntField(term23010, term23010.getClass(), "organizerIndex", 0);
        setIntField(term23010, term23010.getClass(), "secondCandidateIndex", 0);
        setField(term23010, term23010.getClass(), "planetName", null);
        term23014 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.vote.Vote");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term23014;
        callMethod(klass, "setSecondCandidateIndex", argTypes, term23010, args);
    }

};


