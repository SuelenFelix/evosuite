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

public class PrintStyleBuilder_withSectionSummary_36167634910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70778;

    public PrintStyleBuilder_withSectionSummary_36167634910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term70942 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term70941 = ((Class) term70942).getDeclaredField((String) "SUMMARIZED");
        ((Field) term70941).setAccessible(true);
        Object enum238 = ((Field) term70941).get((Object) null);
        Class<? extends Object> term71264 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term71263 = ((Class) term71264).getDeclaredField((String) "ISO_8601");
        ((Field) term71263).setAccessible(true);
        Object enum239 = ((Field) term71263).get((Object) null);
        Class<? extends Object> term71525 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term71524 = ((Class) term71525).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term71524).setAccessible(true);
        Object enum240 =  ((Field) term71524).get((Object) null);
        Class<? extends Object> term71740 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term71739 = ((Class) term71740).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term71739).setAccessible(true);
        Object enum241 =  ((Field) term71739).get((Object) null);
        ArrayList term70906 = new ArrayList();
        ((ArrayList) term70906).add(enum240);
        ((ArrayList) term70906).add(enum241);
        HashMap term70918 = new HashMap();
        term70778 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term70778, term70778.getClass(), "printFormat", enum238);
        setBooleanField(term70778, term70778.getClass(), "printHeader", false);
        setField(term70778, term70778.getClass(), "headerFormat", "IpmgwHTgnG");
        setBooleanField(term70778, term70778.getClass(), "printTrailer", true);
        setField(term70778, term70778.getClass(), "trailerFormat", "tIpkeYIezR");
        setField(term70778, term70778.getClass(), "rowFormat", "YkZtEtthvz");
        setField(term70778, term70778.getClass(), "sectionHeaderFormat", "dwlZSxlXOo");
        setBooleanField(term70778, term70778.getClass(), "printSectionSummary", false);
        setField(term70778, term70778.getClass(), "sectionSummaryRowFormat", "lKrEAkypza");
        setBooleanField(term70778, term70778.getClass(), "printSectionTrailer", false);
        setField(term70778, term70778.getClass(), "sectionTrailerFormat", "KtuuNAqGCQ");
        setField(term70778, term70778.getClass(), "durationFormat", enum239);
        setBooleanField(term70778, term70778.getClass(), "printLegend", false);
        setField(term70778, term70778.getClass(), "simpleLine", "OGQsfjmReM");
        setField(term70778, term70778.getClass(), "alternativeLine", "YsUtbngnRO");
        setField(term70778, term70778.getClass(), "excludedTypes", term70906);
        setField(term70778, term70778.getClass(), "customCounterNames", term70918);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "NxgmYPzWCI";
        callMethod(klass, "withSectionSummary", argTypes, term70778, args);
    }

};


