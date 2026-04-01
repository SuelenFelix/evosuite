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

public class IntHashMap_containsValue_73596092523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154643;
     Object term154647;

    public IntHashMap_containsValue_73596092523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154643 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        setField(term154643, term154643.getClass(), "table", null);
        setIntField(term154643, term154643.getClass(), "count", 0);
        setIntField(term154643, term154643.getClass(), "threshold", 0);
        setFloatField(term154643, term154643.getClass(), "loadFactor", 0.0F);
        term154647 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntHashMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term154647;
        callMethod(klass, "containsValue", argTypes, term154643, args);
    }

};


