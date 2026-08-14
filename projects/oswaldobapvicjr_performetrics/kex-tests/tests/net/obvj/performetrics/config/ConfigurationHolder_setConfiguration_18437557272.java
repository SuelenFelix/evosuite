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

public class ConfigurationHolder_setConfiguration_18437557272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public ConfigurationHolder_setConfiguration_18437557272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term379 = Class.forName((String) "net.obvj.performetrics.ConversionMode");
        Field term378 = ((Class) term379).getDeclaredField((String) "DOUBLE_PRECISION");
        ((Field) term378).setAccessible(true);
        Object enum0 = ((Field) term378).get((Object) null);
        Class<? extends Object> term645 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term644 = ((Class) term645).getDeclaredField((String) "SUMMARIZED");
        ((Field) term644).setAccessible(true);
        Object enum1 = ((Field) term644).get((Object) null);
        Class<? extends Object> term1152 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term1151 = ((Class) term1152).getDeclaredField((String) "FULL");
        ((Field) term1151).setAccessible(true);
        Object enum2 = ((Field) term1151).get((Object) null);
        HashMap term154 = new HashMap();
        Set<Object> term1452 =  ((Map) term154).keySet();
        HashSet term153 = new HashSet((Collection<? extends Object>) term1452);
        Class<? extends Object> term160 = Class.forName((String) "java.lang.ref.Cleaner$Cleanable");
        Class<? extends Object> term1659 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term1658 = ((Class) term1659).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term1658).setAccessible(true);
        Object enum3 = ((Field) term1658).get((Object) null);
        Class<? extends Object> term1886 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term1885 = ((Class) term1886).getDeclaredField((String) "CPU_TIME");
        ((Field) term1885).setAccessible(true);
        Object enum4 = ((Field) term1885).get((Object) null);
        Class<? extends Object> term2092 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term2091 = ((Class) term2092).getDeclaredField((String) "USER_TIME");
        ((Field) term2091).setAccessible(true);
        Object enum5 = ((Field) term2091).get((Object) null);
        Class<? extends Object> term2301 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term2300 = ((Class) term2301).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term2300).setAccessible(true);
        Object enum6 = ((Field) term2300).get((Object) null);
        Class<? extends Object> term2516 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term2515 = ((Class) term2516).getDeclaredField((String) "DETAILED");
        ((Field) term2515).setAccessible(true);
        Object enum7 = ((Field) term2515).get((Object) null);
        term1 = newInstance(Class.forName("net.obvj.performetrics.config.Configuration"));
        Object term23 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        Object term159 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term168 = (Object[]) newArray("net.obvj.performetrics.Counter$Type", 4);
        Object[] term177 = (Object[]) newArray("java.lang.Object", 4);
        Object term179 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        Object term345 = newInstance(Class.forName("java.util.Collections$EmptySet"));
        Object term346 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term347 = (Object[]) newArray("net.obvj.performetrics.Counter$Type", 4);
        Object[] term348 = (Object[]) newArray("java.lang.Object", 4);
        setField(term1, term1.getClass(), "conversionMode", enum0);
        setIntField(term1, term1.getClass(), "scale", 9);
        setField(term23, term23.getClass(), "printFormat", enum1);
        setBooleanField(term23, term23.getClass(), "printHeader", true);
        setField(term23, term23.getClass(), "headerFormat", "%-15s  %19s");
        setBooleanField(term23, term23.getClass(), "printTrailer", false);
        setField(term23, term23.getClass(), "trailerFormat", null);
        setField(term23, term23.getClass(), "rowFormat", "%-15s  %19s");
        setField(term23, term23.getClass(), "sectionHeaderFormat", null);
        setBooleanField(term23, term23.getClass(), "printSectionSummary", false);
        setField(term23, term23.getClass(), "sectionSummaryRowFormat", null);
        setBooleanField(term23, term23.getClass(), "printSectionTrailer", false);
        setField(term23, term23.getClass(), "sectionTrailerFormat", null);
        setField(term23, term23.getClass(), "durationFormat", enum2);
        setBooleanField(term23, term23.getClass(), "printLegend", false);
        setField(term23, term23.getClass(), "simpleLine", "------------------------------------");
        setField(term23, term23.getClass(), "alternativeLine", "====================================");
        setField(term23, term23.getClass(), "excludedTypes", term153);
        setField(term159, term159.getClass(), "keyType", term160);
        setElement(term168, 0, enum3);
        setElement(term168, 1, enum4);
        setElement(term168, 2, enum5);
        setElement(term168, 3, enum6);
        setField(term159, term159.getClass(), "keyUniverse", term168);
        setField(term159, term159.getClass(), "vals", term177);
        setIntField(term159, term159.getClass(), "size", 0);
        setField(term159, term159.getClass(), "entrySet", null);
        setField(term159, term159.getClass(), "keySet", null);
        setField(term159, term159.getClass(), "values", null);
        setField(term23, term23.getClass(), "customCounterNames", term159);
        setField(term1, term1.getClass(), "printStyle", term23);
        setField(term1, term1.getClass(), "printStyleForSummary", term23);
        setField(term179, term179.getClass(), "printFormat", enum7);
        setBooleanField(term179, term179.getClass(), "printHeader", true);
        setField(term179, term179.getClass(), "headerFormat", "%5s  %19s  %19s");
        setBooleanField(term179, term179.getClass(), "printTrailer", false);
        setField(term179, term179.getClass(), "trailerFormat", null);
        setField(term179, term179.getClass(), "rowFormat", "%5s  %19s  %19s");
        setField(term179, term179.getClass(), "sectionHeaderFormat", "%s");
        setBooleanField(term179, term179.getClass(), "printSectionSummary", true);
        setField(term179, term179.getClass(), "sectionSummaryRowFormat", "TOTAL %41s");
        setBooleanField(term179, term179.getClass(), "printSectionTrailer", false);
        setField(term179, term179.getClass(), "sectionTrailerFormat", null);
        setField(term179, term179.getClass(), "durationFormat", enum2);
        setBooleanField(term179, term179.getClass(), "printLegend", false);
        setField(term179, term179.getClass(), "simpleLine", "-----------------------------------------------");
        setField(term179, term179.getClass(), "alternativeLine", "===============================================");
        setField(term179, term179.getClass(), "excludedTypes", term345);
        setField(term346, term346.getClass(), "keyType", term160);
        setElement(term347, 0, enum3);
        setElement(term347, 1, enum4);
        setElement(term347, 2, enum5);
        setElement(term347, 3, enum6);
        setField(term346, term346.getClass(), "keyUniverse", term347);
        setField(term346, term346.getClass(), "vals", term348);
        setIntField(term346, term346.getClass(), "size", 0);
        setField(term346, term346.getClass(), "entrySet", null);
        setField(term346, term346.getClass(), "keySet", null);
        setField(term346, term346.getClass(), "values", null);
        setField(term179, term179.getClass(), "customCounterNames", term346);
        setField(term1, term1.getClass(), "printStyleForDetails", term179);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.config.ConfigurationHolder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.obvj.performetrics.config.Configuration");
        Object[] args = new Object[1];
        args[0] = term1;
        callMethod(klass, "setConfiguration", argTypes, null, args);
    }

};


