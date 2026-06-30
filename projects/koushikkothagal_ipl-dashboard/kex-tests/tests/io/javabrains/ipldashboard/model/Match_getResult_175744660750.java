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

public class Match_getResult_175744660750 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7873;

    public Match_getResult_175744660750() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7873 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        setLongField(term7873, term7873.getClass(), "id", 0L);
        setField(term7873, term7873.getClass(), "city", null);
        setField(term7873, term7873.getClass(), "date", null);
        setField(term7873, term7873.getClass(), "playerOfMatch", null);
        setField(term7873, term7873.getClass(), "venue", null);
        setField(term7873, term7873.getClass(), "team1", null);
        setField(term7873, term7873.getClass(), "team2", null);
        setField(term7873, term7873.getClass(), "tossWinner", null);
        setField(term7873, term7873.getClass(), "tossDecision", null);
        setField(term7873, term7873.getClass(), "matchWinner", null);
        setField(term7873, term7873.getClass(), "result", null);
        setField(term7873, term7873.getClass(), "resultMargin", null);
        setField(term7873, term7873.getClass(), "umpire1", null);
        setField(term7873, term7873.getClass(), "umpire2", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.model.Match");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResult", argTypes, term7873, args);
    }

};


