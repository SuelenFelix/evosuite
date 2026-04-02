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

public class Edge_getTargetVertexId_3827666763 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term295;

    public Edge_getTargetVertexId_3827666763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term296 = new Long(6811161968424632369L);
        Long term298 = new Long(-7237588299778557629L);
        HashMap term303 = new HashMap();
        Set<Object> term367 =  ((Map) term303).keySet();
        HashSet term302 = new HashSet((Collection<? extends Object>) term367);
        Long term308 = new Long(6967924379644551255L);
        ArrayList term310 = new ArrayList();
        ((ArrayList) term310).add("uuaPigETmJ");
        ((ArrayList) term310).add("MxlszYVzRf");
        ((ArrayList) term310).add("LQFpaHEwXR");
        HashMap term350 = new HashMap();
        term295 = newInstance(Class.forName("org.s1ck.gdl.model.Edge"));
        setField(term295, term295.getClass(), "sourceVertexId", term296);
        setField(term295, term295.getClass(), "targetVertexId", term298);
        setIntField(term295, term295.getClass(), "lowerBound", 1);
        setIntField(term295, term295.getClass(), "upperBound", 1);
        setField(term295, term295.getClass(), "graphs", term302);
        setField(term295, term295.getClass(), "id", term308);
        setField(term295, term295.getClass(), "labels", term310);
        setField(term295, term295.getClass(), "properties", term350);
        setField(term295, term295.getClass(), "variable", "oVcInYnLWB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.Edge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTargetVertexId", argTypes, term295, args);
    }

};


