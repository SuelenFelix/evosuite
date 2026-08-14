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

public class BoundedSubsetIterator_advance_9415471993 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62;

    public BoundedSubsetIterator_advance_9415471993() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62 = newInstance(Class.forName("org.graph4j.util.BoundedSubsetIterator"));
        int[] term63 = (int[]) newIntArray(6);
        int[] term73 = (int[]) newIntArray(2);
        setIntElement(term63, 0, 865208305);
        setIntElement(term63, 1, -1275173084);
        setIntElement(term63, 2, -244121226);
        setIntElement(term63, 3, -203030934);
        setIntElement(term63, 4, -1179120542);
        setIntElement(term63, 5, -73683645);
        setField(term62, term62.getClass(), "elements", term63);
        setIntField(term62, term62.getClass(), "numElements", -226514366);
        setIntField(term62, term62.getClass(), "maxSubsetSize", 1193880199);
        setIntField(term62, term62.getClass(), "currentSubsetSize", -1087774327);
        setIntElement(term73, 0, -1530420153);
        setIntElement(term73, 1, -469968304);
        setField(term62, term62.getClass(), "indices", term73);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.BoundedSubsetIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "advance", argTypes, term62, args);
    }

};


