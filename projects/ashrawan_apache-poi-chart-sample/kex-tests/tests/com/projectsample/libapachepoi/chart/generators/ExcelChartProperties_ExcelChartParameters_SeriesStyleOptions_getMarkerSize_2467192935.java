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

public class ExcelChartProperties_ExcelChartParameters_SeriesStyleOptions_getMarkerSize_2467192935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80573;

    public ExcelChartProperties_ExcelChartParameters_SeriesStyleOptions_getMarkerSize_2467192935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term80623 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelFillType");
        Field term80622 = ((Class) term80623).getDeclaredField((String) "NONE");
        ((Field) term80622).setAccessible(true);
        Object enum153 = ((Field) term80622).get((Object) null);
        Class<? extends Object> term81072 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelMarkerStyle");
        Field term81071 = ((Class) term81072).getDeclaredField((String) "NONE");
        ((Field) term81071).setAccessible(true);
        Object enum154 = ((Field) term81071).get((Object) null);
        term80573 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters$SeriesStyleOptions"));
        setField(term80573, term80573.getClass(), "fillType", enum153);
        setField(term80573, term80573.getClass(), "stPresetPatternVal", "UxgSdhxPCH");
        setField(term80573, term80573.getClass(), "hexColor", "DAujxZPHJC");
        setField(term80573, term80573.getClass(), "stMarkerStyle", enum154);
        setIntField(term80573, term80573.getClass(), "markerSize", 691577392);
        setIntField(term80573, term80573.getClass(), "transparencyPercent", -893623680);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters$SeriesStyleOptions");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMarkerSize", argTypes, term80573, args);
    }

};


