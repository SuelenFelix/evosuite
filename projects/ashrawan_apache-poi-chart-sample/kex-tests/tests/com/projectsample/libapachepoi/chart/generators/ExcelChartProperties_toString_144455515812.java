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

public class ExcelChartProperties_toString_144455515812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160996;

    public ExcelChartProperties_toString_144455515812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term161104 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelPosition");
        Field term161103 = ((Class) term161104).getDeclaredField((String) "LEFT");
        ((Field) term161103).setAccessible(true);
        Object enum325 = ((Field) term161103).get((Object) null);
        Class<? extends Object> term161533 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelPosition");
        Field term161532 = ((Class) term161533).getDeclaredField((String) "TOP");
        ((Field) term161532).setAccessible(true);
        Object enum326 = ((Field) term161532).get((Object) null);
        Class<? extends Object> term161969 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartTypes");
        Field term161968 = ((Class) term161969).getDeclaredField((String) "COLUMN");
        ((Field) term161968).setAccessible(true);
        Object enum327 = ((Field) term161968).get((Object) null);
        ArrayList term161031 = new ArrayList();
        ((ArrayList) term161031).add((Object)null);
        ((ArrayList) term161031).add((Object)null);
        ((ArrayList) term161031).add((Object)null);
        ((ArrayList) term161031).add((Object)null);
        ((ArrayList) term161031).add((Object)null);
        ((ArrayList) term161031).add((Object)null);
        ArrayList term161034 = new ArrayList();
        ((ArrayList) term161034).add((Object)null);
        ((ArrayList) term161034).add((Object)null);
        ((ArrayList) term161034).add((Object)null);
        ((ArrayList) term161034).add((Object)null);
        ((ArrayList) term161034).add((Object)null);
        ((ArrayList) term161034).add((Object)null);
        ((ArrayList) term161034).add((Object)null);
        ((ArrayList) term161034).add((Object)null);
        Class<? extends Object> term162414 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarGrouping");
        Field term162413 = ((Class) term162414).getDeclaredField((String) "CLUSTERED");
        ((Field) term162413).setAccessible(true);
        Object enum328 = ((Field) term162413).get((Object) null);
        Class<? extends Object> term162873 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarDirection");
        Field term162872 = ((Class) term162873).getDeclaredField((String) "BAR");
        ((Field) term162872).setAccessible(true);
        Object enum329 = ((Field) term162872).get((Object) null);
        Class<? extends Object> term163319 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelScatterStyle");
        Field term163318 = ((Class) term163319).getDeclaredField((String) "LINE");
        ((Field) term163318).setAccessible(true);
        Object enum330 = ((Field) term163318).get((Object) null);
        HashMap term161048 = new HashMap();
        Object term161026 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters"));
        setField(term161026, term161026.getClass(), "type", enum327);
        setField(term161026, term161026.getClass(), "categoryAxisTitle", "");
        setField(term161026, term161026.getClass(), "valueAxisTitle", "");
        setField(term161026, term161026.getClass(), "categoryColumns", term161031);
        setField(term161026, term161026.getClass(), "dataRows", term161034);
        setField(term161026, term161026.getClass(), "barGrouping", enum328);
        setField(term161026, term161026.getClass(), "barDirection", enum329);
        setIntField(term161026, term161026.getClass(), "barSeriesOverlapPercent", 1215150180);
        setField(term161026, term161026.getClass(), "scatterStyle", enum330);
        setBooleanField(term161026, term161026.getClass(), "lineIsSmooth", true);
        setBooleanField(term161026, term161026.getClass(), "plotOnSecondaryAxis", true);
        setBooleanField(term161026, term161026.getClass(), "useSameMinMaxScaleAsPrimary", true);
        setField(term161026, term161026.getClass(), "colorSet", "");
        setField(term161026, term161026.getClass(), "seriesStyleOptionsMap", term161048);
        Class<? extends Object> term163768 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartTypes");
        Field term163767 = ((Class) term163768).getDeclaredField((String) "COLUMN");
        ((Field) term163767).setAccessible(true);
        Object enum331 = ((Field) term163767).get((Object) null);
        ArrayList term161058 = new ArrayList();
        ((ArrayList) term161058).add((Object)null);
        ((ArrayList) term161058).add((Object)null);
        ((ArrayList) term161058).add((Object)null);
        ArrayList term161061 = new ArrayList();
        ((ArrayList) term161061).add((Object)null);
        Class<? extends Object> term164213 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarGrouping");
        Field term164212 = ((Class) term164213).getDeclaredField((String) "STACKED");
        ((Field) term164212).setAccessible(true);
        Object enum332 = ((Field) term164212).get((Object) null);
        Class<? extends Object> term164666 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelScatterStyle");
        Field term164665 = ((Class) term164666).getDeclaredField((String) "SMOOTH_MARKER");
        ((Field) term164665).setAccessible(true);
        Object enum333 = ((Field) term164665).get((Object) null);
        HashMap term161073 = new HashMap();
        Object term161053 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters"));
        setField(term161053, term161053.getClass(), "type", enum331);
        setField(term161053, term161053.getClass(), "categoryAxisTitle", "");
        setField(term161053, term161053.getClass(), "valueAxisTitle", "");
        setField(term161053, term161053.getClass(), "categoryColumns", term161058);
        setField(term161053, term161053.getClass(), "dataRows", term161061);
        setField(term161053, term161053.getClass(), "barGrouping", enum332);
        setField(term161053, term161053.getClass(), "barDirection", enum329);
        setIntField(term161053, term161053.getClass(), "barSeriesOverlapPercent", 68922753);
        setField(term161053, term161053.getClass(), "scatterStyle", enum333);
        setBooleanField(term161053, term161053.getClass(), "lineIsSmooth", false);
        setBooleanField(term161053, term161053.getClass(), "plotOnSecondaryAxis", false);
        setBooleanField(term161053, term161053.getClass(), "useSameMinMaxScaleAsPrimary", false);
        setField(term161053, term161053.getClass(), "colorSet", "");
        setField(term161053, term161053.getClass(), "seriesStyleOptionsMap", term161073);
        Class<? extends Object> term165142 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartTypes");
        Field term165141 = ((Class) term165142).getDeclaredField((String) "PIE");
        ((Field) term165141).setAccessible(true);
        Object enum334 = ((Field) term165141).get((Object) null);
        ArrayList term161083 = new ArrayList();
        ((ArrayList) term161083).add((Object)null);
        ArrayList term161086 = new ArrayList();
        Class<? extends Object> term165578 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelScatterStyle");
        Field term165577 = ((Class) term165578).getDeclaredField((String) "LINE_MARKER");
        ((Field) term165577).setAccessible(true);
        Object enum335 = ((Field) term165577).get((Object) null);
        HashMap term161096 = new HashMap();
        Object term161078 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters"));
        setField(term161078, term161078.getClass(), "type", enum334);
        setField(term161078, term161078.getClass(), "categoryAxisTitle", "");
        setField(term161078, term161078.getClass(), "valueAxisTitle", "");
        setField(term161078, term161078.getClass(), "categoryColumns", term161083);
        setField(term161078, term161078.getClass(), "dataRows", term161086);
        setField(term161078, term161078.getClass(), "barGrouping", enum328);
        setField(term161078, term161078.getClass(), "barDirection", enum329);
        setIntField(term161078, term161078.getClass(), "barSeriesOverlapPercent", -2070466617);
        setField(term161078, term161078.getClass(), "scatterStyle", enum335);
        setBooleanField(term161078, term161078.getClass(), "lineIsSmooth", true);
        setBooleanField(term161078, term161078.getClass(), "plotOnSecondaryAxis", true);
        setBooleanField(term161078, term161078.getClass(), "useSameMinMaxScaleAsPrimary", false);
        setField(term161078, term161078.getClass(), "colorSet", "");
        setField(term161078, term161078.getClass(), "seriesStyleOptionsMap", term161096);
        ArrayList term161024 = new ArrayList();
        ((ArrayList) term161024).add(term161026);
        ((ArrayList) term161024).add(term161053);
        ((ArrayList) term161024).add(term161078);
        term160996 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties"));
        setField(term160996, term160996.getClass(), "chartPosition", enum325);
        setField(term160996, term160996.getClass(), "legendPosition", enum326);
        setField(term160996, term160996.getClass(), "chartTitle", "NUUjAyqOva");
        setField(term160996, term160996.getClass(), "params", term161024);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term160996, args);
    }

};


