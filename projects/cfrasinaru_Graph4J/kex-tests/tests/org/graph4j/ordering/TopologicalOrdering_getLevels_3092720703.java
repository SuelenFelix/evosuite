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

public class TopologicalOrdering_getLevels_3092720703 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85;

    public TopologicalOrdering_getLevels_3092720703() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term98 = new Boolean(false);
        term85 = newInstance(Class.forName("org.graph4j.ordering.TopologicalOrdering"));
        int[] term86 = (int[]) newIntArray(2);
        int[] term89 = (int[]) newIntArray(6);
        setIntElement(term86, 0, 1135664017);
        setIntElement(term86, 1, 590364439);
        setField(term85, term85.getClass(), "ordering", term86);
        setIntElement(term89, 0, 865208305);
        setIntElement(term89, 1, -1275173084);
        setIntElement(term89, 2, -244121226);
        setIntElement(term89, 3, -203030934);
        setIntElement(term89, 4, -1179120542);
        setIntElement(term89, 5, -73683645);
        setField(term85, term85.getClass(), "levels", term89);
        setBooleanField(term85, term85.getClass(), "unique", true);
        setBooleanField(term85, term85.getClass(), "computed", true);
        setField(term85, term85.getClass(), "graph", null);
        setField(term85, term85.getClass(), "stronglyConnected", term98);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.ordering.TopologicalOrdering");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevels", argTypes, term85, args);
    }

};


