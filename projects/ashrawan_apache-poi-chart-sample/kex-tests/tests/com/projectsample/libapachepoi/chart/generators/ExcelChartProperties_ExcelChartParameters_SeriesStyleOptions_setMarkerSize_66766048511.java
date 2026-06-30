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
import java.lang.Integer;

public class ExcelChartProperties_ExcelChartParameters_SeriesStyleOptions_setMarkerSize_66766048511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86810;
     Object term86860;

    public ExcelChartProperties_ExcelChartParameters_SeriesStyleOptions_setMarkerSize_66766048511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term86863 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelFillType");
        Field term86862 = ((Class) term86863).getDeclaredField((String) "SOLID");
        ((Field) term86862).setAccessible(true);
        Object enum166 = ((Field) term86862).get((Object) null);
        Class<? extends Object> term87315 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelMarkerStyle");
        Field term87314 = ((Class) term87315).getDeclaredField((String) "AUTO");
        ((Field) term87314).setAccessible(true);
        Object enum167 = ((Field) term87314).get((Object) null);
        term86810 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters$SeriesStyleOptions"));
        setField(term86810, term86810.getClass(), "fillType", enum166);
        setField(term86810, term86810.getClass(), "stPresetPatternVal", "ceCWHUTQUM");
        setField(term86810, term86810.getClass(), "hexColor", "LrqwfrKKtS");
        setField(term86810, term86810.getClass(), "stMarkerStyle", enum167);
        setIntField(term86810, term86810.getClass(), "markerSize", 1107176718);
        setIntField(term86810, term86810.getClass(), "transparencyPercent", 480137250);
        term86860 = new Integer(-341152642);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters$SeriesStyleOptions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term86860;
        callMethod(klass, "setMarkerSize", argTypes, term86810, args);
    }

};


