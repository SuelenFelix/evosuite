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

public class IntHashMap_getOrDefault_17164903219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154579;
     Object term154584;
     Object term154586;

    public IntHashMap_getOrDefault_17164903219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154579 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term154580 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        setField(term154579, term154579.getClass(), "table", term154580);
        setIntField(term154579, term154579.getClass(), "count", -515183656);
        setIntField(term154579, term154579.getClass(), "threshold", 15);
        setFloatField(term154579, term154579.getClass(), "loadFactor", 0.75F);
        term154584 = new Integer(731534684);
        term154586 = new Integer(1821066489);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntHashMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term154584;
        args[1] = term154586;
        callMethod(klass, "getOrDefault", argTypes, term154579, args);
    }

};


