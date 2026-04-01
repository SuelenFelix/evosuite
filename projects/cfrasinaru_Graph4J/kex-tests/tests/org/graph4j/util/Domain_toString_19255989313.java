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

public class Domain_toString_19255989313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157772;

    public Domain_toString_19255989313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157772 = newInstance(Class.forName("org.graph4j.util.Domain"));
        int[] term157774 = (int[]) newIntArray(6);
        int[] term157781 = (int[]) newIntArray(0);
        setIntField(term157772, term157772.getClass(), "vertex", -891447013);
        setIntElement(term157774, 0, -1491941255);
        setIntElement(term157774, 1, 1617418222);
        setIntElement(term157774, 2, 992939280);
        setIntElement(term157774, 3, 176815471);
        setIntElement(term157774, 4, -428140538);
        setIntElement(term157774, 5, 1893132792);
        setField(term157772, term157772.getClass(), "values", term157774);
        setField(term157772, term157772.getClass(), "positions", term157781);
        setIntField(term157772, term157772.getClass(), "size", -524245719);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Domain");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term157772, args);
    }

};


