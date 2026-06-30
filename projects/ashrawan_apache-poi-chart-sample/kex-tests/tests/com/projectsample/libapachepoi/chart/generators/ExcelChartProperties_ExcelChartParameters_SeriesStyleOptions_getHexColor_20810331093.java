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

public class ExcelChartProperties_ExcelChartParameters_SeriesStyleOptions_getHexColor_20810331093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78678;

    public ExcelChartProperties_ExcelChartParameters_SeriesStyleOptions_getHexColor_20810331093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term78729 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelFillType");
        Field term78728 = ((Class) term78729).getDeclaredField((String) "SOLID");
        ((Field) term78728).setAccessible(true);
        Object enum149 = ((Field) term78728).get((Object) null);
        Class<? extends Object> term79181 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelMarkerStyle");
        Field term79180 = ((Class) term79181).getDeclaredField((String) "DASH");
        ((Field) term79180).setAccessible(true);
        Object enum150 = ((Field) term79180).get((Object) null);
        term78678 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters$SeriesStyleOptions"));
        setField(term78678, term78678.getClass(), "fillType", enum149);
        setField(term78678, term78678.getClass(), "stPresetPatternVal", "vLTbaoAxBm");
        setField(term78678, term78678.getClass(), "hexColor", "BXTjEyEZxD");
        setField(term78678, term78678.getClass(), "stMarkerStyle", enum150);
        setIntField(term78678, term78678.getClass(), "markerSize", 1532716628);
        setIntField(term78678, term78678.getClass(), "transparencyPercent", -1801760683);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters$SeriesStyleOptions");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHexColor", argTypes, term78678, args);
    }

};


