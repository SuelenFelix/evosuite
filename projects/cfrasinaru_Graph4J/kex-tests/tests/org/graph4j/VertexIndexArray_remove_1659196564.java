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

public class VertexIndexArray_remove_1659196564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100280;
     Object term100288;

    public VertexIndexArray_remove_1659196564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100280 = newInstance(Class.forName("org.graph4j.VertexIndexArray"));
        int[] term100281 = (int[]) newIntArray(6);
        setIntElement(term100281, 0, 1777620572);
        setIntElement(term100281, 1, -841007432);
        setIntElement(term100281, 2, -287194609);
        setIntElement(term100281, 3, -1593254684);
        setIntElement(term100281, 4, 13571711);
        setIntElement(term100281, 5, 1766722273);
        setField(term100280, term100280.getClass(), "index", term100281);
        term100288 = new Integer(162206294);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.VertexIndexArray");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term100288;
        callMethod(klass, "remove", argTypes, term100280, args);
    }

};


