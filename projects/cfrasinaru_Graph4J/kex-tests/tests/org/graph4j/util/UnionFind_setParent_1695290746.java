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
import java.lang.Integer;

public class UnionFind_setParent_1695290746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73997;
     Object term74004;
     Object term74006;

    public UnionFind_setParent_1695290746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73997 = newInstance(Class.forName("org.graph4j.util.UnionFind"));
        int[] term74000 = (int[]) newIntArray(2);
        setIntField(term73997, term73997.getClass(), "numVertices", -531718135);
        setBooleanField(term73997, term73997.getClass(), "pathCompression", true);
        setIntElement(term74000, 0, 598160626);
        setIntElement(term74000, 1, 1754085320);
        setField(term73997, term73997.getClass(), "parent", term74000);
        setIntField(term73997, term73997.getClass(), "numSets", -143315713);
        term74004 = new Integer(-362106921);
        term74006 = new Integer(86367204);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.UnionFind");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term74004;
        args[1] = term74006;
        callMethod(klass, "setParent", argTypes, term73997, args);
    }

};


