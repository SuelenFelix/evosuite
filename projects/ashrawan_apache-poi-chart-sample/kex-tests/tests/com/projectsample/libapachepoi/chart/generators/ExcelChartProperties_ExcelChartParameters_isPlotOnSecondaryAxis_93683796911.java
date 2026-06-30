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

public class ExcelChartProperties_ExcelChartParameters_isPlotOnSecondaryAxis_93683796911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21227;

    public ExcelChartProperties_ExcelChartParameters_isPlotOnSecondaryAxis_93683796911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21366 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartTypes");
        Field term21365 = ((Class) term21366).getDeclaredField((String) "SCATTER");
        ((Field) term21365).setAccessible(true);
        Object enum40 = ((Field) term21365).get((Object) null);
        ArrayList term21263 = new ArrayList();
        ((ArrayList) term21263).add("ZzIujlwVsw");
        ((ArrayList) term21263).add("LWyEaeIyAo");
        ArrayList term21291 = new ArrayList();
        ((ArrayList) term21291).add("yVMkkQhvmN");
        Class<? extends Object> term21864 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarGrouping");
        Field term21863 = ((Class) term21864).getDeclaredField((String) "CLUSTERED");
        ((Field) term21863).setAccessible(true);
        Object enum41 = ((Field) term21863).get((Object) null);
        Class<? extends Object> term22323 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarDirection");
        Field term22322 = ((Class) term22323).getDeclaredField((String) "BAR");
        ((Field) term22322).setAccessible(true);
        Object enum42 = ((Field) term22322).get((Object) null);
        Class<? extends Object> term22769 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelScatterStyle");
        Field term22768 = ((Class) term22769).getDeclaredField((String) "SMOOTH");
        ((Field) term22768).setAccessible(true);
        Object enum43 = ((Field) term22768).get((Object) null);
        HashMap term21353 = new HashMap();
        term21227 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters"));
        setField(term21227, term21227.getClass(), "type", enum40);
        setField(term21227, term21227.getClass(), "categoryAxisTitle", "VMeAzAHwZj");
        setField(term21227, term21227.getClass(), "valueAxisTitle", "PznxWXsZME");
        setField(term21227, term21227.getClass(), "categoryColumns", term21263);
        setField(term21227, term21227.getClass(), "dataRows", term21291);
        setField(term21227, term21227.getClass(), "barGrouping", enum41);
        setField(term21227, term21227.getClass(), "barDirection", enum42);
        setIntField(term21227, term21227.getClass(), "barSeriesOverlapPercent", -203030934);
        setField(term21227, term21227.getClass(), "scatterStyle", enum43);
        setBooleanField(term21227, term21227.getClass(), "lineIsSmooth", true);
        setBooleanField(term21227, term21227.getClass(), "plotOnSecondaryAxis", true);
        setBooleanField(term21227, term21227.getClass(), "useSameMinMaxScaleAsPrimary", true);
        setField(term21227, term21227.getClass(), "colorSet", "mvrkADEgpp");
        setField(term21227, term21227.getClass(), "seriesStyleOptionsMap", term21353);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPlotOnSecondaryAxis", argTypes, term21227, args);
    }

};


