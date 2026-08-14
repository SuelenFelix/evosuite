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

public class EdgeArray_vertexSet_153163849520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2035;

    public EdgeArray_vertexSet_153163849520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2035 = newInstance(Class.forName("org.graph4j.util.EdgeArray"));
        Object[] term2036 = (Object[]) newArray("[I", 4);
        int[] term2037 = (int[]) newIntArray(6);
        int[] term2044 = (int[]) newIntArray(4);
        int[] term2049 = (int[]) newIntArray(6);
        int[] term2056 = (int[]) newIntArray(7);
        setField(term2035, term2035.getClass(), "graph", null);
        setIntElement(term2037, 0, -341287775);
        setIntElement(term2037, 1, -1651110911);
        setIntElement(term2037, 2, -1934033808);
        setIntElement(term2037, 3, 950322609);
        setIntElement(term2037, 4, -2023791789);
        setIntElement(term2037, 5, 353974456);
        setElement(term2036, 0, term2037);
        setIntElement(term2044, 0, -485108462);
        setIntElement(term2044, 1, 1418551216);
        setIntElement(term2044, 2, -626779272);
        setIntElement(term2044, 3, -1150062870);
        setElement(term2036, 1, term2044);
        setIntElement(term2049, 0, -886200503);
        setIntElement(term2049, 1, 1136393691);
        setIntElement(term2049, 2, -1288536479);
        setIntElement(term2049, 3, 1092038167);
        setIntElement(term2049, 4, 1879729823);
        setIntElement(term2049, 5, 1443855558);
        setElement(term2036, 2, term2049);
        setIntElement(term2056, 0, -1933419449);
        setIntElement(term2056, 1, -1804322375);
        setIntElement(term2056, 2, 1595814906);
        setIntElement(term2056, 3, -834193529);
        setIntElement(term2056, 4, 335780735);
        setIntElement(term2056, 5, -1541981599);
        setIntElement(term2056, 6, 1605456363);
        setElement(term2036, 3, term2056);
        setField(term2035, term2035.getClass(), "edges", term2036);
        setIntField(term2035, term2035.getClass(), "numEdges", 2059896693);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.EdgeArray");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "vertexSet", argTypes, term2035, args);
    }

};


