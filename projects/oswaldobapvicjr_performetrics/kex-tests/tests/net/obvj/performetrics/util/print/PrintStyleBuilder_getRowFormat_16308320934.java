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

public class PrintStyleBuilder_getRowFormat_16308320934 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101861;

    public PrintStyleBuilder_getRowFormat_16308320934() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term102158 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term102157 = ((Class) term102158).getDeclaredField((String) "DETAILED");
        ((Field) term102157).setAccessible(true);
        Object enum346 = ((Field) term102157).get((Object) null);
        Class<? extends Object> term102474 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term102473 = ((Class) term102474).getDeclaredField((String) "LINUX");
        ((Field) term102473).setAccessible(true);
        Object enum347 = ((Field) term102473).get((Object) null);
        Class<? extends Object> term102726 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term102725 = ((Class) term102726).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term102725).setAccessible(true);
        Object enum348 =  ((Field) term102725).get((Object) null);
        ArrayList term102138 = new ArrayList();
        ((ArrayList) term102138).add(enum348);
        HashMap term102146 = new HashMap();
        term101861 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term101861, term101861.getClass(), "printFormat", enum346);
        setBooleanField(term101861, term101861.getClass(), "printHeader", true);
        setField(term101861, term101861.getClass(), "headerFormat", "njvnWFTMxN");
        setBooleanField(term101861, term101861.getClass(), "printTrailer", false);
        setField(term101861, term101861.getClass(), "trailerFormat", "fLRqcTSfzF");
        setField(term101861, term101861.getClass(), "rowFormat", "EBYHwsuWAU");
        setField(term101861, term101861.getClass(), "sectionHeaderFormat", "PtIjKpiSix");
        setBooleanField(term101861, term101861.getClass(), "printSectionSummary", true);
        setField(term101861, term101861.getClass(), "sectionSummaryRowFormat", "NZdTuwSCIM");
        setBooleanField(term101861, term101861.getClass(), "printSectionTrailer", true);
        setField(term101861, term101861.getClass(), "sectionTrailerFormat", "dDHcmzPAmP");
        setField(term101861, term101861.getClass(), "durationFormat", enum347);
        setBooleanField(term101861, term101861.getClass(), "printLegend", false);
        setField(term101861, term101861.getClass(), "simpleLine", "HEaTkWYBgv");
        setField(term101861, term101861.getClass(), "alternativeLine", "MpJsPKLTIU");
        setField(term101861, term101861.getClass(), "excludedTypes", term102138);
        setField(term101861, term101861.getClass(), "customCounterNames", term102146);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRowFormat", argTypes, term101861, args);
    }

};


