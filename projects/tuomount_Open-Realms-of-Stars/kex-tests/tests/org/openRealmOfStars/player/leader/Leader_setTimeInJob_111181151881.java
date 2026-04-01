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

public class Leader_setTimeInJob_111181151881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1266532;
     Object term1266538;

    public Leader_setTimeInJob_111181151881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1266532 = newInstance(Class.forName("org.openRealmOfStars.player.leader.Leader"));
        setField(term1266532, term1266532.getClass(), "name", null);
        setField(term1266532, term1266532.getClass(), "homeworld", null);
        setIntField(term1266532, term1266532.getClass(), "age", 0);
        setIntField(term1266532, term1266532.getClass(), "timeInJob", 0);
        setIntField(term1266532, term1266532.getClass(), "level", 0);
        setIntField(term1266532, term1266532.getClass(), "experience", 0);
        setField(term1266532, term1266532.getClass(), "militaryRank", null);
        setField(term1266532, term1266532.getClass(), "gender", null);
        setField(term1266532, term1266532.getClass(), "race", null);
        setField(term1266532, term1266532.getClass(), "title", null);
        setField(term1266532, term1266532.getClass(), "job", null);
        setField(term1266532, term1266532.getClass(), "parent", null);
        setIntField(term1266532, term1266532.getClass(), "parentIndex", 0);
        setField(term1266532, term1266532.getClass(), "perkList", null);
        setField(term1266532, term1266532.getClass(), "stats", null);
        term1266538 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.leader.Leader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1266538;
        callMethod(klass, "setTimeInJob", argTypes, term1266532, args);
    }

};


