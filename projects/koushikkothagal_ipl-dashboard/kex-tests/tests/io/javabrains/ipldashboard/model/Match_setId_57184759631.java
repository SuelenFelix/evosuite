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

public class Match_setId_57184759631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7833;
     Object term7835;

    public Match_setId_57184759631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7833 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        setLongField(term7833, term7833.getClass(), "id", 0L);
        setField(term7833, term7833.getClass(), "city", null);
        setField(term7833, term7833.getClass(), "date", null);
        setField(term7833, term7833.getClass(), "playerOfMatch", null);
        setField(term7833, term7833.getClass(), "venue", null);
        setField(term7833, term7833.getClass(), "team1", null);
        setField(term7833, term7833.getClass(), "team2", null);
        setField(term7833, term7833.getClass(), "tossWinner", null);
        setField(term7833, term7833.getClass(), "tossDecision", null);
        setField(term7833, term7833.getClass(), "matchWinner", null);
        setField(term7833, term7833.getClass(), "result", null);
        setField(term7833, term7833.getClass(), "resultMargin", null);
        setField(term7833, term7833.getClass(), "umpire1", null);
        setField(term7833, term7833.getClass(), "umpire2", null);
        term7835 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.model.Match");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term7835;
        callMethod(klass, "setId", argTypes, term7833, args);
    }

};


