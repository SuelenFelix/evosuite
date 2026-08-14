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

public class RandomAccessArrayDeque_nonNullElementAt_17272827610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163;
     Object term168;

    public RandomAccessArrayDeque_nonNullElementAt_17272827610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term163 = (Object[]) newArray("java.lang.Object", 4);
        Object term164 = newInstance(Class.forName("java.lang.Object"));
        Object term165 = newInstance(Class.forName("java.lang.Object"));
        Object term166 = newInstance(Class.forName("java.lang.Object"));
        Object term167 = newInstance(Class.forName("java.lang.Object"));
        setElement(term163, 0, term164);
        setElement(term163, 1, term165);
        setElement(term163, 2, term166);
        setElement(term163, 3, term167);
        term168 = new Integer(579005622);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.rtbhouse.kafka.workers.impl.collection.RandomAccessArrayDeque");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term163;
        args[1] = term168;
        callMethod(klass, "nonNullElementAt", argTypes, null, args);
    }

};


