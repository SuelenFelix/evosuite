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
     Object term8609;
     Object term8614;
     Object term8616;

    public IntHashMap_getOrDefault_17164903219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8609 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term8610 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        setField(term8609, term8609.getClass(), "table", term8610);
        setIntField(term8609, term8609.getClass(), "count", -137516512);
        setIntField(term8609, term8609.getClass(), "threshold", 15);
        setFloatField(term8609, term8609.getClass(), "loadFactor", 0.75F);
        term8614 = new Integer(-585134115);
        term8616 = new Integer(1435872700);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntHashMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term8614;
        args[1] = term8616;
        callMethod(klass, "getOrDefault", argTypes, term8609, args);
    }

};


