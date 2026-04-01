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

public class Vote_saveVote_5920298633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22976;

    public Vote_saveVote_5920298633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22976 = newInstance(Class.forName("org.openRealmOfStars.starMap.vote.Vote"));
        setField(term22976, term22976.getClass(), "type", null);
        setField(term22976, term22976.getClass(), "choices", null);
        setField(term22976, term22976.getClass(), "numberOfVotes", null);
        setIntField(term22976, term22976.getClass(), "turnsToVote", 0);
        setIntField(term22976, term22976.getClass(), "organizerIndex", 0);
        setIntField(term22976, term22976.getClass(), "secondCandidateIndex", 0);
        setField(term22976, term22976.getClass(), "planetName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.vote.Vote");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataOutputStream");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "saveVote", argTypes, term22976, args);
    }

};


