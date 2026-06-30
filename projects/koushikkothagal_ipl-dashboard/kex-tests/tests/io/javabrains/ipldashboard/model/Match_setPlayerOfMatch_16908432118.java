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
import java.lang.Object;

public class Match_setPlayerOfMatch_16908432118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1919;

    public Match_setPlayerOfMatch_16908432118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1919 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term1933 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term1919, term1919.getClass(), "id", -7237588299778557629L);
        setField(term1919, term1919.getClass(), "city", "LvJFtLBaxj");
        setIntField(term1933, term1933.getClass(), "year", 2022);
        setShortField(term1933, term1933.getClass(), "month", (short) 2);
        setShortField(term1933, term1933.getClass(), "day", (short) 25);
        setField(term1919, term1919.getClass(), "date", term1933);
        setField(term1919, term1919.getClass(), "playerOfMatch", "PHvxnGHptP");
        setField(term1919, term1919.getClass(), "venue", "TimdotUuNC");
        setField(term1919, term1919.getClass(), "team1", "PkWMRdJcBb");
        setField(term1919, term1919.getClass(), "team2", "jSpAteRute");
        setField(term1919, term1919.getClass(), "tossWinner", "swZVeJAxjt");
        setField(term1919, term1919.getClass(), "tossDecision", "xOcJIiQQDu");
        setField(term1919, term1919.getClass(), "matchWinner", "GVizqqzXpy");
        setField(term1919, term1919.getClass(), "result", "JqXGgAhZPl");
        setField(term1919, term1919.getClass(), "resultMargin", "jiKYgYHqIS");
        setField(term1919, term1919.getClass(), "umpire1", "DfISiziTgG");
        setField(term1919, term1919.getClass(), "umpire2", "XqgfKFvPSD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.model.Match");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JiVRgTZvKc";
        callMethod(klass, "setPlayerOfMatch", argTypes, term1919, args);
    }

};


