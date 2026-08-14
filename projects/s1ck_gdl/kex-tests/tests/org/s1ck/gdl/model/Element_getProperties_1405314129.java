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

public class Element_getProperties_1405314129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2531;

    public Element_getProperties_1405314129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2532 = new Long(4784595517102746672L);
        ArrayList term2534 = new ArrayList();
        ((ArrayList) term2534).add("DfISiziTgG");
        HashMap term2550 = new HashMap();
        term2531 = newInstance(Class.forName("org.s1ck.gdl.model.Element"));
        setField(term2531, term2531.getClass(), "id", term2532);
        setField(term2531, term2531.getClass(), "labels", term2534);
        setField(term2531, term2531.getClass(), "properties", term2550);
        setField(term2531, term2531.getClass(), "variable", "XqgfKFvPSD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProperties", argTypes, term2531, args);
    }

};


