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

public class Configuration_getScale_2084356443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8181;

    public Configuration_getScale_2084356443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8531 = Class.forName((String) "net.obvj.performetrics.ConversionMode");
        Field term8530 = ((Class) term8531).getDeclaredField((String) "DOUBLE_PRECISION");
        ((Field) term8530).setAccessible(true);
        Object enum25 = ((Field) term8530).get((Object) null);
        Class<? extends Object> term8771 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term8770 = ((Class) term8771).getDeclaredField((String) "SUMMARIZED");
        ((Field) term8770).setAccessible(true);
        Object enum26 = ((Field) term8770).get((Object) null);
        Class<? extends Object> term9055 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term9054 = ((Class) term9055).getDeclaredField((String) "FULL");
        ((Field) term9054).setAccessible(true);
        Object enum27 = ((Field) term9054).get((Object) null);
        HashMap term8334 = new HashMap();
        Set<Object> term9355 =  ((Map) term8334).keySet();
        HashSet term8333 = new HashSet((Collection<? extends Object>) term9355);
        Class<? extends Object> term8340 = Class.forName((String) "java.util.concurrent.CopyOnWriteArrayList");
        Class<? extends Object> term9482 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term9481 = ((Class) term9482).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term9481).setAccessible(true);
        Object enum28 = ((Field) term9481).get((Object) null);
        Class<? extends Object> term9709 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term9708 = ((Class) term9709).getDeclaredField((String) "CPU_TIME");
        ((Field) term9708).setAccessible(true);
        Object enum29 = ((Field) term9708).get((Object) null);
        Class<? extends Object> term9915 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term9914 = ((Class) term9915).getDeclaredField((String) "USER_TIME");
        ((Field) term9914).setAccessible(true);
        Object enum30 = ((Field) term9914).get((Object) null);
        Class<? extends Object> term10124 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term10123 = ((Class) term10124).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term10123).setAccessible(true);
        Object enum31 = ((Field) term10123).get((Object) null);
        Class<? extends Object> term10339 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term10338 = ((Class) term10339).getDeclaredField((String) "DETAILED");
        ((Field) term10338).setAccessible(true);
        Object enum32 = ((Field) term10338).get((Object) null);
        term8181 = newInstance(Class.forName("net.obvj.performetrics.config.Configuration"));
        Object term8203 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        Object term8339 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term8348 = (Object[]) newArray("net.obvj.performetrics.Counter$Type", 4);
        Object[] term8357 = (Object[]) newArray("java.lang.Object", 4);
        Object term8359 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        Object term8525 = newInstance(Class.forName("java.util.Collections$EmptySet"));
        Object term8526 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term8527 = (Object[]) newArray("net.obvj.performetrics.Counter$Type", 4);
        Object[] term8528 = (Object[]) newArray("java.lang.Object", 4);
        setField(term8181, term8181.getClass(), "conversionMode", enum25);
        setIntField(term8181, term8181.getClass(), "scale", 9);
        setField(term8203, term8203.getClass(), "printFormat", enum26);
        setBooleanField(term8203, term8203.getClass(), "printHeader", true);
        setField(term8203, term8203.getClass(), "headerFormat", "%-15s  %19s");
        setBooleanField(term8203, term8203.getClass(), "printTrailer", false);
        setField(term8203, term8203.getClass(), "trailerFormat", null);
        setField(term8203, term8203.getClass(), "rowFormat", "%-15s  %19s");
        setField(term8203, term8203.getClass(), "sectionHeaderFormat", null);
        setBooleanField(term8203, term8203.getClass(), "printSectionSummary", false);
        setField(term8203, term8203.getClass(), "sectionSummaryRowFormat", null);
        setBooleanField(term8203, term8203.getClass(), "printSectionTrailer", false);
        setField(term8203, term8203.getClass(), "sectionTrailerFormat", null);
        setField(term8203, term8203.getClass(), "durationFormat", enum27);
        setBooleanField(term8203, term8203.getClass(), "printLegend", false);
        setField(term8203, term8203.getClass(), "simpleLine", "------------------------------------");
        setField(term8203, term8203.getClass(), "alternativeLine", "====================================");
        setField(term8203, term8203.getClass(), "excludedTypes", term8333);
        setField(term8339, term8339.getClass(), "keyType", term8340);
        setElement(term8348, 0, enum28);
        setElement(term8348, 1, enum29);
        setElement(term8348, 2, enum30);
        setElement(term8348, 3, enum31);
        setField(term8339, term8339.getClass(), "keyUniverse", term8348);
        setField(term8339, term8339.getClass(), "vals", term8357);
        setIntField(term8339, term8339.getClass(), "size", 0);
        setField(term8339, term8339.getClass(), "entrySet", null);
        setField(term8339, term8339.getClass(), "keySet", null);
        setField(term8339, term8339.getClass(), "values", null);
        setField(term8203, term8203.getClass(), "customCounterNames", term8339);
        setField(term8181, term8181.getClass(), "printStyle", term8203);
        setField(term8181, term8181.getClass(), "printStyleForSummary", term8203);
        setField(term8359, term8359.getClass(), "printFormat", enum32);
        setBooleanField(term8359, term8359.getClass(), "printHeader", true);
        setField(term8359, term8359.getClass(), "headerFormat", "%5s  %19s  %19s");
        setBooleanField(term8359, term8359.getClass(), "printTrailer", false);
        setField(term8359, term8359.getClass(), "trailerFormat", null);
        setField(term8359, term8359.getClass(), "rowFormat", "%5s  %19s  %19s");
        setField(term8359, term8359.getClass(), "sectionHeaderFormat", "%s");
        setBooleanField(term8359, term8359.getClass(), "printSectionSummary", true);
        setField(term8359, term8359.getClass(), "sectionSummaryRowFormat", "TOTAL %41s");
        setBooleanField(term8359, term8359.getClass(), "printSectionTrailer", false);
        setField(term8359, term8359.getClass(), "sectionTrailerFormat", null);
        setField(term8359, term8359.getClass(), "durationFormat", enum27);
        setBooleanField(term8359, term8359.getClass(), "printLegend", false);
        setField(term8359, term8359.getClass(), "simpleLine", "-----------------------------------------------");
        setField(term8359, term8359.getClass(), "alternativeLine", "===============================================");
        setField(term8359, term8359.getClass(), "excludedTypes", term8525);
        setField(term8526, term8526.getClass(), "keyType", term8340);
        setElement(term8527, 0, enum28);
        setElement(term8527, 1, enum29);
        setElement(term8527, 2, enum30);
        setElement(term8527, 3, enum31);
        setField(term8526, term8526.getClass(), "keyUniverse", term8527);
        setField(term8526, term8526.getClass(), "vals", term8528);
        setIntField(term8526, term8526.getClass(), "size", 0);
        setField(term8526, term8526.getClass(), "entrySet", null);
        setField(term8526, term8526.getClass(), "keySet", null);
        setField(term8526, term8526.getClass(), "values", null);
        setField(term8359, term8359.getClass(), "customCounterNames", term8526);
        setField(term8181, term8181.getClass(), "printStyleForDetails", term8359);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.config.Configuration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScale", argTypes, term8181, args);
    }

};


