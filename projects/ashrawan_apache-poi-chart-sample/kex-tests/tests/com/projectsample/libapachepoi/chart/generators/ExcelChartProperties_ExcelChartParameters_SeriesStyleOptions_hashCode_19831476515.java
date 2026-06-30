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

public class ExcelChartProperties_ExcelChartParameters_SeriesStyleOptions_hashCode_19831476515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90624;

    public ExcelChartProperties_ExcelChartParameters_SeriesStyleOptions_hashCode_19831476515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term90678 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelFillType");
        Field term90677 = ((Class) term90678).getDeclaredField((String) "NONE");
        ((Field) term90677).setAccessible(true);
        Object enum174 = ((Field) term90677).get((Object) null);
        Class<? extends Object> term91127 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelMarkerStyle");
        Field term91126 = ((Class) term91127).getDeclaredField((String) "SQUARE");
        ((Field) term91126).setAccessible(true);
        Object enum175 = ((Field) term91126).get((Object) null);
        term90624 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters$SeriesStyleOptions"));
        setField(term90624, term90624.getClass(), "fillType", enum174);
        setField(term90624, term90624.getClass(), "stPresetPatternVal", "DzKFxEuEEC");
        setField(term90624, term90624.getClass(), "hexColor", "CAMnvfDLJL");
        setField(term90624, term90624.getClass(), "stMarkerStyle", enum175);
        setIntField(term90624, term90624.getClass(), "markerSize", 1202361360);
        setIntField(term90624, term90624.getClass(), "transparencyPercent", -2015048153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters$SeriesStyleOptions");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term90624, args);
    }

};


