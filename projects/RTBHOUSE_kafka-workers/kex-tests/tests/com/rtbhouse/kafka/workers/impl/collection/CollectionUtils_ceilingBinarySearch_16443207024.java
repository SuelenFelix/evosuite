package com.rtbhouse.kafka.workers.impl.collection;

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
import static com.rtbhouse.kafka.workers.impl.collection.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CollectionUtils_ceilingBinarySearch_16443207024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4;

    public CollectionUtils_ceilingBinarySearch_16443207024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.rtbhouse.kafka.workers.impl.collection.CollectionUtils");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.rtbhouse.kafka.workers.impl.collection.RandomAccess");
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = Class.forName("java.util.function.Function");
        argTypes[3] = Class.forName("java.util.Comparator");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term4;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "ceilingBinarySearch", argTypes, null, args);
    }

};


