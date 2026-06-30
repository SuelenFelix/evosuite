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
import java.util.LinkedList;

public class ExcelChartProperties_ExcelChartParameters_setDataRows_195402230319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38764;
     Object term38877;

    public ExcelChartProperties_ExcelChartParameters_setDataRows_195402230319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term38907 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartTypes");
        Field term38906 = ((Class) term38907).getDeclaredField((String) "COLUMN");
        ((Field) term38906).setAccessible(true);
        Object enum73 = ((Field) term38906).get((Object) null);
        ArrayList term38799 = new ArrayList();
        ((ArrayList) term38799).add("ZKMLioamsY");
        ArrayList term38815 = new ArrayList();
        Class<? extends Object> term39382 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarGrouping");
        Field term39381 = ((Class) term39382).getDeclaredField((String) "CLUSTERED");
        ((Field) term39381).setAccessible(true);
        Object enum74 = ((Field) term39381).get((Object) null);
        Class<? extends Object> term39841 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarDirection");
        Field term39840 = ((Class) term39841).getDeclaredField((String) "BAR");
        ((Field) term39840).setAccessible(true);
        Object enum75 = ((Field) term39840).get((Object) null);
        Class<? extends Object> term40287 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelScatterStyle");
        Field term40286 = ((Class) term40287).getDeclaredField((String) "MARKER");
        ((Field) term40286).setAccessible(true);
        Object enum76 = ((Field) term40286).get((Object) null);
        HashMap term38865 = new HashMap();
        term38764 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters"));
        setField(term38764, term38764.getClass(), "type", enum73);
        setField(term38764, term38764.getClass(), "categoryAxisTitle", "ypEdrstygY");
        setField(term38764, term38764.getClass(), "valueAxisTitle", "sNQFlATEeQ");
        setField(term38764, term38764.getClass(), "categoryColumns", term38799);
        setField(term38764, term38764.getClass(), "dataRows", term38815);
        setField(term38764, term38764.getClass(), "barGrouping", enum74);
        setField(term38764, term38764.getClass(), "barDirection", enum75);
        setIntField(term38764, term38764.getClass(), "barSeriesOverlapPercent", -1048298087);
        setField(term38764, term38764.getClass(), "scatterStyle", enum76);
        setBooleanField(term38764, term38764.getClass(), "lineIsSmooth", true);
        setBooleanField(term38764, term38764.getClass(), "plotOnSecondaryAxis", false);
        setBooleanField(term38764, term38764.getClass(), "useSameMinMaxScaleAsPrimary", false);
        setField(term38764, term38764.getClass(), "colorSet", "WVbxuoDBcn");
        setField(term38764, term38764.getClass(), "seriesStyleOptionsMap", term38865);
        term38877 = new LinkedList();
        ((LinkedList) term38877).add("onQLVONGuf");
        ((LinkedList) term38877).add("SOrEHbcbmn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term38877;
        callMethod(klass, "setDataRows", argTypes, term38764, args);
    }

};


