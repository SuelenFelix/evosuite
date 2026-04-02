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

public class Edge_referenceString_189633916911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1337;

    public Edge_referenceString_189633916911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1338 = new Long(5262507301787091109L);
        Long term1340 = new Long(-6823727938421990489L);
        HashMap term1345 = new HashMap();
        Set<Object> term1445 =  ((Map) term1345).keySet();
        HashSet term1344 = new HashSet((Collection<? extends Object>) term1445);
        Long term1350 = new Long(-484994522244390100L);
        ArrayList term1352 = new ArrayList();
        ((ArrayList) term1352).add("jDtqGUpnZN");
        ((ArrayList) term1352).add("nGKItKLYNC");
        ((ArrayList) term1352).add("UiUYnPrcCi");
        ((ArrayList) term1352).add("UoYtihxVaS");
        ((ArrayList) term1352).add("JDswTTCZHV");
        ((ArrayList) term1352).add("onpbIeEKoi");
        HashMap term1428 = new HashMap();
        term1337 = newInstance(Class.forName("org.s1ck.gdl.model.Edge"));
        setField(term1337, term1337.getClass(), "sourceVertexId", term1338);
        setField(term1337, term1337.getClass(), "targetVertexId", term1340);
        setIntField(term1337, term1337.getClass(), "lowerBound", 1);
        setIntField(term1337, term1337.getClass(), "upperBound", 1);
        setField(term1337, term1337.getClass(), "graphs", term1344);
        setField(term1337, term1337.getClass(), "id", term1350);
        setField(term1337, term1337.getClass(), "labels", term1352);
        setField(term1337, term1337.getClass(), "properties", term1428);
        setField(term1337, term1337.getClass(), "variable", "YRHGsAkhxb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.Edge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "referenceString", argTypes, term1337, args);
    }

};


