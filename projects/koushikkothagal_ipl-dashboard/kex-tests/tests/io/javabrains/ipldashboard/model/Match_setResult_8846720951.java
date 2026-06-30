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

public class Match_setResult_8846720951 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7875;

    public Match_setResult_8846720951() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7875 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        setLongField(term7875, term7875.getClass(), "id", 0L);
        setField(term7875, term7875.getClass(), "city", null);
        setField(term7875, term7875.getClass(), "date", null);
        setField(term7875, term7875.getClass(), "playerOfMatch", null);
        setField(term7875, term7875.getClass(), "venue", null);
        setField(term7875, term7875.getClass(), "team1", null);
        setField(term7875, term7875.getClass(), "team2", null);
        setField(term7875, term7875.getClass(), "tossWinner", null);
        setField(term7875, term7875.getClass(), "tossDecision", null);
        setField(term7875, term7875.getClass(), "matchWinner", null);
        setField(term7875, term7875.getClass(), "result", null);
        setField(term7875, term7875.getClass(), "resultMargin", null);
        setField(term7875, term7875.getClass(), "umpire1", null);
        setField(term7875, term7875.getClass(), "umpire2", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.model.Match");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setResult", argTypes, term7875, args);
    }

};


