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

public class ExcelChartProperties_ExcelChartParameters_getBarSeriesOverlapPercent_15089983908 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15031;

    public ExcelChartProperties_ExcelChartParameters_getBarSeriesOverlapPercent_15089983908() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15176 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartTypes");
        Field term15175 = ((Class) term15176).getDeclaredField((String) "PIE");
        ((Field) term15175).setAccessible(true);
        Object enum28 = ((Field) term15175).get((Object) null);
        ArrayList term15063 = new ArrayList();
        ((ArrayList) term15063).add("sEccwbJKYE");
        ((ArrayList) term15063).add("AWRooQKkdW");
        ((ArrayList) term15063).add("vjxIhXHxGR");
        ArrayList term15103 = new ArrayList();
        ((ArrayList) term15103).add("QXzGXbEXMu");
        Class<? extends Object> term15672 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarGrouping");
        Field term15671 = ((Class) term15672).getDeclaredField((String) "STACKED");
        ((Field) term15671).setAccessible(true);
        Object enum29 = ((Field) term15671).get((Object) null);
        Class<? extends Object> term16125 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarDirection");
        Field term16124 = ((Class) term16125).getDeclaredField((String) "COL");
        ((Field) term16124).setAccessible(true);
        Object enum30 = ((Field) term16124).get((Object) null);
        Class<? extends Object> term16571 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelScatterStyle");
        Field term16570 = ((Class) term16571).getDeclaredField((String) "MARKER");
        ((Field) term16570).setAccessible(true);
        Object enum31 = ((Field) term16570).get((Object) null);
        HashMap term15163 = new HashMap();
        term15031 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters"));
        setField(term15031, term15031.getClass(), "type", enum28);
        setField(term15031, term15031.getClass(), "categoryAxisTitle", "BKLfkLiZTH");
        setField(term15031, term15031.getClass(), "valueAxisTitle", "SPpkrGcPRr");
        setField(term15031, term15031.getClass(), "categoryColumns", term15063);
        setField(term15031, term15031.getClass(), "dataRows", term15103);
        setField(term15031, term15031.getClass(), "barGrouping", enum29);
        setField(term15031, term15031.getClass(), "barDirection", enum30);
        setIntField(term15031, term15031.getClass(), "barSeriesOverlapPercent", -6029667);
        setField(term15031, term15031.getClass(), "scatterStyle", enum31);
        setBooleanField(term15031, term15031.getClass(), "lineIsSmooth", true);
        setBooleanField(term15031, term15031.getClass(), "plotOnSecondaryAxis", true);
        setBooleanField(term15031, term15031.getClass(), "useSameMinMaxScaleAsPrimary", true);
        setField(term15031, term15031.getClass(), "colorSet", "qxSDVejjiY");
        setField(term15031, term15031.getClass(), "seriesStyleOptionsMap", term15163);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBarSeriesOverlapPercent", argTypes, term15031, args);
    }

};


