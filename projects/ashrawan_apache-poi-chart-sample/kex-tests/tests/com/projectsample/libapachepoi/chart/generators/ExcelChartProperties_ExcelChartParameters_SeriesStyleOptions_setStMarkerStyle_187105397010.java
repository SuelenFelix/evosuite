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

public class ExcelChartProperties_ExcelChartParameters_SeriesStyleOptions_setStMarkerStyle_187105397010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85388;
     Object enum165;

    public ExcelChartProperties_ExcelChartParameters_SeriesStyleOptions_setStMarkerStyle_187105397010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term85459 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelFillType");
        Field term85458 = ((Class) term85459).getDeclaredField((String) "PATTERN");
        ((Field) term85458).setAccessible(true);
        Object enum163 = ((Field) term85458).get((Object) null);
        Class<? extends Object> term85917 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelMarkerStyle");
        Field term85916 = ((Class) term85917).getDeclaredField((String) "SQUARE");
        ((Field) term85916).setAccessible(true);
        Object enum164 = ((Field) term85916).get((Object) null);
        term85388 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters$SeriesStyleOptions"));
        setField(term85388, term85388.getClass(), "fillType", enum163);
        setField(term85388, term85388.getClass(), "stPresetPatternVal", "XtiurrVYKw");
        setField(term85388, term85388.getClass(), "hexColor", "rsumfoDNHa");
        setField(term85388, term85388.getClass(), "stMarkerStyle", enum164);
        setIntField(term85388, term85388.getClass(), "markerSize", 53410913);
        setIntField(term85388, term85388.getClass(), "transparencyPercent", -375014958);
        Class<? extends Object> term86367 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelMarkerStyle");
        Field term86366 = ((Class) term86367).getDeclaredField((String) "PLUS");
        ((Field) term86366).setAccessible(true);
        enum165 = ((Field) term86366).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters$SeriesStyleOptions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelMarkerStyle");
        Object[] args = new Object[1];
        args[0] = enum165;
        callMethod(klass, "setStMarkerStyle", argTypes, term85388, args);
    }

};


