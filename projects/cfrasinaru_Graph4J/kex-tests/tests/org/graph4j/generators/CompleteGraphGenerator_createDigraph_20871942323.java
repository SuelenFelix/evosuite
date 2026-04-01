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

public class CompleteGraphGenerator_createDigraph_20871942323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1953;

    public CompleteGraphGenerator_createDigraph_20871942323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1953 = newInstance(Class.forName("org.graph4j.generators.CompleteGraphGenerator"));
        int[] term1954 = (int[]) newIntArray(9);
        setIntElement(term1954, 0, -344907703);
        setIntElement(term1954, 1, 824341437);
        setIntElement(term1954, 2, -1794965320);
        setIntElement(term1954, 3, 520504102);
        setIntElement(term1954, 4, -457396133);
        setIntElement(term1954, 5, -1793950607);
        setIntElement(term1954, 6, 1091954101);
        setIntElement(term1954, 7, 1895143076);
        setIntElement(term1954, 8, 1981860404);
        setField(term1953, term1953.getClass(), "vertices", term1954);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.CompleteGraphGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createDigraph", argTypes, term1953, args);
    }

};


