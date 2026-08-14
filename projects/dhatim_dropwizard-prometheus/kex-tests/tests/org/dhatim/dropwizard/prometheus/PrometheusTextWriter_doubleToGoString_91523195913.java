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
import java.lang.Double;

public class PrometheusTextWriter_doubleToGoString_91523195913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term629;
     Object term630;

    public PrometheusTextWriter_doubleToGoString_91523195913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term629 = newInstance(Class.forName("org.dhatim.dropwizard.prometheus.PrometheusTextWriter"));
        setField(term629, term629.getClass(), "out", null);
        setField(term629, term629.getClass(), "writeBuffer", null);
        setField(term629, term629.getClass(), "lock", null);
        term630 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.dhatim.dropwizard.prometheus.PrometheusTextWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term630;
        callMethod(klass, "doubleToGoString", argTypes, term629, args);
    }

};


