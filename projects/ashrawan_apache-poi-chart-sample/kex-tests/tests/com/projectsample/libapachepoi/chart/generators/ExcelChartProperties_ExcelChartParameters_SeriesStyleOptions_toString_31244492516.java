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

public class ExcelChartProperties_ExcelChartParameters_SeriesStyleOptions_toString_31244492516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91576;

    public ExcelChartProperties_ExcelChartParameters_SeriesStyleOptions_toString_31244492516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term91627 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelFillType");
        Field term91626 = ((Class) term91627).getDeclaredField((String) "SOLID");
        ((Field) term91626).setAccessible(true);
        Object enum176 = ((Field) term91626).get((Object) null);
        Class<? extends Object> term92079 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelMarkerStyle");
        Field term92078 = ((Class) term92079).getDeclaredField((String) "DASH");
        ((Field) term92078).setAccessible(true);
        Object enum177 = ((Field) term92078).get((Object) null);
        term91576 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters$SeriesStyleOptions"));
        setField(term91576, term91576.getClass(), "fillType", enum176);
        setField(term91576, term91576.getClass(), "stPresetPatternVal", "mfHtgSbdjD");
        setField(term91576, term91576.getClass(), "hexColor", "cmuaUiHMVL");
        setField(term91576, term91576.getClass(), "stMarkerStyle", enum177);
        setIntField(term91576, term91576.getClass(), "markerSize", -2063457669);
        setIntField(term91576, term91576.getClass(), "transparencyPercent", -1222006000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters$SeriesStyleOptions");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term91576, args);
    }

};


