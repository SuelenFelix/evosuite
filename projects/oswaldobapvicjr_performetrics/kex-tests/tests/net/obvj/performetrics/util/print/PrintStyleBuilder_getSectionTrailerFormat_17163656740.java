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

public class PrintStyleBuilder_getSectionTrailerFormat_17163656740 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98256;

    public PrintStyleBuilder_getSectionTrailerFormat_17163656740() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term98411 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term98410 = ((Class) term98411).getDeclaredField((String) "SUMMARIZED");
        ((Field) term98410).setAccessible(true);
        Object enum336 = ((Field) term98410).get((Object) null);
        Class<? extends Object> term98733 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term98732 = ((Class) term98733).getDeclaredField((String) "SHORT");
        ((Field) term98732).setAccessible(true);
        Object enum337 = ((Field) term98732).get((Object) null);
        Class<? extends Object> term98985 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term98984 = ((Class) term98985).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term98984).setAccessible(true);
        Object enum338 =  ((Field) term98984).get((Object) null);
        Class<? extends Object> term99212 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term99211 = ((Class) term99212).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term99211).setAccessible(true);
        Object enum339 =  ((Field) term99211).get((Object) null);
        Class<? extends Object> term99427 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term99426 = ((Class) term99427).getDeclaredField((String) "USER_TIME");
        ((Field) term99426).setAccessible(true);
        Object enum340 =  ((Field) term99426).get((Object) null);
        Class<? extends Object> term99636 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term99635 = ((Class) term99636).getDeclaredField((String) "CPU_TIME");
        ((Field) term99635).setAccessible(true);
        Object enum341 =  ((Field) term99635).get((Object) null);
        ArrayList term98381 = new ArrayList();
        ((ArrayList) term98381).add(enum338);
        ((ArrayList) term98381).add(enum339);
        ((ArrayList) term98381).add(enum340);
        ((ArrayList) term98381).add(enum339);
        ((ArrayList) term98381).add(enum340);
        ((ArrayList) term98381).add(enum341);
        ((ArrayList) term98381).add(enum338);
        ((ArrayList) term98381).add(enum338);
        ((ArrayList) term98381).add(enum340);
        HashMap term98401 = new HashMap();
        term98256 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term98256, term98256.getClass(), "printFormat", enum336);
        setBooleanField(term98256, term98256.getClass(), "printHeader", false);
        setField(term98256, term98256.getClass(), "headerFormat", "RbQmXqfXAT");
        setBooleanField(term98256, term98256.getClass(), "printTrailer", true);
        setField(term98256, term98256.getClass(), "trailerFormat", "fcCAsvfBbe");
        setField(term98256, term98256.getClass(), "rowFormat", "mUNcKUxghj");
        setField(term98256, term98256.getClass(), "sectionHeaderFormat", "lnvLKbtveE");
        setBooleanField(term98256, term98256.getClass(), "printSectionSummary", true);
        setField(term98256, term98256.getClass(), "sectionSummaryRowFormat", "FfrrEhTHzQ");
        setBooleanField(term98256, term98256.getClass(), "printSectionTrailer", false);
        setField(term98256, term98256.getClass(), "sectionTrailerFormat", "LXnDNrMsqT");
        setField(term98256, term98256.getClass(), "durationFormat", enum337);
        setBooleanField(term98256, term98256.getClass(), "printLegend", true);
        setField(term98256, term98256.getClass(), "simpleLine", "ZLQamJFBmu");
        setField(term98256, term98256.getClass(), "alternativeLine", "ZWcOCwKNvd");
        setField(term98256, term98256.getClass(), "excludedTypes", term98381);
        setField(term98256, term98256.getClass(), "customCounterNames", term98401);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSectionTrailerFormat", argTypes, term98256, args);
    }

};


