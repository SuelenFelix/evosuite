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

public class GridGenerator_createGraph_6046482991 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2507;

    public GridGenerator_createGraph_6046482991() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2507 = newInstance(Class.forName("org.graph4j.generators.GridGenerator"));
        int[] term2510 = (int[]) newIntArray(4);
        setIntField(term2507, term2507.getClass(), "rows", 529625347);
        setIntField(term2507, term2507.getClass(), "cols", 1409095253);
        setIntElement(term2510, 0, 315179039);
        setIntElement(term2510, 1, -1835923897);
        setIntElement(term2510, 2, -341287775);
        setIntElement(term2510, 3, -1651110911);
        setField(term2507, term2507.getClass(), "vertices", term2510);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.GridGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createGraph", argTypes, term2507, args);
    }

};


