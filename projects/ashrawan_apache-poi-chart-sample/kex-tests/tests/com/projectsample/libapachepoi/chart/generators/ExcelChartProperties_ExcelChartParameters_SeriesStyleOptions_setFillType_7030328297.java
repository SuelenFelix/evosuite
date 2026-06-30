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

public class ExcelChartProperties_ExcelChartParameters_SeriesStyleOptions_setFillType_7030328297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82454;
     Object enum157;

    public ExcelChartProperties_ExcelChartParameters_SeriesStyleOptions_setFillType_7030328297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term82511 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelFillType");
        Field term82510 = ((Class) term82511).getDeclaredField((String) "PATTERN");
        ((Field) term82510).setAccessible(true);
        enum157 = ((Field) term82510).get((Object) null);
        Class<? extends Object> term82969 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelMarkerStyle");
        Field term82968 = ((Class) term82969).getDeclaredField((String) "SQUARE");
        ((Field) term82968).setAccessible(true);
        Object enum158 = ((Field) term82968).get((Object) null);
        term82454 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters$SeriesStyleOptions"));
        setField(term82454, term82454.getClass(), "fillType", enum157);
        setField(term82454, term82454.getClass(), "stPresetPatternVal", "GLbyDfbNZI");
        setField(term82454, term82454.getClass(), "hexColor", "oNLcCYDAsO");
        setField(term82454, term82454.getClass(), "stMarkerStyle", enum158);
        setIntField(term82454, term82454.getClass(), "markerSize", 1045657203);
        setIntField(term82454, term82454.getClass(), "transparencyPercent", 1386130016);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters$SeriesStyleOptions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelFillType");
        Object[] args = new Object[1];
        args[0] = enum157;
        callMethod(klass, "setFillType", argTypes, term82454, args);
    }

};


