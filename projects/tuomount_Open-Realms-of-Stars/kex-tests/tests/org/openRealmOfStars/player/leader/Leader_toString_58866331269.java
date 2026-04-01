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

public class Leader_toString_58866331269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1266460;

    public Leader_toString_58866331269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1266460 = newInstance(Class.forName("org.openRealmOfStars.player.leader.Leader"));
        setField(term1266460, term1266460.getClass(), "name", null);
        setField(term1266460, term1266460.getClass(), "homeworld", null);
        setIntField(term1266460, term1266460.getClass(), "age", 0);
        setIntField(term1266460, term1266460.getClass(), "timeInJob", 0);
        setIntField(term1266460, term1266460.getClass(), "level", 0);
        setIntField(term1266460, term1266460.getClass(), "experience", 0);
        setField(term1266460, term1266460.getClass(), "militaryRank", null);
        setField(term1266460, term1266460.getClass(), "gender", null);
        setField(term1266460, term1266460.getClass(), "race", null);
        setField(term1266460, term1266460.getClass(), "title", null);
        setField(term1266460, term1266460.getClass(), "job", null);
        setField(term1266460, term1266460.getClass(), "parent", null);
        setIntField(term1266460, term1266460.getClass(), "parentIndex", 0);
        setField(term1266460, term1266460.getClass(), "perkList", null);
        setField(term1266460, term1266460.getClass(), "stats", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.leader.Leader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1266460, args);
    }

};


