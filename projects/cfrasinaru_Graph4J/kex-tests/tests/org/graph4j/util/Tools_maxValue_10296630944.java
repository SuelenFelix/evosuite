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

public class Tools_maxValue_10296630944 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10632;

    public Tools_maxValue_10296630944() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10632 = (Object[]) newArray("[I", 2);
        int[] term10633 = (int[]) newIntArray(3);
        int[] term10637 = (int[]) newIntArray(9);
        setIntElement(term10633, 0, -342719145);
        setIntElement(term10633, 1, 2101766592);
        setIntElement(term10633, 2, 802196878);
        setElement(term10632, 0, term10633);
        setIntElement(term10637, 0, -174401540);
        setIntElement(term10637, 1, -1881073314);
        setIntElement(term10637, 2, -1902513009);
        setIntElement(term10637, 3, 1810303681);
        setIntElement(term10637, 4, 1374798468);
        setIntElement(term10637, 5, -425364766);
        setIntElement(term10637, 6, -240455247);
        setIntElement(term10637, 7, 412243891);
        setIntElement(term10637, 8, -1517264869);
        setElement(term10632, 1, term10637);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Tools");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term10632;
        callMethod(klass, "maxValue", argTypes, null, args);
    }

};


