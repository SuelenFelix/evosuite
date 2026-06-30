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

public class ExcelChartProperties_ExcelChartParameters_getScatterStyle_11869005259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17035;

    public ExcelChartProperties_ExcelChartParameters_getScatterStyle_11869005259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17158 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartTypes");
        Field term17157 = ((Class) term17158).getDeclaredField((String) "PIE");
        ((Field) term17157).setAccessible(true);
        Object enum32 = ((Field) term17157).get((Object) null);
        ArrayList term17067 = new ArrayList();
        ArrayList term17071 = new ArrayList();
        ((ArrayList) term17071).add("SJiQaLvSKv");
        ((ArrayList) term17071).add("OEXDRUKcFl");
        Class<? extends Object> term17634 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarGrouping");
        Field term17633 = ((Class) term17634).getDeclaredField((String) "CLUSTERED");
        ((Field) term17633).setAccessible(true);
        Object enum33 = ((Field) term17633).get((Object) null);
        Class<? extends Object> term18093 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarDirection");
        Field term18092 = ((Class) term18093).getDeclaredField((String) "BAR");
        ((Field) term18092).setAccessible(true);
        Object enum34 = ((Field) term18092).get((Object) null);
        Class<? extends Object> term18539 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelScatterStyle");
        Field term18538 = ((Class) term18539).getDeclaredField((String) "MARKER");
        ((Field) term18538).setAccessible(true);
        Object enum35 = ((Field) term18538).get((Object) null);
        HashMap term17145 = new HashMap();
        term17035 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters"));
        setField(term17035, term17035.getClass(), "type", enum32);
        setField(term17035, term17035.getClass(), "categoryAxisTitle", "fztQhjqwdP");
        setField(term17035, term17035.getClass(), "valueAxisTitle", "eVpkWxjuki");
        setField(term17035, term17035.getClass(), "categoryColumns", term17067);
        setField(term17035, term17035.getClass(), "dataRows", term17071);
        setField(term17035, term17035.getClass(), "barGrouping", enum33);
        setField(term17035, term17035.getClass(), "barDirection", enum34);
        setIntField(term17035, term17035.getClass(), "barSeriesOverlapPercent", -1007160944);
        setField(term17035, term17035.getClass(), "scatterStyle", enum35);
        setBooleanField(term17035, term17035.getClass(), "lineIsSmooth", true);
        setBooleanField(term17035, term17035.getClass(), "plotOnSecondaryAxis", false);
        setBooleanField(term17035, term17035.getClass(), "useSameMinMaxScaleAsPrimary", false);
        setField(term17035, term17035.getClass(), "colorSet", "RYdKCNNMBR");
        setField(term17035, term17035.getClass(), "seriesStyleOptionsMap", term17145);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScatterStyle", argTypes, term17035, args);
    }

};


