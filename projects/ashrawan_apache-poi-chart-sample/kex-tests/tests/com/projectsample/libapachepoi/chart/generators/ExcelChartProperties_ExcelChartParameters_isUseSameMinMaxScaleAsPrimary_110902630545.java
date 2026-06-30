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

public class ExcelChartProperties_ExcelChartParameters_isUseSameMinMaxScaleAsPrimary_110902630545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70019;

    public ExcelChartProperties_ExcelChartParameters_isUseSameMinMaxScaleAsPrimary_110902630545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70019 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters"));
        setField(term70019, term70019.getClass(), "type", null);
        setField(term70019, term70019.getClass(), "categoryAxisTitle", null);
        setField(term70019, term70019.getClass(), "valueAxisTitle", null);
        setField(term70019, term70019.getClass(), "categoryColumns", null);
        setField(term70019, term70019.getClass(), "dataRows", null);
        setField(term70019, term70019.getClass(), "barGrouping", null);
        setField(term70019, term70019.getClass(), "barDirection", null);
        setIntField(term70019, term70019.getClass(), "barSeriesOverlapPercent", 0);
        setField(term70019, term70019.getClass(), "scatterStyle", null);
        setBooleanField(term70019, term70019.getClass(), "lineIsSmooth", false);
        setBooleanField(term70019, term70019.getClass(), "plotOnSecondaryAxis", false);
        setBooleanField(term70019, term70019.getClass(), "useSameMinMaxScaleAsPrimary", false);
        setField(term70019, term70019.getClass(), "colorSet", null);
        setField(term70019, term70019.getClass(), "seriesStyleOptionsMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isUseSameMinMaxScaleAsPrimary", argTypes, term70019, args);
    }

};


