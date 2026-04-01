package org.graph4j.ordering;

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
import static org.graph4j.ordering.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class TopologicalOrdering_isUnique_7247509482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64;

    public TopologicalOrdering_isUnique_7247509482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term76 = new Boolean(false);
        term64 = newInstance(Class.forName("org.graph4j.ordering.TopologicalOrdering"));
        int[] term65 = (int[]) newIntArray(1);
        int[] term67 = (int[]) newIntArray(6);
        setIntElement(term65, 0, 1622346318);
        setField(term64, term64.getClass(), "ordering", term65);
        setIntElement(term67, 0, 1048535127);
        setIntElement(term67, 1, -655067527);
        setIntElement(term67, 2, -6029667);
        setIntElement(term67, 3, -2068769794);
        setIntElement(term67, 4, -117576464);
        setIntElement(term67, 5, -1007160944);
        setField(term64, term64.getClass(), "levels", term67);
        setBooleanField(term64, term64.getClass(), "unique", false);
        setBooleanField(term64, term64.getClass(), "computed", true);
        setField(term64, term64.getClass(), "graph", null);
        setField(term64, term64.getClass(), "stronglyConnected", term76);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.ordering.TopologicalOrdering");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isUnique", argTypes, term64, args);
    }

};


