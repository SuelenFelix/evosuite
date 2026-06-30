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

public class ExcelChartProperties_ExcelChartParameters_setType_91451230215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29739;
     Object enum60;

    public ExcelChartProperties_ExcelChartParameters_setType_91451230215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term29963 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartTypes");
        Field term29962 = ((Class) term29963).getDeclaredField((String) "LINE");
        ((Field) term29962).setAccessible(true);
        Object enum56 = ((Field) term29962).get((Object) null);
        ArrayList term29772 = new ArrayList();
        ((ArrayList) term29772).add("kGMQdqJYyB");
        ((ArrayList) term29772).add("XJJNClzHRf");
        ((ArrayList) term29772).add("HDaezxQfQR");
        ((ArrayList) term29772).add("iikZEapDlu");
        ((ArrayList) term29772).add("nhoHrZfnIN");
        ((ArrayList) term29772).add("ZkMALXpEAZ");
        ((ArrayList) term29772).add("tXfQjSqDzN");
        ArrayList term29860 = new ArrayList();
        ((ArrayList) term29860).add("BjugTaMcxJ");
        ((ArrayList) term29860).add("vGiuZVPJNH");
        Class<? extends Object> term30512 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarGrouping");
        Field term30511 = ((Class) term30512).getDeclaredField((String) "CLUSTERED");
        ((Field) term30511).setAccessible(true);
        Object enum57 = ((Field) term30511).get((Object) null);
        Class<? extends Object> term30971 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarDirection");
        Field term30970 = ((Class) term30971).getDeclaredField((String) "BAR");
        ((Field) term30970).setAccessible(true);
        Object enum58 = ((Field) term30970).get((Object) null);
        Class<? extends Object> term31417 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelScatterStyle");
        Field term31416 = ((Class) term31417).getDeclaredField((String) "LINE_MARKER");
        ((Field) term31416).setAccessible(true);
        Object enum59 = ((Field) term31416).get((Object) null);
        HashMap term29939 = new HashMap();
        term29739 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters"));
        setField(term29739, term29739.getClass(), "type", enum56);
        setField(term29739, term29739.getClass(), "categoryAxisTitle", "PgPzMSEjjX");
        setField(term29739, term29739.getClass(), "valueAxisTitle", "wzsPSPcRdj");
        setField(term29739, term29739.getClass(), "categoryColumns", term29772);
        setField(term29739, term29739.getClass(), "dataRows", term29860);
        setField(term29739, term29739.getClass(), "barGrouping", enum57);
        setField(term29739, term29739.getClass(), "barDirection", enum58);
        setIntField(term29739, term29739.getClass(), "barSeriesOverlapPercent", -602026508);
        setField(term29739, term29739.getClass(), "scatterStyle", enum59);
        setBooleanField(term29739, term29739.getClass(), "lineIsSmooth", true);
        setBooleanField(term29739, term29739.getClass(), "plotOnSecondaryAxis", true);
        setBooleanField(term29739, term29739.getClass(), "useSameMinMaxScaleAsPrimary", false);
        setField(term29739, term29739.getClass(), "colorSet", "tlzpzIjMib");
        setField(term29739, term29739.getClass(), "seriesStyleOptionsMap", term29939);
        Class<? extends Object> term31897 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartTypes");
        Field term31896 = ((Class) term31897).getDeclaredField((String) "SCATTER");
        ((Field) term31896).setAccessible(true);
        enum60 = ((Field) term31896).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartTypes");
        Object[] args = new Object[1];
        args[0] = enum60;
        callMethod(klass, "setType", argTypes, term29739, args);
    }

};


