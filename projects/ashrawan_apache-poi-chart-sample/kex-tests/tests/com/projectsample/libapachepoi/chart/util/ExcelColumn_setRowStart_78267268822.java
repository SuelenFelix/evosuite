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
import java.lang.Integer;

public class ExcelColumn_setRowStart_78267268822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term471;
     Object term476;

    public ExcelColumn_setRowStart_78267268822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term471 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.util.ExcelColumn"));
        setField(term471, term471.getClass(), "colName", null);
        setIntField(term471, term471.getClass(), "rowStart", 0);
        setIntField(term471, term471.getClass(), "rowEnd", 0);
        setIntField(term471, term471.getClass(), "columnStart", 0);
        setIntField(term471, term471.getClass(), "columnEnd", 0);
        term476 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.util.ExcelColumn");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term476;
        callMethod(klass, "setRowStart", argTypes, term471, args);
    }

};


