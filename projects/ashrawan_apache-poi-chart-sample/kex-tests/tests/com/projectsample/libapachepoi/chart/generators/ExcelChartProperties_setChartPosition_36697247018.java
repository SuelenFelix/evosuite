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

public class ExcelChartProperties_setChartPosition_36697247018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166051;

    public ExcelChartProperties_setChartPosition_36697247018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term166051 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties"));
        setField(term166051, term166051.getClass(), "chartPosition", null);
        setField(term166051, term166051.getClass(), "legendPosition", null);
        setField(term166051, term166051.getClass(), "chartTitle", null);
        setField(term166051, term166051.getClass(), "params", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelPosition");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setChartPosition", argTypes, term166051, args);
    }

};


