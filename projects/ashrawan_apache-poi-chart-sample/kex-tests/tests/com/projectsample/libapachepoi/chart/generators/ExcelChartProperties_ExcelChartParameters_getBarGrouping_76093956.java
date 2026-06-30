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

public class ExcelChartProperties_ExcelChartParameters_getBarGrouping_76093956 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10735;

    public ExcelChartProperties_ExcelChartParameters_getBarGrouping_76093956() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10973 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartTypes");
        Field term10972 = ((Class) term10973).getDeclaredField((String) "COLUMN");
        ((Field) term10972).setAccessible(true);
        Object enum20 = ((Field) term10972).get((Object) null);
        ArrayList term10770 = new ArrayList();
        ((ArrayList) term10770).add("IgRJUzaCwW");
        ((ArrayList) term10770).add("JUmudUmaaV");
        ((ArrayList) term10770).add("KoyGrUJeJW");
        ((ArrayList) term10770).add("HqBOwkVqjD");
        ((ArrayList) term10770).add("MAcUBcBckh");
        ((ArrayList) term10770).add("oVgzLbrsFr");
        ArrayList term10846 = new ArrayList();
        ((ArrayList) term10846).add("vQVyKLdtaz");
        ((ArrayList) term10846).add("OWKQODBLzb");
        ((ArrayList) term10846).add("wGmYcqUkgE");
        ((ArrayList) term10846).add("idgaQsnJpQ");
        ((ArrayList) term10846).add("VgZnGoIFwQ");
        Class<? extends Object> term11548 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarGrouping");
        Field term11547 = ((Class) term11548).getDeclaredField((String) "PERCENT_STACKED");
        ((Field) term11547).setAccessible(true);
        Object enum21 = ((Field) term11547).get((Object) null);
        Class<? extends Object> term12025 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarDirection");
        Field term12024 = ((Class) term12025).getDeclaredField((String) "COL");
        ((Field) term12024).setAccessible(true);
        Object enum22 = ((Field) term12024).get((Object) null);
        Class<? extends Object> term12471 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelScatterStyle");
        Field term12470 = ((Class) term12471).getDeclaredField((String) "LINE");
        ((Field) term12470).setAccessible(true);
        Object enum23 = ((Field) term12470).get((Object) null);
        HashMap term10960 = new HashMap();
        term10735 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters"));
        setField(term10735, term10735.getClass(), "type", enum20);
        setField(term10735, term10735.getClass(), "categoryAxisTitle", "bLPjGVBhlX");
        setField(term10735, term10735.getClass(), "valueAxisTitle", "whBvTVIIlC");
        setField(term10735, term10735.getClass(), "categoryColumns", term10770);
        setField(term10735, term10735.getClass(), "dataRows", term10846);
        setField(term10735, term10735.getClass(), "barGrouping", enum21);
        setField(term10735, term10735.getClass(), "barDirection", enum22);
        setIntField(term10735, term10735.getClass(), "barSeriesOverlapPercent", 597278769);
        setField(term10735, term10735.getClass(), "scatterStyle", enum23);
        setBooleanField(term10735, term10735.getClass(), "lineIsSmooth", false);
        setBooleanField(term10735, term10735.getClass(), "plotOnSecondaryAxis", true);
        setBooleanField(term10735, term10735.getClass(), "useSameMinMaxScaleAsPrimary", true);
        setField(term10735, term10735.getClass(), "colorSet", "jUbSRrkrYZ");
        setField(term10735, term10735.getClass(), "seriesStyleOptionsMap", term10960);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBarGrouping", argTypes, term10735, args);
    }

};


