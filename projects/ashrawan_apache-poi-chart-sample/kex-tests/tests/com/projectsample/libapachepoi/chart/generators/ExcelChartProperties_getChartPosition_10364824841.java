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

public class ExcelChartProperties_getChartPosition_10364824841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93527;

    public ExcelChartProperties_getChartPosition_10364824841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term93588 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelPosition");
        Field term93587 = ((Class) term93588).getDeclaredField((String) "RIGHT");
        ((Field) term93587).setAccessible(true);
        Object enum180 = ((Field) term93587).get((Object) null);
        Class<? extends Object> term94020 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelPosition");
        Field term94019 = ((Class) term94020).getDeclaredField((String) "TOP");
        ((Field) term94019).setAccessible(true);
        Object enum181 = ((Field) term94019).get((Object) null);
        Class<? extends Object> term94456 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartTypes");
        Field term94455 = ((Class) term94456).getDeclaredField((String) "PIE");
        ((Field) term94455).setAccessible(true);
        Object enum182 = ((Field) term94455).get((Object) null);
        ArrayList term93563 = new ArrayList();
        ((ArrayList) term93563).add((Object)null);
        ((ArrayList) term93563).add((Object)null);
        ((ArrayList) term93563).add((Object)null);
        ((ArrayList) term93563).add((Object)null);
        ArrayList term93566 = new ArrayList();
        ((ArrayList) term93566).add((Object)null);
        Class<? extends Object> term94892 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarGrouping");
        Field term94891 = ((Class) term94892).getDeclaredField((String) "STACKED");
        ((Field) term94891).setAccessible(true);
        Object enum183 = ((Field) term94891).get((Object) null);
        Class<? extends Object> term95345 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarDirection");
        Field term95344 = ((Class) term95345).getDeclaredField((String) "BAR");
        ((Field) term95344).setAccessible(true);
        Object enum184 = ((Field) term95344).get((Object) null);
        Class<? extends Object> term95791 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelScatterStyle");
        Field term95790 = ((Class) term95791).getDeclaredField((String) "LINE_MARKER");
        ((Field) term95790).setAccessible(true);
        Object enum185 = ((Field) term95790).get((Object) null);
        HashMap term93580 = new HashMap();
        Object term93558 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters"));
        setField(term93558, term93558.getClass(), "type", enum182);
        setField(term93558, term93558.getClass(), "categoryAxisTitle", "");
        setField(term93558, term93558.getClass(), "valueAxisTitle", "");
        setField(term93558, term93558.getClass(), "categoryColumns", term93563);
        setField(term93558, term93558.getClass(), "dataRows", term93566);
        setField(term93558, term93558.getClass(), "barGrouping", enum183);
        setField(term93558, term93558.getClass(), "barDirection", enum184);
        setIntField(term93558, term93558.getClass(), "barSeriesOverlapPercent", 2095798786);
        setField(term93558, term93558.getClass(), "scatterStyle", enum185);
        setBooleanField(term93558, term93558.getClass(), "lineIsSmooth", false);
        setBooleanField(term93558, term93558.getClass(), "plotOnSecondaryAxis", true);
        setBooleanField(term93558, term93558.getClass(), "useSameMinMaxScaleAsPrimary", true);
        setField(term93558, term93558.getClass(), "colorSet", "");
        setField(term93558, term93558.getClass(), "seriesStyleOptionsMap", term93580);
        ArrayList term93556 = new ArrayList();
        ((ArrayList) term93556).add(term93558);
        term93527 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties"));
        setField(term93527, term93527.getClass(), "chartPosition", enum180);
        setField(term93527, term93527.getClass(), "legendPosition", enum181);
        setField(term93527, term93527.getClass(), "chartTitle", "uzmqjnOUXu");
        setField(term93527, term93527.getClass(), "params", term93556);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChartPosition", argTypes, term93527, args);
    }

};


