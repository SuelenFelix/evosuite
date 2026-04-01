package org.graph4j.generators;

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
import static org.graph4j.generators.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class StarGenerator_addEdges_17685658164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term801;
     Object term810;

    public StarGenerator_addEdges_17685658164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term801 = newInstance(Class.forName("org.graph4j.generators.StarGenerator"));
        int[] term803 = (int[]) newIntArray(6);
        setIntField(term801, term801.getClass(), "center", -209654048);
        setIntElement(term803, 0, 477625804);
        setIntElement(term803, 1, 252575029);
        setIntElement(term803, 2, 57189932);
        setIntElement(term803, 3, 1460722225);
        setIntElement(term803, 4, 1743224434);
        setIntElement(term803, 5, 842904495);
        setField(term801, term801.getClass(), "vertices", term803);
        term810 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.StarGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term810;
        callMethod(klass, "addEdges", argTypes, term801, args);
    }

};


