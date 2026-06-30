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

public class ExcelChartProperties_ExcelChartParameters_setBarGrouping_100067840520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40771;
     Object enum81;

    public ExcelChartProperties_ExcelChartParameters_setBarGrouping_100067840520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term41046 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartTypes");
        Field term41045 = ((Class) term41046).getDeclaredField((String) "SCATTER");
        ((Field) term41045).setAccessible(true);
        Object enum77 = ((Field) term41045).get((Object) null);
        ArrayList term40807 = new ArrayList();
        ((ArrayList) term40807).add("jDmhBrIoDa");
        ((ArrayList) term40807).add("SPtPatHeOm");
        ((ArrayList) term40807).add("ywmcuThdfL");
        ((ArrayList) term40807).add("GBOEuByOfr");
        ((ArrayList) term40807).add("NHbOFFjyVK");
        ((ArrayList) term40807).add("zaloBqlrSo");
        ((ArrayList) term40807).add("vvoLrMGCoN");
        ((ArrayList) term40807).add("pXdglvyrQe");
        ((ArrayList) term40807).add("OcfNzHYdki");
        ArrayList term40919 = new ArrayList();
        ((ArrayList) term40919).add("uPuCVuZYOI");
        ((ArrayList) term40919).add("TweMFhxNdj");
        ((ArrayList) term40919).add("NBrvVzvQHe");
        ((ArrayList) term40919).add("FjOiNAfBOc");
        Class<? extends Object> term41644 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarGrouping");
        Field term41643 = ((Class) term41644).getDeclaredField((String) "STANDARD");
        ((Field) term41643).setAccessible(true);
        Object enum78 = ((Field) term41643).get((Object) null);
        Class<? extends Object> term42100 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarDirection");
        Field term42099 = ((Class) term42100).getDeclaredField((String) "BAR");
        ((Field) term42099).setAccessible(true);
        Object enum79 = ((Field) term42099).get((Object) null);
        Class<? extends Object> term42546 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelScatterStyle");
        Field term42545 = ((Class) term42546).getDeclaredField((String) "LINE");
        ((Field) term42545).setAccessible(true);
        Object enum80 = ((Field) term42545).get((Object) null);
        HashMap term41014 = new HashMap();
        term40771 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters"));
        setField(term40771, term40771.getClass(), "type", enum77);
        setField(term40771, term40771.getClass(), "categoryAxisTitle", "bnsyeQXFdu");
        setField(term40771, term40771.getClass(), "valueAxisTitle", "BwtdjiefJn");
        setField(term40771, term40771.getClass(), "categoryColumns", term40807);
        setField(term40771, term40771.getClass(), "dataRows", term40919);
        setField(term40771, term40771.getClass(), "barGrouping", enum78);
        setField(term40771, term40771.getClass(), "barDirection", enum79);
        setIntField(term40771, term40771.getClass(), "barSeriesOverlapPercent", -184153539);
        setField(term40771, term40771.getClass(), "scatterStyle", enum80);
        setBooleanField(term40771, term40771.getClass(), "lineIsSmooth", true);
        setBooleanField(term40771, term40771.getClass(), "plotOnSecondaryAxis", false);
        setBooleanField(term40771, term40771.getClass(), "useSameMinMaxScaleAsPrimary", false);
        setField(term40771, term40771.getClass(), "colorSet", "iCCsaLHohG");
        setField(term40771, term40771.getClass(), "seriesStyleOptionsMap", term41014);
        Class<? extends Object> term43005 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarGrouping");
        Field term43004 = ((Class) term43005).getDeclaredField((String) "PERCENT_STACKED");
        ((Field) term43004).setAccessible(true);
        enum81 = ((Field) term43004).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarGrouping");
        Object[] args = new Object[1];
        args[0] = enum81;
        callMethod(klass, "setBarGrouping", argTypes, term40771, args);
    }

};


