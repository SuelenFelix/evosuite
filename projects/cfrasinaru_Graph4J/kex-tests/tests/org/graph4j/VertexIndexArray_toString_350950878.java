package org.graph4j;

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
import static org.graph4j.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class VertexIndexArray_toString_350950878 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100329;

    public VertexIndexArray_toString_350950878() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100329 = newInstance(Class.forName("org.graph4j.VertexIndexArray"));
        int[] term100330 = (int[]) newIntArray(7);
        setIntElement(term100330, 0, -112032066);
        setIntElement(term100330, 1, 599757412);
        setIntElement(term100330, 2, 1560593676);
        setIntElement(term100330, 3, -1022472400);
        setIntElement(term100330, 4, -2027830462);
        setIntElement(term100330, 5, 1123640429);
        setIntElement(term100330, 6, -1849340559);
        setField(term100329, term100329.getClass(), "index", term100330);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.VertexIndexArray");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term100329, args);
    }

};


