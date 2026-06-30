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

public class ExcelChartProperties_ExcelChartParameters_toString_3671627732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67818;

    public ExcelChartProperties_ExcelChartParameters_toString_3671627732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term68031 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartTypes");
        Field term68030 = ((Class) term68031).getDeclaredField((String) "PIE");
        ((Field) term68030).setAccessible(true);
        Object enum127 = ((Field) term68030).get((Object) null);
        ArrayList term67850 = new ArrayList();
        ArrayList term67854 = new ArrayList();
        ((ArrayList) term67854).add("lRORwXipuk");
        ((ArrayList) term67854).add("fVdTcjgHdw");
        ((ArrayList) term67854).add("wwAwLLcLPp");
        ((ArrayList) term67854).add("nHpMKOmlpQ");
        ((ArrayList) term67854).add("fKhrQsJToZ");
        ((ArrayList) term67854).add("wsysQLGFnl");
        ((ArrayList) term67854).add("ckQLZGFjMX");
        ((ArrayList) term67854).add("qphdrqUtNx");
        ((ArrayList) term67854).add("bwlLFAfNWx");
        Class<? extends Object> term68577 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarGrouping");
        Field term68576 = ((Class) term68577).getDeclaredField((String) "PERCENT_STACKED");
        ((Field) term68576).setAccessible(true);
        Object enum128 = ((Field) term68576).get((Object) null);
        Class<? extends Object> term69054 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarDirection");
        Field term69053 = ((Class) term69054).getDeclaredField((String) "COL");
        ((Field) term69053).setAccessible(true);
        Object enum129 = ((Field) term69053).get((Object) null);
        Class<? extends Object> term69500 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelScatterStyle");
        Field term69499 = ((Class) term69500).getDeclaredField((String) "MARKER");
        ((Field) term69499).setAccessible(true);
        Object enum130 = ((Field) term69499).get((Object) null);
        HashMap term68018 = new HashMap();
        term67818 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters"));
        setField(term67818, term67818.getClass(), "type", enum127);
        setField(term67818, term67818.getClass(), "categoryAxisTitle", "RjNoEywJbC");
        setField(term67818, term67818.getClass(), "valueAxisTitle", "RTTvrwwhou");
        setField(term67818, term67818.getClass(), "categoryColumns", term67850);
        setField(term67818, term67818.getClass(), "dataRows", term67854);
        setField(term67818, term67818.getClass(), "barGrouping", enum128);
        setField(term67818, term67818.getClass(), "barDirection", enum129);
        setIntField(term67818, term67818.getClass(), "barSeriesOverlapPercent", -268815336);
        setField(term67818, term67818.getClass(), "scatterStyle", enum130);
        setBooleanField(term67818, term67818.getClass(), "lineIsSmooth", true);
        setBooleanField(term67818, term67818.getClass(), "plotOnSecondaryAxis", true);
        setBooleanField(term67818, term67818.getClass(), "useSameMinMaxScaleAsPrimary", true);
        setField(term67818, term67818.getClass(), "colorSet", "JWodNQzjjV");
        setField(term67818, term67818.getClass(), "seriesStyleOptionsMap", term68018);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term67818, args);
    }

};


