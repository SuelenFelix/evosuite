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

public class ExcelChartProperties_ExcelChartParameters_getSeriesStyleOptionsMap_176567712214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27615;

    public ExcelChartProperties_ExcelChartParameters_getSeriesStyleOptionsMap_176567712214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term27816 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartTypes");
        Field term27815 = ((Class) term27816).getDeclaredField((String) "PIE");
        ((Field) term27815).setAccessible(true);
        Object enum52 = ((Field) term27815).get((Object) null);
        ArrayList term27647 = new ArrayList();
        ((ArrayList) term27647).add("ekxGuOYIwi");
        ((ArrayList) term27647).add("RbVQXSpxXy");
        ((ArrayList) term27647).add("YpJbIgJWWv");
        ((ArrayList) term27647).add("JppkknKVOw");
        ((ArrayList) term27647).add("iljANwuEjk");
        ArrayList term27711 = new ArrayList();
        ((ArrayList) term27711).add("kNqaJKIATy");
        ((ArrayList) term27711).add("vKQukfbJUd");
        ((ArrayList) term27711).add("lFRJFUMVbx");
        Class<? extends Object> term28352 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarGrouping");
        Field term28351 = ((Class) term28352).getDeclaredField((String) "PERCENT_STACKED");
        ((Field) term28351).setAccessible(true);
        Object enum53 = ((Field) term28351).get((Object) null);
        Class<? extends Object> term28829 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarDirection");
        Field term28828 = ((Class) term28829).getDeclaredField((String) "COL");
        ((Field) term28828).setAccessible(true);
        Object enum54 = ((Field) term28828).get((Object) null);
        Class<? extends Object> term29275 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelScatterStyle");
        Field term29274 = ((Class) term29275).getDeclaredField((String) "MARKER");
        ((Field) term29274).setAccessible(true);
        Object enum55 = ((Field) term29274).get((Object) null);
        HashMap term27803 = new HashMap();
        term27615 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters"));
        setField(term27615, term27615.getClass(), "type", enum52);
        setField(term27615, term27615.getClass(), "categoryAxisTitle", "VGizxZnyHX");
        setField(term27615, term27615.getClass(), "valueAxisTitle", "kVEZMHmRtR");
        setField(term27615, term27615.getClass(), "categoryColumns", term27647);
        setField(term27615, term27615.getClass(), "dataRows", term27711);
        setField(term27615, term27615.getClass(), "barGrouping", enum53);
        setField(term27615, term27615.getClass(), "barDirection", enum54);
        setIntField(term27615, term27615.getClass(), "barSeriesOverlapPercent", 679763016);
        setField(term27615, term27615.getClass(), "scatterStyle", enum55);
        setBooleanField(term27615, term27615.getClass(), "lineIsSmooth", false);
        setBooleanField(term27615, term27615.getClass(), "plotOnSecondaryAxis", false);
        setBooleanField(term27615, term27615.getClass(), "useSameMinMaxScaleAsPrimary", false);
        setField(term27615, term27615.getClass(), "colorSet", "sZdUNdggUW");
        setField(term27615, term27615.getClass(), "seriesStyleOptionsMap", term27803);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSeriesStyleOptionsMap", argTypes, term27615, args);
    }

};


