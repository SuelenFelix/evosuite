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

public class BoundedSubsetIterator_hasNext_13180094941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26;

    public BoundedSubsetIterator_hasNext_13180094941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26 = newInstance(Class.forName("org.graph4j.util.BoundedSubsetIterator"));
        int[] term27 = (int[]) newIntArray(4);
        int[] term35 = (int[]) newIntArray(3);
        setIntElement(term27, 0, -1339778481);
        setIntElement(term27, 1, 1725571209);
        setIntElement(term27, 2, -522618178);
        setIntElement(term27, 3, 1134449235);
        setField(term26, term26.getClass(), "elements", term27);
        setIntField(term26, term26.getClass(), "numElements", -883034806);
        setIntField(term26, term26.getClass(), "maxSubsetSize", 1585847225);
        setIntField(term26, term26.getClass(), "currentSubsetSize", 597278769);
        setIntElement(term35, 0, -1685132342);
        setIntElement(term35, 1, -1456670397);
        setIntElement(term35, 2, 1622346318);
        setField(term26, term26.getClass(), "indices", term35);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.BoundedSubsetIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasNext", argTypes, term26, args);
    }

};


