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

public class ExcelChartProperties_ExcelChartParameters_getType_15959247321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public ExcelChartProperties_ExcelChartParameters_getType_15959247321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term259 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartTypes");
        Field term258 = ((Class) term259).getDeclaredField((String) "COLUMN");
        ((Field) term258).setAccessible(true);
        Object enum0 = ((Field) term258).get((Object) null);
        ArrayList term36 = new ArrayList();
        ((ArrayList) term36).add("MuLcgQHgqz");
        ((ArrayList) term36).add("xxtlPwDYFs");
        ((ArrayList) term36).add("jJCZpVmanW");
        ((ArrayList) term36).add("EGtDIRbSSb");
        ((ArrayList) term36).add("SzjVpOQTyS");
        ArrayList term100 = new ArrayList();
        ((ArrayList) term100).add("MjGYSRKTNF");
        ((ArrayList) term100).add("hRNSzYYIrc");
        ((ArrayList) term100).add("RMFIsYGgne");
        ((ArrayList) term100).add("NRdvgJlhkX");
        Class<? extends Object> term869 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarGrouping");
        Field term868 = ((Class) term869).getDeclaredField((String) "STANDARD");
        ((Field) term868).setAccessible(true);
        Object enum1 = ((Field) term868).get((Object) null);
        Class<? extends Object> term1339 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarDirection");
        Field term1338 = ((Class) term1339).getDeclaredField((String) "BAR");
        ((Field) term1338).setAccessible(true);
        Object enum2 = ((Field) term1338).get((Object) null);
        Class<? extends Object> term1861 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelScatterStyle");
        Field term1860 = ((Class) term1861).getDeclaredField((String) "LINE");
        ((Field) term1860).setAccessible(true);
        Object enum3 = ((Field) term1860).get((Object) null);
        HashMap term195 = new HashMap();
        term1 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters"));
        setField(term1, term1.getClass(), "type", enum0);
        setField(term1, term1.getClass(), "categoryAxisTitle", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "valueAxisTitle", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "categoryColumns", term36);
        setField(term1, term1.getClass(), "dataRows", term100);
        setField(term1, term1.getClass(), "barGrouping", enum1);
        setField(term1, term1.getClass(), "barDirection", enum2);
        setIntField(term1, term1.getClass(), "barSeriesOverlapPercent", 568599855);
        setField(term1, term1.getClass(), "scatterStyle", enum3);
        setBooleanField(term1, term1.getClass(), "lineIsSmooth", false);
        setBooleanField(term1, term1.getClass(), "plotOnSecondaryAxis", false);
        setBooleanField(term1, term1.getClass(), "useSameMinMaxScaleAsPrimary", false);
        setField(term1, term1.getClass(), "colorSet", "uuaPigETmJ");
        setField(term1, term1.getClass(), "seriesStyleOptionsMap", term195);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term1, args);
    }

};


