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

public class ExcelChartProperties_ExcelChartParameters_getCategoryColumns_4237967254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6515;

    public ExcelChartProperties_ExcelChartParameters_getCategoryColumns_4237967254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6717 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartTypes");
        Field term6716 = ((Class) term6717).getDeclaredField((String) "NONE");
        ((Field) term6716).setAccessible(true);
        Object enum12 = ((Field) term6716).get((Object) null);
        ArrayList term6548 = new ArrayList();
        ((ArrayList) term6548).add("hxCBltsObl");
        ((ArrayList) term6548).add("BndsHwAFMv");
        ArrayList term6576 = new ArrayList();
        ((ArrayList) term6576).add("GzFkzHGYFt");
        ((ArrayList) term6576).add("tShwQLRGNe");
        ((ArrayList) term6576).add("LvtrsXUliU");
        ((ArrayList) term6576).add("xLbjWUgOIL");
        ((ArrayList) term6576).add("jDtqGUpnZN");
        ((ArrayList) term6576).add("nGKItKLYNC");
        Class<? extends Object> term7256 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarGrouping");
        Field term7255 = ((Class) term7256).getDeclaredField((String) "STANDARD");
        ((Field) term7255).setAccessible(true);
        Object enum13 = ((Field) term7255).get((Object) null);
        Class<? extends Object> term7712 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarDirection");
        Field term7711 = ((Class) term7712).getDeclaredField((String) "BAR");
        ((Field) term7711).setAccessible(true);
        Object enum14 = ((Field) term7711).get((Object) null);
        Class<? extends Object> term8158 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelScatterStyle");
        Field term8157 = ((Class) term8158).getDeclaredField((String) "SMOOTH_MARKER");
        ((Field) term8157).setAccessible(true);
        Object enum15 = ((Field) term8157).get((Object) null);
        HashMap term6704 = new HashMap();
        term6515 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters"));
        setField(term6515, term6515.getClass(), "type", enum12);
        setField(term6515, term6515.getClass(), "categoryAxisTitle", "UlajhuVLaP");
        setField(term6515, term6515.getClass(), "valueAxisTitle", "gGSMzuGICf");
        setField(term6515, term6515.getClass(), "categoryColumns", term6548);
        setField(term6515, term6515.getClass(), "dataRows", term6576);
        setField(term6515, term6515.getClass(), "barGrouping", enum13);
        setField(term6515, term6515.getClass(), "barDirection", enum14);
        setIntField(term6515, term6515.getClass(), "barSeriesOverlapPercent", -1339778481);
        setField(term6515, term6515.getClass(), "scatterStyle", enum15);
        setBooleanField(term6515, term6515.getClass(), "lineIsSmooth", true);
        setBooleanField(term6515, term6515.getClass(), "plotOnSecondaryAxis", false);
        setBooleanField(term6515, term6515.getClass(), "useSameMinMaxScaleAsPrimary", true);
        setField(term6515, term6515.getClass(), "colorSet", "UiUYnPrcCi");
        setField(term6515, term6515.getClass(), "seriesStyleOptionsMap", term6704);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCategoryColumns", argTypes, term6515, args);
    }

};


