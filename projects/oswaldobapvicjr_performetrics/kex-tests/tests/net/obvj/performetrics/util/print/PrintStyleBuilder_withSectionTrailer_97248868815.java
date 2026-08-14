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

public class PrintStyleBuilder_withSectionTrailer_97248868815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64406;

    public PrintStyleBuilder_withSectionTrailer_97248868815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term64566 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term64565 = ((Class) term64566).getDeclaredField((String) "DETAILED");
        ((Field) term64565).setAccessible(true);
        Object enum216 = ((Field) term64565).get((Object) null);
        Class<? extends Object> term64882 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term64881 = ((Class) term64882).getDeclaredField((String) "FULL");
        ((Field) term64881).setAccessible(true);
        Object enum217 = ((Field) term64881).get((Object) null);
        Class<? extends Object> term65131 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term65130 = ((Class) term65131).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term65130).setAccessible(true);
        Object enum218 =  ((Field) term65130).get((Object) null);
        Class<? extends Object> term65358 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term65357 = ((Class) term65358).getDeclaredField((String) "CPU_TIME");
        ((Field) term65357).setAccessible(true);
        Object enum219 =  ((Field) term65357).get((Object) null);
        Class<? extends Object> term65564 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term65563 = ((Class) term65564).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term65563).setAccessible(true);
        Object enum220 =  ((Field) term65563).get((Object) null);
        ArrayList term64528 = new ArrayList();
        ((ArrayList) term64528).add(enum218);
        ((ArrayList) term64528).add(enum218);
        ((ArrayList) term64528).add(enum219);
        ((ArrayList) term64528).add(enum219);
        ((ArrayList) term64528).add(enum220);
        ((ArrayList) term64528).add(enum219);
        ((ArrayList) term64528).add(enum218);
        HashMap term64544 = new HashMap();
        term64406 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term64406, term64406.getClass(), "printFormat", enum216);
        setBooleanField(term64406, term64406.getClass(), "printHeader", false);
        setField(term64406, term64406.getClass(), "headerFormat", "GsWxOwXvSu");
        setBooleanField(term64406, term64406.getClass(), "printTrailer", false);
        setField(term64406, term64406.getClass(), "trailerFormat", "bKBSncrMEZ");
        setField(term64406, term64406.getClass(), "rowFormat", "yeSXGqQExb");
        setField(term64406, term64406.getClass(), "sectionHeaderFormat", "uXYcXVYJZM");
        setBooleanField(term64406, term64406.getClass(), "printSectionSummary", true);
        setField(term64406, term64406.getClass(), "sectionSummaryRowFormat", "BJhjdJUhkz");
        setBooleanField(term64406, term64406.getClass(), "printSectionTrailer", false);
        setField(term64406, term64406.getClass(), "sectionTrailerFormat", "cdHYQDgUZR");
        setField(term64406, term64406.getClass(), "durationFormat", enum217);
        setBooleanField(term64406, term64406.getClass(), "printLegend", false);
        setField(term64406, term64406.getClass(), "simpleLine", "KAORSSPSeV");
        setField(term64406, term64406.getClass(), "alternativeLine", "UimMMORkzd");
        setField(term64406, term64406.getClass(), "excludedTypes", term64528);
        setField(term64406, term64406.getClass(), "customCounterNames", term64544);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vhKzFyKPOT";
        callMethod(klass, "withSectionTrailer", argTypes, term64406, args);
    }

};


