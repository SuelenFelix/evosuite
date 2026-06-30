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

public class ExcelChartProperties_ExcelChartParameters_setScatterStyle_198804590556 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70076;

    public ExcelChartProperties_ExcelChartParameters_setScatterStyle_198804590556() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70076 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters"));
        setField(term70076, term70076.getClass(), "type", null);
        setField(term70076, term70076.getClass(), "categoryAxisTitle", null);
        setField(term70076, term70076.getClass(), "valueAxisTitle", null);
        setField(term70076, term70076.getClass(), "categoryColumns", null);
        setField(term70076, term70076.getClass(), "dataRows", null);
        setField(term70076, term70076.getClass(), "barGrouping", null);
        setField(term70076, term70076.getClass(), "barDirection", null);
        setIntField(term70076, term70076.getClass(), "barSeriesOverlapPercent", 0);
        setField(term70076, term70076.getClass(), "scatterStyle", null);
        setBooleanField(term70076, term70076.getClass(), "lineIsSmooth", false);
        setBooleanField(term70076, term70076.getClass(), "plotOnSecondaryAxis", false);
        setBooleanField(term70076, term70076.getClass(), "useSameMinMaxScaleAsPrimary", false);
        setField(term70076, term70076.getClass(), "colorSet", null);
        setField(term70076, term70076.getClass(), "seriesStyleOptionsMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelScatterStyle");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setScatterStyle", argTypes, term70076, args);
    }

};


