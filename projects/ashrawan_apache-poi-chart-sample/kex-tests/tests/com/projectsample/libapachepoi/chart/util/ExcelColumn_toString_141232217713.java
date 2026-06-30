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

public class ExcelColumn_toString_141232217713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term384;

    public ExcelColumn_toString_141232217713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term384 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.util.ExcelColumn"));
        setField(term384, term384.getClass(), "colName", "oVcInYnLWB");
        setIntField(term384, term384.getClass(), "rowStart", 458147407);
        setIntField(term384, term384.getClass(), "rowEnd", -184153539);
        setIntField(term384, term384.getClass(), "columnStart", 493620644);
        setIntField(term384, term384.getClass(), "columnEnd", 1328271830);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.util.ExcelColumn");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term384, args);
    }

};


