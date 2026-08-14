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

public class Edge_getUpperBound_14583512489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1055;

    public Edge_getUpperBound_14583512489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1056 = new Long(2486810210675247493L);
        Long term1058 = new Long(7009926388951271268L);
        HashMap term1063 = new HashMap();
        Set<Object> term1175 =  ((Map) term1063).keySet();
        HashSet term1062 = new HashSet((Collection<? extends Object>) term1175);
        Long term1068 = new Long(-7672528020740371001L);
        ArrayList term1070 = new ArrayList();
        ((ArrayList) term1070).add("aKnKipADSo");
        ((ArrayList) term1070).add("wSQxaModmm");
        ((ArrayList) term1070).add("UlajhuVLaP");
        ((ArrayList) term1070).add("gGSMzuGICf");
        ((ArrayList) term1070).add("hxCBltsObl");
        ((ArrayList) term1070).add("BndsHwAFMv");
        ((ArrayList) term1070).add("GzFkzHGYFt");
        HashMap term1158 = new HashMap();
        term1055 = newInstance(Class.forName("org.s1ck.gdl.model.Edge"));
        setField(term1055, term1055.getClass(), "sourceVertexId", term1056);
        setField(term1055, term1055.getClass(), "targetVertexId", term1058);
        setIntField(term1055, term1055.getClass(), "lowerBound", 1);
        setIntField(term1055, term1055.getClass(), "upperBound", 1);
        setField(term1055, term1055.getClass(), "graphs", term1062);
        setField(term1055, term1055.getClass(), "id", term1068);
        setField(term1055, term1055.getClass(), "labels", term1070);
        setField(term1055, term1055.getClass(), "properties", term1158);
        setField(term1055, term1055.getClass(), "variable", "tShwQLRGNe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.Edge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpperBound", argTypes, term1055, args);
    }

};


