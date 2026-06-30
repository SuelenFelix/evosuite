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

public class ExcelChartProperties_ExcelChartParameters_SeriesStyleOptions_setMarkerSize_66766048528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92552;
     Object term92555;

    public ExcelChartProperties_ExcelChartParameters_SeriesStyleOptions_setMarkerSize_66766048528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92552 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters$SeriesStyleOptions"));
        setField(term92552, term92552.getClass(), "fillType", null);
        setField(term92552, term92552.getClass(), "stPresetPatternVal", null);
        setField(term92552, term92552.getClass(), "hexColor", null);
        setField(term92552, term92552.getClass(), "stMarkerStyle", null);
        setIntField(term92552, term92552.getClass(), "markerSize", 0);
        setIntField(term92552, term92552.getClass(), "transparencyPercent", 0);
        term92555 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters$SeriesStyleOptions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term92555;
        callMethod(klass, "setMarkerSize", argTypes, term92552, args);
    }

};


