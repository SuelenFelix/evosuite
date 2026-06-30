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

public class Match_getTossWinner_124734309044 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7861;

    public Match_getTossWinner_124734309044() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7861 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        setLongField(term7861, term7861.getClass(), "id", 0L);
        setField(term7861, term7861.getClass(), "city", null);
        setField(term7861, term7861.getClass(), "date", null);
        setField(term7861, term7861.getClass(), "playerOfMatch", null);
        setField(term7861, term7861.getClass(), "venue", null);
        setField(term7861, term7861.getClass(), "team1", null);
        setField(term7861, term7861.getClass(), "team2", null);
        setField(term7861, term7861.getClass(), "tossWinner", null);
        setField(term7861, term7861.getClass(), "tossDecision", null);
        setField(term7861, term7861.getClass(), "matchWinner", null);
        setField(term7861, term7861.getClass(), "result", null);
        setField(term7861, term7861.getClass(), "resultMargin", null);
        setField(term7861, term7861.getClass(), "umpire1", null);
        setField(term7861, term7861.getClass(), "umpire2", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.model.Match");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTossWinner", argTypes, term7861, args);
    }

};


