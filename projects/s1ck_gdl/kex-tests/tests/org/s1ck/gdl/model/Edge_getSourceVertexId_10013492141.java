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

public class Edge_getSourceVertexId_10013492141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public Edge_getSourceVertexId_10013492141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2 = new Long(2442117782898005296L);
        Long term4 = new Long(6375119433582206027L);
        HashMap term9 = new HashMap();
        Set<Object> term97 =  ((Map) term9).keySet();
        HashSet term8 = new HashSet((Collection<? extends Object>) term97);
        Long term14 = new Long(-8257434502486459194L);
        ArrayList term16 = new ArrayList();
        ((ArrayList) term16).add("PAEBtnZtTD");
        ((ArrayList) term16).add("sjlJAEtRrb");
        ((ArrayList) term16).add("MuLcgQHgqz");
        ((ArrayList) term16).add("xxtlPwDYFs");
        ((ArrayList) term16).add("jJCZpVmanW");
        HashMap term80 = new HashMap();
        term1 = newInstance(Class.forName("org.s1ck.gdl.model.Edge"));
        setField(term1, term1.getClass(), "sourceVertexId", term2);
        setField(term1, term1.getClass(), "targetVertexId", term4);
        setIntField(term1, term1.getClass(), "lowerBound", 1);
        setIntField(term1, term1.getClass(), "upperBound", 1);
        setField(term1, term1.getClass(), "graphs", term8);
        setField(term1, term1.getClass(), "id", term14);
        setField(term1, term1.getClass(), "labels", term16);
        setField(term1, term1.getClass(), "properties", term80);
        setField(term1, term1.getClass(), "variable", "EGtDIRbSSb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.Edge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSourceVertexId", argTypes, term1, args);
    }

};


