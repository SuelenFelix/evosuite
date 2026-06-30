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

public class Team_getTeamName_33569097015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9094;

    public Team_getTeamName_33569097015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9094 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Team"));
        setLongField(term9094, term9094.getClass(), "id", 0L);
        setField(term9094, term9094.getClass(), "teamName", null);
        setLongField(term9094, term9094.getClass(), "totalMatches", 0L);
        setLongField(term9094, term9094.getClass(), "totalWins", 0L);
        setField(term9094, term9094.getClass(), "matches", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.model.Team");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTeamName", argTypes, term9094, args);
    }

};


