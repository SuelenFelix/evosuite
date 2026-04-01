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

public class Leader_setLevel_35104551359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1266394;
     Object term1266400;

    public Leader_setLevel_35104551359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1266394 = newInstance(Class.forName("org.openRealmOfStars.player.leader.Leader"));
        setField(term1266394, term1266394.getClass(), "name", null);
        setField(term1266394, term1266394.getClass(), "homeworld", null);
        setIntField(term1266394, term1266394.getClass(), "age", 0);
        setIntField(term1266394, term1266394.getClass(), "timeInJob", 0);
        setIntField(term1266394, term1266394.getClass(), "level", 0);
        setIntField(term1266394, term1266394.getClass(), "experience", 0);
        setField(term1266394, term1266394.getClass(), "militaryRank", null);
        setField(term1266394, term1266394.getClass(), "gender", null);
        setField(term1266394, term1266394.getClass(), "race", null);
        setField(term1266394, term1266394.getClass(), "title", null);
        setField(term1266394, term1266394.getClass(), "job", null);
        setField(term1266394, term1266394.getClass(), "parent", null);
        setIntField(term1266394, term1266394.getClass(), "parentIndex", 0);
        setField(term1266394, term1266394.getClass(), "perkList", null);
        setField(term1266394, term1266394.getClass(), "stats", null);
        term1266400 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.leader.Leader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1266400;
        callMethod(klass, "setLevel", argTypes, term1266394, args);
    }

};


