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

public class EdgeArray_size_9238949176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61687;

    public EdgeArray_size_9238949176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61687 = newInstance(Class.forName("org.graph4j.util.EdgeArray"));
        Object[] term61688 = (Object[]) newArray("[I", 4);
        int[] term61689 = (int[]) newIntArray(4);
        int[] term61694 = (int[]) newIntArray(3);
        int[] term61698 = (int[]) newIntArray(5);
        int[] term61704 = (int[]) newIntArray(3);
        setField(term61687, term61687.getClass(), "graph", null);
        setIntElement(term61689, 0, 1460432517);
        setIntElement(term61689, 1, -1565303291);
        setIntElement(term61689, 2, -2061583605);
        setIntElement(term61689, 3, -1469827981);
        setElement(term61688, 0, term61689);
        setIntElement(term61694, 0, -1389673403);
        setIntElement(term61694, 1, 584403812);
        setIntElement(term61694, 2, 1751116625);
        setElement(term61688, 1, term61694);
        setIntElement(term61698, 0, 1523894424);
        setIntElement(term61698, 1, 704725073);
        setIntElement(term61698, 2, 556138661);
        setIntElement(term61698, 3, -1314160786);
        setIntElement(term61698, 4, -1226932272);
        setElement(term61688, 2, term61698);
        setIntElement(term61704, 0, 2043153984);
        setIntElement(term61704, 1, 627237547);
        setIntElement(term61704, 2, 342899515);
        setElement(term61688, 3, term61704);
        setField(term61687, term61687.getClass(), "edges", term61688);
        setIntField(term61687, term61687.getClass(), "numEdges", 2137920886);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.EdgeArray");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "size", argTypes, term61687, args);
    }

};


