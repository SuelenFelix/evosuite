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

public class ExcelChartProperties_ExcelChartParameters_SeriesStyleOptions_getStPresetPatternVal_13915512302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77732;

    public ExcelChartProperties_ExcelChartParameters_SeriesStyleOptions_getStPresetPatternVal_13915512302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term77783 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelFillType");
        Field term77782 = ((Class) term77783).getDeclaredField((String) "SOLID");
        ((Field) term77782).setAccessible(true);
        Object enum147 = ((Field) term77782).get((Object) null);
        Class<? extends Object> term78235 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelMarkerStyle");
        Field term78234 = ((Class) term78235).getDeclaredField((String) "NONE");
        ((Field) term78234).setAccessible(true);
        Object enum148 = ((Field) term78234).get((Object) null);
        term77732 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters$SeriesStyleOptions"));
        setField(term77732, term77732.getClass(), "fillType", enum147);
        setField(term77732, term77732.getClass(), "stPresetPatternVal", "XebAeSnCKZ");
        setField(term77732, term77732.getClass(), "hexColor", "GeddnXjHGy");
        setField(term77732, term77732.getClass(), "stMarkerStyle", enum148);
        setIntField(term77732, term77732.getClass(), "markerSize", -1476117762);
        setIntField(term77732, term77732.getClass(), "transparencyPercent", -341962980);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters$SeriesStyleOptions");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStPresetPatternVal", argTypes, term77732, args);
    }

};


