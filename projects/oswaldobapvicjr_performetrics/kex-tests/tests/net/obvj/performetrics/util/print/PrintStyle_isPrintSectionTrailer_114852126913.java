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

public class PrintStyle_isPrintSectionTrailer_114852126913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31302;

    public PrintStyle_isPrintSectionTrailer_114852126913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term31458 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term31457 = ((Class) term31458).getDeclaredField((String) "DETAILED");
        ((Field) term31457).setAccessible(true);
        Object enum101 = ((Field) term31457).get((Object) null);
        Class<? extends Object> term31774 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term31773 = ((Class) term31774).getDeclaredField((String) "ISO_8601");
        ((Field) term31773).setAccessible(true);
        Object enum102 = ((Field) term31773).get((Object) null);
        Class<? extends Object> term32035 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term32034 = ((Class) term32035).getDeclaredField((String) "CPU_TIME");
        ((Field) term32034).setAccessible(true);
        Object enum103 =  ((Field) term32034).get((Object) null);
        Class<? extends Object> term32241 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term32240 = ((Class) term32241).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term32240).setAccessible(true);
        Object enum104 =  ((Field) term32240).get((Object) null);
        Class<? extends Object> term32468 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term32467 = ((Class) term32468).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term32467).setAccessible(true);
        Object enum105 =  ((Field) term32467).get((Object) null);
        Class<? extends Object> term32683 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term32682 = ((Class) term32683).getDeclaredField((String) "USER_TIME");
        ((Field) term32682).setAccessible(true);
        Object enum106 =  ((Field) term32682).get((Object) null);
        ArrayList term31428 = new ArrayList();
        ((ArrayList) term31428).add(enum103);
        ((ArrayList) term31428).add(enum104);
        ((ArrayList) term31428).add(enum104);
        ((ArrayList) term31428).add(enum105);
        ((ArrayList) term31428).add(enum106);
        ((ArrayList) term31428).add(enum104);
        HashMap term31448 = new HashMap();
        term31302 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term31302, term31302.getClass(), "printFormat", enum101);
        setBooleanField(term31302, term31302.getClass(), "printHeader", false);
        setField(term31302, term31302.getClass(), "headerFormat", "kNqaJKIATy");
        setBooleanField(term31302, term31302.getClass(), "printTrailer", false);
        setField(term31302, term31302.getClass(), "trailerFormat", "vKQukfbJUd");
        setField(term31302, term31302.getClass(), "rowFormat", "lFRJFUMVbx");
        setField(term31302, term31302.getClass(), "sectionHeaderFormat", "sZdUNdggUW");
        setBooleanField(term31302, term31302.getClass(), "printSectionSummary", false);
        setField(term31302, term31302.getClass(), "sectionSummaryRowFormat", "OqbwYQfvAe");
        setBooleanField(term31302, term31302.getClass(), "printSectionTrailer", false);
        setField(term31302, term31302.getClass(), "sectionTrailerFormat", "tRxZafjqIx");
        setField(term31302, term31302.getClass(), "durationFormat", enum102);
        setBooleanField(term31302, term31302.getClass(), "printLegend", false);
        setField(term31302, term31302.getClass(), "simpleLine", "DhjNLmRMCu");
        setField(term31302, term31302.getClass(), "alternativeLine", "PgPzMSEjjX");
        setField(term31302, term31302.getClass(), "excludedTypes", term31428);
        setField(term31302, term31302.getClass(), "customCounterNames", term31448);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPrintSectionTrailer", argTypes, term31302, args);
    }

};


