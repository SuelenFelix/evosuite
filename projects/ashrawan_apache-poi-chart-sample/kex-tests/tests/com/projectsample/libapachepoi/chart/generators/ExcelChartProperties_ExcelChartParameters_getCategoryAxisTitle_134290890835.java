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

public class ExcelChartProperties_ExcelChartParameters_getCategoryAxisTitle_134290890835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69969;

    public ExcelChartProperties_ExcelChartParameters_getCategoryAxisTitle_134290890835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69969 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters"));
        setField(term69969, term69969.getClass(), "type", null);
        setField(term69969, term69969.getClass(), "categoryAxisTitle", null);
        setField(term69969, term69969.getClass(), "valueAxisTitle", null);
        setField(term69969, term69969.getClass(), "categoryColumns", null);
        setField(term69969, term69969.getClass(), "dataRows", null);
        setField(term69969, term69969.getClass(), "barGrouping", null);
        setField(term69969, term69969.getClass(), "barDirection", null);
        setIntField(term69969, term69969.getClass(), "barSeriesOverlapPercent", 0);
        setField(term69969, term69969.getClass(), "scatterStyle", null);
        setBooleanField(term69969, term69969.getClass(), "lineIsSmooth", false);
        setBooleanField(term69969, term69969.getClass(), "plotOnSecondaryAxis", false);
        setBooleanField(term69969, term69969.getClass(), "useSameMinMaxScaleAsPrimary", false);
        setField(term69969, term69969.getClass(), "colorSet", null);
        setField(term69969, term69969.getClass(), "seriesStyleOptionsMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCategoryAxisTitle", argTypes, term69969, args);
    }

};


