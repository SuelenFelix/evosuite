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

public class Element_setLabels_16866222087 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2241;
     Object term2361;

    public Element_setLabels_16866222087() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2242 = new Long(-6292278961887936280L);
        ArrayList term2244 = new ArrayList();
        ((ArrayList) term2244).add("bWWfajKbEX");
        ((ArrayList) term2244).add("cAPeiZHKGJ");
        ((ArrayList) term2244).add("LvJFtLBaxj");
        ((ArrayList) term2244).add("PHvxnGHptP");
        ((ArrayList) term2244).add("TimdotUuNC");
        ((ArrayList) term2244).add("PkWMRdJcBb");
        ((ArrayList) term2244).add("jSpAteRute");
        ((ArrayList) term2244).add("swZVeJAxjt");
        HashMap term2344 = new HashMap();
        term2241 = newInstance(Class.forName("org.s1ck.gdl.model.Element"));
        setField(term2241, term2241.getClass(), "id", term2242);
        setField(term2241, term2241.getClass(), "labels", term2244);
        setField(term2241, term2241.getClass(), "properties", term2344);
        setField(term2241, term2241.getClass(), "variable", "xOcJIiQQDu");
        term2361 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term2361;
        callMethod(klass, "setLabels", argTypes, term2241, args);
    }

};


