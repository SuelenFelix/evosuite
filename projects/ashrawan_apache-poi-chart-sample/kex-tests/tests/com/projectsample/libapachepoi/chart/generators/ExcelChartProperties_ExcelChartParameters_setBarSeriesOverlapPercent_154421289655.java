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
import java.lang.Integer;

public class ExcelChartProperties_ExcelChartParameters_setBarSeriesOverlapPercent_154421289655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70069;
     Object term70074;

    public ExcelChartProperties_ExcelChartParameters_setBarSeriesOverlapPercent_154421289655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70069 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters"));
        setField(term70069, term70069.getClass(), "type", null);
        setField(term70069, term70069.getClass(), "categoryAxisTitle", null);
        setField(term70069, term70069.getClass(), "valueAxisTitle", null);
        setField(term70069, term70069.getClass(), "categoryColumns", null);
        setField(term70069, term70069.getClass(), "dataRows", null);
        setField(term70069, term70069.getClass(), "barGrouping", null);
        setField(term70069, term70069.getClass(), "barDirection", null);
        setIntField(term70069, term70069.getClass(), "barSeriesOverlapPercent", 0);
        setField(term70069, term70069.getClass(), "scatterStyle", null);
        setBooleanField(term70069, term70069.getClass(), "lineIsSmooth", false);
        setBooleanField(term70069, term70069.getClass(), "plotOnSecondaryAxis", false);
        setBooleanField(term70069, term70069.getClass(), "useSameMinMaxScaleAsPrimary", false);
        setField(term70069, term70069.getClass(), "colorSet", null);
        setField(term70069, term70069.getClass(), "seriesStyleOptionsMap", null);
        term70074 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term70074;
        callMethod(klass, "setBarSeriesOverlapPercent", argTypes, term70069, args);
    }

};


