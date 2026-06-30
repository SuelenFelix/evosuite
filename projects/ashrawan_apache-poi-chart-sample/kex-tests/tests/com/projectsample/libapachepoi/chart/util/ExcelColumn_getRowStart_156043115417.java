package com.projectsample.libapachepoi.chart.util;

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
import static com.projectsample.libapachepoi.chart.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ExcelColumn_getRowStart_156043115417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term446;

    public ExcelColumn_getRowStart_156043115417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term446 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.util.ExcelColumn"));
        setField(term446, term446.getClass(), "colName", null);
        setIntField(term446, term446.getClass(), "rowStart", 0);
        setIntField(term446, term446.getClass(), "rowEnd", 0);
        setIntField(term446, term446.getClass(), "columnStart", 0);
        setIntField(term446, term446.getClass(), "columnEnd", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.util.ExcelColumn");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRowStart", argTypes, term446, args);
    }

};


