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

public class Element_setId_41855742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1870;
     Object term1918;

    public Element_setId_41855742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1871 = new Long(1439298019805881866L);
        ArrayList term1873 = new ArrayList();
        ((ArrayList) term1873).add("bLPjGVBhlX");
        ((ArrayList) term1873).add("whBvTVIIlC");
        HashMap term1901 = new HashMap();
        term1870 = newInstance(Class.forName("org.s1ck.gdl.model.Element"));
        setField(term1870, term1870.getClass(), "id", term1871);
        setField(term1870, term1870.getClass(), "labels", term1873);
        setField(term1870, term1870.getClass(), "properties", term1901);
        setField(term1870, term1870.getClass(), "variable", "IgRJUzaCwW");
        term1918 = new Long(2442117782898005296L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term1918;
        callMethod(klass, "setId", argTypes, term1870, args);
    }

};


