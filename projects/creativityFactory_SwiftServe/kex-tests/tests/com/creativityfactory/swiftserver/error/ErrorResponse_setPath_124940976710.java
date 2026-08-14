package com.creativityfactory.swiftserver.error;

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
import static com.creativityfactory.swiftserver.error.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ErrorResponse_setPath_124940976710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term679;

    public ErrorResponse_setPath_124940976710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term679 = newInstance(Class.forName("com.creativityfactory.swiftserver.error.ErrorResponse"));
        Object term680 = newInstance(Class.forName("java.util.Date"));
        setLongField(term680, term680.getClass(), "fastTime", 1797203628025L);
        setField(term680, term680.getClass(), "cdate", null);
        setField(term679, term679.getClass(), "timestamp", term680);
        setIntField(term679, term679.getClass(), "status", 1725571209);
        setField(term679, term679.getClass(), "error", "TEParAifyi");
        setField(term679, term679.getClass(), "message", "OWDIEULEFu");
        setField(term679, term679.getClass(), "path", "dWRymuLBtr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.creativityfactory.swiftserver.error.ErrorResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AijpHYOFuy";
        callMethod(klass, "setPath", argTypes, term679, args);
    }

};


