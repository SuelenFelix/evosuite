package net.obvj.performetrics.util.print;

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
import static net.obvj.performetrics.util.print.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;
import java.util.ArrayList;
import java.util.HashMap;

public class PrintFormat_2_toRowFormat_10994466242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum6;
     Object term2044;
     Object term2046;
     Object term2052;
     Object term2058;
     Object enum11;

    public PrintFormat_2_toRowFormat_10994466242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2236 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term2235 = ((Class) term2236).getDeclaredField((String) "DETAILED");
        ((Field) term2235).setAccessible(true);
        enum6 = ((Field) term2235).get((Object) null);
        term2044 = new Integer(391863371);
        term2046 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term2047 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term2047, term2047.getClass(), "seconds", 46800L);
        setIntField(term2047, term2047.getClass(), "nanos", 0);
        setField(term2046, term2046.getClass(), "internalDuration", term2047);
        setLongField(term2046, term2046.getClass(), "effectiveTotalSeconds", 2442117782898005296L);
        setIntField(term2046, term2046.getClass(), "effectiveNanoseconds", -1922583790);
        term2052 = newInstance(Class.forName("net.obvj.performetrics.util.Duration"));
        Object term2053 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term2053, term2053.getClass(), "seconds", 122400L);
        setIntField(term2053, term2053.getClass(), "nanos", 0);
        setField(term2052, term2052.getClass(), "internalDuration", term2053);
        setLongField(term2052, term2052.getClass(), "effectiveTotalSeconds", 6375119433582206027L);
        setIntField(term2052, term2052.getClass(), "effectiveNanoseconds", -616727354);
        Class<? extends Object> term2492 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term2491 = ((Class) term2492).getDeclaredField((String) "SUMMARIZED");
        ((Field) term2491).setAccessible(true);
        Object enum7 = ((Field) term2491).get((Object) null);
        Class<? extends Object> term2814 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term2813 = ((Class) term2814).getDeclaredField((String) "ISO_8601");
        ((Field) term2813).setAccessible(true);
        Object enum8 = ((Field) term2813).get((Object) null);
        Class<? extends Object> term3075 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term3074 = ((Class) term3075).getDeclaredField((String) "USER_TIME");
        ((Field) term3074).setAccessible(true);
        Object enum9 =  ((Field) term3074).get((Object) null);
        Class<? extends Object> term3284 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term3283 = ((Class) term3284).getDeclaredField((String) "CPU_TIME");
        ((Field) term3283).setAccessible(true);
        Object enum10 =  ((Field) term3283).get((Object) null);
        ArrayList term2186 = new ArrayList();
        ((ArrayList) term2186).add(enum9);
        ((ArrayList) term2186).add(enum9);
        ((ArrayList) term2186).add(enum10);
        ((ArrayList) term2186).add(enum9);
        HashMap term2198 = new HashMap();
        term2058 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term2058, term2058.getClass(), "printFormat", enum7);
        setBooleanField(term2058, term2058.getClass(), "printHeader", true);
        setField(term2058, term2058.getClass(), "headerFormat", "MxlszYVzRf");
        setBooleanField(term2058, term2058.getClass(), "printTrailer", true);
        setField(term2058, term2058.getClass(), "trailerFormat", "LQFpaHEwXR");
        setField(term2058, term2058.getClass(), "rowFormat", "oVcInYnLWB");
        setField(term2058, term2058.getClass(), "sectionHeaderFormat", "aJlieCFVtF");
        setBooleanField(term2058, term2058.getClass(), "printSectionSummary", true);
        setField(term2058, term2058.getClass(), "sectionSummaryRowFormat", "ZiaGIbnzTs");
        setBooleanField(term2058, term2058.getClass(), "printSectionTrailer", false);
        setField(term2058, term2058.getClass(), "sectionTrailerFormat", "tbcdzjIfER");
        setField(term2058, term2058.getClass(), "durationFormat", enum8);
        setBooleanField(term2058, term2058.getClass(), "printLegend", true);
        setField(term2058, term2058.getClass(), "simpleLine", "HyxfbSQYBe");
        setField(term2058, term2058.getClass(), "alternativeLine", "pCTimMblYc");
        setField(term2058, term2058.getClass(), "excludedTypes", term2186);
        setField(term2058, term2058.getClass(), "customCounterNames", term2198);
        Class<? extends Object> term3490 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term3489 = ((Class) term3490).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term3489).setAccessible(true);
        enum11 = ((Field) term3489).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintFormat$2");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("net.obvj.performetrics.util.Duration");
        argTypes[2] = Class.forName("net.obvj.performetrics.util.Duration");
        argTypes[3] = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        argTypes[4] = Class.forName("net.obvj.performetrics.Counter$Type");
        Object[] args = new Object[5];
        args[0] = term2044;
        args[1] = term2046;
        args[2] = term2052;
        args[3] = term2058;
        args[4] = enum11;
        callMethod(klass, "toRowFormat", argTypes, enum6, args);
    }

};


