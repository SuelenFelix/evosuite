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
import java.lang.Boolean;

public class ExcelChartProperties_ExcelChartParameters_setPlotOnSecondaryAxis_152376670125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52866;
     Object term53090;

    public ExcelChartProperties_ExcelChartParameters_setPlotOnSecondaryAxis_152376670125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term53093 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartTypes");
        Field term53092 = ((Class) term53093).getDeclaredField((String) "BAR");
        ((Field) term53092).setAccessible(true);
        Object enum99 = ((Field) term53092).get((Object) null);
        ArrayList term52898 = new ArrayList();
        ((ArrayList) term52898).add("llRfwANcVF");
        ((ArrayList) term52898).add("sUEeHQTWkA");
        ((ArrayList) term52898).add("BDIRCxAWLA");
        ((ArrayList) term52898).add("eOJfbiZLnb");
        ((ArrayList) term52898).add("nKZKnxWYCK");
        ((ArrayList) term52898).add("JOqQxuzRuZ");
        ((ArrayList) term52898).add("RSaoipUlsg");
        ArrayList term52986 = new ArrayList();
        ((ArrayList) term52986).add("cSHGbqKqlN");
        ((ArrayList) term52986).add("pFAfANnxup");
        ((ArrayList) term52986).add("FbSIUZyBXZ");
        Class<? extends Object> term53649 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarGrouping");
        Field term53648 = ((Class) term53649).getDeclaredField((String) "CLUSTERED");
        ((Field) term53648).setAccessible(true);
        Object enum100 = ((Field) term53648).get((Object) null);
        Class<? extends Object> term54108 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarDirection");
        Field term54107 = ((Class) term54108).getDeclaredField((String) "BAR");
        ((Field) term54107).setAccessible(true);
        Object enum101 = ((Field) term54107).get((Object) null);
        Class<? extends Object> term54554 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelScatterStyle");
        Field term54553 = ((Class) term54554).getDeclaredField((String) "SCATTER_ONLY");
        ((Field) term54553).setAccessible(true);
        Object enum102 = ((Field) term54553).get((Object) null);
        HashMap term53078 = new HashMap();
        term52866 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters"));
        setField(term52866, term52866.getClass(), "type", enum99);
        setField(term52866, term52866.getClass(), "categoryAxisTitle", "AWYyZiNfsm");
        setField(term52866, term52866.getClass(), "valueAxisTitle", "ITRRYiuDwH");
        setField(term52866, term52866.getClass(), "categoryColumns", term52898);
        setField(term52866, term52866.getClass(), "dataRows", term52986);
        setField(term52866, term52866.getClass(), "barGrouping", enum100);
        setField(term52866, term52866.getClass(), "barDirection", enum101);
        setIntField(term52866, term52866.getClass(), "barSeriesOverlapPercent", 1265463001);
        setField(term52866, term52866.getClass(), "scatterStyle", enum102);
        setBooleanField(term52866, term52866.getClass(), "lineIsSmooth", false);
        setBooleanField(term52866, term52866.getClass(), "plotOnSecondaryAxis", false);
        setBooleanField(term52866, term52866.getClass(), "useSameMinMaxScaleAsPrimary", false);
        setField(term52866, term52866.getClass(), "colorSet", "mhQDwIyrRi");
        setField(term52866, term52866.getClass(), "seriesStyleOptionsMap", term53078);
        term53090 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term53090;
        callMethod(klass, "setPlotOnSecondaryAxis", argTypes, term52866, args);
    }

};


