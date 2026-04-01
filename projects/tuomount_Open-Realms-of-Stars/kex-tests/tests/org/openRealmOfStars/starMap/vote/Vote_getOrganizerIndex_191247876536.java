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

public class Vote_getOrganizerIndex_191247876536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22988;

    public Vote_getOrganizerIndex_191247876536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22988 = newInstance(Class.forName("org.openRealmOfStars.starMap.vote.Vote"));
        setField(term22988, term22988.getClass(), "type", null);
        setField(term22988, term22988.getClass(), "choices", null);
        setField(term22988, term22988.getClass(), "numberOfVotes", null);
        setIntField(term22988, term22988.getClass(), "turnsToVote", 0);
        setIntField(term22988, term22988.getClass(), "organizerIndex", 0);
        setIntField(term22988, term22988.getClass(), "secondCandidateIndex", 0);
        setField(term22988, term22988.getClass(), "planetName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.vote.Vote");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOrganizerIndex", argTypes, term22988, args);
    }

};


