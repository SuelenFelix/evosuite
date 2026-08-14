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

public class Element_setId_41855743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1949;
     Object term2009;

    public Element_setId_41855743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1950 = new Long(-8708192233349544946L);
        ArrayList term1952 = new ArrayList();
        ((ArrayList) term1952).add("JUmudUmaaV");
        ((ArrayList) term1952).add("KoyGrUJeJW");
        ((ArrayList) term1952).add("HqBOwkVqjD");
        HashMap term1992 = new HashMap();
        term1949 = newInstance(Class.forName("org.s1ck.gdl.model.Element"));
        setField(term1949, term1949.getClass(), "id", term1950);
        setField(term1949, term1949.getClass(), "labels", term1952);
        setField(term1949, term1949.getClass(), "properties", term1992);
        setField(term1949, term1949.getClass(), "variable", "MAcUBcBckh");
        term2009 = new Long(2442117782898005296L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term2009;
        callMethod(klass, "setId", argTypes, term1949, args);
    }

};


