package org.graph4j.realization;

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
import static org.graph4j.realization.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BipartiteRealizationAlgorithm_checkGaleRyserCondition_11038562420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125;
     Object term131;

    public BipartiteRealizationAlgorithm_checkGaleRyserCondition_11038562420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125 = (int[]) newIntArray(5);
        setIntElement(term125, 0, 1632125673);
        setIntElement(term125, 1, 454281060);
        setIntElement(term125, 2, -1786399638);
        setIntElement(term125, 3, 2055867847);
        setIntElement(term125, 4, -1048298087);
        term131 = (int[]) newIntArray(2);
        setIntElement(term131, 0, 292681826);
        setIntElement(term131, 1, 458147407);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.realization.BipartiteRealizationAlgorithm");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term125;
        args[1] = term131;
        callMethod(klass, "checkGaleRyserCondition", argTypes, null, args);
    }

};


