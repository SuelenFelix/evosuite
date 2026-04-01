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

public class DigraphRealizationAlgorithm_getInstance_6838553501 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101;
     Object term108;

    public DigraphRealizationAlgorithm_getInstance_6838553501() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101 = (int[]) newIntArray(6);
        setIntElement(term101, 0, 679763016);
        setIntElement(term101, 1, 1962444399);
        setIntElement(term101, 2, 767834723);
        setIntElement(term101, 3, -602026508);
        setIntElement(term101, 4, -157887805);
        setIntElement(term101, 5, 1876565163);
        term108 = (int[]) newIntArray(5);
        setIntElement(term108, 0, -817164822);
        setIntElement(term108, 1, -1016503459);
        setIntElement(term108, 2, -1968847291);
        setIntElement(term108, 3, 579005622);
        setIntElement(term108, 4, -14890619);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.realization.DigraphRealizationAlgorithm");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term101;
        args[1] = term108;
        callMethod(klass, "getInstance", argTypes, null, args);
    }

};


