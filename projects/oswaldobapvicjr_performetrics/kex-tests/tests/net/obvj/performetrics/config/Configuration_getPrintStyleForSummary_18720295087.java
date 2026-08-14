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

public class Configuration_getPrintStyleForSummary_18720295087 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18729;

    public Configuration_getPrintStyleForSummary_18720295087() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19081 = Class.forName((String) "net.obvj.performetrics.ConversionMode");
        Field term19080 = ((Class) term19081).getDeclaredField((String) "DOUBLE_PRECISION");
        ((Field) term19080).setAccessible(true);
        Object enum58 = ((Field) term19080).get((Object) null);
        Class<? extends Object> term19321 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term19320 = ((Class) term19321).getDeclaredField((String) "SUMMARIZED");
        ((Field) term19320).setAccessible(true);
        Object enum59 = ((Field) term19320).get((Object) null);
        Class<? extends Object> term19605 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term19604 = ((Class) term19605).getDeclaredField((String) "FULL");
        ((Field) term19604).setAccessible(true);
        Object enum60 = ((Field) term19604).get((Object) null);
        HashMap term18882 = new HashMap();
        Set<Object> term19905 =  ((Map) term18882).keySet();
        HashSet term18881 = new HashSet((Collection<? extends Object>) term19905);
        Class<? extends Object> term18888 = Class.forName((String) "java.lang.SuppressWarnings");
        Class<? extends Object> term19987 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term19986 = ((Class) term19987).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term19986).setAccessible(true);
        Object enum61 = ((Field) term19986).get((Object) null);
        Class<? extends Object> term20214 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term20213 = ((Class) term20214).getDeclaredField((String) "CPU_TIME");
        ((Field) term20213).setAccessible(true);
        Object enum62 = ((Field) term20213).get((Object) null);
        Class<? extends Object> term20420 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term20419 = ((Class) term20420).getDeclaredField((String) "USER_TIME");
        ((Field) term20419).setAccessible(true);
        Object enum63 = ((Field) term20419).get((Object) null);
        Class<? extends Object> term20629 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term20628 = ((Class) term20629).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term20628).setAccessible(true);
        Object enum64 = ((Field) term20628).get((Object) null);
        Class<? extends Object> term20844 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term20843 = ((Class) term20844).getDeclaredField((String) "DETAILED");
        ((Field) term20843).setAccessible(true);
        Object enum65 = ((Field) term20843).get((Object) null);
        term18729 = newInstance(Class.forName("net.obvj.performetrics.config.Configuration"));
        Object term18751 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        Object term18887 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term18898 = (Object[]) newArray("net.obvj.performetrics.Counter$Type", 4);
        Object[] term18907 = (Object[]) newArray("java.lang.Object", 4);
        Object term18909 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        Object term19075 = newInstance(Class.forName("java.util.Collections$EmptySet"));
        Object term19076 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term19077 = (Object[]) newArray("net.obvj.performetrics.Counter$Type", 4);
        Object[] term19078 = (Object[]) newArray("java.lang.Object", 4);
        setField(term18729, term18729.getClass(), "conversionMode", enum58);
        setIntField(term18729, term18729.getClass(), "scale", 9);
        setField(term18751, term18751.getClass(), "printFormat", enum59);
        setBooleanField(term18751, term18751.getClass(), "printHeader", true);
        setField(term18751, term18751.getClass(), "headerFormat", "%-15s  %19s");
        setBooleanField(term18751, term18751.getClass(), "printTrailer", false);
        setField(term18751, term18751.getClass(), "trailerFormat", null);
        setField(term18751, term18751.getClass(), "rowFormat", "%-15s  %19s");
        setField(term18751, term18751.getClass(), "sectionHeaderFormat", null);
        setBooleanField(term18751, term18751.getClass(), "printSectionSummary", false);
        setField(term18751, term18751.getClass(), "sectionSummaryRowFormat", null);
        setBooleanField(term18751, term18751.getClass(), "printSectionTrailer", false);
        setField(term18751, term18751.getClass(), "sectionTrailerFormat", null);
        setField(term18751, term18751.getClass(), "durationFormat", enum60);
        setBooleanField(term18751, term18751.getClass(), "printLegend", false);
        setField(term18751, term18751.getClass(), "simpleLine", "------------------------------------");
        setField(term18751, term18751.getClass(), "alternativeLine", "====================================");
        setField(term18751, term18751.getClass(), "excludedTypes", term18881);
        setField(term18887, term18887.getClass(), "keyType", term18888);
        setElement(term18898, 0, enum61);
        setElement(term18898, 1, enum62);
        setElement(term18898, 2, enum63);
        setElement(term18898, 3, enum64);
        setField(term18887, term18887.getClass(), "keyUniverse", term18898);
        setField(term18887, term18887.getClass(), "vals", term18907);
        setIntField(term18887, term18887.getClass(), "size", 0);
        setField(term18887, term18887.getClass(), "entrySet", null);
        setField(term18887, term18887.getClass(), "keySet", null);
        setField(term18887, term18887.getClass(), "values", null);
        setField(term18751, term18751.getClass(), "customCounterNames", term18887);
        setField(term18729, term18729.getClass(), "printStyle", term18751);
        setField(term18729, term18729.getClass(), "printStyleForSummary", term18751);
        setField(term18909, term18909.getClass(), "printFormat", enum65);
        setBooleanField(term18909, term18909.getClass(), "printHeader", true);
        setField(term18909, term18909.getClass(), "headerFormat", "%5s  %19s  %19s");
        setBooleanField(term18909, term18909.getClass(), "printTrailer", false);
        setField(term18909, term18909.getClass(), "trailerFormat", null);
        setField(term18909, term18909.getClass(), "rowFormat", "%5s  %19s  %19s");
        setField(term18909, term18909.getClass(), "sectionHeaderFormat", "%s");
        setBooleanField(term18909, term18909.getClass(), "printSectionSummary", true);
        setField(term18909, term18909.getClass(), "sectionSummaryRowFormat", "TOTAL %41s");
        setBooleanField(term18909, term18909.getClass(), "printSectionTrailer", false);
        setField(term18909, term18909.getClass(), "sectionTrailerFormat", null);
        setField(term18909, term18909.getClass(), "durationFormat", enum60);
        setBooleanField(term18909, term18909.getClass(), "printLegend", false);
        setField(term18909, term18909.getClass(), "simpleLine", "-----------------------------------------------");
        setField(term18909, term18909.getClass(), "alternativeLine", "===============================================");
        setField(term18909, term18909.getClass(), "excludedTypes", term19075);
        setField(term19076, term19076.getClass(), "keyType", term18888);
        setElement(term19077, 0, enum61);
        setElement(term19077, 1, enum62);
        setElement(term19077, 2, enum63);
        setElement(term19077, 3, enum64);
        setField(term19076, term19076.getClass(), "keyUniverse", term19077);
        setField(term19076, term19076.getClass(), "vals", term19078);
        setIntField(term19076, term19076.getClass(), "size", 0);
        setField(term19076, term19076.getClass(), "entrySet", null);
        setField(term19076, term19076.getClass(), "keySet", null);
        setField(term19076, term19076.getClass(), "values", null);
        setField(term18909, term18909.getClass(), "customCounterNames", term19076);
        setField(term18729, term18729.getClass(), "printStyleForDetails", term18909);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.config.Configuration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrintStyleForSummary", argTypes, term18729, args);
    }

};


