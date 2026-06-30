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

public class ExcelChartProperties_ExcelChartParameters_setValueAxisTitle_185458505917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34562;

    public ExcelChartProperties_ExcelChartParameters_setValueAxisTitle_185458505917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term34753 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartTypes");
        Field term34752 = ((Class) term34753).getDeclaredField((String) "PIE");
        ((Field) term34752).setAccessible(true);
        Object enum65 = ((Field) term34752).get((Object) null);
        ArrayList term34594 = new ArrayList();
        ((ArrayList) term34594).add("xvkbvaEGYd");
        ((ArrayList) term34594).add("HBGNxdNURv");
        ArrayList term34622 = new ArrayList();
        ((ArrayList) term34622).add("mfCpTPPQQm");
        ((ArrayList) term34622).add("OcJCIDNIXA");
        ((ArrayList) term34622).add("XfRABIFVEp");
        ((ArrayList) term34622).add("MHGKyEnwKc");
        ((ArrayList) term34622).add("ShIELyuULw");
        Class<? extends Object> term35279 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarGrouping");
        Field term35278 = ((Class) term35279).getDeclaredField((String) "STACKED");
        ((Field) term35278).setAccessible(true);
        Object enum66 = ((Field) term35278).get((Object) null);
        Class<? extends Object> term35732 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarDirection");
        Field term35731 = ((Class) term35732).getDeclaredField((String) "COL");
        ((Field) term35731).setAccessible(true);
        Object enum67 = ((Field) term35731).get((Object) null);
        Class<? extends Object> term36178 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelScatterStyle");
        Field term36177 = ((Class) term36178).getDeclaredField((String) "LINE");
        ((Field) term36177).setAccessible(true);
        Object enum68 = ((Field) term36177).get((Object) null);
        HashMap term34728 = new HashMap();
        term34562 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters"));
        setField(term34562, term34562.getClass(), "type", enum65);
        setField(term34562, term34562.getClass(), "categoryAxisTitle", "EwQBhZjCIT");
        setField(term34562, term34562.getClass(), "valueAxisTitle", "aSkmSwTnEw");
        setField(term34562, term34562.getClass(), "categoryColumns", term34594);
        setField(term34562, term34562.getClass(), "dataRows", term34622);
        setField(term34562, term34562.getClass(), "barGrouping", enum66);
        setField(term34562, term34562.getClass(), "barDirection", enum67);
        setIntField(term34562, term34562.getClass(), "barSeriesOverlapPercent", 579005622);
        setField(term34562, term34562.getClass(), "scatterStyle", enum68);
        setBooleanField(term34562, term34562.getClass(), "lineIsSmooth", false);
        setBooleanField(term34562, term34562.getClass(), "plotOnSecondaryAxis", true);
        setBooleanField(term34562, term34562.getClass(), "useSameMinMaxScaleAsPrimary", false);
        setField(term34562, term34562.getClass(), "colorSet", "IpQuOGMgmj");
        setField(term34562, term34562.getClass(), "seriesStyleOptionsMap", term34728);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WBAOTqErtm";
        callMethod(klass, "setValueAxisTitle", argTypes, term34562, args);
    }

};


