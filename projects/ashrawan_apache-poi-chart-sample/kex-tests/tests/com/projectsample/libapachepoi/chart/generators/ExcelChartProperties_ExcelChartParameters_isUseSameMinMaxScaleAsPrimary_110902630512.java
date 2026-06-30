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

public class ExcelChartProperties_ExcelChartParameters_isUseSameMinMaxScaleAsPrimary_110902630512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23233;

    public ExcelChartProperties_ExcelChartParameters_isUseSameMinMaxScaleAsPrimary_110902630512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23482 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartTypes");
        Field term23481 = ((Class) term23482).getDeclaredField((String) "PIE");
        ((Field) term23481).setAccessible(true);
        Object enum44 = ((Field) term23481).get((Object) null);
        ArrayList term23265 = new ArrayList();
        ((ArrayList) term23265).add("WHcwFgsGFC");
        ((ArrayList) term23265).add("HzqpegHiRq");
        ((ArrayList) term23265).add("jwsfVjMoJT");
        ((ArrayList) term23265).add("ZfdXfCCFDf");
        ((ArrayList) term23265).add("MwwjNtdOFT");
        ((ArrayList) term23265).add("VYkqXKVlAJ");
        ((ArrayList) term23265).add("XkIoWJRNwN");
        ((ArrayList) term23265).add("aNWLJdrZMq");
        ((ArrayList) term23265).add("HHmNoYxIGj");
        ArrayList term23377 = new ArrayList();
        ((ArrayList) term23377).add("PtirvZmsGt");
        ((ArrayList) term23377).add("HWkpTmtlrc");
        ((ArrayList) term23377).add("hMmaoREuCK");
        Class<? extends Object> term24058 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarGrouping");
        Field term24057 = ((Class) term24058).getDeclaredField((String) "PERCENT_STACKED");
        ((Field) term24057).setAccessible(true);
        Object enum45 = ((Field) term24057).get((Object) null);
        Class<? extends Object> term24535 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarDirection");
        Field term24534 = ((Class) term24535).getDeclaredField((String) "COL");
        ((Field) term24534).setAccessible(true);
        Object enum46 = ((Field) term24534).get((Object) null);
        Class<? extends Object> term24981 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelScatterStyle");
        Field term24980 = ((Class) term24981).getDeclaredField((String) "MARKER");
        ((Field) term24980).setAccessible(true);
        Object enum47 = ((Field) term24980).get((Object) null);
        HashMap term23469 = new HashMap();
        term23233 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters"));
        setField(term23233, term23233.getClass(), "type", enum44);
        setField(term23233, term23233.getClass(), "categoryAxisTitle", "UfQtPRyWRC");
        setField(term23233, term23233.getClass(), "valueAxisTitle", "FPvxVzzSvD");
        setField(term23233, term23233.getClass(), "categoryColumns", term23265);
        setField(term23233, term23233.getClass(), "dataRows", term23377);
        setField(term23233, term23233.getClass(), "barGrouping", enum45);
        setField(term23233, term23233.getClass(), "barDirection", enum46);
        setIntField(term23233, term23233.getClass(), "barSeriesOverlapPercent", -226514366);
        setField(term23233, term23233.getClass(), "scatterStyle", enum47);
        setBooleanField(term23233, term23233.getClass(), "lineIsSmooth", true);
        setBooleanField(term23233, term23233.getClass(), "plotOnSecondaryAxis", false);
        setBooleanField(term23233, term23233.getClass(), "useSameMinMaxScaleAsPrimary", true);
        setField(term23233, term23233.getClass(), "colorSet", "VeDtgDzGAN");
        setField(term23233, term23233.getClass(), "seriesStyleOptionsMap", term23469);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isUseSameMinMaxScaleAsPrimary", argTypes, term23233, args);
    }

};


