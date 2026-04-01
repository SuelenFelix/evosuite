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
import java.lang.Integer;

public class IntHashMap_put_48779506428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154673;
     Object term154677;
     Object term154679;

    public IntHashMap_put_48779506428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154673 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        setField(term154673, term154673.getClass(), "table", null);
        setIntField(term154673, term154673.getClass(), "count", 0);
        setIntField(term154673, term154673.getClass(), "threshold", 0);
        setFloatField(term154673, term154673.getClass(), "loadFactor", 0.0F);
        term154677 = new Integer(0);
        term154679 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntHashMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term154677;
        args[1] = term154679;
        callMethod(klass, "put", argTypes, term154673, args);
    }

};


