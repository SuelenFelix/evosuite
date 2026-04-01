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
import java.lang.Integer;

public class Matching_mate_9411543827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107329;
     Object term107353;

    public Matching_mate_9411543827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term107335 = new HashMap();
        Set<Object> term107357 =  ((Map) term107335).keySet();
        HashSet term107334 = new HashSet((Collection<? extends Object>) term107357);
        term107329 = newInstance(Class.forName("org.graph4j.util.Matching"));
        int[] term107330 = (int[]) newIntArray(2);
        setField(term107329, term107329.getClass(), "graph", null);
        setIntElement(term107330, 0, 1280410123);
        setIntElement(term107330, 1, -1900255770);
        setField(term107329, term107329.getClass(), "mates", term107330);
        setIntField(term107329, term107329.getClass(), "size", -1927343285);
        setField(term107329, term107329.getClass(), "edges", term107334);
        term107353 = new Integer(-843354184);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Matching");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term107353;
        callMethod(klass, "mate", argTypes, term107329, args);
    }

};


