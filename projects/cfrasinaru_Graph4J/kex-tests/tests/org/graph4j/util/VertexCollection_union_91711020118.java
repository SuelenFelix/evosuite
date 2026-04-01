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

public class VertexCollection_union_91711020118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183019;

    public VertexCollection_union_91711020118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term183019 = (int[]) newIntArray(6);
        setIntElement(term183019, 0, -483356490);
        setIntElement(term183019, 1, 937653963);
        setIntElement(term183019, 2, -820702742);
        setIntElement(term183019, 3, -1969520035);
        setIntElement(term183019, 4, -1271040421);
        setIntElement(term183019, 5, 295012850);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexCollection");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.graph4j.util.VertexCollection");
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        argTypes[2] = Class.forName("org.graph4j.util.VertexCollection");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term183019;
        args[2] = null;
        callMethod(klass, "union", argTypes, null, args);
    }

};


