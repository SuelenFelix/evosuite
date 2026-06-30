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

public class Match_setTeam1_3072989212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3043;

    public Match_setTeam1_3072989212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3043 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term3057 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term3043, term3043.getClass(), "id", -4325723315152823407L);
        setField(term3043, term3043.getClass(), "city", "fWKJoSoCwE");
        setIntField(term3057, term3057.getClass(), "year", 2025);
        setShortField(term3057, term3057.getClass(), "month", (short) 4);
        setShortField(term3057, term3057.getClass(), "day", (short) 23);
        setField(term3043, term3043.getClass(), "date", term3057);
        setField(term3043, term3043.getClass(), "playerOfMatch", "wfaXBpWAUH");
        setField(term3043, term3043.getClass(), "venue", "VMeAzAHwZj");
        setField(term3043, term3043.getClass(), "team1", "PznxWXsZME");
        setField(term3043, term3043.getClass(), "team2", "ZzIujlwVsw");
        setField(term3043, term3043.getClass(), "tossWinner", "LWyEaeIyAo");
        setField(term3043, term3043.getClass(), "tossDecision", "yVMkkQhvmN");
        setField(term3043, term3043.getClass(), "matchWinner", "mvrkADEgpp");
        setField(term3043, term3043.getClass(), "result", "pXOkjyeIRb");
        setField(term3043, term3043.getClass(), "resultMargin", "GgZWSjxjyE");
        setField(term3043, term3043.getClass(), "umpire1", "EeBVbzjcCI");
        setField(term3043, term3043.getClass(), "umpire2", "UfQtPRyWRC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.model.Match");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "FPvxVzzSvD";
        callMethod(klass, "setTeam1", argTypes, term3043, args);
    }

};


