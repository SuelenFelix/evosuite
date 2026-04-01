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
import java.lang.Integer;

public class Leader_setAge_200703316650 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1266338;
     Object term1266344;

    public Leader_setAge_200703316650() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1266338 = newInstance(Class.forName("org.openRealmOfStars.player.leader.Leader"));
        setField(term1266338, term1266338.getClass(), "name", null);
        setField(term1266338, term1266338.getClass(), "homeworld", null);
        setIntField(term1266338, term1266338.getClass(), "age", 0);
        setIntField(term1266338, term1266338.getClass(), "timeInJob", 0);
        setIntField(term1266338, term1266338.getClass(), "level", 0);
        setIntField(term1266338, term1266338.getClass(), "experience", 0);
        setField(term1266338, term1266338.getClass(), "militaryRank", null);
        setField(term1266338, term1266338.getClass(), "gender", null);
        setField(term1266338, term1266338.getClass(), "race", null);
        setField(term1266338, term1266338.getClass(), "title", null);
        setField(term1266338, term1266338.getClass(), "job", null);
        setField(term1266338, term1266338.getClass(), "parent", null);
        setIntField(term1266338, term1266338.getClass(), "parentIndex", 0);
        setField(term1266338, term1266338.getClass(), "perkList", null);
        setField(term1266338, term1266338.getClass(), "stats", null);
        term1266344 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.leader.Leader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1266344;
        callMethod(klass, "setAge", argTypes, term1266338, args);
    }

};


