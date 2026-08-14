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

public class BoundedSubsetIterator_next_6982593242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46;

    public BoundedSubsetIterator_next_6982593242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46 = newInstance(Class.forName("org.graph4j.util.BoundedSubsetIterator"));
        int[] term47 = (int[]) newIntArray(4);
        int[] term55 = (int[]) newIntArray(1);
        setIntElement(term47, 0, 1048535127);
        setIntElement(term47, 1, -655067527);
        setIntElement(term47, 2, -6029667);
        setIntElement(term47, 3, -2068769794);
        setField(term46, term46.getClass(), "elements", term47);
        setIntField(term46, term46.getClass(), "numElements", -117576464);
        setIntField(term46, term46.getClass(), "maxSubsetSize", -1007160944);
        setIntField(term46, term46.getClass(), "currentSubsetSize", 1135664017);
        setIntElement(term55, 0, 590364439);
        setField(term46, term46.getClass(), "indices", term55);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.BoundedSubsetIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "next", argTypes, term46, args);
    }

};


