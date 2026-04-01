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

public class CompleteGraphGenerator_addEdges_2158269035 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1989;
     Object term1997;

    public CompleteGraphGenerator_addEdges_2158269035() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1989 = newInstance(Class.forName("org.graph4j.generators.CompleteGraphGenerator"));
        int[] term1990 = (int[]) newIntArray(6);
        setIntElement(term1990, 0, -728760750);
        setIntElement(term1990, 1, -1617383807);
        setIntElement(term1990, 2, -1244386281);
        setIntElement(term1990, 3, -885788574);
        setIntElement(term1990, 4, -865722613);
        setIntElement(term1990, 5, -1551355284);
        setField(term1989, term1989.getClass(), "vertices", term1990);
        term1997 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.CompleteGraphGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1997;
        callMethod(klass, "addEdges", argTypes, term1989, args);
    }

};


