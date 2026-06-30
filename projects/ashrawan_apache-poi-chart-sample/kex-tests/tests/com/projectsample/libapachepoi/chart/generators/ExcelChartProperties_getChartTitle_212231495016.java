package com.projectsample.libapachepoi.chart.generators;

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
import static com.projectsample.libapachepoi.chart.generators.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ExcelChartProperties_getChartTitle_212231495016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166049;

    public ExcelChartProperties_getChartTitle_212231495016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term166049 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties"));
        setField(term166049, term166049.getClass(), "chartPosition", null);
        setField(term166049, term166049.getClass(), "legendPosition", null);
        setField(term166049, term166049.getClass(), "chartTitle", null);
        setField(term166049, term166049.getClass(), "params", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChartTitle", argTypes, term166049, args);
    }

};


