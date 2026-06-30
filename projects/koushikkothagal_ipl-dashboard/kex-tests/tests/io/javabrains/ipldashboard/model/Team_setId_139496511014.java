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

public class Team_setId_139496511014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9088;
     Object term9092;

    public Team_setId_139496511014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9088 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Team"));
        setLongField(term9088, term9088.getClass(), "id", 0L);
        setField(term9088, term9088.getClass(), "teamName", null);
        setLongField(term9088, term9088.getClass(), "totalMatches", 0L);
        setLongField(term9088, term9088.getClass(), "totalWins", 0L);
        setField(term9088, term9088.getClass(), "matches", null);
        term9092 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.model.Team");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term9092;
        callMethod(klass, "setId", argTypes, term9088, args);
    }

};


