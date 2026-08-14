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
import java.util.LinkedHashMap;
import java.lang.Double;

public class PrometheusTextWriter_writeSample_20144563193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term454;
     Object term472;
     Object term537;

    public PrometheusTextWriter_writeSample_20144563193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term454 = newInstance(Class.forName("org.dhatim.dropwizard.prometheus.PrometheusTextWriter"));
        char[] term455 = (char[]) newCharArray(3);
        Object term459 = newInstance(Class.forName("java.lang.Object"));
        setField(term454, term454.getClass(), "out", null);
        setCharElement(term455, 0, 'D');
        setCharElement(term455, 1, 's');
        setCharElement(term455, 2, 'j');
        setField(term454, term454.getClass(), "writeBuffer", term455);
        setField(term454, term454.getClass(), "lock", term459);
        term472 = new LinkedHashMap();
        term537 = new Double(0.13238746331190498);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.dhatim.dropwizard.prometheus.PrometheusTextWriter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.Map");
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = "xxtlPwDYFs";
        args[1] = term472;
        args[2] = term537;
        callMethod(klass, "writeSample", argTypes, term454, args);
    }

};


