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

public class PrintStyle_isPrintable_121733620120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93656;
     Object enum317;

    public PrintStyle_isPrintable_121733620120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term93811 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term93810 = ((Class) term93811).getDeclaredField((String) "SUMMARIZED");
        ((Field) term93810).setAccessible(true);
        Object enum315 = ((Field) term93810).get((Object) null);
        Class<? extends Object> term94133 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term94132 = ((Class) term94133).getDeclaredField((String) "SHORT");
        ((Field) term94132).setAccessible(true);
        Object enum316 = ((Field) term94132).get((Object) null);
        Class<? extends Object> term94385 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term94384 = ((Class) term94385).getDeclaredField((String) "USER_TIME");
        ((Field) term94384).setAccessible(true);
        enum317 =  ((Field) term94384).get((Object) null);
        Class<? extends Object> term94594 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term94593 = ((Class) term94594).getDeclaredField((String) "CPU_TIME");
        ((Field) term94593).setAccessible(true);
        Object enum318 =  ((Field) term94593).get((Object) null);
        Class<? extends Object> term94800 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term94799 = ((Class) term94800).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term94799).setAccessible(true);
        Object enum319 =  ((Field) term94799).get((Object) null);
        Class<? extends Object> term95027 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term95026 = ((Class) term95027).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term95026).setAccessible(true);
        Object enum320 =  ((Field) term95026).get((Object) null);
        ArrayList term93781 = new ArrayList();
        ((ArrayList) term93781).add(enum317);
        ((ArrayList) term93781).add(enum318);
        ((ArrayList) term93781).add(enum319);
        ((ArrayList) term93781).add(enum320);
        ((ArrayList) term93781).add(enum320);
        HashMap term93801 = new HashMap();
        term93656 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term93656, term93656.getClass(), "printFormat", enum315);
        setBooleanField(term93656, term93656.getClass(), "printHeader", false);
        setField(term93656, term93656.getClass(), "headerFormat", "eOJfbiZLnb");
        setBooleanField(term93656, term93656.getClass(), "printTrailer", true);
        setField(term93656, term93656.getClass(), "trailerFormat", "nKZKnxWYCK");
        setField(term93656, term93656.getClass(), "rowFormat", "JOqQxuzRuZ");
        setField(term93656, term93656.getClass(), "sectionHeaderFormat", "RSaoipUlsg");
        setBooleanField(term93656, term93656.getClass(), "printSectionSummary", true);
        setField(term93656, term93656.getClass(), "sectionSummaryRowFormat", "cSHGbqKqlN");
        setBooleanField(term93656, term93656.getClass(), "printSectionTrailer", false);
        setField(term93656, term93656.getClass(), "sectionTrailerFormat", "pFAfANnxup");
        setField(term93656, term93656.getClass(), "durationFormat", enum316);
        setBooleanField(term93656, term93656.getClass(), "printLegend", true);
        setField(term93656, term93656.getClass(), "simpleLine", "FbSIUZyBXZ");
        setField(term93656, term93656.getClass(), "alternativeLine", "mhQDwIyrRi");
        setField(term93656, term93656.getClass(), "excludedTypes", term93781);
        setField(term93656, term93656.getClass(), "customCounterNames", term93801);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.obvj.performetrics.Counter$Type");
        Object[] args = new Object[1];
        args[0] = enum317;
        callMethod(klass, "isPrintable", argTypes, term93656, args);
    }

};


