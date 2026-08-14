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

public class IntHashMap_rehash_28465949010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8618;

    public IntHashMap_rehash_28465949010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8618 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term8619 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        setField(term8618, term8618.getClass(), "table", term8619);
        setIntField(term8618, term8618.getClass(), "count", 1421496660);
        setIntField(term8618, term8618.getClass(), "threshold", 15);
        setFloatField(term8618, term8618.getClass(), "loadFactor", 0.75F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntHashMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "rehash", argTypes, term8618, args);
    }

};


