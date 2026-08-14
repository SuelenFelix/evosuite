package org.graph4j.flow;

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
import static org.graph4j.flow.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class MaximumFlowAlgorithm_getFlowValue_16700128640 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;

    public MaximumFlowAlgorithm_getFlowValue_16700128640() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term28 = new Double(0.13238746331190498);
        Double term30 = new Double(0.3455959125047594);
        Double term32 = new Double(0.5523635872663106);
        Double term34 = new Double(0.544608645520025);
        Double term36 = new Double(0.28570734989730284);
        term23 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term27 = (Object[]) newArray("java.lang.Double", 5);
        setBooleanField(term23, term23.getClass(), "directed", false);
        setIntField(term23, term23.getClass(), "source", 568599855);
        setIntField(term23, term23.getClass(), "target", 1162663216);
        setElement(term27, 0, term28);
        setElement(term27, 1, term30);
        setElement(term27, 2, term32);
        setElement(term27, 3, term34);
        setElement(term27, 4, term36);
        setField(term23, term23.getClass(), "data", term27);
        setField(term23, term23.getClass(), "label", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.flow.MaximumFlowAlgorithm");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.Edge");
        Object[] args = new Object[1];
        args[0] = term23;
        callMethod(klass, "getFlowValue", argTypes, null, args);
    }

};


