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

public class ExcelChartProperties_ExcelChartParameters_hashCode_54747596731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65634;

    public ExcelChartProperties_ExcelChartParameters_hashCode_54747596731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term65876 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartTypes");
        Field term65875 = ((Class) term65876).getDeclaredField((String) "COLUMN");
        ((Field) term65875).setAccessible(true);
        Object enum123 = ((Field) term65875).get((Object) null);
        ArrayList term65669 = new ArrayList();
        ((ArrayList) term65669).add("rwKoAngzCu");
        ((ArrayList) term65669).add("VUkRVwROTl");
        ((ArrayList) term65669).add("UDlkdccCRn");
        ((ArrayList) term65669).add("McpzErOcYb");
        ArrayList term65721 = new ArrayList();
        ((ArrayList) term65721).add("jqrVEUvYEz");
        ((ArrayList) term65721).add("QITgiBrmfj");
        ((ArrayList) term65721).add("pXxkiXgQnq");
        ((ArrayList) term65721).add("tKmrUDURku");
        ((ArrayList) term65721).add("JeZbrwZmsP");
        ((ArrayList) term65721).add("bxyfeicqrK");
        ((ArrayList) term65721).add("vBnWPlsZMk");
        ((ArrayList) term65721).add("fIZsWucfXz");
        Class<? extends Object> term66461 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarGrouping");
        Field term66460 = ((Class) term66461).getDeclaredField((String) "STACKED");
        ((Field) term66460).setAccessible(true);
        Object enum124 = ((Field) term66460).get((Object) null);
        Class<? extends Object> term66914 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarDirection");
        Field term66913 = ((Class) term66914).getDeclaredField((String) "COL");
        ((Field) term66913).setAccessible(true);
        Object enum125 = ((Field) term66913).get((Object) null);
        Class<? extends Object> term67360 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelScatterStyle");
        Field term67359 = ((Class) term67360).getDeclaredField((String) "LINE");
        ((Field) term67359).setAccessible(true);
        Object enum126 = ((Field) term67359).get((Object) null);
        HashMap term65863 = new HashMap();
        term65634 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters"));
        setField(term65634, term65634.getClass(), "type", enum123);
        setField(term65634, term65634.getClass(), "categoryAxisTitle", "sHMXNUzNeM");
        setField(term65634, term65634.getClass(), "valueAxisTitle", "gPzGDOEPPw");
        setField(term65634, term65634.getClass(), "categoryColumns", term65669);
        setField(term65634, term65634.getClass(), "dataRows", term65721);
        setField(term65634, term65634.getClass(), "barGrouping", enum124);
        setField(term65634, term65634.getClass(), "barDirection", enum125);
        setIntField(term65634, term65634.getClass(), "barSeriesOverlapPercent", -1888585309);
        setField(term65634, term65634.getClass(), "scatterStyle", enum126);
        setBooleanField(term65634, term65634.getClass(), "lineIsSmooth", true);
        setBooleanField(term65634, term65634.getClass(), "plotOnSecondaryAxis", false);
        setBooleanField(term65634, term65634.getClass(), "useSameMinMaxScaleAsPrimary", false);
        setField(term65634, term65634.getClass(), "colorSet", "IApvtmfhnq");
        setField(term65634, term65634.getClass(), "seriesStyleOptionsMap", term65863);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term65634, args);
    }

};


