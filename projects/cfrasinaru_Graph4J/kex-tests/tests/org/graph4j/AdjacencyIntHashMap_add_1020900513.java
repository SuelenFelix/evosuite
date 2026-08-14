package org.graph4j;

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
import static org.graph4j.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class AdjacencyIntHashMap_add_1020900513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101011;
     Object term101017;
     Object term101019;

    public AdjacencyIntHashMap_add_1020900513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101011 = newInstance(Class.forName("org.graph4j.AdjacencyIntHashMap"));
        Object term101012 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term101013 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        setField(term101012, term101012.getClass(), "table", term101013);
        setIntField(term101012, term101012.getClass(), "count", 0);
        setIntField(term101012, term101012.getClass(), "threshold", 15);
        setFloatField(term101012, term101012.getClass(), "loadFactor", 0.75F);
        setField(term101011, term101011.getClass(), "hashMap", term101012);
        term101017 = new Integer(1363101790);
        term101019 = new Integer(877478140);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.AdjacencyIntHashMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term101017;
        args[1] = term101019;
        callMethod(klass, "add", argTypes, term101011, args);
    }

};


