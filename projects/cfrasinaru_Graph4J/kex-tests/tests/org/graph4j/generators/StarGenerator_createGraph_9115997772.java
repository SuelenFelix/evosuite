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

public class StarGenerator_createGraph_9115997772 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term771;

    public StarGenerator_createGraph_9115997772() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term771 = newInstance(Class.forName("org.graph4j.generators.StarGenerator"));
        int[] term773 = (int[]) newIntArray(8);
        setIntField(term771, term771.getClass(), "center", -860131894);
        setIntElement(term773, 0, -1022990421);
        setIntElement(term773, 1, 1045547089);
        setIntElement(term773, 2, -1122880881);
        setIntElement(term773, 3, -542712742);
        setIntElement(term773, 4, -1254072822);
        setIntElement(term773, 5, -1111249833);
        setIntElement(term773, 6, -1692331299);
        setIntElement(term773, 7, 479531250);
        setField(term771, term771.getClass(), "vertices", term773);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.StarGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createGraph", argTypes, term771, args);
    }

};


