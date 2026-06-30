package io.javabrains.ipldashboard.model;

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
import static io.javabrains.ipldashboard.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class Team_setTotalWins_66198670620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9116;
     Object term9120;

    public Team_setTotalWins_66198670620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9116 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Team"));
        setLongField(term9116, term9116.getClass(), "id", 0L);
        setField(term9116, term9116.getClass(), "teamName", null);
        setLongField(term9116, term9116.getClass(), "totalMatches", 0L);
        setLongField(term9116, term9116.getClass(), "totalWins", 0L);
        setField(term9116, term9116.getClass(), "matches", null);
        term9120 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.model.Team");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term9120;
        callMethod(klass, "setTotalWins", argTypes, term9116, args);
    }

};


