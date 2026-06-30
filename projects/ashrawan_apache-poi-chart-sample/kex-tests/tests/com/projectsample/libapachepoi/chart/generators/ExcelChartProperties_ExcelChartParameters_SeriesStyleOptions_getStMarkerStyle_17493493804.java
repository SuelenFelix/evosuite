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

public class ExcelChartProperties_ExcelChartParameters_SeriesStyleOptions_getStMarkerStyle_17493493804 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79624;

    public ExcelChartProperties_ExcelChartParameters_SeriesStyleOptions_getStMarkerStyle_17493493804() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term79675 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelFillType");
        Field term79674 = ((Class) term79675).getDeclaredField((String) "PATTERN");
        ((Field) term79674).setAccessible(true);
        Object enum151 = ((Field) term79674).get((Object) null);
        Class<? extends Object> term80133 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelMarkerStyle");
        Field term80132 = ((Class) term80133).getDeclaredField((String) "DOT");
        ((Field) term80132).setAccessible(true);
        Object enum152 = ((Field) term80132).get((Object) null);
        term79624 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters$SeriesStyleOptions"));
        setField(term79624, term79624.getClass(), "fillType", enum151);
        setField(term79624, term79624.getClass(), "stPresetPatternVal", "oKhVzOKUFW");
        setField(term79624, term79624.getClass(), "hexColor", "mNHyqmOAFy");
        setField(term79624, term79624.getClass(), "stMarkerStyle", enum152);
        setIntField(term79624, term79624.getClass(), "markerSize", 1141317871);
        setIntField(term79624, term79624.getClass(), "transparencyPercent", 890669485);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters$SeriesStyleOptions");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStMarkerStyle", argTypes, term79624, args);
    }

};


