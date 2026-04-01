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

public class Vote_getPlanetName_73611249838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22998;

    public Vote_getPlanetName_73611249838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22998 = newInstance(Class.forName("org.openRealmOfStars.starMap.vote.Vote"));
        setField(term22998, term22998.getClass(), "type", null);
        setField(term22998, term22998.getClass(), "choices", null);
        setField(term22998, term22998.getClass(), "numberOfVotes", null);
        setIntField(term22998, term22998.getClass(), "turnsToVote", 0);
        setIntField(term22998, term22998.getClass(), "organizerIndex", 0);
        setIntField(term22998, term22998.getClass(), "secondCandidateIndex", 0);
        setField(term22998, term22998.getClass(), "planetName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.vote.Vote");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlanetName", argTypes, term22998, args);
    }

};


