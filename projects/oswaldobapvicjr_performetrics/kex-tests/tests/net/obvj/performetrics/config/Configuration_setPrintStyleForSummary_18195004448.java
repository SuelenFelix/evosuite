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

public class Configuration_setPrintStyleForSummary_18195004448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21235;
     Object term21586;

    public Configuration_setPrintStyleForSummary_18195004448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21714 = Class.forName((String) "net.obvj.performetrics.ConversionMode");
        Field term21713 = ((Class) term21714).getDeclaredField((String) "DOUBLE_PRECISION");
        ((Field) term21713).setAccessible(true);
        Object enum66 = ((Field) term21713).get((Object) null);
        Class<? extends Object> term21954 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term21953 = ((Class) term21954).getDeclaredField((String) "SUMMARIZED");
        ((Field) term21953).setAccessible(true);
        Object enum67 = ((Field) term21953).get((Object) null);
        Class<? extends Object> term22238 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term22237 = ((Class) term22238).getDeclaredField((String) "FULL");
        ((Field) term22237).setAccessible(true);
        Object enum68 = ((Field) term22237).get((Object) null);
        HashMap term21388 = new HashMap();
        Set<Object> term22538 =  ((Map) term21388).keySet();
        HashSet term21387 = new HashSet((Collection<? extends Object>) term22538);
        Class<? extends Object> term21394 = Class.forName((String) "java.util.concurrent.CompletableFuture$Completion");
        Class<? extends Object> term22689 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term22688 = ((Class) term22689).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term22688).setAccessible(true);
        Object enum69 = ((Field) term22688).get((Object) null);
        Class<? extends Object> term22916 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term22915 = ((Class) term22916).getDeclaredField((String) "CPU_TIME");
        ((Field) term22915).setAccessible(true);
        Object enum70 =  ((Field) term22915).get((Object) null);
        Class<? extends Object> term23122 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term23121 = ((Class) term23122).getDeclaredField((String) "USER_TIME");
        ((Field) term23121).setAccessible(true);
        Object enum71 = ((Field) term23121).get((Object) null);
        Class<? extends Object> term23331 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term23330 = ((Class) term23331).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term23330).setAccessible(true);
        Object enum72 = ((Field) term23330).get((Object) null);
        Class<? extends Object> term23546 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term23545 = ((Class) term23546).getDeclaredField((String) "DETAILED");
        ((Field) term23545).setAccessible(true);
        Object enum73 = ((Field) term23545).get((Object) null);
        term21235 = newInstance(Class.forName("net.obvj.performetrics.config.Configuration"));
        Object term21257 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        Object term21393 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term21404 = (Object[]) newArray("net.obvj.performetrics.Counter$Type", 4);
        Object[] term21413 = (Object[]) newArray("java.lang.Object", 4);
        Object term21415 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        Object term21581 = newInstance(Class.forName("java.util.Collections$EmptySet"));
        Object term21582 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term21583 = (Object[]) newArray("net.obvj.performetrics.Counter$Type", 4);
        Object[] term21584 = (Object[]) newArray("java.lang.Object", 4);
        setField(term21235, term21235.getClass(), "conversionMode", enum66);
        setIntField(term21235, term21235.getClass(), "scale", 9);
        setField(term21257, term21257.getClass(), "printFormat", enum67);
        setBooleanField(term21257, term21257.getClass(), "printHeader", true);
        setField(term21257, term21257.getClass(), "headerFormat", "%-15s  %19s");
        setBooleanField(term21257, term21257.getClass(), "printTrailer", false);
        setField(term21257, term21257.getClass(), "trailerFormat", null);
        setField(term21257, term21257.getClass(), "rowFormat", "%-15s  %19s");
        setField(term21257, term21257.getClass(), "sectionHeaderFormat", null);
        setBooleanField(term21257, term21257.getClass(), "printSectionSummary", false);
        setField(term21257, term21257.getClass(), "sectionSummaryRowFormat", null);
        setBooleanField(term21257, term21257.getClass(), "printSectionTrailer", false);
        setField(term21257, term21257.getClass(), "sectionTrailerFormat", null);
        setField(term21257, term21257.getClass(), "durationFormat", enum68);
        setBooleanField(term21257, term21257.getClass(), "printLegend", false);
        setField(term21257, term21257.getClass(), "simpleLine", "------------------------------------");
        setField(term21257, term21257.getClass(), "alternativeLine", "====================================");
        setField(term21257, term21257.getClass(), "excludedTypes", term21387);
        setField(term21393, term21393.getClass(), "keyType", term21394);
        setElement(term21404, 0, enum69);
        setElement(term21404, 1, enum70);
        setElement(term21404, 2, enum71);
        setElement(term21404, 3, enum72);
        setField(term21393, term21393.getClass(), "keyUniverse", term21404);
        setField(term21393, term21393.getClass(), "vals", term21413);
        setIntField(term21393, term21393.getClass(), "size", 0);
        setField(term21393, term21393.getClass(), "entrySet", null);
        setField(term21393, term21393.getClass(), "keySet", null);
        setField(term21393, term21393.getClass(), "values", null);
        setField(term21257, term21257.getClass(), "customCounterNames", term21393);
        setField(term21235, term21235.getClass(), "printStyle", term21257);
        setField(term21235, term21235.getClass(), "printStyleForSummary", term21257);
        setField(term21415, term21415.getClass(), "printFormat", enum73);
        setBooleanField(term21415, term21415.getClass(), "printHeader", true);
        setField(term21415, term21415.getClass(), "headerFormat", "%5s  %19s  %19s");
        setBooleanField(term21415, term21415.getClass(), "printTrailer", false);
        setField(term21415, term21415.getClass(), "trailerFormat", null);
        setField(term21415, term21415.getClass(), "rowFormat", "%5s  %19s  %19s");
        setField(term21415, term21415.getClass(), "sectionHeaderFormat", "%s");
        setBooleanField(term21415, term21415.getClass(), "printSectionSummary", true);
        setField(term21415, term21415.getClass(), "sectionSummaryRowFormat", "TOTAL %41s");
        setBooleanField(term21415, term21415.getClass(), "printSectionTrailer", false);
        setField(term21415, term21415.getClass(), "sectionTrailerFormat", null);
        setField(term21415, term21415.getClass(), "durationFormat", enum68);
        setBooleanField(term21415, term21415.getClass(), "printLegend", false);
        setField(term21415, term21415.getClass(), "simpleLine", "-----------------------------------------------");
        setField(term21415, term21415.getClass(), "alternativeLine", "===============================================");
        setField(term21415, term21415.getClass(), "excludedTypes", term21581);
        setField(term21582, term21582.getClass(), "keyType", term21394);
        setElement(term21583, 0, enum69);
        setElement(term21583, 1, enum70);
        setElement(term21583, 2, enum71);
        setElement(term21583, 3, enum72);
        setField(term21582, term21582.getClass(), "keyUniverse", term21583);
        setField(term21582, term21582.getClass(), "vals", term21584);
        setIntField(term21582, term21582.getClass(), "size", 0);
        setField(term21582, term21582.getClass(), "entrySet", null);
        setField(term21582, term21582.getClass(), "keySet", null);
        setField(term21582, term21582.getClass(), "values", null);
        setField(term21415, term21415.getClass(), "customCounterNames", term21582);
        setField(term21235, term21235.getClass(), "printStyleForDetails", term21415);
        Class<? extends Object> term23998 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term23997 = ((Class) term23998).getDeclaredField((String) "ISO_8601");
        ((Field) term23997).setAccessible(true);
        Object enum74 = ((Field) term23997).get((Object) null);
        ArrayList term21700 = new ArrayList();
        ((ArrayList) term21700).add(enum70);
        HashMap term21704 = new HashMap();
        term21586 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term21586, term21586.getClass(), "printFormat", enum67);
        setBooleanField(term21586, term21586.getClass(), "printHeader", true);
        setField(term21586, term21586.getClass(), "headerFormat", "RMFIsYGgne");
        setBooleanField(term21586, term21586.getClass(), "printTrailer", true);
        setField(term21586, term21586.getClass(), "trailerFormat", "NRdvgJlhkX");
        setField(term21586, term21586.getClass(), "rowFormat", "uuaPigETmJ");
        setField(term21586, term21586.getClass(), "sectionHeaderFormat", "MxlszYVzRf");
        setBooleanField(term21586, term21586.getClass(), "printSectionSummary", true);
        setField(term21586, term21586.getClass(), "sectionSummaryRowFormat", "LQFpaHEwXR");
        setBooleanField(term21586, term21586.getClass(), "printSectionTrailer", false);
        setField(term21586, term21586.getClass(), "sectionTrailerFormat", "oVcInYnLWB");
        setField(term21586, term21586.getClass(), "durationFormat", enum74);
        setBooleanField(term21586, term21586.getClass(), "printLegend", true);
        setField(term21586, term21586.getClass(), "simpleLine", "aJlieCFVtF");
        setField(term21586, term21586.getClass(), "alternativeLine", "ZiaGIbnzTs");
        setField(term21586, term21586.getClass(), "excludedTypes", term21700);
        setField(term21586, term21586.getClass(), "customCounterNames", term21704);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.config.Configuration");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Object[] args = new Object[1];
        args[0] = term21586;
        callMethod(klass, "setPrintStyleForSummary", argTypes, term21235, args);
    }

};


