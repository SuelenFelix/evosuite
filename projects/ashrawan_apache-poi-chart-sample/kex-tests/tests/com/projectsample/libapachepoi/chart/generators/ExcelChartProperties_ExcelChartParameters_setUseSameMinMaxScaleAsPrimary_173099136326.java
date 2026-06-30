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

public class ExcelChartProperties_ExcelChartParameters_setUseSameMinMaxScaleAsPrimary_173099136326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55036;
     Object term55205;

    public ExcelChartProperties_ExcelChartParameters_setUseSameMinMaxScaleAsPrimary_173099136326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term55208 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartTypes");
        Field term55207 = ((Class) term55208).getDeclaredField((String) "PIE");
        ((Field) term55207).setAccessible(true);
        Object enum103 = ((Field) term55207).get((Object) null);
        ArrayList term55068 = new ArrayList();
        ((ArrayList) term55068).add("IEYhJmgCVd");
        ((ArrayList) term55068).add("KSJeYkkvpk");
        ((ArrayList) term55068).add("qUtkFGMNUV");
        ((ArrayList) term55068).add("mGRiYhnMcR");
        ArrayList term55120 = new ArrayList();
        ((ArrayList) term55120).add("NFlvfJCVPO");
        ((ArrayList) term55120).add("KarbTXFmUU");
        Class<? extends Object> term55724 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarGrouping");
        Field term55723 = ((Class) term55724).getDeclaredField((String) "STANDARD");
        ((Field) term55723).setAccessible(true);
        Object enum104 = ((Field) term55723).get((Object) null);
        Class<? extends Object> term56180 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarDirection");
        Field term56179 = ((Class) term56180).getDeclaredField((String) "BAR");
        ((Field) term56179).setAccessible(true);
        Object enum105 = ((Field) term56179).get((Object) null);
        Class<? extends Object> term56626 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelScatterStyle");
        Field term56625 = ((Class) term56626).getDeclaredField((String) "MARKER");
        ((Field) term56625).setAccessible(true);
        Object enum106 = ((Field) term56625).get((Object) null);
        HashMap term55193 = new HashMap();
        term55036 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters"));
        setField(term55036, term55036.getClass(), "type", enum103);
        setField(term55036, term55036.getClass(), "categoryAxisTitle", "bdyhHbDAmJ");
        setField(term55036, term55036.getClass(), "valueAxisTitle", "BBXiTNHqGE");
        setField(term55036, term55036.getClass(), "categoryColumns", term55068);
        setField(term55036, term55036.getClass(), "dataRows", term55120);
        setField(term55036, term55036.getClass(), "barGrouping", enum104);
        setField(term55036, term55036.getClass(), "barDirection", enum105);
        setIntField(term55036, term55036.getClass(), "barSeriesOverlapPercent", -2027534003);
        setField(term55036, term55036.getClass(), "scatterStyle", enum106);
        setBooleanField(term55036, term55036.getClass(), "lineIsSmooth", false);
        setBooleanField(term55036, term55036.getClass(), "plotOnSecondaryAxis", false);
        setBooleanField(term55036, term55036.getClass(), "useSameMinMaxScaleAsPrimary", true);
        setField(term55036, term55036.getClass(), "colorSet", "jiUSjqwSIQ");
        setField(term55036, term55036.getClass(), "seriesStyleOptionsMap", term55193);
        term55205 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term55205;
        callMethod(klass, "setUseSameMinMaxScaleAsPrimary", argTypes, term55036, args);
    }

};


