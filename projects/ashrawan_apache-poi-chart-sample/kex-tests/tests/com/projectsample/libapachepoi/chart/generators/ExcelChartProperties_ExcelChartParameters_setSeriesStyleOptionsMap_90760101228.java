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
import java.util.LinkedHashMap;

public class ExcelChartProperties_ExcelChartParameters_setSeriesStyleOptionsMap_90760101228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59166;
     Object term59374;

    public ExcelChartProperties_ExcelChartParameters_setSeriesStyleOptionsMap_90760101228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term59509 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartTypes");
        Field term59508 = ((Class) term59509).getDeclaredField((String) "SCATTER");
        ((Field) term59508).setAccessible(true);
        Object enum111 = ((Field) term59508).get((Object) null);
        ArrayList term59202 = new ArrayList();
        ((ArrayList) term59202).add("orEuhCStGM");
        ((ArrayList) term59202).add("HhEaSXWvrY");
        ArrayList term59230 = new ArrayList();
        ((ArrayList) term59230).add("CVRGEomOth");
        ((ArrayList) term59230).add("vSeruUyNWX");
        ((ArrayList) term59230).add("UkKvaeJfEC");
        ((ArrayList) term59230).add("WPxXsahPRq");
        ((ArrayList) term59230).add("IENRuqmwUU");
        ((ArrayList) term59230).add("GsWxOwXvSu");
        ((ArrayList) term59230).add("bKBSncrMEZ");
        Class<? extends Object> term60067 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarGrouping");
        Field term60066 = ((Class) term60067).getDeclaredField((String) "STACKED");
        ((Field) term60066).setAccessible(true);
        Object enum112 = ((Field) term60066).get((Object) null);
        Class<? extends Object> term60520 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarDirection");
        Field term60519 = ((Class) term60520).getDeclaredField((String) "COL");
        ((Field) term60519).setAccessible(true);
        Object enum113 = ((Field) term60519).get((Object) null);
        Class<? extends Object> term60966 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelScatterStyle");
        Field term60965 = ((Class) term60966).getDeclaredField((String) "SMOOTH");
        ((Field) term60965).setAccessible(true);
        Object enum114 = ((Field) term60965).get((Object) null);
        HashMap term59362 = new HashMap();
        term59166 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters"));
        setField(term59166, term59166.getClass(), "type", enum111);
        setField(term59166, term59166.getClass(), "categoryAxisTitle", "zjZYTddemL");
        setField(term59166, term59166.getClass(), "valueAxisTitle", "QtrylgCLiF");
        setField(term59166, term59166.getClass(), "categoryColumns", term59202);
        setField(term59166, term59166.getClass(), "dataRows", term59230);
        setField(term59166, term59166.getClass(), "barGrouping", enum112);
        setField(term59166, term59166.getClass(), "barDirection", enum113);
        setIntField(term59166, term59166.getClass(), "barSeriesOverlapPercent", -481533957);
        setField(term59166, term59166.getClass(), "scatterStyle", enum114);
        setBooleanField(term59166, term59166.getClass(), "lineIsSmooth", true);
        setBooleanField(term59166, term59166.getClass(), "plotOnSecondaryAxis", false);
        setBooleanField(term59166, term59166.getClass(), "useSameMinMaxScaleAsPrimary", true);
        setField(term59166, term59166.getClass(), "colorSet", "yeSXGqQExb");
        setField(term59166, term59166.getClass(), "seriesStyleOptionsMap", term59362);
        term59374 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term59374;
        callMethod(klass, "setSeriesStyleOptionsMap", argTypes, term59166, args);
    }

};


