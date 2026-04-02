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
import java.util.LinkedList;

public class Element_setLabels_16866222086 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2162;
     Object term2210;

    public Element_setLabels_16866222086() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2163 = new Long(-2068172595987555756L);
        ArrayList term2165 = new ArrayList();
        ((ArrayList) term2165).add("idgaQsnJpQ");
        ((ArrayList) term2165).add("VgZnGoIFwQ");
        HashMap term2193 = new HashMap();
        term2162 = newInstance(Class.forName("org.s1ck.gdl.model.Element"));
        setField(term2162, term2162.getClass(), "id", term2163);
        setField(term2162, term2162.getClass(), "labels", term2165);
        setField(term2162, term2162.getClass(), "properties", term2193);
        setField(term2162, term2162.getClass(), "variable", "jUbSRrkrYZ");
        term2210 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term2210;
        callMethod(klass, "setLabels", argTypes, term2162, args);
    }

};


