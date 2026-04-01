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
     Object term56535;

    public BoundedSubsetIterator_hasNext_13180094941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56535 = newInstance(Class.forName("org.graph4j.util.BoundedSubsetIterator"));
        int[] term56536 = (int[]) newIntArray(1);
        int[] term56541 = (int[]) newIntArray(9);
        setIntElement(term56536, 0, 56736806);
        setField(term56535, term56535.getClass(), "elements", term56536);
        setIntField(term56535, term56535.getClass(), "numElements", 496074088);
        setIntField(term56535, term56535.getClass(), "maxSubsetSize", -785066858);
        setIntField(term56535, term56535.getClass(), "currentSubsetSize", -1086354117);
        setIntElement(term56541, 0, -868397361);
        setIntElement(term56541, 1, 1974839599);
        setIntElement(term56541, 2, 975425511);
        setIntElement(term56541, 3, 1662673275);
        setIntElement(term56541, 4, 1782831447);
        setIntElement(term56541, 5, -1997327027);
        setIntElement(term56541, 6, -1055738735);
        setIntElement(term56541, 7, 693030720);
        setIntElement(term56541, 8, -148509792);
        setField(term56535, term56535.getClass(), "indices", term56541);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.BoundedSubsetIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasNext", argTypes, term56535, args);
    }

};


