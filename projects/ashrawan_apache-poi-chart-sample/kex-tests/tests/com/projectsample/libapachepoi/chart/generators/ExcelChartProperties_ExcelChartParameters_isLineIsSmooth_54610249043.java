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

public class ExcelChartProperties_ExcelChartParameters_isLineIsSmooth_54610249043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70009;

    public ExcelChartProperties_ExcelChartParameters_isLineIsSmooth_54610249043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70009 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters"));
        setField(term70009, term70009.getClass(), "type", null);
        setField(term70009, term70009.getClass(), "categoryAxisTitle", null);
        setField(term70009, term70009.getClass(), "valueAxisTitle", null);
        setField(term70009, term70009.getClass(), "categoryColumns", null);
        setField(term70009, term70009.getClass(), "dataRows", null);
        setField(term70009, term70009.getClass(), "barGrouping", null);
        setField(term70009, term70009.getClass(), "barDirection", null);
        setIntField(term70009, term70009.getClass(), "barSeriesOverlapPercent", 0);
        setField(term70009, term70009.getClass(), "scatterStyle", null);
        setBooleanField(term70009, term70009.getClass(), "lineIsSmooth", false);
        setBooleanField(term70009, term70009.getClass(), "plotOnSecondaryAxis", false);
        setBooleanField(term70009, term70009.getClass(), "useSameMinMaxScaleAsPrimary", false);
        setField(term70009, term70009.getClass(), "colorSet", null);
        setField(term70009, term70009.getClass(), "seriesStyleOptionsMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isLineIsSmooth", argTypes, term70009, args);
    }

};


