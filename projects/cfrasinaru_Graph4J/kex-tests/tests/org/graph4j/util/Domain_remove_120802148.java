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
import java.lang.Integer;

public class Domain_remove_120802148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157637;
     Object term157651;

    public Domain_remove_120802148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157637 = newInstance(Class.forName("org.graph4j.util.Domain"));
        int[] term157639 = (int[]) newIntArray(7);
        int[] term157647 = (int[]) newIntArray(2);
        setIntField(term157637, term157637.getClass(), "vertex", 1854764940);
        setIntElement(term157639, 0, 2069399507);
        setIntElement(term157639, 1, -1041310008);
        setIntElement(term157639, 2, -332966490);
        setIntElement(term157639, 3, 1106219973);
        setIntElement(term157639, 4, -1757912475);
        setIntElement(term157639, 5, -1667302824);
        setIntElement(term157639, 6, 384751657);
        setField(term157637, term157637.getClass(), "values", term157639);
        setIntElement(term157647, 0, 1583903996);
        setIntElement(term157647, 1, 862020565);
        setField(term157637, term157637.getClass(), "positions", term157647);
        setIntField(term157637, term157637.getClass(), "size", -1193213277);
        term157651 = new Integer(83413410);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Domain");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term157651;
        callMethod(klass, "remove", argTypes, term157637, args);
    }

};


