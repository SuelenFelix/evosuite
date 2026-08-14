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

public class Edge_setLowerBound_12843591177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term793;
     Object term853;

    public Edge_setLowerBound_12843591177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term794 = new Long(8428634514691209827L);
        Long term796 = new Long(-2585684163342970173L);
        HashMap term801 = new HashMap();
        Set<Object> term855 =  ((Map) term801).keySet();
        HashSet term800 = new HashSet((Collection<? extends Object>) term855);
        Long term806 = new Long(8059786003080744426L);
        ArrayList term808 = new ArrayList();
        ((ArrayList) term808).add("TEParAifyi");
        ((ArrayList) term808).add("OWDIEULEFu");
        HashMap term836 = new HashMap();
        term793 = newInstance(Class.forName("org.s1ck.gdl.model.Edge"));
        setField(term793, term793.getClass(), "sourceVertexId", term794);
        setField(term793, term793.getClass(), "targetVertexId", term796);
        setIntField(term793, term793.getClass(), "lowerBound", 1);
        setIntField(term793, term793.getClass(), "upperBound", 1);
        setField(term793, term793.getClass(), "graphs", term800);
        setField(term793, term793.getClass(), "id", term806);
        setField(term793, term793.getClass(), "labels", term808);
        setField(term793, term793.getClass(), "properties", term836);
        setField(term793, term793.getClass(), "variable", "dWRymuLBtr");
        term853 = new Integer(568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.Edge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term853;
        callMethod(klass, "setLowerBound", argTypes, term793, args);
    }

};


