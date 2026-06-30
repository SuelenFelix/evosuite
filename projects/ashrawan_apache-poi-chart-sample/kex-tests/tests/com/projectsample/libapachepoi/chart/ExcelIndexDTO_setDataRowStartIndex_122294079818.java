package com.projectsample.libapachepoi.chart;

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
import static com.projectsample.libapachepoi.chart.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ExcelIndexDTO_setDataRowStartIndex_122294079818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73556;
     Object term73561;

    public ExcelIndexDTO_setDataRowStartIndex_122294079818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73556 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.ExcelIndexDTO"));
        setIntField(term73556, term73556.getClass(), "dataRowStartIndex", 0);
        setIntField(term73556, term73556.getClass(), "dataRowEndIndex", 0);
        setIntField(term73556, term73556.getClass(), "chartRowStartIndex", 0);
        setIntField(term73556, term73556.getClass(), "chartRowEndIndex", 0);
        term73561 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.ExcelIndexDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term73561;
        callMethod(klass, "setDataRowStartIndex", argTypes, term73556, args);
    }

};


