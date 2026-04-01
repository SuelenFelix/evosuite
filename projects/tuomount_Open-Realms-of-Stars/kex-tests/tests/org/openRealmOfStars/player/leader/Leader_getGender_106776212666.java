package org.openRealmOfStars.player.leader;

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
import static org.openRealmOfStars.player.leader.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Leader_getGender_106776212666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1266442;

    public Leader_getGender_106776212666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1266442 = newInstance(Class.forName("org.openRealmOfStars.player.leader.Leader"));
        setField(term1266442, term1266442.getClass(), "name", null);
        setField(term1266442, term1266442.getClass(), "homeworld", null);
        setIntField(term1266442, term1266442.getClass(), "age", 0);
        setIntField(term1266442, term1266442.getClass(), "timeInJob", 0);
        setIntField(term1266442, term1266442.getClass(), "level", 0);
        setIntField(term1266442, term1266442.getClass(), "experience", 0);
        setField(term1266442, term1266442.getClass(), "militaryRank", null);
        setField(term1266442, term1266442.getClass(), "gender", null);
        setField(term1266442, term1266442.getClass(), "race", null);
        setField(term1266442, term1266442.getClass(), "title", null);
        setField(term1266442, term1266442.getClass(), "job", null);
        setField(term1266442, term1266442.getClass(), "parent", null);
        setIntField(term1266442, term1266442.getClass(), "parentIndex", 0);
        setField(term1266442, term1266442.getClass(), "perkList", null);
        setField(term1266442, term1266442.getClass(), "stats", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.leader.Leader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGender", argTypes, term1266442, args);
    }

};


