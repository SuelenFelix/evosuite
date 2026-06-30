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

public class ExcelChartProperties_ExcelChartParameters_SeriesStyleOptions_getFillType_15355632151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76776;

    public ExcelChartProperties_ExcelChartParameters_SeriesStyleOptions_getFillType_15355632151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term76831 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelFillType");
        Field term76830 = ((Class) term76831).getDeclaredField((String) "SOLID");
        ((Field) term76830).setAccessible(true);
        Object enum145 = ((Field) term76830).get((Object) null);
        Class<? extends Object> term77283 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelMarkerStyle");
        Field term77282 = ((Class) term77283).getDeclaredField((String) "CIRCLE");
        ((Field) term77282).setAccessible(true);
        Object enum146 = ((Field) term77282).get((Object) null);
        term76776 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters$SeriesStyleOptions"));
        setField(term76776, term76776.getClass(), "fillType", enum145);
        setField(term76776, term76776.getClass(), "stPresetPatternVal", "YgQvdcBQKw");
        setField(term76776, term76776.getClass(), "hexColor", "FiYYLuailz");
        setField(term76776, term76776.getClass(), "stMarkerStyle", enum146);
        setIntField(term76776, term76776.getClass(), "markerSize", 339854490);
        setIntField(term76776, term76776.getClass(), "transparencyPercent", -615654495);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters$SeriesStyleOptions");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFillType", argTypes, term76776, args);
    }

};


