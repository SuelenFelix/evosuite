package org.graph4j.traversal;

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
import static org.graph4j.traversal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Boolean;

public class BFSIterator_init_5514276412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106872;
     Object term106874;
     Object term106882;

    public BFSIterator_init_5514276412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106872 = new Integer(1841267577);
        term106874 = (int[]) newIntArray(7);
        setIntElement(term106874, 0, -1696437268);
        setIntElement(term106874, 1, -1612328990);
        setIntElement(term106874, 2, 824967439);
        setIntElement(term106874, 3, 1484193841);
        setIntElement(term106874, 4, 136266266);
        setIntElement(term106874, 5, 2020115381);
        setIntElement(term106874, 6, 814559519);
        term106882 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.BFSIterator");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = int.class;
        argTypes[2] = Array.newInstance(int.class, 0).getClass();
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term106872;
        args[2] = term106874;
        args[3] = term106882;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


