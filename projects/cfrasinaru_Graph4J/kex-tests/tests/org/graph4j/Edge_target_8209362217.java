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
     Object term108176;

    public Edge_target_8209362217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term108181 = new Double(0.61109721071905);
        Double term108183 = new Double(0.7005595888007458);
        term108176 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term108180 = (Object[]) newArray("java.lang.Double", 2);
        setBooleanField(term108176, term108176.getClass(), "directed", false);
        setIntField(term108176, term108176.getClass(), "source", 249979911);
        setIntField(term108176, term108176.getClass(), "target", -1015808608);
        setElement(term108180, 0, term108181);
        setElement(term108180, 1, term108183);
        setField(term108176, term108176.getClass(), "data", term108180);
        setField(term108176, term108176.getClass(), "label", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.Edge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "target", argTypes, term108176, args);
    }

};


