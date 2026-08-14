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

public class PrometheusTextWriter_writeEscapedLabelValue_19870278225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term577;

    public PrometheusTextWriter_writeEscapedLabelValue_19870278225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term577 = newInstance(Class.forName("org.dhatim.dropwizard.prometheus.PrometheusTextWriter"));
        char[] term578 = (char[]) newCharArray(9);
        Object term588 = newInstance(Class.forName("java.lang.Object"));
        setField(term577, term577.getClass(), "out", null);
        setCharElement(term578, 0, 'l');
        setCharElement(term578, 1, 'J');
        setCharElement(term578, 2, 'A');
        setCharElement(term578, 3, 'E');
        setCharElement(term578, 4, 't');
        setCharElement(term578, 5, 'R');
        setCharElement(term578, 6, 'r');
        setCharElement(term578, 7, 'b');
        setCharElement(term578, 8, 'M');
        setField(term577, term577.getClass(), "writeBuffer", term578);
        setField(term577, term577.getClass(), "lock", term588);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.dhatim.dropwizard.prometheus.PrometheusTextWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LQFpaHEwXR";
        callMethod(klass, "writeEscapedLabelValue", argTypes, term577, args);
    }

};


