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

public class Edge_setSourceVertexId_12624373122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158;
     Object term242;

    public Edge_setSourceVertexId_12624373122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term159 = new Long(-8400487765614892086L);
        Long term161 = new Long(5270370404989704783L);
        HashMap term166 = new HashMap();
        Set<Object> term244 =  ((Map) term166).keySet();
        HashSet term165 = new HashSet((Collection<? extends Object>) term244);
        Long term171 = new Long(7411271909051562686L);
        ArrayList term173 = new ArrayList();
        ((ArrayList) term173).add("SzjVpOQTyS");
        ((ArrayList) term173).add("MjGYSRKTNF");
        ((ArrayList) term173).add("hRNSzYYIrc");
        ((ArrayList) term173).add("RMFIsYGgne");
        HashMap term225 = new HashMap();
        term158 = newInstance(Class.forName("org.s1ck.gdl.model.Edge"));
        setField(term158, term158.getClass(), "sourceVertexId", term159);
        setField(term158, term158.getClass(), "targetVertexId", term161);
        setIntField(term158, term158.getClass(), "lowerBound", 1);
        setIntField(term158, term158.getClass(), "upperBound", 1);
        setField(term158, term158.getClass(), "graphs", term165);
        setField(term158, term158.getClass(), "id", term171);
        setField(term158, term158.getClass(), "labels", term173);
        setField(term158, term158.getClass(), "properties", term225);
        setField(term158, term158.getClass(), "variable", "NRdvgJlhkX");
        term242 = new Long(4872422362414183754L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.Edge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term242;
        callMethod(klass, "setSourceVertexId", argTypes, term158, args);
    }

};


