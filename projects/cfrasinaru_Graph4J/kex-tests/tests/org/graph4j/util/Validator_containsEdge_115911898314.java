package org.graph4j.util;

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
import static org.graph4j.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class Validator_containsEdge_115911898314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73102;

    public Validator_containsEdge_115911898314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term73107 = new Double(0.710793359488993);
        term73102 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term73106 = (Object[]) newArray("java.lang.Double", 1);
        setBooleanField(term73102, term73102.getClass(), "directed", true);
        setIntField(term73102, term73102.getClass(), "source", 1946548320);
        setIntField(term73102, term73102.getClass(), "target", 1072604902);
        setElement(term73106, 0, term73107);
        setField(term73102, term73102.getClass(), "data", term73106);
        setField(term73102, term73102.getClass(), "label", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Validator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = Class.forName("org.graph4j.Edge");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term73102;
        callMethod(klass, "containsEdge", argTypes, null, args);
    }

};


