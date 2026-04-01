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

public class IntArrays_intersection_108381223411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155476;
     Object term155486;

    public IntArrays_intersection_108381223411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155476 = (int[]) newIntArray(9);
        setIntElement(term155476, 0, 1054537134);
        setIntElement(term155476, 1, 859462954);
        setIntElement(term155476, 2, -1370236637);
        setIntElement(term155476, 3, -745352584);
        setIntElement(term155476, 4, 317310476);
        setIntElement(term155476, 5, 1578530099);
        setIntElement(term155476, 6, 465189781);
        setIntElement(term155476, 7, -1198668613);
        setIntElement(term155476, 8, -1530509760);
        term155486 = (int[]) newIntArray(4);
        setIntElement(term155486, 0, 898837119);
        setIntElement(term155486, 1, 39639187);
        setIntElement(term155486, 2, 1110191296);
        setIntElement(term155486, 3, 1092338608);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntArrays");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term155476;
        args[1] = term155486;
        callMethod(klass, "intersection", argTypes, null, args);
    }

};


