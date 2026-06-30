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

public class ExcelChartProperties_equals_18909657739 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141502;
     Object term141566;

    public ExcelChartProperties_equals_18909657739() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term141568 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelPosition");
        Field term141567 = ((Class) term141568).getDeclaredField((String) "TOP_RIGHT");
        ((Field) term141567).setAccessible(true);
        Object enum283 = ((Field) term141567).get((Object) null);
        Class<? extends Object> term142012 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelPosition");
        Field term142011 = ((Class) term142012).getDeclaredField((String) "TOP");
        ((Field) term142011).setAccessible(true);
        Object enum284 = ((Field) term142011).get((Object) null);
        Class<? extends Object> term142448 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartTypes");
        Field term142447 = ((Class) term142448).getDeclaredField((String) "BAR");
        ((Field) term142447).setAccessible(true);
        Object enum285 = ((Field) term142447).get((Object) null);
        ArrayList term141542 = new ArrayList();
        ArrayList term141545 = new ArrayList();
        Class<? extends Object> term142884 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarGrouping");
        Field term142883 = ((Class) term142884).getDeclaredField((String) "STACKED");
        ((Field) term142883).setAccessible(true);
        Object enum286 = ((Field) term142883).get((Object) null);
        Class<? extends Object> term143337 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarDirection");
        Field term143336 = ((Class) term143337).getDeclaredField((String) "COL");
        ((Field) term143336).setAccessible(true);
        Object enum287 = ((Field) term143336).get((Object) null);
        Class<? extends Object> term143783 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelScatterStyle");
        Field term143782 = ((Class) term143783).getDeclaredField((String) "SMOOTH_MARKER");
        ((Field) term143782).setAccessible(true);
        Object enum288 = ((Field) term143782).get((Object) null);
        HashMap term141559 = new HashMap();
        Object term141537 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters"));
        setField(term141537, term141537.getClass(), "type", enum285);
        setField(term141537, term141537.getClass(), "categoryAxisTitle", "");
        setField(term141537, term141537.getClass(), "valueAxisTitle", "");
        setField(term141537, term141537.getClass(), "categoryColumns", term141542);
        setField(term141537, term141537.getClass(), "dataRows", term141545);
        setField(term141537, term141537.getClass(), "barGrouping", enum286);
        setField(term141537, term141537.getClass(), "barDirection", enum287);
        setIntField(term141537, term141537.getClass(), "barSeriesOverlapPercent", 2049577015);
        setField(term141537, term141537.getClass(), "scatterStyle", enum288);
        setBooleanField(term141537, term141537.getClass(), "lineIsSmooth", true);
        setBooleanField(term141537, term141537.getClass(), "plotOnSecondaryAxis", true);
        setBooleanField(term141537, term141537.getClass(), "useSameMinMaxScaleAsPrimary", true);
        setField(term141537, term141537.getClass(), "colorSet", "");
        setField(term141537, term141537.getClass(), "seriesStyleOptionsMap", term141559);
        ArrayList term141535 = new ArrayList();
        ((ArrayList) term141535).add(term141537);
        term141502 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties"));
        setField(term141502, term141502.getClass(), "chartPosition", enum283);
        setField(term141502, term141502.getClass(), "legendPosition", enum284);
        setField(term141502, term141502.getClass(), "chartTitle", "tMhhBYonAI");
        setField(term141502, term141502.getClass(), "params", term141535);
        term141566 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term141566;
        callMethod(klass, "equals", argTypes, term141502, args);
    }

};


