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

public class Edge_getUpperBound_14583512488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term886;

    public Edge_getUpperBound_14583512488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term887 = new Long(-4365849114644724155L);
        Long term889 = new Long(2486810210675247493L);
        HashMap term894 = new HashMap();
        Set<Object> term994 =  ((Map) term894).keySet();
        HashSet term893 = new HashSet((Collection<? extends Object>) term994);
        Long term899 = new Long(7009926388951271268L);
        ArrayList term901 = new ArrayList();
        ((ArrayList) term901).add("AijpHYOFuy");
        ((ArrayList) term901).add("SbAoxhfrkn");
        ((ArrayList) term901).add("kuTXqwMtDB");
        ((ArrayList) term901).add("Ghbwtircqb");
        ((ArrayList) term901).add("xrwlQZdwCp");
        ((ArrayList) term901).add("IDCWpPLRkE");
        HashMap term977 = new HashMap();
        term886 = newInstance(Class.forName("org.s1ck.gdl.model.Edge"));
        setField(term886, term886.getClass(), "sourceVertexId", term887);
        setField(term886, term886.getClass(), "targetVertexId", term889);
        setIntField(term886, term886.getClass(), "lowerBound", 1);
        setIntField(term886, term886.getClass(), "upperBound", 1);
        setField(term886, term886.getClass(), "graphs", term893);
        setField(term886, term886.getClass(), "id", term899);
        setField(term886, term886.getClass(), "labels", term901);
        setField(term886, term886.getClass(), "properties", term977);
        setField(term886, term886.getClass(), "variable", "nyiiPDVjAc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.Edge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpperBound", argTypes, term886, args);
    }

};


