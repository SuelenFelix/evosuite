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

public class Element_getLabels_20035747906 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2163;

    public Element_getLabels_20035747906() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2164 = new Long(-2068172595987555756L);
        ArrayList term2166 = new ArrayList();
        ((ArrayList) term2166).add("idgaQsnJpQ");
        ((ArrayList) term2166).add("VgZnGoIFwQ");
        HashMap term2194 = new HashMap();
        term2163 = newInstance(Class.forName("org.s1ck.gdl.model.Element"));
        setField(term2163, term2163.getClass(), "id", term2164);
        setField(term2163, term2163.getClass(), "labels", term2166);
        setField(term2163, term2163.getClass(), "properties", term2194);
        setField(term2163, term2163.getClass(), "variable", "jUbSRrkrYZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLabels", argTypes, term2163, args);
    }

};


