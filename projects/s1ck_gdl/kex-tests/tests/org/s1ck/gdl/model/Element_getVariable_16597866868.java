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
import java.util.ArrayList;
import java.util.HashMap;

public class Element_getVariable_16597866868 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2454;

    public Element_getVariable_16597866868() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2455 = new Long(-6645965768855543712L);
        ArrayList term2457 = new ArrayList();
        ((ArrayList) term2457).add("GVizqqzXpy");
        ((ArrayList) term2457).add("JqXGgAhZPl");
        ((ArrayList) term2457).add("jiKYgYHqIS");
        ((ArrayList) term2457).add("DfISiziTgG");
        HashMap term2509 = new HashMap();
        term2454 = newInstance(Class.forName("org.s1ck.gdl.model.Element"));
        setField(term2454, term2454.getClass(), "id", term2455);
        setField(term2454, term2454.getClass(), "labels", term2457);
        setField(term2454, term2454.getClass(), "properties", term2509);
        setField(term2454, term2454.getClass(), "variable", "XqgfKFvPSD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVariable", argTypes, term2454, args);
    }

};


