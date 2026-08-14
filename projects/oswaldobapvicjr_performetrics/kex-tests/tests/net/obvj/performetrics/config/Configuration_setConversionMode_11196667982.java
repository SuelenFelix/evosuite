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

public class Configuration_setConversionMode_11196667982 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5444;
     Object enum24;

    public Configuration_setConversionMode_11196667982() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5802 = Class.forName((String) "net.obvj.performetrics.ConversionMode");
        Field term5801 = ((Class) term5802).getDeclaredField((String) "DOUBLE_PRECISION");
        ((Field) term5801).setAccessible(true);
        Object enum16 = ((Field) term5801).get((Object) null);
        Class<? extends Object> term6042 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term6041 = ((Class) term6042).getDeclaredField((String) "SUMMARIZED");
        ((Field) term6041).setAccessible(true);
        Object enum17 = ((Field) term6041).get((Object) null);
        Class<? extends Object> term6326 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term6325 = ((Class) term6326).getDeclaredField((String) "FULL");
        ((Field) term6325).setAccessible(true);
        Object enum18 = ((Field) term6325).get((Object) null);
        HashMap term5597 = new HashMap();
        Set<Object> term6626 =  ((Map) term5597).keySet();
        HashSet term5596 = new HashSet((Collection<? extends Object>) term6626);
        Class<? extends Object> term5603 = Class.forName((String) "java.util.stream.LongPipeline$9$1");
        Class<? extends Object> term6729 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term6728 = ((Class) term6729).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term6728).setAccessible(true);
        Object enum19 = ((Field) term6728).get((Object) null);
        Class<? extends Object> term6956 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term6955 = ((Class) term6956).getDeclaredField((String) "CPU_TIME");
        ((Field) term6955).setAccessible(true);
        Object enum20 = ((Field) term6955).get((Object) null);
        Class<? extends Object> term7162 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term7161 = ((Class) term7162).getDeclaredField((String) "USER_TIME");
        ((Field) term7161).setAccessible(true);
        Object enum21 = ((Field) term7161).get((Object) null);
        Class<? extends Object> term7371 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term7370 = ((Class) term7371).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term7370).setAccessible(true);
        Object enum22 = ((Field) term7370).get((Object) null);
        Class<? extends Object> term7586 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term7585 = ((Class) term7586).getDeclaredField((String) "DETAILED");
        ((Field) term7585).setAccessible(true);
        Object enum23 = ((Field) term7585).get((Object) null);
        term5444 = newInstance(Class.forName("net.obvj.performetrics.config.Configuration"));
        Object term5466 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        Object term5602 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term5611 = (Object[]) newArray("net.obvj.performetrics.Counter$Type", 4);
        Object[] term5620 = (Object[]) newArray("java.lang.Object", 4);
        Object term5622 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        Object term5788 = newInstance(Class.forName("java.util.Collections$EmptySet"));
        Object term5789 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term5790 = (Object[]) newArray("net.obvj.performetrics.Counter$Type", 4);
        Object[] term5791 = (Object[]) newArray("java.lang.Object", 4);
        setField(term5444, term5444.getClass(), "conversionMode", enum16);
        setIntField(term5444, term5444.getClass(), "scale", 9);
        setField(term5466, term5466.getClass(), "printFormat", enum17);
        setBooleanField(term5466, term5466.getClass(), "printHeader", true);
        setField(term5466, term5466.getClass(), "headerFormat", "%-15s  %19s");
        setBooleanField(term5466, term5466.getClass(), "printTrailer", false);
        setField(term5466, term5466.getClass(), "trailerFormat", null);
        setField(term5466, term5466.getClass(), "rowFormat", "%-15s  %19s");
        setField(term5466, term5466.getClass(), "sectionHeaderFormat", null);
        setBooleanField(term5466, term5466.getClass(), "printSectionSummary", false);
        setField(term5466, term5466.getClass(), "sectionSummaryRowFormat", null);
        setBooleanField(term5466, term5466.getClass(), "printSectionTrailer", false);
        setField(term5466, term5466.getClass(), "sectionTrailerFormat", null);
        setField(term5466, term5466.getClass(), "durationFormat", enum18);
        setBooleanField(term5466, term5466.getClass(), "printLegend", false);
        setField(term5466, term5466.getClass(), "simpleLine", "------------------------------------");
        setField(term5466, term5466.getClass(), "alternativeLine", "====================================");
        setField(term5466, term5466.getClass(), "excludedTypes", term5596);
        setField(term5602, term5602.getClass(), "keyType", term5603);
        setElement(term5611, 0, enum19);
        setElement(term5611, 1, enum20);
        setElement(term5611, 2, enum21);
        setElement(term5611, 3, enum22);
        setField(term5602, term5602.getClass(), "keyUniverse", term5611);
        setField(term5602, term5602.getClass(), "vals", term5620);
        setIntField(term5602, term5602.getClass(), "size", 0);
        setField(term5602, term5602.getClass(), "entrySet", null);
        setField(term5602, term5602.getClass(), "keySet", null);
        setField(term5602, term5602.getClass(), "values", null);
        setField(term5466, term5466.getClass(), "customCounterNames", term5602);
        setField(term5444, term5444.getClass(), "printStyle", term5466);
        setField(term5444, term5444.getClass(), "printStyleForSummary", term5466);
        setField(term5622, term5622.getClass(), "printFormat", enum23);
        setBooleanField(term5622, term5622.getClass(), "printHeader", true);
        setField(term5622, term5622.getClass(), "headerFormat", "%5s  %19s  %19s");
        setBooleanField(term5622, term5622.getClass(), "printTrailer", false);
        setField(term5622, term5622.getClass(), "trailerFormat", null);
        setField(term5622, term5622.getClass(), "rowFormat", "%5s  %19s  %19s");
        setField(term5622, term5622.getClass(), "sectionHeaderFormat", "%s");
        setBooleanField(term5622, term5622.getClass(), "printSectionSummary", true);
        setField(term5622, term5622.getClass(), "sectionSummaryRowFormat", "TOTAL %41s");
        setBooleanField(term5622, term5622.getClass(), "printSectionTrailer", false);
        setField(term5622, term5622.getClass(), "sectionTrailerFormat", null);
        setField(term5622, term5622.getClass(), "durationFormat", enum18);
        setBooleanField(term5622, term5622.getClass(), "printLegend", false);
        setField(term5622, term5622.getClass(), "simpleLine", "-----------------------------------------------");
        setField(term5622, term5622.getClass(), "alternativeLine", "===============================================");
        setField(term5622, term5622.getClass(), "excludedTypes", term5788);
        setField(term5789, term5789.getClass(), "keyType", term5603);
        setElement(term5790, 0, enum19);
        setElement(term5790, 1, enum20);
        setElement(term5790, 2, enum21);
        setElement(term5790, 3, enum22);
        setField(term5789, term5789.getClass(), "keyUniverse", term5790);
        setField(term5789, term5789.getClass(), "vals", term5791);
        setIntField(term5789, term5789.getClass(), "size", 0);
        setField(term5789, term5789.getClass(), "entrySet", null);
        setField(term5789, term5789.getClass(), "keySet", null);
        setField(term5789, term5789.getClass(), "values", null);
        setField(term5622, term5622.getClass(), "customCounterNames", term5789);
        setField(term5444, term5444.getClass(), "printStyleForDetails", term5622);
        Class<? extends Object> term7978 = Class.forName((String) "net.obvj.performetrics.ConversionMode");
        Field term7977 = ((Class) term7978).getDeclaredField((String) "FAST");
        ((Field) term7977).setAccessible(true);
        enum24 = ((Field) term7977).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.config.Configuration");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.obvj.performetrics.ConversionMode");
        Object[] args = new Object[1];
        args[0] = enum24;
        callMethod(klass, "setConversionMode", argTypes, term5444, args);
    }

};


