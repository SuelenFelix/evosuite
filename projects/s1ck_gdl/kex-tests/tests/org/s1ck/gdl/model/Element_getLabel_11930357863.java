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

public class Element_getLabel_11930357863 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1950;

    public Element_getLabel_11930357863() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1951 = new Long(-8708192233349544946L);
        ArrayList term1953 = new ArrayList();
        ((ArrayList) term1953).add("JUmudUmaaV");
        ((ArrayList) term1953).add("KoyGrUJeJW");
        ((ArrayList) term1953).add("HqBOwkVqjD");
        HashMap term1993 = new HashMap();
        term1950 = newInstance(Class.forName("org.s1ck.gdl.model.Element"));
        setField(term1950, term1950.getClass(), "id", term1951);
        setField(term1950, term1950.getClass(), "labels", term1953);
        setField(term1950, term1950.getClass(), "properties", term1993);
        setField(term1950, term1950.getClass(), "variable", "MAcUBcBckh");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLabel", argTypes, term1950, args);
    }

};


