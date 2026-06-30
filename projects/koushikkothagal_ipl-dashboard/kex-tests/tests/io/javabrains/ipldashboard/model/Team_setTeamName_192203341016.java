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

public class Team_setTeamName_192203341016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9098;

    public Team_setTeamName_192203341016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9098 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Team"));
        setLongField(term9098, term9098.getClass(), "id", 0L);
        setField(term9098, term9098.getClass(), "teamName", null);
        setLongField(term9098, term9098.getClass(), "totalMatches", 0L);
        setLongField(term9098, term9098.getClass(), "totalWins", 0L);
        setField(term9098, term9098.getClass(), "matches", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.model.Team");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTeamName", argTypes, term9098, args);
    }

};


