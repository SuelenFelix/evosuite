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

public class Element_getId_20679233681 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1726;

    public Element_getId_20679233681() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1727 = new Long(6617340557564669657L);
        ArrayList term1729 = new ArrayList();
        ((ArrayList) term1729).add("eqJfYWRaEL");
        ((ArrayList) term1729).add("fhkbdRViHi");
        ((ArrayList) term1729).add("uWHnvSvaPl");
        ((ArrayList) term1729).add("kBdSllIBVz");
        ((ArrayList) term1729).add("TJmVBGfTML");
        HashMap term1793 = new HashMap();
        term1726 = newInstance(Class.forName("org.s1ck.gdl.model.Element"));
        setField(term1726, term1726.getClass(), "id", term1727);
        setField(term1726, term1726.getClass(), "labels", term1729);
        setField(term1726, term1726.getClass(), "properties", term1793);
        setField(term1726, term1726.getClass(), "variable", "tPlsykYBqO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1726, args);
    }

};


