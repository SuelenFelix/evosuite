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

public class IntHashMap_clear_124110193013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154609;

    public IntHashMap_clear_124110193013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154609 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term154610 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        setField(term154609, term154609.getClass(), "table", term154610);
        setIntField(term154609, term154609.getClass(), "count", -757959038);
        setIntField(term154609, term154609.getClass(), "threshold", 15);
        setFloatField(term154609, term154609.getClass(), "loadFactor", 0.75F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntHashMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clear", argTypes, term154609, args);
    }

};


