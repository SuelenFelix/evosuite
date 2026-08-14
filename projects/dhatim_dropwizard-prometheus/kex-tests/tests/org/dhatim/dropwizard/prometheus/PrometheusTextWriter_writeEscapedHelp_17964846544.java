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

public class PrometheusTextWriter_writeEscapedHelp_17964846544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term552;

    public PrometheusTextWriter_writeEscapedHelp_17964846544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term552 = newInstance(Class.forName("org.dhatim.dropwizard.prometheus.PrometheusTextWriter"));
        char[] term553 = (char[]) newCharArray(0);
        Object term554 = newInstance(Class.forName("java.lang.Object"));
        setField(term552, term552.getClass(), "out", null);
        setField(term552, term552.getClass(), "writeBuffer", term553);
        setField(term552, term552.getClass(), "lock", term554);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.dhatim.dropwizard.prometheus.PrometheusTextWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MxlszYVzRf";
        callMethod(klass, "writeEscapedHelp", argTypes, term552, args);
    }

};


