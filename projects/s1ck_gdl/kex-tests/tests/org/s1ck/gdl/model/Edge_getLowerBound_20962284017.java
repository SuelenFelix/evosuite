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

public class Edge_getLowerBound_20962284017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term783;

    public Edge_getLowerBound_20962284017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term784 = new Long(-6573104506744284592L);
        Long term786 = new Long(-4920224193275732920L);
        HashMap term791 = new HashMap();
        Set<Object> term843 =  ((Map) term791).keySet();
        HashSet term790 = new HashSet((Collection<? extends Object>) term843);
        Long term796 = new Long(8428634514691209827L);
        ArrayList term798 = new ArrayList();
        ((ArrayList) term798).add("TEParAifyi");
        ((ArrayList) term798).add("OWDIEULEFu");
        HashMap term826 = new HashMap();
        term783 = newInstance(Class.forName("org.s1ck.gdl.model.Edge"));
        setField(term783, term783.getClass(), "sourceVertexId", term784);
        setField(term783, term783.getClass(), "targetVertexId", term786);
        setIntField(term783, term783.getClass(), "lowerBound", 1);
        setIntField(term783, term783.getClass(), "upperBound", 1);
        setField(term783, term783.getClass(), "graphs", term790);
        setField(term783, term783.getClass(), "id", term796);
        setField(term783, term783.getClass(), "labels", term798);
        setField(term783, term783.getClass(), "properties", term826);
        setField(term783, term783.getClass(), "variable", "dWRymuLBtr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.Edge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLowerBound", argTypes, term783, args);
    }

};


