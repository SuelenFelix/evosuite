package org.dhatim.dropwizard.prometheus;

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
import static org.dhatim.dropwizard.prometheus.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PrometheusTextWriter_writeType_16482725559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term623;

    public PrometheusTextWriter_writeType_16482725559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term623 = newInstance(Class.forName("org.dhatim.dropwizard.prometheus.PrometheusTextWriter"));
        setField(term623, term623.getClass(), "out", null);
        setField(term623, term623.getClass(), "writeBuffer", null);
        setField(term623, term623.getClass(), "lock", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.dhatim.dropwizard.prometheus.PrometheusTextWriter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.dhatim.dropwizard.prometheus.MetricType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "writeType", argTypes, term623, args);
    }

};


