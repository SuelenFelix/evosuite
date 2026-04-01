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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Matching_hashCode_34267539811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107437;

    public Matching_hashCode_34267539811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term107445 = new HashMap();
        Set<Object> term107454 =  ((Map) term107445).keySet();
        HashSet term107444 = new HashSet((Collection<? extends Object>) term107454);
        term107437 = newInstance(Class.forName("org.graph4j.util.Matching"));
        int[] term107438 = (int[]) newIntArray(4);
        setField(term107437, term107437.getClass(), "graph", null);
        setIntElement(term107438, 0, -135418088);
        setIntElement(term107438, 1, 445224644);
        setIntElement(term107438, 2, 1687112200);
        setIntElement(term107438, 3, -1985802241);
        setField(term107437, term107437.getClass(), "mates", term107438);
        setIntField(term107437, term107437.getClass(), "size", 1190891102);
        setField(term107437, term107437.getClass(), "edges", term107444);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Matching");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term107437, args);
    }

};


