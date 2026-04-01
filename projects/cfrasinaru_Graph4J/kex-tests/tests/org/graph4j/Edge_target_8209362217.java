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

public class Edge_target_8209362217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108173;

    public Edge_target_8209362217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term108178 = new Double(0.61109721071905);
        Double term108180 = new Double(0.7005595888007458);
        term108173 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term108177 = (Object[]) newArray("java.lang.Double", 2);
        setBooleanField(term108173, term108173.getClass(), "directed", false);
        setIntField(term108173, term108173.getClass(), "source", 249979911);
        setIntField(term108173, term108173.getClass(), "target", -1015808608);
        setElement(term108177, 0, term108178);
        setElement(term108177, 1, term108180);
        setField(term108173, term108173.getClass(), "data", term108177);
        setField(term108173, term108173.getClass(), "label", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.Edge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "target", argTypes, term108173, args);
    }

};


