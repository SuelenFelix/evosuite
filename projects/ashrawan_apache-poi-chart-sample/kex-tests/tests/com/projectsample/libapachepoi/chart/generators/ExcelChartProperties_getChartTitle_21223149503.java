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

public class ExcelChartProperties_getChartTitle_21223149503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103221;

    public ExcelChartProperties_getChartTitle_21223149503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term103352 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelPosition");
        Field term103351 = ((Class) term103352).getDeclaredField((String) "TOP");
        ((Field) term103351).setAccessible(true);
        Object enum201 = ((Field) term103351).get((Object) null);
        Class<? extends Object> term103778 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelPosition");
        Field term103777 = ((Class) term103778).getDeclaredField((String) "LEFT");
        ((Field) term103777).setAccessible(true);
        Object enum202 = ((Field) term103777).get((Object) null);
        Class<? extends Object> term104217 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartTypes");
        Field term104216 = ((Class) term104217).getDeclaredField((String) "PIE");
        ((Field) term104216).setAccessible(true);
        Object enum203 = ((Field) term104216).get((Object) null);
        ArrayList term103256 = new ArrayList();
        ((ArrayList) term103256).add((Object)null);
        ((ArrayList) term103256).add((Object)null);
        ((ArrayList) term103256).add((Object)null);
        ((ArrayList) term103256).add((Object)null);
        ((ArrayList) term103256).add((Object)null);
        ((ArrayList) term103256).add((Object)null);
        ((ArrayList) term103256).add((Object)null);
        ((ArrayList) term103256).add((Object)null);
        ArrayList term103259 = new ArrayList();
        Class<? extends Object> term104653 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarGrouping");
        Field term104652 = ((Class) term104653).getDeclaredField((String) "STANDARD");
        ((Field) term104652).setAccessible(true);
        Object enum204 = ((Field) term104652).get((Object) null);
        Class<? extends Object> term105109 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarDirection");
        Field term105108 = ((Class) term105109).getDeclaredField((String) "BAR");
        ((Field) term105108).setAccessible(true);
        Object enum205 = ((Field) term105108).get((Object) null);
        Class<? extends Object> term105555 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelScatterStyle");
        Field term105554 = ((Class) term105555).getDeclaredField((String) "SCATTER_ONLY");
        ((Field) term105554).setAccessible(true);
        Object enum206 = ((Field) term105554).get((Object) null);
        HashMap term103273 = new HashMap();
        Object term103251 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters"));
        setField(term103251, term103251.getClass(), "type", enum203);
        setField(term103251, term103251.getClass(), "categoryAxisTitle", "");
        setField(term103251, term103251.getClass(), "valueAxisTitle", "");
        setField(term103251, term103251.getClass(), "categoryColumns", term103256);
        setField(term103251, term103251.getClass(), "dataRows", term103259);
        setField(term103251, term103251.getClass(), "barGrouping", enum204);
        setField(term103251, term103251.getClass(), "barDirection", enum205);
        setIntField(term103251, term103251.getClass(), "barSeriesOverlapPercent", -243422082);
        setField(term103251, term103251.getClass(), "scatterStyle", enum206);
        setBooleanField(term103251, term103251.getClass(), "lineIsSmooth", false);
        setBooleanField(term103251, term103251.getClass(), "plotOnSecondaryAxis", false);
        setBooleanField(term103251, term103251.getClass(), "useSameMinMaxScaleAsPrimary", false);
        setField(term103251, term103251.getClass(), "colorSet", "");
        setField(term103251, term103251.getClass(), "seriesStyleOptionsMap", term103273);
        Class<? extends Object> term106028 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartTypes");
        Field term106027 = ((Class) term106028).getDeclaredField((String) "LINE");
        ((Field) term106027).setAccessible(true);
        Object enum207 = ((Field) term106027).get((Object) null);
        ArrayList term103283 = new ArrayList();
        ((ArrayList) term103283).add((Object)null);
        ((ArrayList) term103283).add((Object)null);
        ((ArrayList) term103283).add((Object)null);
        ((ArrayList) term103283).add((Object)null);
        ArrayList term103286 = new ArrayList();
        ((ArrayList) term103286).add((Object)null);
        Class<? extends Object> term106467 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarGrouping");
        Field term106466 = ((Class) term106467).getDeclaredField((String) "PERCENT_STACKED");
        ((Field) term106466).setAccessible(true);
        Object enum208 = ((Field) term106466).get((Object) null);
        Class<? extends Object> term106944 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarDirection");
        Field term106943 = ((Class) term106944).getDeclaredField((String) "COL");
        ((Field) term106943).setAccessible(true);
        Object enum209 = ((Field) term106943).get((Object) null);
        Class<? extends Object> term107390 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelScatterStyle");
        Field term107389 = ((Class) term107390).getDeclaredField((String) "SCATTER_ONLY");
        ((Field) term107389).setAccessible(true);
        Object enum210 = ((Field) term107389).get((Object) null);
        HashMap term103300 = new HashMap();
        Object term103278 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters"));
        setField(term103278, term103278.getClass(), "type", enum207);
        setField(term103278, term103278.getClass(), "categoryAxisTitle", "");
        setField(term103278, term103278.getClass(), "valueAxisTitle", "");
        setField(term103278, term103278.getClass(), "categoryColumns", term103283);
        setField(term103278, term103278.getClass(), "dataRows", term103286);
        setField(term103278, term103278.getClass(), "barGrouping", enum208);
        setField(term103278, term103278.getClass(), "barDirection", enum209);
        setIntField(term103278, term103278.getClass(), "barSeriesOverlapPercent", -2014576105);
        setField(term103278, term103278.getClass(), "scatterStyle", enum210);
        setBooleanField(term103278, term103278.getClass(), "lineIsSmooth", true);
        setBooleanField(term103278, term103278.getClass(), "plotOnSecondaryAxis", false);
        setBooleanField(term103278, term103278.getClass(), "useSameMinMaxScaleAsPrimary", false);
        setField(term103278, term103278.getClass(), "colorSet", "");
        setField(term103278, term103278.getClass(), "seriesStyleOptionsMap", term103300);
        Class<? extends Object> term107863 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartTypes");
        Field term107862 = ((Class) term107863).getDeclaredField((String) "SCATTER");
        ((Field) term107862).setAccessible(true);
        Object enum211 = ((Field) term107862).get((Object) null);
        ArrayList term103310 = new ArrayList();
        ArrayList term103313 = new ArrayList();
        ((ArrayList) term103313).add((Object)null);
        Class<? extends Object> term108311 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelScatterStyle");
        Field term108310 = ((Class) term108311).getDeclaredField((String) "LINE_MARKER");
        ((Field) term108310).setAccessible(true);
        Object enum212 = ((Field) term108310).get((Object) null);
        HashMap term103323 = new HashMap();
        Object term103305 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters"));
        setField(term103305, term103305.getClass(), "type", enum211);
        setField(term103305, term103305.getClass(), "categoryAxisTitle", "");
        setField(term103305, term103305.getClass(), "valueAxisTitle", "");
        setField(term103305, term103305.getClass(), "categoryColumns", term103310);
        setField(term103305, term103305.getClass(), "dataRows", term103313);
        setField(term103305, term103305.getClass(), "barGrouping", enum208);
        setField(term103305, term103305.getClass(), "barDirection", enum209);
        setIntField(term103305, term103305.getClass(), "barSeriesOverlapPercent", -1274456137);
        setField(term103305, term103305.getClass(), "scatterStyle", enum212);
        setBooleanField(term103305, term103305.getClass(), "lineIsSmooth", true);
        setBooleanField(term103305, term103305.getClass(), "plotOnSecondaryAxis", true);
        setBooleanField(term103305, term103305.getClass(), "useSameMinMaxScaleAsPrimary", false);
        setField(term103305, term103305.getClass(), "colorSet", "");
        setField(term103305, term103305.getClass(), "seriesStyleOptionsMap", term103323);
        ArrayList term103331 = new ArrayList();
        ((ArrayList) term103331).add((Object)null);
        ((ArrayList) term103331).add((Object)null);
        ((ArrayList) term103331).add((Object)null);
        ((ArrayList) term103331).add((Object)null);
        ((ArrayList) term103331).add((Object)null);
        ArrayList term103334 = new ArrayList();
        ((ArrayList) term103334).add((Object)null);
        ((ArrayList) term103334).add((Object)null);
        ((ArrayList) term103334).add((Object)null);
        Class<? extends Object> term108781 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarGrouping");
        Field term108780 = ((Class) term108781).getDeclaredField((String) "STACKED");
        ((Field) term108780).setAccessible(true);
        Object enum213 = ((Field) term108780).get((Object) null);
        HashMap term103344 = new HashMap();
        Object term103328 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters"));
        setField(term103328, term103328.getClass(), "type", enum211);
        setField(term103328, term103328.getClass(), "categoryAxisTitle", "");
        setField(term103328, term103328.getClass(), "valueAxisTitle", "");
        setField(term103328, term103328.getClass(), "categoryColumns", term103331);
        setField(term103328, term103328.getClass(), "dataRows", term103334);
        setField(term103328, term103328.getClass(), "barGrouping", enum213);
        setField(term103328, term103328.getClass(), "barDirection", enum205);
        setIntField(term103328, term103328.getClass(), "barSeriesOverlapPercent", 663292551);
        setField(term103328, term103328.getClass(), "scatterStyle", enum212);
        setBooleanField(term103328, term103328.getClass(), "lineIsSmooth", false);
        setBooleanField(term103328, term103328.getClass(), "plotOnSecondaryAxis", true);
        setBooleanField(term103328, term103328.getClass(), "useSameMinMaxScaleAsPrimary", false);
        setField(term103328, term103328.getClass(), "colorSet", "");
        setField(term103328, term103328.getClass(), "seriesStyleOptionsMap", term103344);
        ArrayList term103249 = new ArrayList();
        ((ArrayList) term103249).add(term103251);
        ((ArrayList) term103249).add(term103278);
        ((ArrayList) term103249).add(term103305);
        ((ArrayList) term103249).add(term103328);
        term103221 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties"));
        setField(term103221, term103221.getClass(), "chartPosition", enum201);
        setField(term103221, term103221.getClass(), "legendPosition", enum202);
        setField(term103221, term103221.getClass(), "chartTitle", "GTmoNrziyc");
        setField(term103221, term103221.getClass(), "params", term103249);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChartTitle", argTypes, term103221, args);
    }

};


