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

public class ExcelColumn_getColName_6489822180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public ExcelColumn_getColName_6489822180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.util.ExcelColumn"));
        setField(term1, term1.getClass(), "colName", "PAEBtnZtTD");
        setIntField(term1, term1.getClass(), "rowStart", 568599855);
        setIntField(term1, term1.getClass(), "rowEnd", 1162663216);
        setIntField(term1, term1.getClass(), "columnStart", 1484323161);
        setIntField(term1, term1.getClass(), "columnEnd", 391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.util.ExcelColumn");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getColName", argTypes, term1, args);
    }

};


