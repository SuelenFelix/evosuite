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
import java.lang.Integer;

public class Edge_setUpperBound_5439714709 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1065;
     Object term1185;

    public Edge_setUpperBound_5439714709() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1066 = new Long(-7672528020740371001L);
        Long term1068 = new Long(-4502405999831680926L);
        HashMap term1073 = new HashMap();
        Set<Object> term1187 =  ((Map) term1073).keySet();
        HashSet term1072 = new HashSet((Collection<? extends Object>) term1187);
        Long term1078 = new Long(1967728129628047933L);
        ArrayList term1080 = new ArrayList();
        ((ArrayList) term1080).add("aKnKipADSo");
        ((ArrayList) term1080).add("wSQxaModmm");
        ((ArrayList) term1080).add("UlajhuVLaP");
        ((ArrayList) term1080).add("gGSMzuGICf");
        ((ArrayList) term1080).add("hxCBltsObl");
        ((ArrayList) term1080).add("BndsHwAFMv");
        ((ArrayList) term1080).add("GzFkzHGYFt");
        HashMap term1168 = new HashMap();
        term1065 = newInstance(Class.forName("org.s1ck.gdl.model.Edge"));
        setField(term1065, term1065.getClass(), "sourceVertexId", term1066);
        setField(term1065, term1065.getClass(), "targetVertexId", term1068);
        setIntField(term1065, term1065.getClass(), "lowerBound", 1);
        setIntField(term1065, term1065.getClass(), "upperBound", 1);
        setField(term1065, term1065.getClass(), "graphs", term1072);
        setField(term1065, term1065.getClass(), "id", term1078);
        setField(term1065, term1065.getClass(), "labels", term1080);
        setField(term1065, term1065.getClass(), "properties", term1168);
        setField(term1065, term1065.getClass(), "variable", "tShwQLRGNe");
        term1185 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.Edge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1185;
        callMethod(klass, "setUpperBound", argTypes, term1065, args);
    }

};


