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

public class Matching_remove_3726648172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107191;
     Object term107220;
     Object term107222;

    public Matching_remove_3726648172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term107200 = new HashMap();
        Set<Object> term107229 =  ((Map) term107200).keySet();
        HashSet term107199 = new HashSet((Collection<? extends Object>) term107229);
        term107191 = newInstance(Class.forName("org.graph4j.util.Matching"));
        int[] term107192 = (int[]) newIntArray(5);
        setField(term107191, term107191.getClass(), "graph", null);
        setIntElement(term107192, 0, -1901526540);
        setIntElement(term107192, 1, -157492588);
        setIntElement(term107192, 2, -284211502);
        setIntElement(term107192, 3, -585588567);
        setIntElement(term107192, 4, -1534090803);
        setField(term107191, term107191.getClass(), "mates", term107192);
        setIntField(term107191, term107191.getClass(), "size", -1491757021);
        setField(term107191, term107191.getClass(), "edges", term107199);
        term107220 = new Integer(-1087834259);
        term107222 = new Integer(1822652652);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Matching");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term107220;
        args[1] = term107222;
        callMethod(klass, "remove", argTypes, term107191, args);
    }

};


