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

public class IntArrays_shuffle_203063494120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9207;
     Object term9213;

    public IntArrays_shuffle_203063494120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9207 = (int[]) newIntArray(5);
        setIntElement(term9207, 0, 1094810824);
        setIntElement(term9207, 1, -1746471324);
        setIntElement(term9207, 2, 844485803);
        setIntElement(term9207, 3, -1373407191);
        setIntElement(term9207, 4, 1013516042);
        term9213 = newInstance(Class.forName("java.util.Random"));
        Object term9214 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setLongField(term9214, term9214.getClass(), "value", 222264696975390L);
        setField(term9213, term9213.getClass(), "seed", term9214);
        setDoubleField(term9213, term9213.getClass(), "nextNextGaussian", 0.544608645520025);
        setBooleanField(term9213, term9213.getClass(), "haveNextNextGaussian", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntArrays");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Class.forName("java.util.Random");
        Object[] args = new Object[2];
        args[0] = term9207;
        args[1] = term9213;
        callMethod(klass, "shuffle", argTypes, null, args);
    }

};


