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

public class Vote_getChoice_73249561230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22956;
     Object term22960;

    public Vote_getChoice_73249561230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22956 = newInstance(Class.forName("org.openRealmOfStars.starMap.vote.Vote"));
        setField(term22956, term22956.getClass(), "type", null);
        setField(term22956, term22956.getClass(), "choices", null);
        setField(term22956, term22956.getClass(), "numberOfVotes", null);
        setIntField(term22956, term22956.getClass(), "turnsToVote", 0);
        setIntField(term22956, term22956.getClass(), "organizerIndex", 0);
        setIntField(term22956, term22956.getClass(), "secondCandidateIndex", 0);
        setField(term22956, term22956.getClass(), "planetName", null);
        term22960 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.vote.Vote");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term22960;
        callMethod(klass, "getChoice", argTypes, term22956, args);
    }

};


