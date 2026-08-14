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

public class Edge_weight_57408385110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108225;

    public Edge_weight_57408385110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term108230 = new Double(0.11749444093040129);
        Double term108232 = new Double(0.12856990669752166);
        Double term108234 = new Double(0.7871693137371649);
        Double term108236 = new Double(0.4111991184653976);
        Double term108238 = new Double(0.3688320407866329);
        Double term108240 = new Double(0.7704283024189764);
        term108225 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term108229 = (Object[]) newArray("java.lang.Double", 6);
        setBooleanField(term108225, term108225.getClass(), "directed", false);
        setIntField(term108225, term108225.getClass(), "source", -268046415);
        setIntField(term108225, term108225.getClass(), "target", 25070635);
        setElement(term108229, 0, term108230);
        setElement(term108229, 1, term108232);
        setElement(term108229, 2, term108234);
        setElement(term108229, 3, term108236);
        setElement(term108229, 4, term108238);
        setElement(term108229, 5, term108240);
        setField(term108225, term108225.getClass(), "data", term108229);
        setField(term108225, term108225.getClass(), "label", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.Edge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "weight", argTypes, term108225, args);
    }

};


