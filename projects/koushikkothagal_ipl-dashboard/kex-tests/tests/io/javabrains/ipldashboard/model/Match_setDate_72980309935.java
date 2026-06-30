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

public class Match_setDate_72980309935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7843;

    public Match_setDate_72980309935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7843 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        setLongField(term7843, term7843.getClass(), "id", 0L);
        setField(term7843, term7843.getClass(), "city", null);
        setField(term7843, term7843.getClass(), "date", null);
        setField(term7843, term7843.getClass(), "playerOfMatch", null);
        setField(term7843, term7843.getClass(), "venue", null);
        setField(term7843, term7843.getClass(), "team1", null);
        setField(term7843, term7843.getClass(), "team2", null);
        setField(term7843, term7843.getClass(), "tossWinner", null);
        setField(term7843, term7843.getClass(), "tossDecision", null);
        setField(term7843, term7843.getClass(), "matchWinner", null);
        setField(term7843, term7843.getClass(), "result", null);
        setField(term7843, term7843.getClass(), "resultMargin", null);
        setField(term7843, term7843.getClass(), "umpire1", null);
        setField(term7843, term7843.getClass(), "umpire2", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.model.Match");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDate", argTypes, term7843, args);
    }

};


