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

public class Element_setLabel_7693673704 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2050;

    public Element_setLabel_7693673704() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2051 = new Long(5907001541142728739L);
        ArrayList term2053 = new ArrayList();
        ((ArrayList) term2053).add("oVgzLbrsFr");
        HashMap term2069 = new HashMap();
        term2050 = newInstance(Class.forName("org.s1ck.gdl.model.Element"));
        setField(term2050, term2050.getClass(), "id", term2051);
        setField(term2050, term2050.getClass(), "labels", term2053);
        setField(term2050, term2050.getClass(), "properties", term2069);
        setField(term2050, term2050.getClass(), "variable", "vQVyKLdtaz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OWKQODBLzb";
        callMethod(klass, "setLabel", argTypes, term2050, args);
    }

};


