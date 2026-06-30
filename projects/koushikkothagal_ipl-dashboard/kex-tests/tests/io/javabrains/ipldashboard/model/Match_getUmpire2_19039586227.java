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

public class Match_getUmpire2_19039586227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7269;

    public Match_getUmpire2_19039586227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7269 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term7283 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term7269, term7269.getClass(), "id", -4502405999831680926L);
        setField(term7269, term7269.getClass(), "city", "YAXkVjQZcV");
        setIntField(term7283, term7283.getClass(), "year", 2025);
        setShortField(term7283, term7283.getClass(), "month", (short) 2);
        setShortField(term7283, term7283.getClass(), "day", (short) 13);
        setField(term7269, term7269.getClass(), "date", term7283);
        setField(term7269, term7269.getClass(), "playerOfMatch", "pumvwBWvpy");
        setField(term7269, term7269.getClass(), "venue", "HwLHeGLyhe");
        setField(term7269, term7269.getClass(), "team1", "RDnkgWkcbz");
        setField(term7269, term7269.getClass(), "team2", "IBpaxltauX");
        setField(term7269, term7269.getClass(), "tossWinner", "hePqROaplw");
        setField(term7269, term7269.getClass(), "tossDecision", "PJcSNDruWd");
        setField(term7269, term7269.getClass(), "matchWinner", "VVNNlAePXF");
        setField(term7269, term7269.getClass(), "result", "jnwVnmKAFv");
        setField(term7269, term7269.getClass(), "resultMargin", "TXyHhqeCjR");
        setField(term7269, term7269.getClass(), "umpire1", "lZIgPZPgTu");
        setField(term7269, term7269.getClass(), "umpire2", "iuCxnHGMoW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.model.Match");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUmpire2", argTypes, term7269, args);
    }

};


