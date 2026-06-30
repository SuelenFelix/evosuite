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

public class ExcelChartProperties_ExcelChartParameters_getValueAxisTitle_20496164533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4421;

    public ExcelChartProperties_ExcelChartParameters_getValueAxisTitle_20496164533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4608 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartTypes");
        Field term4607 = ((Class) term4608).getDeclaredField((String) "SCATTER");
        ((Field) term4607).setAccessible(true);
        Object enum8 = ((Field) term4607).get((Object) null);
        ArrayList term4457 = new ArrayList();
        ((ArrayList) term4457).add("OWDIEULEFu");
        ArrayList term4473 = new ArrayList();
        ((ArrayList) term4473).add("dWRymuLBtr");
        ((ArrayList) term4473).add("AijpHYOFuy");
        ((ArrayList) term4473).add("SbAoxhfrkn");
        ((ArrayList) term4473).add("kuTXqwMtDB");
        ((ArrayList) term4473).add("Ghbwtircqb");
        ((ArrayList) term4473).add("xrwlQZdwCp");
        Class<? extends Object> term5146 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarGrouping");
        Field term5145 = ((Class) term5146).getDeclaredField((String) "CLUSTERED");
        ((Field) term5145).setAccessible(true);
        Object enum9 = ((Field) term5145).get((Object) null);
        Class<? extends Object> term5605 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarDirection");
        Field term5604 = ((Class) term5605).getDeclaredField((String) "BAR");
        ((Field) term5604).setAccessible(true);
        Object enum10 = ((Field) term5604).get((Object) null);
        Class<? extends Object> term6051 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelScatterStyle");
        Field term6050 = ((Class) term6051).getDeclaredField((String) "SMOOTH");
        ((Field) term6050).setAccessible(true);
        Object enum11 = ((Field) term6050).get((Object) null);
        HashMap term4595 = new HashMap();
        term4421 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters"));
        setField(term4421, term4421.getClass(), "type", enum8);
        setField(term4421, term4421.getClass(), "categoryAxisTitle", "IoAlmYsBwc");
        setField(term4421, term4421.getClass(), "valueAxisTitle", "TEParAifyi");
        setField(term4421, term4421.getClass(), "categoryColumns", term4457);
        setField(term4421, term4421.getClass(), "dataRows", term4473);
        setField(term4421, term4421.getClass(), "barGrouping", enum9);
        setField(term4421, term4421.getClass(), "barDirection", enum10);
        setIntField(term4421, term4421.getClass(), "barSeriesOverlapPercent", -1955890973);
        setField(term4421, term4421.getClass(), "scatterStyle", enum11);
        setBooleanField(term4421, term4421.getClass(), "lineIsSmooth", true);
        setBooleanField(term4421, term4421.getClass(), "plotOnSecondaryAxis", true);
        setBooleanField(term4421, term4421.getClass(), "useSameMinMaxScaleAsPrimary", false);
        setField(term4421, term4421.getClass(), "colorSet", "IDCWpPLRkE");
        setField(term4421, term4421.getClass(), "seriesStyleOptionsMap", term4595);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getValueAxisTitle", argTypes, term4421, args);
    }

};


