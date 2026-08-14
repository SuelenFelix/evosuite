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

public class RandomAccessArrayDeque_DeqSpliterator_trySplit_4070876469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34;

    public RandomAccessArrayDeque_DeqSpliterator_trySplit_4070876469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34 = newInstance(Class.forName("com.rtbhouse.kafka.workers.impl.collection.RandomAccessArrayDeque$DeqSpliterator"));
        setIntField(term34, term34.getClass(), "fence", 0);
        setIntField(term34, term34.getClass(), "cursor", 0);
        setField(term34, term34.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.rtbhouse.kafka.workers.impl.collection.RandomAccessArrayDeque$DeqSpliterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "trySplit", argTypes, term34, args);
    }

};


