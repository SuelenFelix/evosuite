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
import java.lang.String;
import java.lang.Object;

public class ExcelChartProperties_ExcelChartParameters_SeriesStyleOptions_getTransparencyPercent_6426924716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81515;

    public ExcelChartProperties_ExcelChartParameters_SeriesStyleOptions_getTransparencyPercent_6426924716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term81562 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelFillType");
        Field term81561 = ((Class) term81562).getDeclaredField((String) "PATTERN");
        ((Field) term81561).setAccessible(true);
        Object enum155 = ((Field) term81561).get((Object) null);
        Class<? extends Object> term82020 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelMarkerStyle");
        Field term82019 = ((Class) term82020).getDeclaredField((String) "X");
        ((Field) term82019).setAccessible(true);
        Object enum156 = ((Field) term82019).get((Object) null);
        term81515 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters$SeriesStyleOptions"));
        setField(term81515, term81515.getClass(), "fillType", enum155);
        setField(term81515, term81515.getClass(), "stPresetPatternVal", "IlBhdrCvHq");
        setField(term81515, term81515.getClass(), "hexColor", "OirVUQhauU");
        setField(term81515, term81515.getClass(), "stMarkerStyle", enum156);
        setIntField(term81515, term81515.getClass(), "markerSize", -1963434938);
        setIntField(term81515, term81515.getClass(), "transparencyPercent", 906181092);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters$SeriesStyleOptions");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTransparencyPercent", argTypes, term81515, args);
    }

};


