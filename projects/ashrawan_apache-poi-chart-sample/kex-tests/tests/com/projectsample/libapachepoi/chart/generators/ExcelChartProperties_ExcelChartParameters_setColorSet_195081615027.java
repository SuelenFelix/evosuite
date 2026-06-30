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

public class ExcelChartProperties_ExcelChartParameters_setColorSet_195081615027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57090;

    public ExcelChartProperties_ExcelChartParameters_setColorSet_195081615027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term57266 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartTypes");
        Field term57265 = ((Class) term57266).getDeclaredField((String) "BAR");
        ((Field) term57265).setAccessible(true);
        Object enum107 = ((Field) term57265).get((Object) null);
        ArrayList term57122 = new ArrayList();
        ((ArrayList) term57122).add("TjWpyghUWN");
        ((ArrayList) term57122).add("dkZFDZxcde");
        ((ArrayList) term57122).add("WXcZEtUKlI");
        ((ArrayList) term57122).add("IkpjUOuWQU");
        ((ArrayList) term57122).add("boSSpezHeU");
        ArrayList term57186 = new ArrayList();
        Class<? extends Object> term57772 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarGrouping");
        Field term57771 = ((Class) term57772).getDeclaredField((String) "STANDARD");
        ((Field) term57771).setAccessible(true);
        Object enum108 = ((Field) term57771).get((Object) null);
        Class<? extends Object> term58228 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelBarDirection");
        Field term58227 = ((Class) term58228).getDeclaredField((String) "BAR");
        ((Field) term58227).setAccessible(true);
        Object enum109 = ((Field) term58227).get((Object) null);
        Class<? extends Object> term58674 = Class.forName((String) "com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelScatterStyle");
        Field term58673 = ((Class) term58674).getDeclaredField((String) "SCATTER_ONLY");
        ((Field) term58673).setAccessible(true);
        Object enum110 = ((Field) term58673).get((Object) null);
        HashMap term57241 = new HashMap();
        term57090 = newInstance(Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters"));
        setField(term57090, term57090.getClass(), "type", enum107);
        setField(term57090, term57090.getClass(), "categoryAxisTitle", "PqywFWJlpE");
        setField(term57090, term57090.getClass(), "valueAxisTitle", "OzXRsFGTIp");
        setField(term57090, term57090.getClass(), "categoryColumns", term57122);
        setField(term57090, term57090.getClass(), "dataRows", term57186);
        setField(term57090, term57090.getClass(), "barGrouping", enum108);
        setField(term57090, term57090.getClass(), "barDirection", enum109);
        setIntField(term57090, term57090.getClass(), "barSeriesOverlapPercent", -478195677);
        setField(term57090, term57090.getClass(), "scatterStyle", enum110);
        setBooleanField(term57090, term57090.getClass(), "lineIsSmooth", false);
        setBooleanField(term57090, term57090.getClass(), "plotOnSecondaryAxis", true);
        setBooleanField(term57090, term57090.getClass(), "useSameMinMaxScaleAsPrimary", false);
        setField(term57090, term57090.getClass(), "colorSet", "OUeBWNTQDh");
        setField(term57090, term57090.getClass(), "seriesStyleOptionsMap", term57241);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.chart.generators.ExcelChartProperties$ExcelChartParameters");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oKwCDqywym";
        callMethod(klass, "setColorSet", argTypes, term57090, args);
    }

};


