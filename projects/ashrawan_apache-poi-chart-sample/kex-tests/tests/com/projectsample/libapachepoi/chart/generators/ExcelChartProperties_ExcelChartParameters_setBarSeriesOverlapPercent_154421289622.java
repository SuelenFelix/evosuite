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
import java.lang.Integer;

public class ExcelChartProperties_ExcelChartParameters_setBarSeriesOverlapPercent_154421289622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45737;
     Object term45959;

    public ExcelChartProperties_ExcelChartParameters_setBarSeriesOverlapPercent_154421289622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term45962 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartTypes");
        Field term45961 = ((Class) term45962).getDeclaredField((String) "PIE");
        ((Field) term45961).setAccessible(true);
        Object enum86 = ((Field) term45961).get((Object) null);
        ArrayList term45769 = new ArrayList();
        ((ArrayList) term45769).add("NTWMiBEaDF");
        ((ArrayList) term45769).add("SPBstwKFVr");
        ArrayList term45797 = new ArrayList();
        ((ArrayList) term45797).add("WxYUTuqmIq");
        ((ArrayList) term45797).add("OeQLvhVERT");
        ((ArrayList) term45797).add("IlvgFINwIa");
        ((ArrayList) term45797).add("GEJABPlHSI");
        ((ArrayList) term45797).add("aQFUvuaYxd");
        ((ArrayList) term45797).add("zNFLXMifnS");
        ((ArrayList) term45797).add("HHQcYMSBVc");
        ((ArrayList) term45797).add("wdoqITnaAP");
        Class<? extends Object> term46518 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarGrouping");
        Field term46517 = ((Class) term46518).getDeclaredField((String) "STACKED");
        ((Field) term46517).setAccessible(true);
        Object enum87 = ((Field) term46517).get((Object) null);
        Class<? extends Object> term46971 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarDirection");
        Field term46970 = ((Class) term46971).getDeclaredField((String) "COL");
        ((Field) term46970).setAccessible(true);
        Object enum88 = ((Field) term46970).get((Object) null);
        Class<? extends Object> term47417 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelScatterStyle");
        Field term47416 = ((Class) term47417).getDeclaredField((String) "SCATTER_ONLY");
        ((Field) term47416).setAccessible(true);
        Object enum89 = ((Field) term47416).get((Object) null);
        HashMap term45947 = new HashMap();
        term45737 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters"));
        setField(term45737, term45737.getClass(), "type", enum86);
        setField(term45737, term45737.getClass(), "categoryAxisTitle", "QSrDQfEsTR");
        setField(term45737, term45737.getClass(), "valueAxisTitle", "PsqusYmejD");
        setField(term45737, term45737.getClass(), "categoryColumns", term45769);
        setField(term45737, term45737.getClass(), "dataRows", term45797);
        setField(term45737, term45737.getClass(), "barGrouping", enum87);
        setField(term45737, term45737.getClass(), "barDirection", enum88);
        setIntField(term45737, term45737.getClass(), "barSeriesOverlapPercent", -2095575670);
        setField(term45737, term45737.getClass(), "scatterStyle", enum89);
        setBooleanField(term45737, term45737.getClass(), "lineIsSmooth", true);
        setBooleanField(term45737, term45737.getClass(), "plotOnSecondaryAxis", false);
        setBooleanField(term45737, term45737.getClass(), "useSameMinMaxScaleAsPrimary", false);
        setField(term45737, term45737.getClass(), "colorSet", "rIPMBcrNqB");
        setField(term45737, term45737.getClass(), "seriesStyleOptionsMap", term45947);
        term45959 = new Integer(-1588772968);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term45959;
        callMethod(klass, "setBarSeriesOverlapPercent", argTypes, term45737, args);
    }

};


