package org.graph4j;

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
import static org.graph4j.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class Edge_label_101481860513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108271;

    public Edge_label_101481860513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term108276 = new Double(0.8448572663497166);
        Double term108278 = new Double(0.44427267003047954);
        Double term108280 = new Double(0.6510046609054884);
        Double term108282 = new Double(0.7348952452308307);
        Double term108284 = new Double(0.3554167808758565);
        term108271 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term108275 = (Object[]) newArray("java.lang.Double", 5);
        setBooleanField(term108271, term108271.getClass(), "directed", false);
        setIntField(term108271, term108271.getClass(), "source", 903044702);
        setIntField(term108271, term108271.getClass(), "target", 496575552);
        setElement(term108275, 0, term108276);
        setElement(term108275, 1, term108278);
        setElement(term108275, 2, term108280);
        setElement(term108275, 3, term108282);
        setElement(term108275, 4, term108284);
        setField(term108271, term108271.getClass(), "data", term108275);
        setField(term108271, term108271.getClass(), "label", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.Edge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "label", argTypes, term108271, args);
    }

};


