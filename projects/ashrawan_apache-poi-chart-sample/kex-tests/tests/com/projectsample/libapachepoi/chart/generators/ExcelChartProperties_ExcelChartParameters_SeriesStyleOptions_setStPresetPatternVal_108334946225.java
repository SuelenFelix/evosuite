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

public class ExcelChartProperties_ExcelChartParameters_SeriesStyleOptions_setStPresetPatternVal_108334946225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92543;

    public ExcelChartProperties_ExcelChartParameters_SeriesStyleOptions_setStPresetPatternVal_108334946225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92543 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters$SeriesStyleOptions"));
        setField(term92543, term92543.getClass(), "fillType", null);
        setField(term92543, term92543.getClass(), "stPresetPatternVal", null);
        setField(term92543, term92543.getClass(), "hexColor", null);
        setField(term92543, term92543.getClass(), "stMarkerStyle", null);
        setIntField(term92543, term92543.getClass(), "markerSize", 0);
        setIntField(term92543, term92543.getClass(), "transparencyPercent", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters$SeriesStyleOptions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setStPresetPatternVal", argTypes, term92543, args);
    }

};


