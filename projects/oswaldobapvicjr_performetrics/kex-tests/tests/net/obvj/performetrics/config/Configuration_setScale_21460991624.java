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
import java.lang.Integer;

public class Configuration_setScale_21460991624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10730;
     Object term11079;

    public Configuration_setScale_21460991624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11082 = Class.forName((String) "net.obvj.performetrics.ConversionMode");
        Field term11081 = ((Class) term11082).getDeclaredField((String) "DOUBLE_PRECISION");
        ((Field) term11081).setAccessible(true);
        Object enum33 = ((Field) term11081).get((Object) null);
        Class<? extends Object> term11322 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term11321 = ((Class) term11322).getDeclaredField((String) "SUMMARIZED");
        ((Field) term11321).setAccessible(true);
        Object enum34 = ((Field) term11321).get((Object) null);
        Class<? extends Object> term11606 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term11605 = ((Class) term11606).getDeclaredField((String) "FULL");
        ((Field) term11605).setAccessible(true);
        Object enum35 = ((Field) term11605).get((Object) null);
        HashMap term10883 = new HashMap();
        Set<Object> term11906 =  ((Map) term10883).keySet();
        HashSet term10882 = new HashSet((Collection<? extends Object>) term11906);
        Class<? extends Object> term10889 = Class.forName((String) "java.lang.FdLibm$Exp");
        Class<? extends Object> term11970 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term11969 = ((Class) term11970).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term11969).setAccessible(true);
        Object enum36 = ((Field) term11969).get((Object) null);
        Class<? extends Object> term12197 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term12196 = ((Class) term12197).getDeclaredField((String) "CPU_TIME");
        ((Field) term12196).setAccessible(true);
        Object enum37 = ((Field) term12196).get((Object) null);
        Class<? extends Object> term12403 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term12402 = ((Class) term12403).getDeclaredField((String) "USER_TIME");
        ((Field) term12402).setAccessible(true);
        Object enum38 = ((Field) term12402).get((Object) null);
        Class<? extends Object> term12612 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term12611 = ((Class) term12612).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term12611).setAccessible(true);
        Object enum39 = ((Field) term12611).get((Object) null);
        Class<? extends Object> term12827 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term12826 = ((Class) term12827).getDeclaredField((String) "DETAILED");
        ((Field) term12826).setAccessible(true);
        Object enum40 = ((Field) term12826).get((Object) null);
        term10730 = newInstance(Class.forName("net.obvj.performetrics.config.Configuration"));
        Object term10752 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        Object term10888 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term10897 = (Object[]) newArray("net.obvj.performetrics.Counter$Type", 4);
        Object[] term10906 = (Object[]) newArray("java.lang.Object", 4);
        Object term10908 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        Object term11074 = newInstance(Class.forName("java.util.Collections$EmptySet"));
        Object term11075 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term11076 = (Object[]) newArray("net.obvj.performetrics.Counter$Type", 4);
        Object[] term11077 = (Object[]) newArray("java.lang.Object", 4);
        setField(term10730, term10730.getClass(), "conversionMode", enum33);
        setIntField(term10730, term10730.getClass(), "scale", 9);
        setField(term10752, term10752.getClass(), "printFormat", enum34);
        setBooleanField(term10752, term10752.getClass(), "printHeader", true);
        setField(term10752, term10752.getClass(), "headerFormat", "%-15s  %19s");
        setBooleanField(term10752, term10752.getClass(), "printTrailer", false);
        setField(term10752, term10752.getClass(), "trailerFormat", null);
        setField(term10752, term10752.getClass(), "rowFormat", "%-15s  %19s");
        setField(term10752, term10752.getClass(), "sectionHeaderFormat", null);
        setBooleanField(term10752, term10752.getClass(), "printSectionSummary", false);
        setField(term10752, term10752.getClass(), "sectionSummaryRowFormat", null);
        setBooleanField(term10752, term10752.getClass(), "printSectionTrailer", false);
        setField(term10752, term10752.getClass(), "sectionTrailerFormat", null);
        setField(term10752, term10752.getClass(), "durationFormat", enum35);
        setBooleanField(term10752, term10752.getClass(), "printLegend", false);
        setField(term10752, term10752.getClass(), "simpleLine", "------------------------------------");
        setField(term10752, term10752.getClass(), "alternativeLine", "====================================");
        setField(term10752, term10752.getClass(), "excludedTypes", term10882);
        setField(term10888, term10888.getClass(), "keyType", term10889);
        setElement(term10897, 0, enum36);
        setElement(term10897, 1, enum37);
        setElement(term10897, 2, enum38);
        setElement(term10897, 3, enum39);
        setField(term10888, term10888.getClass(), "keyUniverse", term10897);
        setField(term10888, term10888.getClass(), "vals", term10906);
        setIntField(term10888, term10888.getClass(), "size", 0);
        setField(term10888, term10888.getClass(), "entrySet", null);
        setField(term10888, term10888.getClass(), "keySet", null);
        setField(term10888, term10888.getClass(), "values", null);
        setField(term10752, term10752.getClass(), "customCounterNames", term10888);
        setField(term10730, term10730.getClass(), "printStyle", term10752);
        setField(term10730, term10730.getClass(), "printStyleForSummary", term10752);
        setField(term10908, term10908.getClass(), "printFormat", enum40);
        setBooleanField(term10908, term10908.getClass(), "printHeader", true);
        setField(term10908, term10908.getClass(), "headerFormat", "%5s  %19s  %19s");
        setBooleanField(term10908, term10908.getClass(), "printTrailer", false);
        setField(term10908, term10908.getClass(), "trailerFormat", null);
        setField(term10908, term10908.getClass(), "rowFormat", "%5s  %19s  %19s");
        setField(term10908, term10908.getClass(), "sectionHeaderFormat", "%s");
        setBooleanField(term10908, term10908.getClass(), "printSectionSummary", true);
        setField(term10908, term10908.getClass(), "sectionSummaryRowFormat", "TOTAL %41s");
        setBooleanField(term10908, term10908.getClass(), "printSectionTrailer", false);
        setField(term10908, term10908.getClass(), "sectionTrailerFormat", null);
        setField(term10908, term10908.getClass(), "durationFormat", enum35);
        setBooleanField(term10908, term10908.getClass(), "printLegend", false);
        setField(term10908, term10908.getClass(), "simpleLine", "-----------------------------------------------");
        setField(term10908, term10908.getClass(), "alternativeLine", "===============================================");
        setField(term10908, term10908.getClass(), "excludedTypes", term11074);
        setField(term11075, term11075.getClass(), "keyType", term10889);
        setElement(term11076, 0, enum36);
        setElement(term11076, 1, enum37);
        setElement(term11076, 2, enum38);
        setElement(term11076, 3, enum39);
        setField(term11075, term11075.getClass(), "keyUniverse", term11076);
        setField(term11075, term11075.getClass(), "vals", term11077);
        setIntField(term11075, term11075.getClass(), "size", 0);
        setField(term11075, term11075.getClass(), "entrySet", null);
        setField(term11075, term11075.getClass(), "keySet", null);
        setField(term11075, term11075.getClass(), "values", null);
        setField(term10908, term10908.getClass(), "customCounterNames", term11075);
        setField(term10730, term10730.getClass(), "printStyleForDetails", term10908);
        term11079 = new Integer(568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.config.Configuration");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term11079;
        callMethod(klass, "setScale", argTypes, term10730, args);
    }

};


