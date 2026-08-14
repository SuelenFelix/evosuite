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

public class EdgeArray_isEmpty_20693824294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1048;

    public EdgeArray_isEmpty_20693824294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1048 = newInstance(Class.forName("org.graph4j.util.EdgeArray"));
        Object[] term1049 = (Object[]) newArray("[I", 3);
        int[] term1050 = (int[]) newIntArray(8);
        int[] term1059 = (int[]) newIntArray(8);
        int[] term1068 = (int[]) newIntArray(1);
        setField(term1048, term1048.getClass(), "graph", null);
        setIntElement(term1050, 0, 1843268026);
        setIntElement(term1050, 1, 954660603);
        setIntElement(term1050, 2, -1351605385);
        setIntElement(term1050, 3, 278355793);
        setIntElement(term1050, 4, -310648604);
        setIntElement(term1050, 5, -648200466);
        setIntElement(term1050, 6, 2007134147);
        setIntElement(term1050, 7, 993388358);
        setElement(term1049, 0, term1050);
        setIntElement(term1059, 0, -765191335);
        setIntElement(term1059, 1, -1697741155);
        setIntElement(term1059, 2, 1295839803);
        setIntElement(term1059, 3, -1891015523);
        setIntElement(term1059, 4, -1560631747);
        setIntElement(term1059, 5, 1215150180);
        setIntElement(term1059, 6, -1422859977);
        setIntElement(term1059, 7, -1972436591);
        setElement(term1049, 1, term1059);
        setIntElement(term1068, 0, 68922753);
        setElement(term1049, 2, term1068);
        setField(term1048, term1048.getClass(), "edges", term1049);
        setIntField(term1048, term1048.getClass(), "numEdges", -220791533);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.EdgeArray");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isEmpty", argTypes, term1048, args);
    }

};


