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

public class PrintStyleBuilder_getSimpleLine_32654322241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99841;

    public PrintStyleBuilder_getSimpleLine_32654322241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term99996 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term99995 = ((Class) term99996).getDeclaredField((String) "SUMMARIZED");
        ((Field) term99995).setAccessible(true);
        Object enum342 = ((Field) term99995).get((Object) null);
        Class<? extends Object> term100318 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term100317 = ((Class) term100318).getDeclaredField((String) "SHORT");
        ((Field) term100317).setAccessible(true);
        Object enum343 = ((Field) term100317).get((Object) null);
        Class<? extends Object> term100570 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term100569 = ((Class) term100570).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term100569).setAccessible(true);
        Object enum344 =  ((Field) term100569).get((Object) null);
        Class<? extends Object> term100797 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term100796 = ((Class) term100797).getDeclaredField((String) "CPU_TIME");
        ((Field) term100796).setAccessible(true);
        Object enum345 =  ((Field) term100796).get((Object) null);
        Class<? extends Object> term101003 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term101002 = ((Class) term101003).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term101002).setAccessible(true);
        Object enum346 =  ((Field) term101002).get((Object) null);
        Class<? extends Object> term101218 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term101217 = ((Class) term101218).getDeclaredField((String) "USER_TIME");
        ((Field) term101217).setAccessible(true);
        Object enum347 =  ((Field) term101217).get((Object) null);
        ArrayList term99966 = new ArrayList();
        ((ArrayList) term99966).add(enum344);
        ((ArrayList) term99966).add(enum345);
        ((ArrayList) term99966).add(enum345);
        ((ArrayList) term99966).add(enum346);
        ((ArrayList) term99966).add(enum347);
        ((ArrayList) term99966).add(enum344);
        ((ArrayList) term99966).add(enum347);
        ((ArrayList) term99966).add(enum344);
        ((ArrayList) term99966).add(enum347);
        HashMap term99986 = new HashMap();
        term99841 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term99841, term99841.getClass(), "printFormat", enum342);
        setBooleanField(term99841, term99841.getClass(), "printHeader", false);
        setField(term99841, term99841.getClass(), "headerFormat", "LvztehSlhM");
        setBooleanField(term99841, term99841.getClass(), "printTrailer", true);
        setField(term99841, term99841.getClass(), "trailerFormat", "njvnWFTMxN");
        setField(term99841, term99841.getClass(), "rowFormat", "fLRqcTSfzF");
        setField(term99841, term99841.getClass(), "sectionHeaderFormat", "EBYHwsuWAU");
        setBooleanField(term99841, term99841.getClass(), "printSectionSummary", false);
        setField(term99841, term99841.getClass(), "sectionSummaryRowFormat", "PtIjKpiSix");
        setBooleanField(term99841, term99841.getClass(), "printSectionTrailer", false);
        setField(term99841, term99841.getClass(), "sectionTrailerFormat", "NZdTuwSCIM");
        setField(term99841, term99841.getClass(), "durationFormat", enum343);
        setBooleanField(term99841, term99841.getClass(), "printLegend", true);
        setField(term99841, term99841.getClass(), "simpleLine", "dDHcmzPAmP");
        setField(term99841, term99841.getClass(), "alternativeLine", "HEaTkWYBgv");
        setField(term99841, term99841.getClass(), "excludedTypes", term99966);
        setField(term99841, term99841.getClass(), "customCounterNames", term99986);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSimpleLine", argTypes, term99841, args);
    }

};


