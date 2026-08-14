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

public class Configuration_getPrintStyle_17326959935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13218;

    public Configuration_getPrintStyle_17326959935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13568 = Class.forName((String) "net.obvj.performetrics.ConversionMode");
        Field term13567 = ((Class) term13568).getDeclaredField((String) "DOUBLE_PRECISION");
        ((Field) term13567).setAccessible(true);
        Object enum41 = ((Field) term13567).get((Object) null);
        Class<? extends Object> term13808 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term13807 = ((Class) term13808).getDeclaredField((String) "SUMMARIZED");
        ((Field) term13807).setAccessible(true);
        Object enum42 = ((Field) term13807).get((Object) null);
        Class<? extends Object> term14092 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term14091 = ((Class) term14092).getDeclaredField((String) "FULL");
        ((Field) term14091).setAccessible(true);
        Object enum43 = ((Field) term14091).get((Object) null);
        HashMap term13371 = new HashMap();
        Set<Object> term14392 =  ((Map) term13371).keySet();
        HashSet term13370 = new HashSet((Collection<? extends Object>) term14392);
        Class<? extends Object> term13377 = Class.forName((String) "java.lang.reflect.ParameterizedType");
        Class<? extends Object> term14501 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term14500 = ((Class) term14501).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term14500).setAccessible(true);
        Object enum44 = ((Field) term14500).get((Object) null);
        Class<? extends Object> term14728 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term14727 = ((Class) term14728).getDeclaredField((String) "CPU_TIME");
        ((Field) term14727).setAccessible(true);
        Object enum45 = ((Field) term14727).get((Object) null);
        Class<? extends Object> term14934 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term14933 = ((Class) term14934).getDeclaredField((String) "USER_TIME");
        ((Field) term14933).setAccessible(true);
        Object enum46 = ((Field) term14933).get((Object) null);
        Class<? extends Object> term15143 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term15142 = ((Class) term15143).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term15142).setAccessible(true);
        Object enum47 = ((Field) term15142).get((Object) null);
        Class<? extends Object> term15358 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term15357 = ((Class) term15358).getDeclaredField((String) "DETAILED");
        ((Field) term15357).setAccessible(true);
        Object enum48 = ((Field) term15357).get((Object) null);
        term13218 = newInstance(Class.forName("net.obvj.performetrics.config.Configuration"));
        Object term13240 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        Object term13376 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term13385 = (Object[]) newArray("net.obvj.performetrics.Counter$Type", 4);
        Object[] term13394 = (Object[]) newArray("java.lang.Object", 4);
        Object term13396 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        Object term13562 = newInstance(Class.forName("java.util.Collections$EmptySet"));
        Object term13563 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term13564 = (Object[]) newArray("net.obvj.performetrics.Counter$Type", 4);
        Object[] term13565 = (Object[]) newArray("java.lang.Object", 4);
        setField(term13218, term13218.getClass(), "conversionMode", enum41);
        setIntField(term13218, term13218.getClass(), "scale", 9);
        setField(term13240, term13240.getClass(), "printFormat", enum42);
        setBooleanField(term13240, term13240.getClass(), "printHeader", true);
        setField(term13240, term13240.getClass(), "headerFormat", "%-15s  %19s");
        setBooleanField(term13240, term13240.getClass(), "printTrailer", false);
        setField(term13240, term13240.getClass(), "trailerFormat", null);
        setField(term13240, term13240.getClass(), "rowFormat", "%-15s  %19s");
        setField(term13240, term13240.getClass(), "sectionHeaderFormat", null);
        setBooleanField(term13240, term13240.getClass(), "printSectionSummary", false);
        setField(term13240, term13240.getClass(), "sectionSummaryRowFormat", null);
        setBooleanField(term13240, term13240.getClass(), "printSectionTrailer", false);
        setField(term13240, term13240.getClass(), "sectionTrailerFormat", null);
        setField(term13240, term13240.getClass(), "durationFormat", enum43);
        setBooleanField(term13240, term13240.getClass(), "printLegend", false);
        setField(term13240, term13240.getClass(), "simpleLine", "------------------------------------");
        setField(term13240, term13240.getClass(), "alternativeLine", "====================================");
        setField(term13240, term13240.getClass(), "excludedTypes", term13370);
        setField(term13376, term13376.getClass(), "keyType", term13377);
        setElement(term13385, 0, enum44);
        setElement(term13385, 1, enum45);
        setElement(term13385, 2, enum46);
        setElement(term13385, 3, enum47);
        setField(term13376, term13376.getClass(), "keyUniverse", term13385);
        setField(term13376, term13376.getClass(), "vals", term13394);
        setIntField(term13376, term13376.getClass(), "size", 0);
        setField(term13376, term13376.getClass(), "entrySet", null);
        setField(term13376, term13376.getClass(), "keySet", null);
        setField(term13376, term13376.getClass(), "values", null);
        setField(term13240, term13240.getClass(), "customCounterNames", term13376);
        setField(term13218, term13218.getClass(), "printStyle", term13240);
        setField(term13218, term13218.getClass(), "printStyleForSummary", term13240);
        setField(term13396, term13396.getClass(), "printFormat", enum48);
        setBooleanField(term13396, term13396.getClass(), "printHeader", true);
        setField(term13396, term13396.getClass(), "headerFormat", "%5s  %19s  %19s");
        setBooleanField(term13396, term13396.getClass(), "printTrailer", false);
        setField(term13396, term13396.getClass(), "trailerFormat", null);
        setField(term13396, term13396.getClass(), "rowFormat", "%5s  %19s  %19s");
        setField(term13396, term13396.getClass(), "sectionHeaderFormat", "%s");
        setBooleanField(term13396, term13396.getClass(), "printSectionSummary", true);
        setField(term13396, term13396.getClass(), "sectionSummaryRowFormat", "TOTAL %41s");
        setBooleanField(term13396, term13396.getClass(), "printSectionTrailer", false);
        setField(term13396, term13396.getClass(), "sectionTrailerFormat", null);
        setField(term13396, term13396.getClass(), "durationFormat", enum43);
        setBooleanField(term13396, term13396.getClass(), "printLegend", false);
        setField(term13396, term13396.getClass(), "simpleLine", "-----------------------------------------------");
        setField(term13396, term13396.getClass(), "alternativeLine", "===============================================");
        setField(term13396, term13396.getClass(), "excludedTypes", term13562);
        setField(term13563, term13563.getClass(), "keyType", term13377);
        setElement(term13564, 0, enum44);
        setElement(term13564, 1, enum45);
        setElement(term13564, 2, enum46);
        setElement(term13564, 3, enum47);
        setField(term13563, term13563.getClass(), "keyUniverse", term13564);
        setField(term13563, term13563.getClass(), "vals", term13565);
        setIntField(term13563, term13563.getClass(), "size", 0);
        setField(term13563, term13563.getClass(), "entrySet", null);
        setField(term13563, term13563.getClass(), "keySet", null);
        setField(term13563, term13563.getClass(), "values", null);
        setField(term13396, term13396.getClass(), "customCounterNames", term13563);
        setField(term13218, term13218.getClass(), "printStyleForDetails", term13396);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.config.Configuration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrintStyle", argTypes, term13218, args);
    }

};


