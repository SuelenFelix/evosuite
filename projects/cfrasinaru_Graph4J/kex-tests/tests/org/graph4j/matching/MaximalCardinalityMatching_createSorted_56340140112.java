package org.graph4j.matching;

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
import static org.graph4j.matching.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MaximalCardinalityMatching_createSorted_56340140112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1322;

    public MaximalCardinalityMatching_createSorted_56340140112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1322 = newInstance(Class.forName("org.graph4j.matching.MaximalCardinalityMatching"));
        setField(term1322, term1322.getClass(), "random", null);
        setField(term1322, term1322.getClass(), "comparator", null);
        setField(term1322, term1322.getClass(), "matching", null);
        setField(term1322, term1322.getClass(), "graph", null);
        setBooleanField(term1322, term1322.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.matching.MaximalCardinalityMatching");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.graph4j.Edge"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createSorted", argTypes, term1322, args);
    }

};


