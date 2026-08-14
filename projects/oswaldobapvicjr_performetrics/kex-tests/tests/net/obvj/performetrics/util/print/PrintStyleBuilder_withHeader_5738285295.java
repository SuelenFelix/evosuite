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
import java.util.ArrayList;
import java.util.HashMap;

public class PrintStyleBuilder_withHeader_5738285295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53531;

    public PrintStyleBuilder_withHeader_5738285295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term53848 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term53847 = ((Class) term53848).getDeclaredField((String) "DETAILED");
        ((Field) term53847).setAccessible(true);
        Object enum179 = ((Field) term53847).get((Object) null);
        Class<? extends Object> term54164 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term54163 = ((Class) term54164).getDeclaredField((String) "LINUX");
        ((Field) term54163).setAccessible(true);
        Object enum180 = ((Field) term54163).get((Object) null);
        Class<? extends Object> term54416 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term54415 = ((Class) term54416).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term54415).setAccessible(true);
        Object enum181 =  ((Field) term54415).get((Object) null);
        Class<? extends Object> term54631 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term54630 = ((Class) term54631).getDeclaredField((String) "CPU_TIME");
        ((Field) term54630).setAccessible(true);
        Object enum182 =  ((Field) term54630).get((Object) null);
        Class<? extends Object> term54837 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term54836 = ((Class) term54837).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term54836).setAccessible(true);
        Object enum183 =  ((Field) term54836).get((Object) null);
        ArrayList term53808 = new ArrayList();
        ((ArrayList) term53808).add(enum181);
        ((ArrayList) term53808).add(enum182);
        ((ArrayList) term53808).add(enum183);
        ((ArrayList) term53808).add(enum181);
        HashMap term53824 = new HashMap();
        term53531 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term53531, term53531.getClass(), "printFormat", enum179);
        setBooleanField(term53531, term53531.getClass(), "printHeader", true);
        setField(term53531, term53531.getClass(), "headerFormat", "lZIgPZPgTu");
        setBooleanField(term53531, term53531.getClass(), "printTrailer", true);
        setField(term53531, term53531.getClass(), "trailerFormat", "iuCxnHGMoW");
        setField(term53531, term53531.getClass(), "rowFormat", "GPSEWEDSTo");
        setField(term53531, term53531.getClass(), "sectionHeaderFormat", "RCOqfVsRHt");
        setBooleanField(term53531, term53531.getClass(), "printSectionSummary", false);
        setField(term53531, term53531.getClass(), "sectionSummaryRowFormat", "TSyCeEZPaT");
        setBooleanField(term53531, term53531.getClass(), "printSectionTrailer", true);
        setField(term53531, term53531.getClass(), "sectionTrailerFormat", "JeZFtaqkzW");
        setField(term53531, term53531.getClass(), "durationFormat", enum180);
        setBooleanField(term53531, term53531.getClass(), "printLegend", true);
        setField(term53531, term53531.getClass(), "simpleLine", "vOVuNSCCLe");
        setField(term53531, term53531.getClass(), "alternativeLine", "fzeqPnzpnt");
        setField(term53531, term53531.getClass(), "excludedTypes", term53808);
        setField(term53531, term53531.getClass(), "customCounterNames", term53824);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "aanyiAOJCl";
        callMethod(klass, "withHeader", argTypes, term53531, args);
    }

};


