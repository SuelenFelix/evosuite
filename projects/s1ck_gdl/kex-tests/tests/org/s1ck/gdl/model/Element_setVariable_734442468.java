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

public class Element_setVariable_734442468 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2387;

    public Element_setVariable_734442468() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2388 = new Long(-6645965768855543712L);
        ArrayList term2390 = new ArrayList();
        ((ArrayList) term2390).add("jSpAteRute");
        ((ArrayList) term2390).add("swZVeJAxjt");
        ((ArrayList) term2390).add("xOcJIiQQDu");
        ((ArrayList) term2390).add("GVizqqzXpy");
        HashMap term2442 = new HashMap();
        term2387 = newInstance(Class.forName("org.s1ck.gdl.model.Element"));
        setField(term2387, term2387.getClass(), "id", term2388);
        setField(term2387, term2387.getClass(), "labels", term2390);
        setField(term2387, term2387.getClass(), "properties", term2442);
        setField(term2387, term2387.getClass(), "variable", "JqXGgAhZPl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jiKYgYHqIS";
        callMethod(klass, "setVariable", argTypes, term2387, args);
    }

};


