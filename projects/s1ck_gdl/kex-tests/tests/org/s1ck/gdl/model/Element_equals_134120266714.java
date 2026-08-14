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

public class Element_equals_134120266714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3092;
     Object term3152;

    public Element_equals_134120266714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3093 = new Long(-3842548265506930260L);
        ArrayList term3095 = new ArrayList();
        ((ArrayList) term3095).add("pORebkoRdD");
        ((ArrayList) term3095).add("mXGCWJDOqA");
        ((ArrayList) term3095).add("dpNsDgfPso");
        HashMap term3135 = new HashMap();
        term3092 = newInstance(Class.forName("org.s1ck.gdl.model.Element"));
        setField(term3092, term3092.getClass(), "id", term3093);
        setField(term3092, term3092.getClass(), "labels", term3095);
        setField(term3092, term3092.getClass(), "properties", term3135);
        setField(term3092, term3092.getClass(), "variable", "hCWPJQKpdc");
        term3152 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3152;
        callMethod(klass, "equals", argTypes, term3092, args);
    }

};


