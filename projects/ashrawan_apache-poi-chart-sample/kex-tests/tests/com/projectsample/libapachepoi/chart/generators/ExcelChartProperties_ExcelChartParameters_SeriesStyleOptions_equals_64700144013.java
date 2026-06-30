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

public class ExcelChartProperties_ExcelChartParameters_SeriesStyleOptions_equals_64700144013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88702;
     Object term88754;

    public ExcelChartProperties_ExcelChartParameters_SeriesStyleOptions_equals_64700144013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term88756 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelFillType");
        Field term88755 = ((Class) term88756).getDeclaredField((String) "PATTERN");
        ((Field) term88755).setAccessible(true);
        Object enum170 = ((Field) term88755).get((Object) null);
        Class<? extends Object> term89214 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelMarkerStyle");
        Field term89213 = ((Class) term89214).getDeclaredField((String) "DASH");
        ((Field) term89213).setAccessible(true);
        Object enum171 = ((Field) term89213).get((Object) null);
        term88702 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters$SeriesStyleOptions"));
        setField(term88702, term88702.getClass(), "fillType", enum170);
        setField(term88702, term88702.getClass(), "stPresetPatternVal", "BtvAvsJSei");
        setField(term88702, term88702.getClass(), "hexColor", "vqnBkkxoIa");
        setField(term88702, term88702.getClass(), "stMarkerStyle", enum171);
        setIntField(term88702, term88702.getClass(), "markerSize", -343325701);
        setIntField(term88702, term88702.getClass(), "transparencyPercent", 107945604);
        term88754 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters$SeriesStyleOptions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term88754;
        callMethod(klass, "equals", argTypes, term88702, args);
    }

};


