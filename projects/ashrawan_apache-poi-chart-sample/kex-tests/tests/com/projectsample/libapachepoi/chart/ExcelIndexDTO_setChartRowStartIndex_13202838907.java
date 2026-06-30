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

public class ExcelIndexDTO_setChartRowStartIndex_13202838907 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73500;
     Object term73505;

    public ExcelIndexDTO_setChartRowStartIndex_13202838907() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73500 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.ExcelIndexDTO"));
        setIntField(term73500, term73500.getClass(), "dataRowStartIndex", -1945706126);
        setIntField(term73500, term73500.getClass(), "dataRowEndIndex", 1152356969);
        setIntField(term73500, term73500.getClass(), "chartRowStartIndex", -1667990367);
        setIntField(term73500, term73500.getClass(), "chartRowEndIndex", -1214628358);
        term73505 = new Integer(1102721075);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.ExcelIndexDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term73505;
        callMethod(klass, "setChartRowStartIndex", argTypes, term73500, args);
    }

};


