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

public class Edge_setLowerBound_12843591178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term874;
     Object term982;

    public Edge_setLowerBound_12843591178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term875 = new Long(-2585684163342970173L);
        Long term877 = new Long(8059786003080744426L);
        HashMap term882 = new HashMap();
        Set<Object> term984 =  ((Map) term882).keySet();
        HashSet term881 = new HashSet((Collection<? extends Object>) term984);
        Long term887 = new Long(-4365849114644724155L);
        ArrayList term889 = new ArrayList();
        ((ArrayList) term889).add("AijpHYOFuy");
        ((ArrayList) term889).add("SbAoxhfrkn");
        ((ArrayList) term889).add("kuTXqwMtDB");
        ((ArrayList) term889).add("Ghbwtircqb");
        ((ArrayList) term889).add("xrwlQZdwCp");
        ((ArrayList) term889).add("IDCWpPLRkE");
        HashMap term965 = new HashMap();
        term874 = newInstance(Class.forName("org.s1ck.gdl.model.Edge"));
        setField(term874, term874.getClass(), "sourceVertexId", term875);
        setField(term874, term874.getClass(), "targetVertexId", term877);
        setIntField(term874, term874.getClass(), "lowerBound", 1);
        setIntField(term874, term874.getClass(), "upperBound", 1);
        setField(term874, term874.getClass(), "graphs", term881);
        setField(term874, term874.getClass(), "id", term887);
        setField(term874, term874.getClass(), "labels", term889);
        setField(term874, term874.getClass(), "properties", term965);
        setField(term874, term874.getClass(), "variable", "nyiiPDVjAc");
        term982 = new Integer(568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.Edge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term982;
        callMethod(klass, "setLowerBound", argTypes, term874, args);
    }

};


