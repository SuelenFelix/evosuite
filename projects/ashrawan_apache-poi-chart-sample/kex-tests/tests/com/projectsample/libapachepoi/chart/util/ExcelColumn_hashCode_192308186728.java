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

public class ExcelColumn_hashCode_192308186728 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term509;

    public ExcelColumn_hashCode_192308186728() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term509 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.util.ExcelColumn"));
        setField(term509, term509.getClass(), "colName", null);
        setIntField(term509, term509.getClass(), "rowStart", 0);
        setIntField(term509, term509.getClass(), "rowEnd", 0);
        setIntField(term509, term509.getClass(), "columnStart", 0);
        setIntField(term509, term509.getClass(), "columnEnd", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.util.ExcelColumn");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term509, args);
    }

};


