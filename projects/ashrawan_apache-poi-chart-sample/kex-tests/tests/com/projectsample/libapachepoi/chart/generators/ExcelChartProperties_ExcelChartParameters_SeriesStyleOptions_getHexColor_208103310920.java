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

public class ExcelChartProperties_ExcelChartParameters_SeriesStyleOptions_getHexColor_208103310920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92528;

    public ExcelChartProperties_ExcelChartParameters_SeriesStyleOptions_getHexColor_208103310920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92528 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters$SeriesStyleOptions"));
        setField(term92528, term92528.getClass(), "fillType", null);
        setField(term92528, term92528.getClass(), "stPresetPatternVal", null);
        setField(term92528, term92528.getClass(), "hexColor", null);
        setField(term92528, term92528.getClass(), "stMarkerStyle", null);
        setIntField(term92528, term92528.getClass(), "markerSize", 0);
        setIntField(term92528, term92528.getClass(), "transparencyPercent", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters$SeriesStyleOptions");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHexColor", argTypes, term92528, args);
    }

};


