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

public class ExcelChartProperties_ExcelChartParameters_setCategoryAxisTitle_29556356416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32344;

    public ExcelChartProperties_ExcelChartParameters_setCategoryAxisTitle_29556356416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term32601 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartTypes");
        Field term32600 = ((Class) term32601).getDeclaredField((String) "COLUMN");
        ((Field) term32600).setAccessible(true);
        Object enum61 = ((Field) term32600).get((Object) null);
        ArrayList term32379 = new ArrayList();
        ((ArrayList) term32379).add("izPpKDErnQ");
        ((ArrayList) term32379).add("NnpwZBUTvx");
        ((ArrayList) term32379).add("tlQSNgTkQX");
        ((ArrayList) term32379).add("PCipZnmBOF");
        ((ArrayList) term32379).add("zcorEihhLK");
        ((ArrayList) term32379).add("GrqozDKFOk");
        ArrayList term32455 = new ArrayList();
        ((ArrayList) term32455).add("CFyoseFGLF");
        ((ArrayList) term32455).add("SFqCrhEWLm");
        ((ArrayList) term32455).add("GZdcJyZntS");
        ((ArrayList) term32455).add("OIHoJeysUi");
        ((ArrayList) term32455).add("WXMWFDGcLB");
        ((ArrayList) term32455).add("wKWbJssZuG");
        Class<? extends Object> term33186 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarGrouping");
        Field term33185 = ((Class) term33186).getDeclaredField((String) "STANDARD");
        ((Field) term33185).setAccessible(true);
        Object enum62 = ((Field) term33185).get((Object) null);
        Class<? extends Object> term33642 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarDirection");
        Field term33641 = ((Class) term33642).getDeclaredField((String) "BAR");
        ((Field) term33641).setAccessible(true);
        Object enum63 = ((Field) term33641).get((Object) null);
        Class<? extends Object> term34088 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelScatterStyle");
        Field term34087 = ((Class) term34088).getDeclaredField((String) "SMOOTH");
        ((Field) term34087).setAccessible(true);
        Object enum64 = ((Field) term34087).get((Object) null);
        HashMap term32576 = new HashMap();
        term32344 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters"));
        setField(term32344, term32344.getClass(), "type", enum61);
        setField(term32344, term32344.getClass(), "categoryAxisTitle", "hOncybyCAH");
        setField(term32344, term32344.getClass(), "valueAxisTitle", "QduALnDSVo");
        setField(term32344, term32344.getClass(), "categoryColumns", term32379);
        setField(term32344, term32344.getClass(), "dataRows", term32455);
        setField(term32344, term32344.getClass(), "barGrouping", enum62);
        setField(term32344, term32344.getClass(), "barDirection", enum63);
        setIntField(term32344, term32344.getClass(), "barSeriesOverlapPercent", -817164822);
        setField(term32344, term32344.getClass(), "scatterStyle", enum64);
        setBooleanField(term32344, term32344.getClass(), "lineIsSmooth", true);
        setBooleanField(term32344, term32344.getClass(), "plotOnSecondaryAxis", true);
        setBooleanField(term32344, term32344.getClass(), "useSameMinMaxScaleAsPrimary", true);
        setField(term32344, term32344.getClass(), "colorSet", "NzBMMhkhpT");
        setField(term32344, term32344.getClass(), "seriesStyleOptionsMap", term32576);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "gUvcueTURF";
        callMethod(klass, "setCategoryAxisTitle", argTypes, term32344, args);
    }

};


