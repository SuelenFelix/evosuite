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

public class ExcelChartProperties_ExcelChartParameters_setBarDirection_69672433721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43481;
     Object enum84;

    public ExcelChartProperties_ExcelChartParameters_setBarDirection_69672433721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term43754 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartTypes");
        Field term43753 = ((Class) term43754).getDeclaredField((String) "BAR");
        ((Field) term43753).setAccessible(true);
        Object enum82 = ((Field) term43753).get((Object) null);
        ArrayList term43513 = new ArrayList();
        ((ArrayList) term43513).add("zNdorvdUgu");
        ((ArrayList) term43513).add("oPxuZbkYio");
        ((ArrayList) term43513).add("vKitydDVnM");
        ((ArrayList) term43513).add("urCiQnUFBM");
        ((ArrayList) term43513).add("EKjQdtKxAM");
        ((ArrayList) term43513).add("TXZAIPQJHt");
        ((ArrayList) term43513).add("DIbeDHICho");
        ((ArrayList) term43513).add("dJGPlmSRnz");
        ArrayList term43613 = new ArrayList();
        ((ArrayList) term43613).add("DPskuFUobI");
        ((ArrayList) term43613).add("wBGfLpNNiZ");
        ((ArrayList) term43613).add("yUGCjlqgJE");
        ((ArrayList) term43613).add("PXdVZyoJyC");
        ((ArrayList) term43613).add("vLerpqavFM");
        ((ArrayList) term43613).add("qnvxzwuGKX");
        Class<? extends Object> term44350 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarGrouping");
        Field term44349 = ((Class) term44350).getDeclaredField((String) "PERCENT_STACKED");
        ((Field) term44349).setAccessible(true);
        Object enum83 = ((Field) term44349).get((Object) null);
        Class<? extends Object> term44827 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarDirection");
        Field term44826 = ((Class) term44827).getDeclaredField((String) "COL");
        ((Field) term44826).setAccessible(true);
        enum84 = ((Field) term44826).get((Object) null);
        Class<? extends Object> term45273 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelScatterStyle");
        Field term45272 = ((Class) term45273).getDeclaredField((String) "SMOOTH");
        ((Field) term45272).setAccessible(true);
        Object enum85 = ((Field) term45272).get((Object) null);
        HashMap term43741 = new HashMap();
        term43481 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters"));
        setField(term43481, term43481.getClass(), "type", enum82);
        setField(term43481, term43481.getClass(), "categoryAxisTitle", "TtGbVmKcnX");
        setField(term43481, term43481.getClass(), "valueAxisTitle", "GJVkUrCVdD");
        setField(term43481, term43481.getClass(), "categoryColumns", term43513);
        setField(term43481, term43481.getClass(), "dataRows", term43613);
        setField(term43481, term43481.getClass(), "barGrouping", enum83);
        setField(term43481, term43481.getClass(), "barDirection", enum84);
        setIntField(term43481, term43481.getClass(), "barSeriesOverlapPercent", 1596070772);
        setField(term43481, term43481.getClass(), "scatterStyle", enum85);
        setBooleanField(term43481, term43481.getClass(), "lineIsSmooth", false);
        setBooleanField(term43481, term43481.getClass(), "plotOnSecondaryAxis", false);
        setBooleanField(term43481, term43481.getClass(), "useSameMinMaxScaleAsPrimary", true);
        setField(term43481, term43481.getClass(), "colorSet", "EdPAvpluZg");
        setField(term43481, term43481.getClass(), "seriesStyleOptionsMap", term43741);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarDirection");
        Object[] args = new Object[1];
        args[0] = enum84;
        callMethod(klass, "setBarDirection", argTypes, term43481, args);
    }

};


