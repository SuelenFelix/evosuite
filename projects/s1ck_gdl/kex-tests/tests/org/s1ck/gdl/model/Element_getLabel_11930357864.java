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

public class Element_getLabel_11930357864 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2051;

    public Element_getLabel_11930357864() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2052 = new Long(5907001541142728739L);
        ArrayList term2054 = new ArrayList();
        ((ArrayList) term2054).add("oVgzLbrsFr");
        HashMap term2070 = new HashMap();
        term2051 = newInstance(Class.forName("org.s1ck.gdl.model.Element"));
        setField(term2051, term2051.getClass(), "id", term2052);
        setField(term2051, term2051.getClass(), "labels", term2054);
        setField(term2051, term2051.getClass(), "properties", term2070);
        setField(term2051, term2051.getClass(), "variable", "vQVyKLdtaz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLabel", argTypes, term2051, args);
    }

};


