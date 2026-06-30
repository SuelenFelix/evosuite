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

public class ExcelChartProperties_ExcelChartParameters_getCategoryAxisTitle_13429089082 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2319;

    public ExcelChartProperties_ExcelChartParameters_getCategoryAxisTitle_13429089082() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2508 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartTypes");
        Field term2507 = ((Class) term2508).getDeclaredField((String) "LINE");
        ((Field) term2507).setAccessible(true);
        Object enum4 = ((Field) term2507).get((Object) null);
        ArrayList term2352 = new ArrayList();
        ((ArrayList) term2352).add("tbcdzjIfER");
        ((ArrayList) term2352).add("HyxfbSQYBe");
        ((ArrayList) term2352).add("pCTimMblYc");
        ArrayList term2392 = new ArrayList();
        ((ArrayList) term2392).add("hNxWaHcfhY");
        ((ArrayList) term2392).add("RkybSrpybU");
        ((ArrayList) term2392).add("xOEqzGAmDU");
        ((ArrayList) term2392).add("eZFUvlxvGV");
        Class<? extends Object> term3037 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarGrouping");
        Field term3036 = ((Class) term3037).getDeclaredField((String) "CLUSTERED");
        ((Field) term3036).setAccessible(true);
        Object enum5 = ((Field) term3036).get((Object) null);
        Class<? extends Object> term3496 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarDirection");
        Field term3495 = ((Class) term3496).getDeclaredField((String) "BAR");
        ((Field) term3495).setAccessible(true);
        Object enum6 = ((Field) term3495).get((Object) null);
        Class<? extends Object> term3942 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelScatterStyle");
        Field term3941 = ((Class) term3942).getDeclaredField((String) "LINE_MARKER");
        ((Field) term3941).setAccessible(true);
        Object enum7 = ((Field) term3941).get((Object) null);
        HashMap term2495 = new HashMap();
        term2319 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters"));
        setField(term2319, term2319.getClass(), "type", enum4);
        setField(term2319, term2319.getClass(), "categoryAxisTitle", "aJlieCFVtF");
        setField(term2319, term2319.getClass(), "valueAxisTitle", "ZiaGIbnzTs");
        setField(term2319, term2319.getClass(), "categoryColumns", term2352);
        setField(term2319, term2319.getClass(), "dataRows", term2392);
        setField(term2319, term2319.getClass(), "barGrouping", enum5);
        setField(term2319, term2319.getClass(), "barDirection", enum6);
        setIntField(term2319, term2319.getClass(), "barSeriesOverlapPercent", 391863371);
        setField(term2319, term2319.getClass(), "scatterStyle", enum7);
        setBooleanField(term2319, term2319.getClass(), "lineIsSmooth", false);
        setBooleanField(term2319, term2319.getClass(), "plotOnSecondaryAxis", true);
        setBooleanField(term2319, term2319.getClass(), "useSameMinMaxScaleAsPrimary", true);
        setField(term2319, term2319.getClass(), "colorSet", "BYqFIqCKAV");
        setField(term2319, term2319.getClass(), "seriesStyleOptionsMap", term2495);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCategoryAxisTitle", argTypes, term2319, args);
    }

};


