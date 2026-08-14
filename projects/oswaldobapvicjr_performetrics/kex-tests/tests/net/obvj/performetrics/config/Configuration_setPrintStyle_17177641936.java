package net.obvj.performetrics.config;

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
import static net.obvj.performetrics.config.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;

public class Configuration_setPrintStyle_17177641936 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15749;
     Object term16100;

    public Configuration_setPrintStyle_17177641936() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16227 = Class.forName((String) "net.obvj.performetrics.ConversionMode");
        Field term16226 = ((Class) term16227).getDeclaredField((String) "DOUBLE_PRECISION");
        ((Field) term16226).setAccessible(true);
        Object enum49 = ((Field) term16226).get((Object) null);
        Class<? extends Object> term16467 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term16466 = ((Class) term16467).getDeclaredField((String) "SUMMARIZED");
        ((Field) term16466).setAccessible(true);
        Object enum50 = ((Field) term16466).get((Object) null);
        Class<? extends Object> term16751 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term16750 = ((Class) term16751).getDeclaredField((String) "FULL");
        ((Field) term16750).setAccessible(true);
        Object enum51 = ((Field) term16750).get((Object) null);
        HashMap term15902 = new HashMap();
        Set<Object> term17051 =  ((Map) term15902).keySet();
        HashSet term15901 = new HashSet((Collection<? extends Object>) term17051);
        Class<? extends Object> term15908 = Class.forName((String) "net.obvj.performetrics.Performetrics");
        Class<? extends Object> term17163 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term17162 = ((Class) term17163).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term17162).setAccessible(true);
        Object enum52 =  ((Field) term17162).get((Object) null);
        Class<? extends Object> term17390 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term17389 = ((Class) term17390).getDeclaredField((String) "CPU_TIME");
        ((Field) term17389).setAccessible(true);
        Object enum53 = ((Field) term17389).get((Object) null);
        Class<? extends Object> term17596 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term17595 = ((Class) term17596).getDeclaredField((String) "USER_TIME");
        ((Field) term17595).setAccessible(true);
        Object enum54 = ((Field) term17595).get((Object) null);
        Class<? extends Object> term17805 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term17804 = ((Class) term17805).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term17804).setAccessible(true);
        Object enum55 = ((Field) term17804).get((Object) null);
        Class<? extends Object> term18020 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term18019 = ((Class) term18020).getDeclaredField((String) "DETAILED");
        ((Field) term18019).setAccessible(true);
        Object enum56 = ((Field) term18019).get((Object) null);
        term15749 = newInstance(Class.forName("net.obvj.performetrics.config.Configuration"));
        Object term15771 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        Object term15907 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term15918 = (Object[]) newArray("net.obvj.performetrics.Counter$Type", 4);
        Object[] term15927 = (Object[]) newArray("java.lang.Object", 4);
        Object term15929 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        Object term16095 = newInstance(Class.forName("java.util.Collections$EmptySet"));
        Object term16096 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term16097 = (Object[]) newArray("net.obvj.performetrics.Counter$Type", 4);
        Object[] term16098 = (Object[]) newArray("java.lang.Object", 4);
        setField(term15749, term15749.getClass(), "conversionMode", enum49);
        setIntField(term15749, term15749.getClass(), "scale", 9);
        setField(term15771, term15771.getClass(), "printFormat", enum50);
        setBooleanField(term15771, term15771.getClass(), "printHeader", true);
        setField(term15771, term15771.getClass(), "headerFormat", "%-15s  %19s");
        setBooleanField(term15771, term15771.getClass(), "printTrailer", false);
        setField(term15771, term15771.getClass(), "trailerFormat", null);
        setField(term15771, term15771.getClass(), "rowFormat", "%-15s  %19s");
        setField(term15771, term15771.getClass(), "sectionHeaderFormat", null);
        setBooleanField(term15771, term15771.getClass(), "printSectionSummary", false);
        setField(term15771, term15771.getClass(), "sectionSummaryRowFormat", null);
        setBooleanField(term15771, term15771.getClass(), "printSectionTrailer", false);
        setField(term15771, term15771.getClass(), "sectionTrailerFormat", null);
        setField(term15771, term15771.getClass(), "durationFormat", enum51);
        setBooleanField(term15771, term15771.getClass(), "printLegend", false);
        setField(term15771, term15771.getClass(), "simpleLine", "------------------------------------");
        setField(term15771, term15771.getClass(), "alternativeLine", "====================================");
        setField(term15771, term15771.getClass(), "excludedTypes", term15901);
        setField(term15907, term15907.getClass(), "keyType", term15908);
        setElement(term15918, 0, enum52);
        setElement(term15918, 1, enum53);
        setElement(term15918, 2, enum54);
        setElement(term15918, 3, enum55);
        setField(term15907, term15907.getClass(), "keyUniverse", term15918);
        setField(term15907, term15907.getClass(), "vals", term15927);
        setIntField(term15907, term15907.getClass(), "size", 0);
        setField(term15907, term15907.getClass(), "entrySet", null);
        setField(term15907, term15907.getClass(), "keySet", null);
        setField(term15907, term15907.getClass(), "values", null);
        setField(term15771, term15771.getClass(), "customCounterNames", term15907);
        setField(term15749, term15749.getClass(), "printStyle", term15771);
        setField(term15749, term15749.getClass(), "printStyleForSummary", term15771);
        setField(term15929, term15929.getClass(), "printFormat", enum56);
        setBooleanField(term15929, term15929.getClass(), "printHeader", true);
        setField(term15929, term15929.getClass(), "headerFormat", "%5s  %19s  %19s");
        setBooleanField(term15929, term15929.getClass(), "printTrailer", false);
        setField(term15929, term15929.getClass(), "trailerFormat", null);
        setField(term15929, term15929.getClass(), "rowFormat", "%5s  %19s  %19s");
        setField(term15929, term15929.getClass(), "sectionHeaderFormat", "%s");
        setBooleanField(term15929, term15929.getClass(), "printSectionSummary", true);
        setField(term15929, term15929.getClass(), "sectionSummaryRowFormat", "TOTAL %41s");
        setBooleanField(term15929, term15929.getClass(), "printSectionTrailer", false);
        setField(term15929, term15929.getClass(), "sectionTrailerFormat", null);
        setField(term15929, term15929.getClass(), "durationFormat", enum51);
        setBooleanField(term15929, term15929.getClass(), "printLegend", false);
        setField(term15929, term15929.getClass(), "simpleLine", "-----------------------------------------------");
        setField(term15929, term15929.getClass(), "alternativeLine", "===============================================");
        setField(term15929, term15929.getClass(), "excludedTypes", term16095);
        setField(term16096, term16096.getClass(), "keyType", term15908);
        setElement(term16097, 0, enum52);
        setElement(term16097, 1, enum53);
        setElement(term16097, 2, enum54);
        setElement(term16097, 3, enum55);
        setField(term16096, term16096.getClass(), "keyUniverse", term16097);
        setField(term16096, term16096.getClass(), "vals", term16098);
        setIntField(term16096, term16096.getClass(), "size", 0);
        setField(term16096, term16096.getClass(), "entrySet", null);
        setField(term16096, term16096.getClass(), "keySet", null);
        setField(term16096, term16096.getClass(), "values", null);
        setField(term15929, term15929.getClass(), "customCounterNames", term16096);
        setField(term15749, term15749.getClass(), "printStyleForDetails", term15929);
        Class<? extends Object> term18472 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term18471 = ((Class) term18472).getDeclaredField((String) "SHORTER");
        ((Field) term18471).setAccessible(true);
        Object enum57 = ((Field) term18471).get((Object) null);
        ArrayList term16213 = new ArrayList();
        ((ArrayList) term16213).add(enum52);
        HashMap term16217 = new HashMap();
        term16100 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term16100, term16100.getClass(), "printFormat", enum50);
        setBooleanField(term16100, term16100.getClass(), "printHeader", false);
        setField(term16100, term16100.getClass(), "headerFormat", "PAEBtnZtTD");
        setBooleanField(term16100, term16100.getClass(), "printTrailer", false);
        setField(term16100, term16100.getClass(), "trailerFormat", "sjlJAEtRrb");
        setField(term16100, term16100.getClass(), "rowFormat", "MuLcgQHgqz");
        setField(term16100, term16100.getClass(), "sectionHeaderFormat", "xxtlPwDYFs");
        setBooleanField(term16100, term16100.getClass(), "printSectionSummary", false);
        setField(term16100, term16100.getClass(), "sectionSummaryRowFormat", "jJCZpVmanW");
        setBooleanField(term16100, term16100.getClass(), "printSectionTrailer", false);
        setField(term16100, term16100.getClass(), "sectionTrailerFormat", "EGtDIRbSSb");
        setField(term16100, term16100.getClass(), "durationFormat", enum57);
        setBooleanField(term16100, term16100.getClass(), "printLegend", true);
        setField(term16100, term16100.getClass(), "simpleLine", "SzjVpOQTyS");
        setField(term16100, term16100.getClass(), "alternativeLine", "MjGYSRKTNF");
        setField(term16100, term16100.getClass(), "excludedTypes", term16213);
        setField(term16100, term16100.getClass(), "customCounterNames", term16217);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.config.Configuration");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Object[] args = new Object[1];
        args[0] = term16100;
        callMethod(klass, "setPrintStyle", argTypes, term15749, args);
    }

};


