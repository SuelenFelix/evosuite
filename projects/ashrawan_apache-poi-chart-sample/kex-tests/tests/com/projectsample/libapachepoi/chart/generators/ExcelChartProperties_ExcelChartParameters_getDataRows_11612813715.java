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

public class ExcelChartProperties_ExcelChartParameters_getDataRows_11612813715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8643;

    public ExcelChartProperties_ExcelChartParameters_getDataRows_11612813715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8836 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartTypes");
        Field term8835 = ((Class) term8836).getDeclaredField((String) "PIE");
        ((Field) term8835).setAccessible(true);
        Object enum16 = ((Field) term8835).get((Object) null);
        ArrayList term8675 = new ArrayList();
        ((ArrayList) term8675).add("MLqYREekMl");
        ((ArrayList) term8675).add("ytSBIKXogI");
        ((ArrayList) term8675).add("nHXjMycHlU");
        ((ArrayList) term8675).add("ieCtQFdkii");
        ((ArrayList) term8675).add("dEnhdmILtU");
        ((ArrayList) term8675).add("hoicvmsovO");
        ((ArrayList) term8675).add("eqJfYWRaEL");
        ArrayList term8763 = new ArrayList();
        ((ArrayList) term8763).add("fhkbdRViHi");
        Class<? extends Object> term9372 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarGrouping");
        Field term9371 = ((Class) term9372).getDeclaredField((String) "STACKED");
        ((Field) term9371).setAccessible(true);
        Object enum17 = ((Field) term9371).get((Object) null);
        Class<? extends Object> term9825 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarDirection");
        Field term9824 = ((Class) term9825).getDeclaredField((String) "COL");
        ((Field) term9824).setAccessible(true);
        Object enum18 = ((Field) term9824).get((Object) null);
        Class<? extends Object> term10271 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelScatterStyle");
        Field term10270 = ((Class) term10271).getDeclaredField((String) "MARKER");
        ((Field) term10270).setAccessible(true);
        Object enum19 = ((Field) term10270).get((Object) null);
        HashMap term8823 = new HashMap();
        term8643 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters"));
        setField(term8643, term8643.getClass(), "type", enum16);
        setField(term8643, term8643.getClass(), "categoryAxisTitle", "YRHGsAkhxb");
        setField(term8643, term8643.getClass(), "valueAxisTitle", "ffYhPOzlUs");
        setField(term8643, term8643.getClass(), "categoryColumns", term8675);
        setField(term8643, term8643.getClass(), "dataRows", term8763);
        setField(term8643, term8643.getClass(), "barGrouping", enum17);
        setField(term8643, term8643.getClass(), "barDirection", enum18);
        setIntField(term8643, term8643.getClass(), "barSeriesOverlapPercent", 1134449235);
        setField(term8643, term8643.getClass(), "scatterStyle", enum19);
        setBooleanField(term8643, term8643.getClass(), "lineIsSmooth", false);
        setBooleanField(term8643, term8643.getClass(), "plotOnSecondaryAxis", true);
        setBooleanField(term8643, term8643.getClass(), "useSameMinMaxScaleAsPrimary", false);
        setField(term8643, term8643.getClass(), "colorSet", "uWHnvSvaPl");
        setField(term8643, term8643.getClass(), "seriesStyleOptionsMap", term8823);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDataRows", argTypes, term8643, args);
    }

};


