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

public class PathGenerator_createGraph_16397530362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1615;

    public PathGenerator_createGraph_16397530362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1615 = newInstance(Class.forName("org.graph4j.generators.PathGenerator"));
        int[] term1616 = (int[]) newIntArray(6);
        setIntElement(term1616, 0, -1549607466);
        setIntElement(term1616, 1, 853609788);
        setIntElement(term1616, 2, -197820800);
        setIntElement(term1616, 3, 723812297);
        setIntElement(term1616, 4, 1639448749);
        setIntElement(term1616, 5, 873659088);
        setField(term1615, term1615.getClass(), "vertices", term1616);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.PathGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createGraph", argTypes, term1615, args);
    }

};


