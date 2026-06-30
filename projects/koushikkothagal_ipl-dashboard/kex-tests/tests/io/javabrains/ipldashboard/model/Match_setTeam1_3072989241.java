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

public class Match_setTeam1_3072989241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7855;

    public Match_setTeam1_3072989241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7855 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        setLongField(term7855, term7855.getClass(), "id", 0L);
        setField(term7855, term7855.getClass(), "city", null);
        setField(term7855, term7855.getClass(), "date", null);
        setField(term7855, term7855.getClass(), "playerOfMatch", null);
        setField(term7855, term7855.getClass(), "venue", null);
        setField(term7855, term7855.getClass(), "team1", null);
        setField(term7855, term7855.getClass(), "team2", null);
        setField(term7855, term7855.getClass(), "tossWinner", null);
        setField(term7855, term7855.getClass(), "tossDecision", null);
        setField(term7855, term7855.getClass(), "matchWinner", null);
        setField(term7855, term7855.getClass(), "result", null);
        setField(term7855, term7855.getClass(), "resultMargin", null);
        setField(term7855, term7855.getClass(), "umpire1", null);
        setField(term7855, term7855.getClass(), "umpire2", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.model.Match");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTeam1", argTypes, term7855, args);
    }

};


