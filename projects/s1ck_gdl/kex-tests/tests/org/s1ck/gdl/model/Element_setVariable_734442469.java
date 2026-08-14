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

public class Element_setVariable_734442469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2576;

    public Element_setVariable_734442469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2577 = new Long(4784595517102746672L);
        ArrayList term2579 = new ArrayList();
        ((ArrayList) term2579).add("JiVRgTZvKc");
        HashMap term2595 = new HashMap();
        term2576 = newInstance(Class.forName("org.s1ck.gdl.model.Element"));
        setField(term2576, term2576.getClass(), "id", term2577);
        setField(term2576, term2576.getClass(), "labels", term2579);
        setField(term2576, term2576.getClass(), "properties", term2595);
        setField(term2576, term2576.getClass(), "variable", "XPKmummaqg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BKLfkLiZTH";
        callMethod(klass, "setVariable", argTypes, term2576, args);
    }

};


