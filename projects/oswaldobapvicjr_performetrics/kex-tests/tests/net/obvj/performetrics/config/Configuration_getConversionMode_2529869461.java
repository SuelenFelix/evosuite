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

public class Configuration_getConversionMode_2529869461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2910;

    public Configuration_getConversionMode_2529869461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3260 = Class.forName((String) "net.obvj.performetrics.ConversionMode");
        Field term3259 = ((Class) term3260).getDeclaredField((String) "DOUBLE_PRECISION");
        ((Field) term3259).setAccessible(true);
        Object enum8 = ((Field) term3259).get((Object) null);
        Class<? extends Object> term3500 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term3499 = ((Class) term3500).getDeclaredField((String) "SUMMARIZED");
        ((Field) term3499).setAccessible(true);
        Object enum9 = ((Field) term3499).get((Object) null);
        Class<? extends Object> term3784 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term3783 = ((Class) term3784).getDeclaredField((String) "FULL");
        ((Field) term3783).setAccessible(true);
        Object enum10 = ((Field) term3783).get((Object) null);
        HashMap term3063 = new HashMap();
        Set<Object> term4084 =  ((Map) term3063).keySet();
        HashSet term3062 = new HashSet((Collection<? extends Object>) term4084);
        Class<? extends Object> term3069 = Class.forName((String) "java.nio.file.spi.FileSystemProvider");
        Class<? extends Object> term4196 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term4195 = ((Class) term4196).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term4195).setAccessible(true);
        Object enum11 = ((Field) term4195).get((Object) null);
        Class<? extends Object> term4423 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term4422 = ((Class) term4423).getDeclaredField((String) "CPU_TIME");
        ((Field) term4422).setAccessible(true);
        Object enum12 = ((Field) term4422).get((Object) null);
        Class<? extends Object> term4629 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term4628 = ((Class) term4629).getDeclaredField((String) "USER_TIME");
        ((Field) term4628).setAccessible(true);
        Object enum13 = ((Field) term4628).get((Object) null);
        Class<? extends Object> term4838 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term4837 = ((Class) term4838).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term4837).setAccessible(true);
        Object enum14 = ((Field) term4837).get((Object) null);
        Class<? extends Object> term5053 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term5052 = ((Class) term5053).getDeclaredField((String) "DETAILED");
        ((Field) term5052).setAccessible(true);
        Object enum15 = ((Field) term5052).get((Object) null);
        term2910 = newInstance(Class.forName("net.obvj.performetrics.config.Configuration"));
        Object term2932 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        Object term3068 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term3077 = (Object[]) newArray("net.obvj.performetrics.Counter$Type", 4);
        Object[] term3086 = (Object[]) newArray("java.lang.Object", 4);
        Object term3088 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        Object term3254 = newInstance(Class.forName("java.util.Collections$EmptySet"));
        Object term3255 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term3256 = (Object[]) newArray("net.obvj.performetrics.Counter$Type", 4);
        Object[] term3257 = (Object[]) newArray("java.lang.Object", 4);
        setField(term2910, term2910.getClass(), "conversionMode", enum8);
        setIntField(term2910, term2910.getClass(), "scale", 9);
        setField(term2932, term2932.getClass(), "printFormat", enum9);
        setBooleanField(term2932, term2932.getClass(), "printHeader", true);
        setField(term2932, term2932.getClass(), "headerFormat", "%-15s  %19s");
        setBooleanField(term2932, term2932.getClass(), "printTrailer", false);
        setField(term2932, term2932.getClass(), "trailerFormat", null);
        setField(term2932, term2932.getClass(), "rowFormat", "%-15s  %19s");
        setField(term2932, term2932.getClass(), "sectionHeaderFormat", null);
        setBooleanField(term2932, term2932.getClass(), "printSectionSummary", false);
        setField(term2932, term2932.getClass(), "sectionSummaryRowFormat", null);
        setBooleanField(term2932, term2932.getClass(), "printSectionTrailer", false);
        setField(term2932, term2932.getClass(), "sectionTrailerFormat", null);
        setField(term2932, term2932.getClass(), "durationFormat", enum10);
        setBooleanField(term2932, term2932.getClass(), "printLegend", false);
        setField(term2932, term2932.getClass(), "simpleLine", "------------------------------------");
        setField(term2932, term2932.getClass(), "alternativeLine", "====================================");
        setField(term2932, term2932.getClass(), "excludedTypes", term3062);
        setField(term3068, term3068.getClass(), "keyType", term3069);
        setElement(term3077, 0, enum11);
        setElement(term3077, 1, enum12);
        setElement(term3077, 2, enum13);
        setElement(term3077, 3, enum14);
        setField(term3068, term3068.getClass(), "keyUniverse", term3077);
        setField(term3068, term3068.getClass(), "vals", term3086);
        setIntField(term3068, term3068.getClass(), "size", 0);
        setField(term3068, term3068.getClass(), "entrySet", null);
        setField(term3068, term3068.getClass(), "keySet", null);
        setField(term3068, term3068.getClass(), "values", null);
        setField(term2932, term2932.getClass(), "customCounterNames", term3068);
        setField(term2910, term2910.getClass(), "printStyle", term2932);
        setField(term2910, term2910.getClass(), "printStyleForSummary", term2932);
        setField(term3088, term3088.getClass(), "printFormat", enum15);
        setBooleanField(term3088, term3088.getClass(), "printHeader", true);
        setField(term3088, term3088.getClass(), "headerFormat", "%5s  %19s  %19s");
        setBooleanField(term3088, term3088.getClass(), "printTrailer", false);
        setField(term3088, term3088.getClass(), "trailerFormat", null);
        setField(term3088, term3088.getClass(), "rowFormat", "%5s  %19s  %19s");
        setField(term3088, term3088.getClass(), "sectionHeaderFormat", "%s");
        setBooleanField(term3088, term3088.getClass(), "printSectionSummary", true);
        setField(term3088, term3088.getClass(), "sectionSummaryRowFormat", "TOTAL %41s");
        setBooleanField(term3088, term3088.getClass(), "printSectionTrailer", false);
        setField(term3088, term3088.getClass(), "sectionTrailerFormat", null);
        setField(term3088, term3088.getClass(), "durationFormat", enum10);
        setBooleanField(term3088, term3088.getClass(), "printLegend", false);
        setField(term3088, term3088.getClass(), "simpleLine", "-----------------------------------------------");
        setField(term3088, term3088.getClass(), "alternativeLine", "===============================================");
        setField(term3088, term3088.getClass(), "excludedTypes", term3254);
        setField(term3255, term3255.getClass(), "keyType", term3069);
        setElement(term3256, 0, enum11);
        setElement(term3256, 1, enum12);
        setElement(term3256, 2, enum13);
        setElement(term3256, 3, enum14);
        setField(term3255, term3255.getClass(), "keyUniverse", term3256);
        setField(term3255, term3255.getClass(), "vals", term3257);
        setIntField(term3255, term3255.getClass(), "size", 0);
        setField(term3255, term3255.getClass(), "entrySet", null);
        setField(term3255, term3255.getClass(), "keySet", null);
        setField(term3255, term3255.getClass(), "values", null);
        setField(term3088, term3088.getClass(), "customCounterNames", term3255);
        setField(term2910, term2910.getClass(), "printStyleForDetails", term3088);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.config.Configuration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConversionMode", argTypes, term2910, args);
    }

};


