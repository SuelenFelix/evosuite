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

public class ExcelChartProperties_ExcelChartParameters_SeriesStyleOptions_setTransparencyPercent_144314625312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87758;
     Object term87807;

    public ExcelChartProperties_ExcelChartParameters_SeriesStyleOptions_setTransparencyPercent_144314625312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term87810 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelFillType");
        Field term87809 = ((Class) term87810).getDeclaredField((String) "NONE");
        ((Field) term87809).setAccessible(true);
        Object enum168 = ((Field) term87809).get((Object) null);
        Class<? extends Object> term88259 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelMarkerStyle");
        Field term88258 = ((Class) term88259).getDeclaredField((String) "STAR");
        ((Field) term88258).setAccessible(true);
        Object enum169 = ((Field) term88258).get((Object) null);
        term87758 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters$SeriesStyleOptions"));
        setField(term87758, term87758.getClass(), "fillType", enum168);
        setField(term87758, term87758.getClass(), "stPresetPatternVal", "ZUdnQXfzCI");
        setField(term87758, term87758.getClass(), "hexColor", "EULDrUNQvw");
        setField(term87758, term87758.getClass(), "stMarkerStyle", enum169);
        setIntField(term87758, term87758.getClass(), "markerSize", -2015854073);
        setIntField(term87758, term87758.getClass(), "transparencyPercent", 538259104);
        term87807 = new Integer(96566506);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters$SeriesStyleOptions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term87807;
        callMethod(klass, "setTransparencyPercent", argTypes, term87758, args);
    }

};


