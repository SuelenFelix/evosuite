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

public class ExcelChartProperties_ExcelChartParameters_getBarDirection_1932292817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12929;

    public ExcelChartProperties_ExcelChartParameters_getBarDirection_1932292817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13118 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartTypes");
        Field term13117 = ((Class) term13118).getDeclaredField((String) "NONE");
        ((Field) term13117).setAccessible(true);
        Object enum24 = ((Field) term13117).get((Object) null);
        ArrayList term12962 = new ArrayList();
        ((ArrayList) term12962).add("PkWMRdJcBb");
        ((ArrayList) term12962).add("jSpAteRute");
        ((ArrayList) term12962).add("swZVeJAxjt");
        ((ArrayList) term12962).add("xOcJIiQQDu");
        ((ArrayList) term12962).add("GVizqqzXpy");
        ArrayList term13026 = new ArrayList();
        ((ArrayList) term13026).add("JqXGgAhZPl");
        ((ArrayList) term13026).add("jiKYgYHqIS");
        Class<? extends Object> term13647 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarGrouping");
        Field term13646 = ((Class) term13647).getDeclaredField((String) "STACKED");
        ((Field) term13646).setAccessible(true);
        Object enum25 = ((Field) term13646).get((Object) null);
        Class<? extends Object> term14100 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarDirection");
        Field term14099 = ((Class) term14100).getDeclaredField((String) "COL");
        ((Field) term14099).setAccessible(true);
        Object enum26 = ((Field) term14099).get((Object) null);
        Class<? extends Object> term14546 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelScatterStyle");
        Field term14545 = ((Class) term14546).getDeclaredField((String) "SMOOTH_MARKER");
        ((Field) term14545).setAccessible(true);
        Object enum27 = ((Field) term14545).get((Object) null);
        HashMap term13105 = new HashMap();
        term12929 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters"));
        setField(term12929, term12929.getClass(), "type", enum24);
        setField(term12929, term12929.getClass(), "categoryAxisTitle", "PHvxnGHptP");
        setField(term12929, term12929.getClass(), "valueAxisTitle", "TimdotUuNC");
        setField(term12929, term12929.getClass(), "categoryColumns", term12962);
        setField(term12929, term12929.getClass(), "dataRows", term13026);
        setField(term12929, term12929.getClass(), "barGrouping", enum25);
        setField(term12929, term12929.getClass(), "barDirection", enum26);
        setIntField(term12929, term12929.getClass(), "barSeriesOverlapPercent", 1622346318);
        setField(term12929, term12929.getClass(), "scatterStyle", enum27);
        setBooleanField(term12929, term12929.getClass(), "lineIsSmooth", false);
        setBooleanField(term12929, term12929.getClass(), "plotOnSecondaryAxis", false);
        setBooleanField(term12929, term12929.getClass(), "useSameMinMaxScaleAsPrimary", true);
        setField(term12929, term12929.getClass(), "colorSet", "DfISiziTgG");
        setField(term12929, term12929.getClass(), "seriesStyleOptionsMap", term13105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBarDirection", argTypes, term12929, args);
    }

};


