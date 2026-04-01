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

public class Vote_setChoice_199111653229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22950;
     Object term22954;

    public Vote_setChoice_199111653229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22950 = newInstance(Class.forName("org.openRealmOfStars.starMap.vote.Vote"));
        setField(term22950, term22950.getClass(), "type", null);
        setField(term22950, term22950.getClass(), "choices", null);
        setField(term22950, term22950.getClass(), "numberOfVotes", null);
        setIntField(term22950, term22950.getClass(), "turnsToVote", 0);
        setIntField(term22950, term22950.getClass(), "organizerIndex", 0);
        setIntField(term22950, term22950.getClass(), "secondCandidateIndex", 0);
        setField(term22950, term22950.getClass(), "planetName", null);
        term22954 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.vote.Vote");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Object[] args = new Object[2];
        args[0] = term22954;
        args[1] = null;
        callMethod(klass, "setChoice", argTypes, term22950, args);
    }

};


