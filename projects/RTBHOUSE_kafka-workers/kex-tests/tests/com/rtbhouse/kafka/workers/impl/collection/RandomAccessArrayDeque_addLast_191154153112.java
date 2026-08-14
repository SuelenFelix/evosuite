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

public class RandomAccessArrayDeque_addLast_191154153112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173;

    public RandomAccessArrayDeque_addLast_191154153112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173 = newInstance(Class.forName("com.rtbhouse.kafka.workers.impl.collection.RandomAccessArrayDeque"));
        setField(term173, term173.getClass(), "elements", null);
        setIntField(term173, term173.getClass(), "head", 0);
        setIntField(term173, term173.getClass(), "tail", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.rtbhouse.kafka.workers.impl.collection.RandomAccessArrayDeque");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addLast", argTypes, term173, args);
    }

};


