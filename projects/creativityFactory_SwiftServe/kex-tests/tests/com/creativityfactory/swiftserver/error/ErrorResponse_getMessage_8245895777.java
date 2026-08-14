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

public class ErrorResponse_getMessage_8245895777 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term447;

    public ErrorResponse_getMessage_8245895777() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term447 = newInstance(Class.forName("com.creativityfactory.swiftserver.error.ErrorResponse"));
        Object term448 = newInstance(Class.forName("java.util.Date"));
        setLongField(term448, term448.getClass(), "fastTime", 1495357463288L);
        setField(term448, term448.getClass(), "cdate", null);
        setField(term447, term447.getClass(), "timestamp", term448);
        setIntField(term447, term447.getClass(), "status", -2038273078);
        setField(term447, term447.getClass(), "error", "pCTimMblYc");
        setField(term447, term447.getClass(), "message", "hNxWaHcfhY");
        setField(term447, term447.getClass(), "path", "RkybSrpybU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.creativityfactory.swiftserver.error.ErrorResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMessage", argTypes, term447, args);
    }

};


