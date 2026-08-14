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

public class BoundedSubsetIterator_hasNext_13180094946 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219;

    public BoundedSubsetIterator_hasNext_13180094946() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term219 = newInstance(Class.forName("org.graph4j.util.BoundedSubsetIterator"));
        setField(term219, term219.getClass(), "elements", null);
        setIntField(term219, term219.getClass(), "numElements", 0);
        setIntField(term219, term219.getClass(), "maxSubsetSize", 0);
        setIntField(term219, term219.getClass(), "currentSubsetSize", 0);
        setField(term219, term219.getClass(), "indices", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.BoundedSubsetIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasNext", argTypes, term219, args);
    }

};


