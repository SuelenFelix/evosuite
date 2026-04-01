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

public class CompleteBipartiteGenerator_addEdges_1537976893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term706;
     Object term714;

    public CompleteBipartiteGenerator_addEdges_1537976893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term706 = newInstance(Class.forName("org.graph4j.generators.CompleteBipartiteGenerator"));
        int[] term711 = (int[]) newIntArray(2);
        setIntField(term706, term706.getClass(), "first1", 880977281);
        setIntField(term706, term706.getClass(), "last1", 371943306);
        setIntField(term706, term706.getClass(), "first2", 982388293);
        setIntField(term706, term706.getClass(), "last2", -159494544);
        setIntElement(term711, 0, -75206835);
        setIntElement(term711, 1, -1618206977);
        setField(term706, term706.getClass(), "vertices", term711);
        term714 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.CompleteBipartiteGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term714;
        callMethod(klass, "addEdges", argTypes, term706, args);
    }

};


