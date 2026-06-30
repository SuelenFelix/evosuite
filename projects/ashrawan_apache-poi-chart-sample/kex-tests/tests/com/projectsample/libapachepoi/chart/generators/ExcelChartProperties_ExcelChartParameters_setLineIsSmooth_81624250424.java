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
import java.lang.Boolean;

public class ExcelChartProperties_ExcelChartParameters_setLineIsSmooth_81624250424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50526;
     Object term50838;

    public ExcelChartProperties_ExcelChartParameters_setLineIsSmooth_81624250424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term50841 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartTypes");
        Field term50840 = ((Class) term50841).getDeclaredField((String) "SCATTER");
        ((Field) term50840).setAccessible(true);
        Object enum95 = ((Field) term50840).get((Object) null);
        ArrayList term50562 = new ArrayList();
        ((ArrayList) term50562).add("vOVuNSCCLe");
        ((ArrayList) term50562).add("fzeqPnzpnt");
        ((ArrayList) term50562).add("RxbhrFBjkO");
        ((ArrayList) term50562).add("aanyiAOJCl");
        ((ArrayList) term50562).add("VDokbsCuqq");
        ((ArrayList) term50562).add("xClUIcPECX");
        ((ArrayList) term50562).add("avhRaGZaBF");
        ((ArrayList) term50562).add("JkgoRtImdE");
        ArrayList term50662 = new ArrayList();
        ((ArrayList) term50662).add("qFGKIJjlmV");
        ((ArrayList) term50662).add("IHqvyhMtuM");
        ((ArrayList) term50662).add("dAldIGYAXV");
        ((ArrayList) term50662).add("mLwibAPEsa");
        ((ArrayList) term50662).add("zsWKWiTFuo");
        ((ArrayList) term50662).add("UPUbwyHQKN");
        ((ArrayList) term50662).add("lgQkrXANyI");
        ((ArrayList) term50662).add("MeTmRZXErV");
        ((ArrayList) term50662).add("jNxbVmoZgq");
        Class<? extends Object> term51479 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarGrouping");
        Field term51478 = ((Class) term51479).getDeclaredField((String) "PERCENT_STACKED");
        ((Field) term51478).setAccessible(true);
        Object enum96 = ((Field) term51478).get((Object) null);
        Class<? extends Object> term51956 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarDirection");
        Field term51955 = ((Class) term51956).getDeclaredField((String) "COL");
        ((Field) term51955).setAccessible(true);
        Object enum97 = ((Field) term51955).get((Object) null);
        Class<? extends Object> term52402 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelScatterStyle");
        Field term52401 = ((Class) term52402).getDeclaredField((String) "SMOOTH");
        ((Field) term52401).setAccessible(true);
        Object enum98 = ((Field) term52401).get((Object) null);
        HashMap term50826 = new HashMap();
        term50526 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters"));
        setField(term50526, term50526.getClass(), "type", enum95);
        setField(term50526, term50526.getClass(), "categoryAxisTitle", "TSyCeEZPaT");
        setField(term50526, term50526.getClass(), "valueAxisTitle", "JeZFtaqkzW");
        setField(term50526, term50526.getClass(), "categoryColumns", term50562);
        setField(term50526, term50526.getClass(), "dataRows", term50662);
        setField(term50526, term50526.getClass(), "barGrouping", enum96);
        setField(term50526, term50526.getClass(), "barDirection", enum97);
        setIntField(term50526, term50526.getClass(), "barSeriesOverlapPercent", 287287233);
        setField(term50526, term50526.getClass(), "scatterStyle", enum98);
        setBooleanField(term50526, term50526.getClass(), "lineIsSmooth", false);
        setBooleanField(term50526, term50526.getClass(), "plotOnSecondaryAxis", false);
        setBooleanField(term50526, term50526.getClass(), "useSameMinMaxScaleAsPrimary", false);
        setField(term50526, term50526.getClass(), "colorSet", "PvmBHIXaMY");
        setField(term50526, term50526.getClass(), "seriesStyleOptionsMap", term50826);
        term50838 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term50838;
        callMethod(klass, "setLineIsSmooth", argTypes, term50526, args);
    }

};


