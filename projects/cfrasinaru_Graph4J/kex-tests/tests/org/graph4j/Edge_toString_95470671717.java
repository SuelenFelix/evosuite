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
     Object term108346;

    public Edge_toString_95470671717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term108351 = new Double(0.9218672416580571);
        Double term108353 = new Double(0.7496470784921199);
        Double term108355 = new Double(0.9242863644075359);
        Double term108357 = new Double(0.0973418973835607);
        Double term108359 = new Double(0.32541509985477524);
        Double term108361 = new Double(0.10624377997246504);
        Double term108363 = new Double(0.5515266472781634);
        term108346 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term108350 = (Object[]) newArray("java.lang.Double", 7);
        setBooleanField(term108346, term108346.getClass(), "directed", true);
        setIntField(term108346, term108346.getClass(), "source", 711881458);
        setIntField(term108346, term108346.getClass(), "target", -1210162042);
        setElement(term108350, 0, term108351);
        setElement(term108350, 1, term108353);
        setElement(term108350, 2, term108355);
        setElement(term108350, 3, term108357);
        setElement(term108350, 4, term108359);
        setElement(term108350, 5, term108361);
        setElement(term108350, 6, term108363);
        setField(term108346, term108346.getClass(), "data", term108350);
        setField(term108346, term108346.getClass(), "label", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.Edge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term108346, args);
    }

};


