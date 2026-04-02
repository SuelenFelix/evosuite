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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Long;
import java.util.ArrayList;

public class GraphElement_getGraphs_17136258662 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5000;

    public GraphElement_getGraphs_17136258662() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5002 = new HashMap();
        Set<Object> term5078 =  ((Map) term5002).keySet();
        HashSet term5001 = new HashSet((Collection<? extends Object>) term5078);
        Long term5007 = new Long(-1154553077993834885L);
        ArrayList term5009 = new ArrayList();
        ((ArrayList) term5009).add("ZzIujlwVsw");
        ((ArrayList) term5009).add("LWyEaeIyAo");
        ((ArrayList) term5009).add("yVMkkQhvmN");
        ((ArrayList) term5009).add("mvrkADEgpp");
        HashMap term5061 = new HashMap();
        term5000 = newInstance(Class.forName("org.s1ck.gdl.model.GraphElement"));
        setField(term5000, term5000.getClass(), "graphs", term5001);
        setField(term5000, term5000.getClass(), "id", term5007);
        setField(term5000, term5000.getClass(), "labels", term5009);
        setField(term5000, term5000.getClass(), "properties", term5061);
        setField(term5000, term5000.getClass(), "variable", "pXOkjyeIRb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.GraphElement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGraphs", argTypes, term5000, args);
    }

};


