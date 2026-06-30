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

public class ExcelChartProperties_getParams_5773382714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109233;

    public ExcelChartProperties_getParams_5773382714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term109299 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelPosition");
        Field term109298 = ((Class) term109299).getDeclaredField((String) "LEFT");
        ((Field) term109298).setAccessible(true);
        Object enum214 = ((Field) term109298).get((Object) null);
        Class<? extends Object> term109728 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelPosition");
        Field term109727 = ((Class) term109728).getDeclaredField((String) "TOP_RIGHT");
        ((Field) term109727).setAccessible(true);
        Object enum215 = ((Field) term109727).get((Object) null);
        Class<? extends Object> term110182 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartTypes");
        Field term110181 = ((Class) term110182).getDeclaredField((String) "PIE");
        ((Field) term110181).setAccessible(true);
        Object enum216 = ((Field) term110181).get((Object) null);
        ArrayList term109274 = new ArrayList();
        ((ArrayList) term109274).add((Object)null);
        ((ArrayList) term109274).add((Object)null);
        ((ArrayList) term109274).add((Object)null);
        ((ArrayList) term109274).add((Object)null);
        ((ArrayList) term109274).add((Object)null);
        ((ArrayList) term109274).add((Object)null);
        ArrayList term109277 = new ArrayList();
        ((ArrayList) term109277).add((Object)null);
        ((ArrayList) term109277).add((Object)null);
        ((ArrayList) term109277).add((Object)null);
        Class<? extends Object> term110618 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarGrouping");
        Field term110617 = ((Class) term110618).getDeclaredField((String) "STACKED");
        ((Field) term110617).setAccessible(true);
        Object enum217 = ((Field) term110617).get((Object) null);
        Class<? extends Object> term111071 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarDirection");
        Field term111070 = ((Class) term111071).getDeclaredField((String) "COL");
        ((Field) term111070).setAccessible(true);
        Object enum218 = ((Field) term111070).get((Object) null);
        Class<? extends Object> term111517 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelScatterStyle");
        Field term111516 = ((Class) term111517).getDeclaredField((String) "SCATTER_ONLY");
        ((Field) term111516).setAccessible(true);
        Object enum219 = ((Field) term111516).get((Object) null);
        HashMap term109291 = new HashMap();
        Object term109269 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters"));
        setField(term109269, term109269.getClass(), "type", enum216);
        setField(term109269, term109269.getClass(), "categoryAxisTitle", "");
        setField(term109269, term109269.getClass(), "valueAxisTitle", "");
        setField(term109269, term109269.getClass(), "categoryColumns", term109274);
        setField(term109269, term109269.getClass(), "dataRows", term109277);
        setField(term109269, term109269.getClass(), "barGrouping", enum217);
        setField(term109269, term109269.getClass(), "barDirection", enum218);
        setIntField(term109269, term109269.getClass(), "barSeriesOverlapPercent", -1731761810);
        setField(term109269, term109269.getClass(), "scatterStyle", enum219);
        setBooleanField(term109269, term109269.getClass(), "lineIsSmooth", true);
        setBooleanField(term109269, term109269.getClass(), "plotOnSecondaryAxis", false);
        setBooleanField(term109269, term109269.getClass(), "useSameMinMaxScaleAsPrimary", false);
        setField(term109269, term109269.getClass(), "colorSet", "");
        setField(term109269, term109269.getClass(), "seriesStyleOptionsMap", term109291);
        ArrayList term109267 = new ArrayList();
        ((ArrayList) term109267).add(term109269);
        term109233 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties"));
        setField(term109233, term109233.getClass(), "chartPosition", enum214);
        setField(term109233, term109233.getClass(), "legendPosition", enum215);
        setField(term109233, term109233.getClass(), "chartTitle", "EHoNUaeyvT");
        setField(term109233, term109233.getClass(), "params", term109267);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParams", argTypes, term109233, args);
    }

};


