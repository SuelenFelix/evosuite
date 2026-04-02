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
import java.util.LinkedHashMap;

public class Element_setProperties_46009268210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2587;
     Object term2635;

    public Element_setProperties_46009268210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2588 = new Long(-7612550318181586304L);
        ArrayList term2590 = new ArrayList();
        ((ArrayList) term2590).add("JiVRgTZvKc");
        ((ArrayList) term2590).add("XPKmummaqg");
        HashMap term2618 = new HashMap();
        term2587 = newInstance(Class.forName("org.s1ck.gdl.model.Element"));
        setField(term2587, term2587.getClass(), "id", term2588);
        setField(term2587, term2587.getClass(), "labels", term2590);
        setField(term2587, term2587.getClass(), "properties", term2618);
        setField(term2587, term2587.getClass(), "variable", "BKLfkLiZTH");
        term2635 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term2635;
        callMethod(klass, "setProperties", argTypes, term2587, args);
    }

};


