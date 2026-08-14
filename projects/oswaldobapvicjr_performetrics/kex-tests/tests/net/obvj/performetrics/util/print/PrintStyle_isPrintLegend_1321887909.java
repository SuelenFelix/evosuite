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

public class PrintStyle_isPrintLegend_1321887909 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26250;

    public PrintStyle_isPrintLegend_1321887909() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term26553 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term26552 = ((Class) term26553).getDeclaredField((String) "DETAILED");
        ((Field) term26552).setAccessible(true);
        Object enum85 = ((Field) term26552).get((Object) null);
        Class<? extends Object> term26869 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term26868 = ((Class) term26869).getDeclaredField((String) "LINUX");
        ((Field) term26868).setAccessible(true);
        Object enum86 = ((Field) term26868).get((Object) null);
        Class<? extends Object> term27121 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term27120 = ((Class) term27121).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term27120).setAccessible(true);
        Object enum87 =  ((Field) term27120).get((Object) null);
        Class<? extends Object> term27348 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term27347 = ((Class) term27348).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term27347).setAccessible(true);
        Object enum88 =  ((Field) term27347).get((Object) null);
        Class<? extends Object> term27563 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term27562 = ((Class) term27563).getDeclaredField((String) "USER_TIME");
        ((Field) term27562).setAccessible(true);
        Object enum89 =  ((Field) term27562).get((Object) null);
        ArrayList term26527 = new ArrayList();
        ((ArrayList) term26527).add(enum87);
        ((ArrayList) term26527).add(enum88);
        ((ArrayList) term26527).add(enum89);
        ((ArrayList) term26527).add(enum88);
        HashMap term26543 = new HashMap();
        term26250 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term26250, term26250.getClass(), "printFormat", enum85);
        setBooleanField(term26250, term26250.getClass(), "printHeader", false);
        setField(term26250, term26250.getClass(), "headerFormat", "MwwjNtdOFT");
        setBooleanField(term26250, term26250.getClass(), "printTrailer", true);
        setField(term26250, term26250.getClass(), "trailerFormat", "VYkqXKVlAJ");
        setField(term26250, term26250.getClass(), "rowFormat", "XkIoWJRNwN");
        setField(term26250, term26250.getClass(), "sectionHeaderFormat", "aNWLJdrZMq");
        setBooleanField(term26250, term26250.getClass(), "printSectionSummary", true);
        setField(term26250, term26250.getClass(), "sectionSummaryRowFormat", "HHmNoYxIGj");
        setBooleanField(term26250, term26250.getClass(), "printSectionTrailer", false);
        setField(term26250, term26250.getClass(), "sectionTrailerFormat", "PtirvZmsGt");
        setField(term26250, term26250.getClass(), "durationFormat", enum86);
        setBooleanField(term26250, term26250.getClass(), "printLegend", false);
        setField(term26250, term26250.getClass(), "simpleLine", "HWkpTmtlrc");
        setField(term26250, term26250.getClass(), "alternativeLine", "hMmaoREuCK");
        setField(term26250, term26250.getClass(), "excludedTypes", term26527);
        setField(term26250, term26250.getClass(), "customCounterNames", term26543);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPrintLegend", argTypes, term26250, args);
    }

};


