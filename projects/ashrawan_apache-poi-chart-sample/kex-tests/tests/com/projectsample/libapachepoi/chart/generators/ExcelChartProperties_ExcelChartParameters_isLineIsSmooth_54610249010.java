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

public class ExcelChartProperties_ExcelChartParameters_isLineIsSmooth_54610249010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19003;

    public ExcelChartProperties_ExcelChartParameters_isLineIsSmooth_54610249010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19268 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartTypes");
        Field term19267 = ((Class) term19268).getDeclaredField((String) "PIE");
        ((Field) term19267).setAccessible(true);
        Object enum36 = ((Field) term19267).get((Object) null);
        ArrayList term19035 = new ArrayList();
        ((ArrayList) term19035).add("mXGCWJDOqA");
        ((ArrayList) term19035).add("dpNsDgfPso");
        ((ArrayList) term19035).add("hCWPJQKpdc");
        ((ArrayList) term19035).add("WzMEhMXkKx");
        ((ArrayList) term19035).add("XOiDvlDhdc");
        ((ArrayList) term19035).add("AdxvLJhNLe");
        ((ArrayList) term19035).add("lHfTrWKMPk");
        ((ArrayList) term19035).add("JDaAnsVTGV");
        ArrayList term19135 = new ArrayList();
        ((ArrayList) term19135).add("mLUZFTfjle");
        ((ArrayList) term19135).add("xIeFjkHkOe");
        ((ArrayList) term19135).add("SdCKLMIYnX");
        ((ArrayList) term19135).add("OJJtVNPyKZ");
        ((ArrayList) term19135).add("AKNapTAfmD");
        ((ArrayList) term19135).add("xJgPlLxpgC");
        Class<? extends Object> term19864 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarGrouping");
        Field term19863 = ((Class) term19864).getDeclaredField((String) "STACKED");
        ((Field) term19863).setAccessible(true);
        Object enum37 = ((Field) term19863).get((Object) null);
        Class<? extends Object> term20317 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarDirection");
        Field term20316 = ((Class) term20317).getDeclaredField((String) "COL");
        ((Field) term20316).setAccessible(true);
        Object enum38 = ((Field) term20316).get((Object) null);
        Class<? extends Object> term20763 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelScatterStyle");
        Field term20762 = ((Class) term20763).getDeclaredField((String) "MARKER");
        ((Field) term20762).setAccessible(true);
        Object enum39 = ((Field) term20762).get((Object) null);
        HashMap term19255 = new HashMap();
        term19003 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters"));
        setField(term19003, term19003.getClass(), "type", enum36);
        setField(term19003, term19003.getClass(), "categoryAxisTitle", "XylxrMBraH");
        setField(term19003, term19003.getClass(), "valueAxisTitle", "pORebkoRdD");
        setField(term19003, term19003.getClass(), "categoryColumns", term19035);
        setField(term19003, term19003.getClass(), "dataRows", term19135);
        setField(term19003, term19003.getClass(), "barGrouping", enum37);
        setField(term19003, term19003.getClass(), "barDirection", enum38);
        setIntField(term19003, term19003.getClass(), "barSeriesOverlapPercent", 865208305);
        setField(term19003, term19003.getClass(), "scatterStyle", enum39);
        setBooleanField(term19003, term19003.getClass(), "lineIsSmooth", false);
        setBooleanField(term19003, term19003.getClass(), "plotOnSecondaryAxis", true);
        setBooleanField(term19003, term19003.getClass(), "useSameMinMaxScaleAsPrimary", true);
        setField(term19003, term19003.getClass(), "colorSet", "EYtfuJaxiM");
        setField(term19003, term19003.getClass(), "seriesStyleOptionsMap", term19255);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isLineIsSmooth", argTypes, term19003, args);
    }

};


