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

public class Configuration_getPrintStyleForDetails_16148738889 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24258;

    public Configuration_getPrintStyleForDetails_16148738889() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24610 = Class.forName((String) "net.obvj.performetrics.ConversionMode");
        Field term24609 = ((Class) term24610).getDeclaredField((String) "DOUBLE_PRECISION");
        ((Field) term24609).setAccessible(true);
        Object enum75 = ((Field) term24609).get((Object) null);
        Class<? extends Object> term24850 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term24849 = ((Class) term24850).getDeclaredField((String) "SUMMARIZED");
        ((Field) term24849).setAccessible(true);
        Object enum76 = ((Field) term24849).get((Object) null);
        Class<? extends Object> term25134 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term25133 = ((Class) term25134).getDeclaredField((String) "FULL");
        ((Field) term25133).setAccessible(true);
        Object enum77 = ((Field) term25133).get((Object) null);
        HashMap term24411 = new HashMap();
        Set<Object> term25434 =  ((Map) term24411).keySet();
        HashSet term24410 = new HashSet((Collection<? extends Object>) term25434);
        Class<? extends Object> term24417 = Class.forName((String) "java.lang.invoke.VarHandleInts$FieldStaticReadOnly");
        Class<? extends Object> term25588 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term25587 = ((Class) term25588).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term25587).setAccessible(true);
        Object enum78 = ((Field) term25587).get((Object) null);
        Class<? extends Object> term25815 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term25814 = ((Class) term25815).getDeclaredField((String) "CPU_TIME");
        ((Field) term25814).setAccessible(true);
        Object enum79 = ((Field) term25814).get((Object) null);
        Class<? extends Object> term26021 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term26020 = ((Class) term26021).getDeclaredField((String) "USER_TIME");
        ((Field) term26020).setAccessible(true);
        Object enum80 = ((Field) term26020).get((Object) null);
        Class<? extends Object> term26230 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term26229 = ((Class) term26230).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term26229).setAccessible(true);
        Object enum81 = ((Field) term26229).get((Object) null);
        Class<? extends Object> term26445 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term26444 = ((Class) term26445).getDeclaredField((String) "DETAILED");
        ((Field) term26444).setAccessible(true);
        Object enum82 = ((Field) term26444).get((Object) null);
        term24258 = newInstance(Class.forName("net.obvj.performetrics.config.Configuration"));
        Object term24280 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        Object term24416 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term24427 = (Object[]) newArray("net.obvj.performetrics.Counter$Type", 4);
        Object[] term24436 = (Object[]) newArray("java.lang.Object", 4);
        Object term24438 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        Object term24604 = newInstance(Class.forName("java.util.Collections$EmptySet"));
        Object term24605 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term24606 = (Object[]) newArray("net.obvj.performetrics.Counter$Type", 4);
        Object[] term24607 = (Object[]) newArray("java.lang.Object", 4);
        setField(term24258, term24258.getClass(), "conversionMode", enum75);
        setIntField(term24258, term24258.getClass(), "scale", 9);
        setField(term24280, term24280.getClass(), "printFormat", enum76);
        setBooleanField(term24280, term24280.getClass(), "printHeader", true);
        setField(term24280, term24280.getClass(), "headerFormat", "%-15s  %19s");
        setBooleanField(term24280, term24280.getClass(), "printTrailer", false);
        setField(term24280, term24280.getClass(), "trailerFormat", null);
        setField(term24280, term24280.getClass(), "rowFormat", "%-15s  %19s");
        setField(term24280, term24280.getClass(), "sectionHeaderFormat", null);
        setBooleanField(term24280, term24280.getClass(), "printSectionSummary", false);
        setField(term24280, term24280.getClass(), "sectionSummaryRowFormat", null);
        setBooleanField(term24280, term24280.getClass(), "printSectionTrailer", false);
        setField(term24280, term24280.getClass(), "sectionTrailerFormat", null);
        setField(term24280, term24280.getClass(), "durationFormat", enum77);
        setBooleanField(term24280, term24280.getClass(), "printLegend", false);
        setField(term24280, term24280.getClass(), "simpleLine", "------------------------------------");
        setField(term24280, term24280.getClass(), "alternativeLine", "====================================");
        setField(term24280, term24280.getClass(), "excludedTypes", term24410);
        setField(term24416, term24416.getClass(), "keyType", term24417);
        setElement(term24427, 0, enum78);
        setElement(term24427, 1, enum79);
        setElement(term24427, 2, enum80);
        setElement(term24427, 3, enum81);
        setField(term24416, term24416.getClass(), "keyUniverse", term24427);
        setField(term24416, term24416.getClass(), "vals", term24436);
        setIntField(term24416, term24416.getClass(), "size", 0);
        setField(term24416, term24416.getClass(), "entrySet", null);
        setField(term24416, term24416.getClass(), "keySet", null);
        setField(term24416, term24416.getClass(), "values", null);
        setField(term24280, term24280.getClass(), "customCounterNames", term24416);
        setField(term24258, term24258.getClass(), "printStyle", term24280);
        setField(term24258, term24258.getClass(), "printStyleForSummary", term24280);
        setField(term24438, term24438.getClass(), "printFormat", enum82);
        setBooleanField(term24438, term24438.getClass(), "printHeader", true);
        setField(term24438, term24438.getClass(), "headerFormat", "%5s  %19s  %19s");
        setBooleanField(term24438, term24438.getClass(), "printTrailer", false);
        setField(term24438, term24438.getClass(), "trailerFormat", null);
        setField(term24438, term24438.getClass(), "rowFormat", "%5s  %19s  %19s");
        setField(term24438, term24438.getClass(), "sectionHeaderFormat", "%s");
        setBooleanField(term24438, term24438.getClass(), "printSectionSummary", true);
        setField(term24438, term24438.getClass(), "sectionSummaryRowFormat", "TOTAL %41s");
        setBooleanField(term24438, term24438.getClass(), "printSectionTrailer", false);
        setField(term24438, term24438.getClass(), "sectionTrailerFormat", null);
        setField(term24438, term24438.getClass(), "durationFormat", enum77);
        setBooleanField(term24438, term24438.getClass(), "printLegend", false);
        setField(term24438, term24438.getClass(), "simpleLine", "-----------------------------------------------");
        setField(term24438, term24438.getClass(), "alternativeLine", "===============================================");
        setField(term24438, term24438.getClass(), "excludedTypes", term24604);
        setField(term24605, term24605.getClass(), "keyType", term24417);
        setElement(term24606, 0, enum78);
        setElement(term24606, 1, enum79);
        setElement(term24606, 2, enum80);
        setElement(term24606, 3, enum81);
        setField(term24605, term24605.getClass(), "keyUniverse", term24606);
        setField(term24605, term24605.getClass(), "vals", term24607);
        setIntField(term24605, term24605.getClass(), "size", 0);
        setField(term24605, term24605.getClass(), "entrySet", null);
        setField(term24605, term24605.getClass(), "keySet", null);
        setField(term24605, term24605.getClass(), "values", null);
        setField(term24438, term24438.getClass(), "customCounterNames", term24605);
        setField(term24258, term24258.getClass(), "printStyleForDetails", term24438);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.config.Configuration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrintStyleForDetails", argTypes, term24258, args);
    }

};


