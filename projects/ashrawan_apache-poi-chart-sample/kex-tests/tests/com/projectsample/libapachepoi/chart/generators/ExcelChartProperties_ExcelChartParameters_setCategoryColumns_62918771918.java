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
import java.util.LinkedList;

public class ExcelChartProperties_ExcelChartParameters_setCategoryColumns_62918771918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36646;
     Object term36838;

    public ExcelChartProperties_ExcelChartParameters_setCategoryColumns_62918771918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term36855 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartTypes");
        Field term36854 = ((Class) term36855).getDeclaredField((String) "PIE");
        ((Field) term36854).setAccessible(true);
        Object enum69 = ((Field) term36854).get((Object) null);
        ArrayList term36678 = new ArrayList();
        ((ArrayList) term36678).add("UKAReurpHG");
        ((ArrayList) term36678).add("WVRMUmrljA");
        ((ArrayList) term36678).add("NTlKJDDWlk");
        ArrayList term36718 = new ArrayList();
        ((ArrayList) term36718).add("vOuMEpOQAg");
        ((ArrayList) term36718).add("SIODFGaQhr");
        ((ArrayList) term36718).add("qYzsiuXOgS");
        ((ArrayList) term36718).add("bxrCBbrrct");
        ((ArrayList) term36718).add("CKWpJaaaxX");
        Class<? extends Object> term37391 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarGrouping");
        Field term37390 = ((Class) term37391).getDeclaredField((String) "STACKED");
        ((Field) term37390).setAccessible(true);
        Object enum70 = ((Field) term37390).get((Object) null);
        Class<? extends Object> term37844 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarDirection");
        Field term37843 = ((Class) term37844).getDeclaredField((String) "COL");
        ((Field) term37843).setAccessible(true);
        Object enum71 = ((Field) term37843).get((Object) null);
        Class<? extends Object> term38290 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelScatterStyle");
        Field term38289 = ((Class) term38290).getDeclaredField((String) "MARKER");
        ((Field) term38289).setAccessible(true);
        Object enum72 = ((Field) term38289).get((Object) null);
        HashMap term36826 = new HashMap();
        term36646 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters"));
        setField(term36646, term36646.getClass(), "type", enum69);
        setField(term36646, term36646.getClass(), "categoryAxisTitle", "PqtVXXZMqK");
        setField(term36646, term36646.getClass(), "valueAxisTitle", "rYbtIDVdnd");
        setField(term36646, term36646.getClass(), "categoryColumns", term36678);
        setField(term36646, term36646.getClass(), "dataRows", term36718);
        setField(term36646, term36646.getClass(), "barGrouping", enum70);
        setField(term36646, term36646.getClass(), "barDirection", enum71);
        setIntField(term36646, term36646.getClass(), "barSeriesOverlapPercent", 454281060);
        setField(term36646, term36646.getClass(), "scatterStyle", enum72);
        setBooleanField(term36646, term36646.getClass(), "lineIsSmooth", false);
        setBooleanField(term36646, term36646.getClass(), "plotOnSecondaryAxis", true);
        setBooleanField(term36646, term36646.getClass(), "useSameMinMaxScaleAsPrimary", false);
        setField(term36646, term36646.getClass(), "colorSet", "UBRmXJmfrt");
        setField(term36646, term36646.getClass(), "seriesStyleOptionsMap", term36826);
        term36838 = new LinkedList();
        ((LinkedList) term36838).add("CGOpQSZZwI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term36838;
        callMethod(klass, "setCategoryColumns", argTypes, term36646, args);
    }

};


