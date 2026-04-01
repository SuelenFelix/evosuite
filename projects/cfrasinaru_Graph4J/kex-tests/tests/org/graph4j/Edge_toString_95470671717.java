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

public class Edge_toString_95470671717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108343;

    public Edge_toString_95470671717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term108348 = new Double(0.9218672416580571);
        Double term108350 = new Double(0.7496470784921199);
        Double term108352 = new Double(0.9242863644075359);
        Double term108354 = new Double(0.0973418973835607);
        Double term108356 = new Double(0.32541509985477524);
        Double term108358 = new Double(0.10624377997246504);
        Double term108360 = new Double(0.5515266472781634);
        term108343 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term108347 = (Object[]) newArray("java.lang.Double", 7);
        setBooleanField(term108343, term108343.getClass(), "directed", true);
        setIntField(term108343, term108343.getClass(), "source", 711881458);
        setIntField(term108343, term108343.getClass(), "target", -1210162042);
        setElement(term108347, 0, term108348);
        setElement(term108347, 1, term108350);
        setElement(term108347, 2, term108352);
        setElement(term108347, 3, term108354);
        setElement(term108347, 4, term108356);
        setElement(term108347, 5, term108358);
        setElement(term108347, 6, term108360);
        setField(term108343, term108343.getClass(), "data", term108347);
        setField(term108343, term108343.getClass(), "label", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.Edge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term108343, args);
    }

};


