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
import java.util.ArrayList;
import java.util.HashMap;

public class ExcelChartProperties_ExcelChartParameters_equals_99616264229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61430;
     Object term61590;

    public ExcelChartProperties_ExcelChartParameters_equals_99616264229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term61592 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartTypes");
        Field term61591 = ((Class) term61592).getDeclaredField((String) "NONE");
        ((Field) term61591).setAccessible(true);
        Object enum115 = ((Field) term61591).get((Object) null);
        ArrayList term61463 = new ArrayList();
        ArrayList term61467 = new ArrayList();
        ((ArrayList) term61467).add("KtuuNAqGCQ");
        ((ArrayList) term61467).add("OGQsfjmReM");
        ((ArrayList) term61467).add("YsUtbngnRO");
        ((ArrayList) term61467).add("JisaWUxcNb");
        Class<? extends Object> term62091 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarGrouping");
        Field term62090 = ((Class) term62091).getDeclaredField((String) "PERCENT_STACKED");
        ((Field) term62090).setAccessible(true);
        Object enum116 = ((Field) term62090).get((Object) null);
        Class<? extends Object> term62568 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarDirection");
        Field term62567 = ((Class) term62568).getDeclaredField((String) "COL");
        ((Field) term62567).setAccessible(true);
        Object enum117 = ((Field) term62567).get((Object) null);
        Class<? extends Object> term63014 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelScatterStyle");
        Field term63013 = ((Class) term63014).getDeclaredField((String) "SMOOTH_MARKER");
        ((Field) term63013).setAccessible(true);
        Object enum118 = ((Field) term63013).get((Object) null);
        HashMap term61578 = new HashMap();
        term61430 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters"));
        setField(term61430, term61430.getClass(), "type", enum115);
        setField(term61430, term61430.getClass(), "categoryAxisTitle", "dwlZSxlXOo");
        setField(term61430, term61430.getClass(), "valueAxisTitle", "lKrEAkypza");
        setField(term61430, term61430.getClass(), "categoryColumns", term61463);
        setField(term61430, term61430.getClass(), "dataRows", term61467);
        setField(term61430, term61430.getClass(), "barGrouping", enum116);
        setField(term61430, term61430.getClass(), "barDirection", enum117);
        setIntField(term61430, term61430.getClass(), "barSeriesOverlapPercent", 444029505);
        setField(term61430, term61430.getClass(), "scatterStyle", enum118);
        setBooleanField(term61430, term61430.getClass(), "lineIsSmooth", false);
        setBooleanField(term61430, term61430.getClass(), "plotOnSecondaryAxis", false);
        setBooleanField(term61430, term61430.getClass(), "useSameMinMaxScaleAsPrimary", true);
        setField(term61430, term61430.getClass(), "colorSet", "NxgmYPzWCI");
        setField(term61430, term61430.getClass(), "seriesStyleOptionsMap", term61578);
        term61590 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term61590;
        callMethod(klass, "equals", argTypes, term61430, args);
    }

};


