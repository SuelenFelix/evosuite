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
import java.lang.Boolean;

public class MaximalCardinalityMatching_createUnsorted_60290235511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1318;
     Object term1320;

    public MaximalCardinalityMatching_createUnsorted_60290235511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1318 = newInstance(Class.forName("org.graph4j.matching.MaximalCardinalityMatching"));
        setField(term1318, term1318.getClass(), "random", null);
        setField(term1318, term1318.getClass(), "comparator", null);
        setField(term1318, term1318.getClass(), "matching", null);
        setField(term1318, term1318.getClass(), "graph", null);
        setBooleanField(term1318, term1318.getClass(), "directed", false);
        term1320 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.matching.MaximalCardinalityMatching");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1320;
        callMethod(klass, "createUnsorted", argTypes, term1318, args);
    }

};


