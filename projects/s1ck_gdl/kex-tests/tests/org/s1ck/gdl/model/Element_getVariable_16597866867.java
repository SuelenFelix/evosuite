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

public class Element_getVariable_16597866867 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2243;

    public Element_getVariable_16597866867() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2244 = new Long(-6292278961887936280L);
        ArrayList term2246 = new ArrayList();
        ((ArrayList) term2246).add("bWWfajKbEX");
        ((ArrayList) term2246).add("cAPeiZHKGJ");
        ((ArrayList) term2246).add("LvJFtLBaxj");
        ((ArrayList) term2246).add("PHvxnGHptP");
        ((ArrayList) term2246).add("TimdotUuNC");
        HashMap term2310 = new HashMap();
        term2243 = newInstance(Class.forName("org.s1ck.gdl.model.Element"));
        setField(term2243, term2243.getClass(), "id", term2244);
        setField(term2243, term2243.getClass(), "labels", term2246);
        setField(term2243, term2243.getClass(), "properties", term2310);
        setField(term2243, term2243.getClass(), "variable", "PkWMRdJcBb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVariable", argTypes, term2243, args);
    }

};


