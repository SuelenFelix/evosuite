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

public class ExcelChartProperties_ExcelChartParameters_setScatterStyle_198804590523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47899;
     Object enum94;

    public ExcelChartProperties_ExcelChartParameters_setScatterStyle_198804590523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term48126 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartTypes");
        Field term48125 = ((Class) term48126).getDeclaredField((String) "SCATTER");
        ((Field) term48125).setAccessible(true);
        Object enum90 = ((Field) term48125).get((Object) null);
        ArrayList term47935 = new ArrayList();
        ((ArrayList) term47935).add("pumvwBWvpy");
        ((ArrayList) term47935).add("HwLHeGLyhe");
        ((ArrayList) term47935).add("RDnkgWkcbz");
        ArrayList term47975 = new ArrayList();
        ((ArrayList) term47975).add("IBpaxltauX");
        ((ArrayList) term47975).add("hePqROaplw");
        ((ArrayList) term47975).add("PJcSNDruWd");
        ((ArrayList) term47975).add("VVNNlAePXF");
        ((ArrayList) term47975).add("jnwVnmKAFv");
        ((ArrayList) term47975).add("TXyHhqeCjR");
        Class<? extends Object> term48684 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarGrouping");
        Field term48683 = ((Class) term48684).getDeclaredField((String) "PERCENT_STACKED");
        ((Field) term48683).setAccessible(true);
        Object enum91 = ((Field) term48683).get((Object) null);
        Class<? extends Object> term49161 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarDirection");
        Field term49160 = ((Class) term49161).getDeclaredField((String) "COL");
        ((Field) term49160).setAccessible(true);
        Object enum92 = ((Field) term49160).get((Object) null);
        Class<? extends Object> term49607 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelScatterStyle");
        Field term49606 = ((Class) term49607).getDeclaredField((String) "MARKER");
        ((Field) term49606).setAccessible(true);
        Object enum93 = ((Field) term49606).get((Object) null);
        HashMap term48103 = new HashMap();
        term47899 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters"));
        setField(term47899, term47899.getClass(), "type", enum90);
        setField(term47899, term47899.getClass(), "categoryAxisTitle", "riMtzCoxNj");
        setField(term47899, term47899.getClass(), "valueAxisTitle", "YAXkVjQZcV");
        setField(term47899, term47899.getClass(), "categoryColumns", term47935);
        setField(term47899, term47899.getClass(), "dataRows", term47975);
        setField(term47899, term47899.getClass(), "barGrouping", enum91);
        setField(term47899, term47899.getClass(), "barDirection", enum92);
        setIntField(term47899, term47899.getClass(), "barSeriesOverlapPercent", -93135961);
        setField(term47899, term47899.getClass(), "scatterStyle", enum93);
        setBooleanField(term47899, term47899.getClass(), "lineIsSmooth", true);
        setBooleanField(term47899, term47899.getClass(), "plotOnSecondaryAxis", true);
        setBooleanField(term47899, term47899.getClass(), "useSameMinMaxScaleAsPrimary", true);
        setField(term47899, term47899.getClass(), "colorSet", "lZIgPZPgTu");
        setField(term47899, term47899.getClass(), "seriesStyleOptionsMap", term48103);
        Class<? extends Object> term50072 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelScatterStyle");
        Field term50071 = ((Class) term50072).getDeclaredField((String) "SMOOTH");
        ((Field) term50071).setAccessible(true);
        enum94 = ((Field) term50071).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelScatterStyle");
        Object[] args = new Object[1];
        args[0] = enum94;
        callMethod(klass, "setScatterStyle", argTypes, term47899, args);
    }

};


