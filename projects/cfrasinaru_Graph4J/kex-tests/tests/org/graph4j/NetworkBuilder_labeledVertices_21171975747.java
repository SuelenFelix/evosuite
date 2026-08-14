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
import java.lang.Object;

public class NetworkBuilder_labeledVertices_21171975747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64841;

    public NetworkBuilder_labeledVertices_21171975747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64841 = (Object[]) newArray("java.lang.Object", 3);
        Object term64842 = newInstance(Class.forName("java.lang.Object"));
        Object term64843 = newInstance(Class.forName("java.lang.Object"));
        Object term64844 = newInstance(Class.forName("java.lang.Object"));
        setElement(term64841, 0, term64842);
        setElement(term64841, 1, term64843);
        setElement(term64841, 2, term64844);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.NetworkBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term64841;
        callMethod(klass, "labeledVertices", argTypes, null, args);
    }

};


