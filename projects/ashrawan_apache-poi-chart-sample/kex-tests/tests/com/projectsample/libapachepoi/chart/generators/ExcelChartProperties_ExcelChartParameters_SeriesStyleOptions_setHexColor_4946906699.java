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

public class ExcelChartProperties_ExcelChartParameters_SeriesStyleOptions_setHexColor_4946906699 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84402;

    public ExcelChartProperties_ExcelChartParameters_SeriesStyleOptions_setHexColor_4946906699() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term84471 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelFillType");
        Field term84470 = ((Class) term84471).getDeclaredField((String) "PATTERN");
        ((Field) term84470).setAccessible(true);
        Object enum161 = ((Field) term84470).get((Object) null);
        Class<? extends Object> term84929 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelMarkerStyle");
        Field term84928 = ((Class) term84929).getDeclaredField((String) "SQUARE");
        ((Field) term84928).setAccessible(true);
        Object enum162 = ((Field) term84928).get((Object) null);
        term84402 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters$SeriesStyleOptions"));
        setField(term84402, term84402.getClass(), "fillType", enum161);
        setField(term84402, term84402.getClass(), "stPresetPatternVal", "GbahCBMvct");
        setField(term84402, term84402.getClass(), "hexColor", "iiHBhsNFgk");
        setField(term84402, term84402.getClass(), "stMarkerStyle", enum162);
        setIntField(term84402, term84402.getClass(), "markerSize", 1474524152);
        setIntField(term84402, term84402.getClass(), "transparencyPercent", 568954359);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters$SeriesStyleOptions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HknsTajwxJ";
        callMethod(klass, "setHexColor", argTypes, term84402, args);
    }

};


