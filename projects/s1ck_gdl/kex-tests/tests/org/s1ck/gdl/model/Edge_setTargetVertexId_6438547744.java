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

public class Edge_setTargetVertexId_6438547744 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term408;
     Object term492;

    public Edge_setTargetVertexId_6438547744() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term409 = new Long(-2813493605142626659L);
        Long term411 = new Long(-8885298608300233488L);
        HashMap term416 = new HashMap();
        Set<Object> term494 =  ((Map) term416).keySet();
        HashSet term415 = new HashSet((Collection<? extends Object>) term494);
        Long term421 = new Long(-4325723315152823407L);
        ArrayList term423 = new ArrayList();
        ((ArrayList) term423).add("aJlieCFVtF");
        ((ArrayList) term423).add("ZiaGIbnzTs");
        ((ArrayList) term423).add("tbcdzjIfER");
        ((ArrayList) term423).add("HyxfbSQYBe");
        HashMap term475 = new HashMap();
        term408 = newInstance(Class.forName("org.s1ck.gdl.model.Edge"));
        setField(term408, term408.getClass(), "sourceVertexId", term409);
        setField(term408, term408.getClass(), "targetVertexId", term411);
        setIntField(term408, term408.getClass(), "lowerBound", 1);
        setIntField(term408, term408.getClass(), "upperBound", 1);
        setField(term408, term408.getClass(), "graphs", term415);
        setField(term408, term408.getClass(), "id", term421);
        setField(term408, term408.getClass(), "labels", term423);
        setField(term408, term408.getClass(), "properties", term475);
        setField(term408, term408.getClass(), "variable", "pCTimMblYc");
        term492 = new Long(2535595959091595249L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.Edge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term492;
        callMethod(klass, "setTargetVertexId", argTypes, term408, args);
    }

};


