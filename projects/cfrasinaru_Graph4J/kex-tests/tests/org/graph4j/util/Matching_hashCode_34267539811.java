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
     Object term4613;

    public Matching_hashCode_34267539811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4624 = new HashMap();
        Set<Object> term4647 =  ((Map) term4624).keySet();
        HashSet term4623 = new HashSet((Collection<? extends Object>) term4647);
        term4613 = newInstance(Class.forName("org.graph4j.util.Matching"));
        int[] term4614 = (int[]) newIntArray(7);
        setField(term4613, term4613.getClass(), "graph", null);
        setIntElement(term4614, 0, 1844345719);
        setIntElement(term4614, 1, 1704024265);
        setIntElement(term4614, 2, 501801161);
        setIntElement(term4614, 3, 2103971768);
        setIntElement(term4614, 4, -939132796);
        setIntElement(term4614, 5, 159279866);
        setIntElement(term4614, 6, 138122227);
        setField(term4613, term4613.getClass(), "mates", term4614);
        setIntField(term4613, term4613.getClass(), "size", 1795358995);
        setField(term4613, term4613.getClass(), "edges", term4623);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Matching");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term4613, args);
    }

};


