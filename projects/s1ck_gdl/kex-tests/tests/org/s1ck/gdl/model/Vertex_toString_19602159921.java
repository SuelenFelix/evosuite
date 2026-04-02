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

public class Vertex_toString_19602159921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5131;

    public Vertex_toString_19602159921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5133 = new HashMap();
        Set<Object> term5245 =  ((Map) term5133).keySet();
        HashSet term5132 = new HashSet((Collection<? extends Object>) term5245);
        Long term5138 = new Long(-2850532706972744550L);
        ArrayList term5140 = new ArrayList();
        ((ArrayList) term5140).add("GgZWSjxjyE");
        ((ArrayList) term5140).add("EeBVbzjcCI");
        ((ArrayList) term5140).add("UfQtPRyWRC");
        ((ArrayList) term5140).add("FPvxVzzSvD");
        ((ArrayList) term5140).add("WHcwFgsGFC");
        ((ArrayList) term5140).add("HzqpegHiRq");
        ((ArrayList) term5140).add("jwsfVjMoJT");
        HashMap term5228 = new HashMap();
        term5131 = newInstance(Class.forName("org.s1ck.gdl.model.Vertex"));
        setField(term5131, term5131.getClass(), "graphs", term5132);
        setField(term5131, term5131.getClass(), "id", term5138);
        setField(term5131, term5131.getClass(), "labels", term5140);
        setField(term5131, term5131.getClass(), "properties", term5228);
        setField(term5131, term5131.getClass(), "variable", "ZfdXfCCFDf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.Vertex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term5131, args);
    }

};


