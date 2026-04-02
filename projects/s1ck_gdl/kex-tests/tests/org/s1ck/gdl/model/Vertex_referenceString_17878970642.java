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

public class Vertex_referenceString_17878970642 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5326;

    public Vertex_referenceString_17878970642() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5328 = new HashMap();
        Set<Object> term5368 =  ((Map) term5328).keySet();
        HashSet term5327 = new HashSet((Collection<? extends Object>) term5368);
        Long term5333 = new Long(-2644215923136513282L);
        ArrayList term5335 = new ArrayList();
        ((ArrayList) term5335).add("MwwjNtdOFT");
        HashMap term5351 = new HashMap();
        term5326 = newInstance(Class.forName("org.s1ck.gdl.model.Vertex"));
        setField(term5326, term5326.getClass(), "graphs", term5327);
        setField(term5326, term5326.getClass(), "id", term5333);
        setField(term5326, term5326.getClass(), "labels", term5335);
        setField(term5326, term5326.getClass(), "properties", term5351);
        setField(term5326, term5326.getClass(), "variable", "VYkqXKVlAJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.Vertex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "referenceString", argTypes, term5326, args);
    }

};


