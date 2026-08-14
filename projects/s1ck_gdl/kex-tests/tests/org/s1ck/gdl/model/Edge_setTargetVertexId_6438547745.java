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

public class Edge_setTargetVertexId_6438547745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term533;
     Object term581;

    public Edge_setTargetVertexId_6438547745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term534 = new Long(-8885298608300233488L);
        Long term536 = new Long(-4325723315152823407L);
        HashMap term541 = new HashMap();
        Set<Object> term583 =  ((Map) term541).keySet();
        HashSet term540 = new HashSet((Collection<? extends Object>) term583);
        Long term546 = new Long(2535595959091595249L);
        ArrayList term548 = new ArrayList();
        ((ArrayList) term548).add("hNxWaHcfhY");
        HashMap term564 = new HashMap();
        term533 = newInstance(Class.forName("org.s1ck.gdl.model.Edge"));
        setField(term533, term533.getClass(), "sourceVertexId", term534);
        setField(term533, term533.getClass(), "targetVertexId", term536);
        setIntField(term533, term533.getClass(), "lowerBound", 1);
        setIntField(term533, term533.getClass(), "upperBound", 1);
        setField(term533, term533.getClass(), "graphs", term540);
        setField(term533, term533.getClass(), "id", term546);
        setField(term533, term533.getClass(), "labels", term548);
        setField(term533, term533.getClass(), "properties", term564);
        setField(term533, term533.getClass(), "variable", "RkybSrpybU");
        term581 = new Long(-5476826692763582090L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.Edge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term581;
        callMethod(klass, "setTargetVertexId", argTypes, term533, args);
    }

};


