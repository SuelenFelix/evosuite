package org.graph4j.util;

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
import static org.graph4j.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class StableSet_isMaximal_58025301615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154860;

    public StableSet_isMaximal_58025301615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154860 = newInstance(Class.forName("org.graph4j.util.StableSet"));
        setField(term154860, term154860.getClass(), "posMap", null);
        setField(term154860, term154860.getClass(), "graph", null);
        setField(term154860, term154860.getClass(), "vertices", null);
        setIntField(term154860, term154860.getClass(), "numVertices", 0);
        setIntField(term154860, term154860.getClass(), "first", 0);
        setField(term154860, term154860.getClass(), "bitset", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.StableSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isMaximal", argTypes, term154860, args);
    }

};


