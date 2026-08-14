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
import java.lang.Object;
import java.lang.String;

public class PrometheusTextWriter_writeType_16482725552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58;
     Object enum0;

    public PrometheusTextWriter_writeType_16482725552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58 = newInstance(Class.forName("org.dhatim.dropwizard.prometheus.PrometheusTextWriter"));
        char[] term59 = (char[]) newCharArray(4);
        Object term64 = newInstance(Class.forName("java.lang.Object"));
        setField(term58, term58.getClass(), "out", null);
        setCharElement(term59, 0, 'n');
        setCharElement(term59, 1, 'Z');
        setCharElement(term59, 2, 't');
        setCharElement(term59, 3, 'T');
        setField(term58, term58.getClass(), "writeBuffer", term59);
        setField(term58, term58.getClass(), "lock", term64);
        Class<? extends Object> term212 = Class.forName((String) "org.dhatim.dropwizard.prometheus.MetricType");
        Field term211 = ((Class) term212).getDeclaredField((String) "SUMMARY");
        ((Field) term211).setAccessible(true);
        enum0 = ((Field) term211).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.dhatim.dropwizard.prometheus.PrometheusTextWriter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.dhatim.dropwizard.prometheus.MetricType");
        Object[] args = new Object[2];
        args[0] = "MuLcgQHgqz";
        args[1] = enum0;
        callMethod(klass, "writeType", argTypes, term58, args);
    }

};


