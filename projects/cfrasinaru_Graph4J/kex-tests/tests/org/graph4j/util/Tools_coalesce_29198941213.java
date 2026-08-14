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
import java.lang.Object;

public class Tools_coalesce_29198941213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10869;

    public Tools_coalesce_29198941213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10869 = (Object[]) newArray("java.lang.Object", 5);
        Object term10870 = newInstance(Class.forName("java.lang.Object"));
        Object term10871 = newInstance(Class.forName("java.lang.Object"));
        Object term10872 = newInstance(Class.forName("java.lang.Object"));
        Object term10873 = newInstance(Class.forName("java.lang.Object"));
        Object term10874 = newInstance(Class.forName("java.lang.Object"));
        setElement(term10869, 0, term10870);
        setElement(term10869, 1, term10871);
        setElement(term10869, 2, term10872);
        setElement(term10869, 3, term10873);
        setElement(term10869, 4, term10874);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Tools");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term10869;
        callMethod(klass, "coalesce", argTypes, null, args);
    }

};


