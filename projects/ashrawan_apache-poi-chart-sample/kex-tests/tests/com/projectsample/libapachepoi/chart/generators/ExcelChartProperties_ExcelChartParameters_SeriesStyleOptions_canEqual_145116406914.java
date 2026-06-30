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

public class ExcelChartProperties_ExcelChartParameters_SeriesStyleOptions_canEqual_145116406914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89657;
     Object term89715;

    public ExcelChartProperties_ExcelChartParameters_SeriesStyleOptions_canEqual_145116406914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term89717 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelFillType");
        Field term89716 = ((Class) term89717).getDeclaredField((String) "SOLID");
        ((Field) term89716).setAccessible(true);
        Object enum172 = ((Field) term89716).get((Object) null);
        Class<? extends Object> term90169 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelMarkerStyle");
        Field term90168 = ((Class) term90169).getDeclaredField((String) "TRIANGLE");
        ((Field) term90168).setAccessible(true);
        Object enum173 = ((Field) term90168).get((Object) null);
        term89657 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters$SeriesStyleOptions"));
        setField(term89657, term89657.getClass(), "fillType", enum172);
        setField(term89657, term89657.getClass(), "stPresetPatternVal", "bycpZjxXFn");
        setField(term89657, term89657.getClass(), "hexColor", "jQWttOAiwL");
        setField(term89657, term89657.getClass(), "stMarkerStyle", enum173);
        setIntField(term89657, term89657.getClass(), "markerSize", -1963464809);
        setIntField(term89657, term89657.getClass(), "transparencyPercent", 71190297);
        term89715 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters$SeriesStyleOptions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term89715;
        callMethod(klass, "canEqual", argTypes, term89657, args);
    }

};


