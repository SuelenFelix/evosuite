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

public class Match_getUmpire1_19039490154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7881;

    public Match_getUmpire1_19039490154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7881 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        setLongField(term7881, term7881.getClass(), "id", 0L);
        setField(term7881, term7881.getClass(), "city", null);
        setField(term7881, term7881.getClass(), "date", null);
        setField(term7881, term7881.getClass(), "playerOfMatch", null);
        setField(term7881, term7881.getClass(), "venue", null);
        setField(term7881, term7881.getClass(), "team1", null);
        setField(term7881, term7881.getClass(), "team2", null);
        setField(term7881, term7881.getClass(), "tossWinner", null);
        setField(term7881, term7881.getClass(), "tossDecision", null);
        setField(term7881, term7881.getClass(), "matchWinner", null);
        setField(term7881, term7881.getClass(), "result", null);
        setField(term7881, term7881.getClass(), "resultMargin", null);
        setField(term7881, term7881.getClass(), "umpire1", null);
        setField(term7881, term7881.getClass(), "umpire2", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.model.Match");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUmpire1", argTypes, term7881, args);
    }

};


