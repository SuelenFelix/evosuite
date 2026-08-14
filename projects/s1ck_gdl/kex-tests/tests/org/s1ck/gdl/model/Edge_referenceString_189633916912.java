package org.s1ck.gdl.model;

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
import static org.s1ck.gdl.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;

public class Edge_referenceString_189633916912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1506;

    public Edge_referenceString_189633916912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1507 = new Long(-6823727938421990489L);
        Long term1509 = new Long(-484994522244390100L);
        HashMap term1514 = new HashMap();
        Set<Object> term1602 =  ((Map) term1514).keySet();
        HashSet term1513 = new HashSet((Collection<? extends Object>) term1602);
        Long term1519 = new Long(1233889271256172047L);
        ArrayList term1521 = new ArrayList();
        ((ArrayList) term1521).add("ffYhPOzlUs");
        ((ArrayList) term1521).add("MLqYREekMl");
        ((ArrayList) term1521).add("ytSBIKXogI");
        ((ArrayList) term1521).add("nHXjMycHlU");
        ((ArrayList) term1521).add("ieCtQFdkii");
        HashMap term1585 = new HashMap();
        term1506 = newInstance(Class.forName("org.s1ck.gdl.model.Edge"));
        setField(term1506, term1506.getClass(), "sourceVertexId", term1507);
        setField(term1506, term1506.getClass(), "targetVertexId", term1509);
        setIntField(term1506, term1506.getClass(), "lowerBound", 1);
        setIntField(term1506, term1506.getClass(), "upperBound", 1);
        setField(term1506, term1506.getClass(), "graphs", term1513);
        setField(term1506, term1506.getClass(), "id", term1519);
        setField(term1506, term1506.getClass(), "labels", term1521);
        setField(term1506, term1506.getClass(), "properties", term1585);
        setField(term1506, term1506.getClass(), "variable", "dEnhdmILtU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.Edge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "referenceString", argTypes, term1506, args);
    }

};


