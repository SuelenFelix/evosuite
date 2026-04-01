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
     Object term155686;
     Object term155693;

    public IntArrays_shuffle_203063494120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155686 = (int[]) newIntArray(6);
        setIntElement(term155686, 0, 1775991577);
        setIntElement(term155686, 1, -1303038803);
        setIntElement(term155686, 2, -601320413);
        setIntElement(term155686, 3, 1635413776);
        setIntElement(term155686, 4, 879442600);
        setIntElement(term155686, 5, -864685597);
        term155693 = newInstance(Class.forName("java.util.Random"));
        Object term155694 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setLongField(term155694, term155694.getClass(), "value", 82664864106370L);
        setField(term155693, term155693.getClass(), "seed", term155694);
        setDoubleField(term155693, term155693.getClass(), "nextNextGaussian", 0.9255014498306806);
        setBooleanField(term155693, term155693.getClass(), "haveNextNextGaussian", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntArrays");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Class.forName("java.util.Random");
        Object[] args = new Object[2];
        args[0] = term155686;
        args[1] = term155693;
        callMethod(klass, "shuffle", argTypes, null, args);
    }

};


