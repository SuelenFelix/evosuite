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
import java.lang.Object;
import java.lang.Integer;

public class IntHashMap_put_48779506411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154593;
     Object term154598;
     Object term154600;

    public IntHashMap_put_48779506411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154593 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term154594 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        setField(term154593, term154593.getClass(), "table", term154594);
        setIntField(term154593, term154593.getClass(), "count", -1117717217);
        setIntField(term154593, term154593.getClass(), "threshold", 15);
        setFloatField(term154593, term154593.getClass(), "loadFactor", 0.75F);
        term154598 = new Integer(-482697690);
        term154600 = new Integer(1828383811);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntHashMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term154598;
        args[1] = term154600;
        callMethod(klass, "put", argTypes, term154593, args);
    }

};


