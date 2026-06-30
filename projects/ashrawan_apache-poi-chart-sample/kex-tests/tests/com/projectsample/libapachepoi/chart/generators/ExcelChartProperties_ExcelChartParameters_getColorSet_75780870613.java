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

public class ExcelChartProperties_ExcelChartParameters_getColorSet_75780870613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25445;

    public ExcelChartProperties_ExcelChartParameters_getColorSet_75780870613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25677 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartTypes");
        Field term25676 = ((Class) term25677).getDeclaredField((String) "COLUMN");
        ((Field) term25676).setAccessible(true);
        Object enum48 = ((Field) term25676).get((Object) null);
        ArrayList term25480 = new ArrayList();
        ((ArrayList) term25480).add("smnHEqRFRx");
        ((ArrayList) term25480).add("XYtryyobou");
        ((ArrayList) term25480).add("OYbzXylRWW");
        ((ArrayList) term25480).add("DSNsTGYXDF");
        ((ArrayList) term25480).add("sQvGcVjdEx");
        ArrayList term25544 = new ArrayList();
        ((ArrayList) term25544).add("rLHAoqXgPh");
        ((ArrayList) term25544).add("zUlRdimJtU");
        ((ArrayList) term25544).add("vwbEQQNQrx");
        ((ArrayList) term25544).add("xtftXXMbem");
        ((ArrayList) term25544).add("cudZvLMQon");
        ((ArrayList) term25544).add("lihXWlGDxk");
        Class<? extends Object> term26252 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarGrouping");
        Field term26251 = ((Class) term26252).getDeclaredField((String) "CLUSTERED");
        ((Field) term26251).setAccessible(true);
        Object enum49 = ((Field) term26251).get((Object) null);
        Class<? extends Object> term26711 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarDirection");
        Field term26710 = ((Class) term26711).getDeclaredField((String) "BAR");
        ((Field) term26710).setAccessible(true);
        Object enum50 = ((Field) term26710).get((Object) null);
        Class<? extends Object> term27157 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelScatterStyle");
        Field term27156 = ((Class) term27157).getDeclaredField((String) "LINE");
        ((Field) term27156).setAccessible(true);
        Object enum51 = ((Field) term27156).get((Object) null);
        HashMap term25664 = new HashMap();
        term25445 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters"));
        setField(term25445, term25445.getClass(), "type", enum48);
        setField(term25445, term25445.getClass(), "categoryAxisTitle", "WzFopsaDuG");
        setField(term25445, term25445.getClass(), "valueAxisTitle", "PapWxkhEWe");
        setField(term25445, term25445.getClass(), "categoryColumns", term25480);
        setField(term25445, term25445.getClass(), "dataRows", term25544);
        setField(term25445, term25445.getClass(), "barGrouping", enum49);
        setField(term25445, term25445.getClass(), "barDirection", enum50);
        setIntField(term25445, term25445.getClass(), "barSeriesOverlapPercent", -1530420153);
        setField(term25445, term25445.getClass(), "scatterStyle", enum51);
        setBooleanField(term25445, term25445.getClass(), "lineIsSmooth", true);
        setBooleanField(term25445, term25445.getClass(), "plotOnSecondaryAxis", true);
        setBooleanField(term25445, term25445.getClass(), "useSameMinMaxScaleAsPrimary", true);
        setField(term25445, term25445.getClass(), "colorSet", "JmcmxoGhIK");
        setField(term25445, term25445.getClass(), "seriesStyleOptionsMap", term25664);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getColorSet", argTypes, term25445, args);
    }

};


