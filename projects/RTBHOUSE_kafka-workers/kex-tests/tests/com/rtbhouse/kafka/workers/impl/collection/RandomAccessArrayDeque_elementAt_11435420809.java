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
import java.lang.Object;
import java.lang.Integer;

public class RandomAccessArrayDeque_elementAt_11435420809 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155;
     Object term161;

    public RandomAccessArrayDeque_elementAt_11435420809() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155 = (Object[]) newArray("java.lang.Object", 5);
        Object term156 = newInstance(Class.forName("java.lang.Object"));
        Object term157 = newInstance(Class.forName("java.lang.Object"));
        Object term158 = newInstance(Class.forName("java.lang.Object"));
        Object term159 = newInstance(Class.forName("java.lang.Object"));
        Object term160 = newInstance(Class.forName("java.lang.Object"));
        setElement(term155, 0, term156);
        setElement(term155, 1, term157);
        setElement(term155, 2, term158);
        setElement(term155, 3, term159);
        setElement(term155, 4, term160);
        term161 = new Integer(-1968847291);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.rtbhouse.kafka.workers.impl.collection.RandomAccessArrayDeque");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term155;
        args[1] = term161;
        callMethod(klass, "elementAt", argTypes, null, args);
    }

};


