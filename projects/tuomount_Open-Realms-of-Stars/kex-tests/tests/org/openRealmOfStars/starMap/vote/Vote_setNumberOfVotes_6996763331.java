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

public class Vote_setNumberOfVotes_6996763331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22962;
     Object term22966;
     Object term22968;

    public Vote_setNumberOfVotes_6996763331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22962 = newInstance(Class.forName("org.openRealmOfStars.starMap.vote.Vote"));
        setField(term22962, term22962.getClass(), "type", null);
        setField(term22962, term22962.getClass(), "choices", null);
        setField(term22962, term22962.getClass(), "numberOfVotes", null);
        setIntField(term22962, term22962.getClass(), "turnsToVote", 0);
        setIntField(term22962, term22962.getClass(), "organizerIndex", 0);
        setIntField(term22962, term22962.getClass(), "secondCandidateIndex", 0);
        setField(term22962, term22962.getClass(), "planetName", null);
        term22966 = new Integer(0);
        term22968 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.vote.Vote");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term22966;
        args[1] = term22968;
        callMethod(klass, "setNumberOfVotes", argTypes, term22962, args);
    }

};


