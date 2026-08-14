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

public class Edge_toString_206865809710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1268;

    public Edge_toString_206865809710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1269 = new Long(2120084523938730454L);
        Long term1271 = new Long(6855071767938501807L);
        HashMap term1276 = new HashMap();
        Set<Object> term1316 =  ((Map) term1276).keySet();
        HashSet term1275 = new HashSet((Collection<? extends Object>) term1316);
        Long term1281 = new Long(-5892135042702373494L);
        ArrayList term1283 = new ArrayList();
        ((ArrayList) term1283).add("LvtrsXUliU");
        HashMap term1299 = new HashMap();
        term1268 = newInstance(Class.forName("org.s1ck.gdl.model.Edge"));
        setField(term1268, term1268.getClass(), "sourceVertexId", term1269);
        setField(term1268, term1268.getClass(), "targetVertexId", term1271);
        setIntField(term1268, term1268.getClass(), "lowerBound", 1);
        setIntField(term1268, term1268.getClass(), "upperBound", 1);
        setField(term1268, term1268.getClass(), "graphs", term1275);
        setField(term1268, term1268.getClass(), "id", term1281);
        setField(term1268, term1268.getClass(), "labels", term1283);
        setField(term1268, term1268.getClass(), "properties", term1299);
        setField(term1268, term1268.getClass(), "variable", "xLbjWUgOIL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.Edge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1268, args);
    }

};


