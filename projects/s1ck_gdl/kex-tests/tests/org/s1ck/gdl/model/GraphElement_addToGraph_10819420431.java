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

public class GraphElement_addToGraph_10819420431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4759;
     Object term4897;

    public GraphElement_addToGraph_10819420431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4761 = new HashMap();
        Set<Object> term4899 =  ((Map) term4761).keySet();
        HashSet term4760 = new HashSet((Collection<? extends Object>) term4899);
        Long term4766 = new Long(-5788180182343976541L);
        ArrayList term4768 = new ArrayList();
        ((ArrayList) term4768).add("SdCKLMIYnX");
        ((ArrayList) term4768).add("OJJtVNPyKZ");
        ((ArrayList) term4768).add("AKNapTAfmD");
        ((ArrayList) term4768).add("xJgPlLxpgC");
        ((ArrayList) term4768).add("EYtfuJaxiM");
        ((ArrayList) term4768).add("gCWtLVKVVe");
        ((ArrayList) term4768).add("fWKJoSoCwE");
        ((ArrayList) term4768).add("wfaXBpWAUH");
        ((ArrayList) term4768).add("VMeAzAHwZj");
        HashMap term4880 = new HashMap();
        term4759 = newInstance(Class.forName("org.s1ck.gdl.model.GraphElement"));
        setField(term4759, term4759.getClass(), "graphs", term4760);
        setField(term4759, term4759.getClass(), "id", term4766);
        setField(term4759, term4759.getClass(), "labels", term4768);
        setField(term4759, term4759.getClass(), "properties", term4880);
        setField(term4759, term4759.getClass(), "variable", "PznxWXsZME");
        term4897 = new Long(2936323121573284007L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.GraphElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term4897;
        callMethod(klass, "addToGraph", argTypes, term4759, args);
    }

};


