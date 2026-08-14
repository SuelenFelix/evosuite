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

public class Edge_toString_206865809711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1327;

    public Edge_toString_206865809711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1328 = new Long(6855071767938501807L);
        Long term1330 = new Long(-5892135042702373494L);
        HashMap term1335 = new HashMap();
        Set<Object> term1435 =  ((Map) term1335).keySet();
        HashSet term1334 = new HashSet((Collection<? extends Object>) term1435);
        Long term1340 = new Long(5262507301787091109L);
        ArrayList term1342 = new ArrayList();
        ((ArrayList) term1342).add("jDtqGUpnZN");
        ((ArrayList) term1342).add("nGKItKLYNC");
        ((ArrayList) term1342).add("UiUYnPrcCi");
        ((ArrayList) term1342).add("UoYtihxVaS");
        ((ArrayList) term1342).add("JDswTTCZHV");
        ((ArrayList) term1342).add("onpbIeEKoi");
        HashMap term1418 = new HashMap();
        term1327 = newInstance(Class.forName("org.s1ck.gdl.model.Edge"));
        setField(term1327, term1327.getClass(), "sourceVertexId", term1328);
        setField(term1327, term1327.getClass(), "targetVertexId", term1330);
        setIntField(term1327, term1327.getClass(), "lowerBound", 1);
        setIntField(term1327, term1327.getClass(), "upperBound", 1);
        setField(term1327, term1327.getClass(), "graphs", term1334);
        setField(term1327, term1327.getClass(), "id", term1340);
        setField(term1327, term1327.getClass(), "labels", term1342);
        setField(term1327, term1327.getClass(), "properties", term1418);
        setField(term1327, term1327.getClass(), "variable", "YRHGsAkhxb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.Edge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1327, args);
    }

};


