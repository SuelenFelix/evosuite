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

public class ExcelChartProperties_ExcelChartParameters_canEqual_180032527130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63499;
     Object term63695;

    public ExcelChartProperties_ExcelChartParameters_canEqual_180032527130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term63697 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartTypes");
        Field term63696 = ((Class) term63697).getDeclaredField((String) "NONE");
        ((Field) term63696).setAccessible(true);
        Object enum119 = ((Field) term63696).get((Object) null);
        ArrayList term63532 = new ArrayList();
        ArrayList term63536 = new ArrayList();
        ((ArrayList) term63536).add("VkPSXewZfB");
        ((ArrayList) term63536).add("ubodzJoMGW");
        ((ArrayList) term63536).add("weddIktxOA");
        ((ArrayList) term63536).add("uSlMeISsDD");
        ((ArrayList) term63536).add("WdCiTDUKqn");
        ((ArrayList) term63536).add("PSizQDoxxe");
        ((ArrayList) term63536).add("mKaHyMybrK");
        Class<? extends Object> term64226 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarGrouping");
        Field term64225 = ((Class) term64226).getDeclaredField((String) "PERCENT_STACKED");
        ((Field) term64225).setAccessible(true);
        Object enum120 = ((Field) term64225).get((Object) null);
        Class<? extends Object> term64703 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarDirection");
        Field term64702 = ((Class) term64703).getDeclaredField((String) "COL");
        ((Field) term64702).setAccessible(true);
        Object enum121 = ((Field) term64702).get((Object) null);
        Class<? extends Object> term65149 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelScatterStyle");
        Field term65148 = ((Class) term65149).getDeclaredField((String) "SMOOTH_MARKER");
        ((Field) term65148).setAccessible(true);
        Object enum122 = ((Field) term65148).get((Object) null);
        HashMap term63683 = new HashMap();
        term63499 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters"));
        setField(term63499, term63499.getClass(), "type", enum119);
        setField(term63499, term63499.getClass(), "categoryAxisTitle", "FlHzxEfFzI");
        setField(term63499, term63499.getClass(), "valueAxisTitle", "aSATgQUpoe");
        setField(term63499, term63499.getClass(), "categoryColumns", term63532);
        setField(term63499, term63499.getClass(), "dataRows", term63536);
        setField(term63499, term63499.getClass(), "barGrouping", enum120);
        setField(term63499, term63499.getClass(), "barDirection", enum121);
        setIntField(term63499, term63499.getClass(), "barSeriesOverlapPercent", -894662986);
        setField(term63499, term63499.getClass(), "scatterStyle", enum122);
        setBooleanField(term63499, term63499.getClass(), "lineIsSmooth", true);
        setBooleanField(term63499, term63499.getClass(), "plotOnSecondaryAxis", true);
        setBooleanField(term63499, term63499.getClass(), "useSameMinMaxScaleAsPrimary", true);
        setField(term63499, term63499.getClass(), "colorSet", "AyrEXuGrEj");
        setField(term63499, term63499.getClass(), "seriesStyleOptionsMap", term63683);
        term63695 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term63695;
        callMethod(klass, "canEqual", argTypes, term63499, args);
    }

};


