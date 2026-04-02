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

public class Edge_hasVariableLength_1111983625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term545;

    public Edge_hasVariableLength_1111983625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term546 = new Long(-5476826692763582090L);
        Long term548 = new Long(-872011222785455006L);
        HashMap term553 = new HashMap();
        Set<Object> term593 =  ((Map) term553).keySet();
        HashSet term552 = new HashSet((Collection<? extends Object>) term593);
        Long term558 = new Long(-316468845751588286L);
        ArrayList term560 = new ArrayList();
        ((ArrayList) term560).add("hNxWaHcfhY");
        HashMap term576 = new HashMap();
        term545 = newInstance(Class.forName("org.s1ck.gdl.model.Edge"));
        setField(term545, term545.getClass(), "sourceVertexId", term546);
        setField(term545, term545.getClass(), "targetVertexId", term548);
        setIntField(term545, term545.getClass(), "lowerBound", 1);
        setIntField(term545, term545.getClass(), "upperBound", 1);
        setField(term545, term545.getClass(), "graphs", term552);
        setField(term545, term545.getClass(), "id", term558);
        setField(term545, term545.getClass(), "labels", term560);
        setField(term545, term545.getClass(), "properties", term576);
        setField(term545, term545.getClass(), "variable", "RkybSrpybU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.Edge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasVariableLength", argTypes, term545, args);
    }

};


