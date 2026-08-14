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
import java.lang.Integer;

public class VertexIndexArray_set_4562906763 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100263;
     Object term100272;
     Object term100274;

    public VertexIndexArray_set_4562906763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100263 = newInstance(Class.forName("org.graph4j.VertexIndexArray"));
        int[] term100264 = (int[]) newIntArray(7);
        setIntElement(term100264, 0, -486055477);
        setIntElement(term100264, 1, -710673716);
        setIntElement(term100264, 2, 879448569);
        setIntElement(term100264, 3, 1636702023);
        setIntElement(term100264, 4, -2138771257);
        setIntElement(term100264, 5, -1258830372);
        setIntElement(term100264, 6, -459007543);
        setField(term100263, term100263.getClass(), "index", term100264);
        term100272 = new Integer(1545433344);
        term100274 = new Integer(-287288345);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.VertexIndexArray");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term100272;
        args[1] = term100274;
        callMethod(klass, "set", argTypes, term100263, args);
    }

};


