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

public class Edge_setUpperBound_54397147010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1256;
     Object term1304;

    public Edge_setUpperBound_54397147010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1257 = new Long(-4502405999831680926L);
        Long term1259 = new Long(1967728129628047933L);
        HashMap term1264 = new HashMap();
        Set<Object> term1306 =  ((Map) term1264).keySet();
        HashSet term1263 = new HashSet((Collection<? extends Object>) term1306);
        Long term1269 = new Long(2120084523938730454L);
        ArrayList term1271 = new ArrayList();
        ((ArrayList) term1271).add("LvtrsXUliU");
        HashMap term1287 = new HashMap();
        term1256 = newInstance(Class.forName("org.s1ck.gdl.model.Edge"));
        setField(term1256, term1256.getClass(), "sourceVertexId", term1257);
        setField(term1256, term1256.getClass(), "targetVertexId", term1259);
        setIntField(term1256, term1256.getClass(), "lowerBound", 1);
        setIntField(term1256, term1256.getClass(), "upperBound", 1);
        setField(term1256, term1256.getClass(), "graphs", term1263);
        setField(term1256, term1256.getClass(), "id", term1269);
        setField(term1256, term1256.getClass(), "labels", term1271);
        setField(term1256, term1256.getClass(), "properties", term1287);
        setField(term1256, term1256.getClass(), "variable", "xLbjWUgOIL");
        term1304 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.Edge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1304;
        callMethod(klass, "setUpperBound", argTypes, term1256, args);
    }

};


