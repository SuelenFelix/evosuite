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

public class PrintStyle_init_10809136122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32330;

    public PrintStyle_init_10809136122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term32481 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term32480 = ((Class) term32481).getDeclaredField((String) "DETAILED");
        ((Field) term32480).setAccessible(true);
        Object enum108 = ((Field) term32480).get((Object) null);
        Class<? extends Object> term32797 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term32796 = ((Class) term32797).getDeclaredField((String) "SHORTER");
        ((Field) term32796).setAccessible(true);
        Object enum109 = ((Field) term32796).get((Object) null);
        Class<? extends Object> term33055 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term33054 = ((Class) term33055).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term33054).setAccessible(true);
        Object enum110 =  ((Field) term33054).get((Object) null);
        Class<? extends Object> term33282 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term33281 = ((Class) term33282).getDeclaredField((String) "CPU_TIME");
        ((Field) term33281).setAccessible(true);
        Object enum111 =  ((Field) term33281).get((Object) null);
        Class<? extends Object> term33488 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term33487 = ((Class) term33488).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term33487).setAccessible(true);
        Object enum112 =  ((Field) term33487).get((Object) null);
        ArrayList term32455 = new ArrayList();
        ((ArrayList) term32455).add(enum110);
        ((ArrayList) term32455).add(enum111);
        ((ArrayList) term32455).add(enum112);
        ((ArrayList) term32455).add(enum110);
        ((ArrayList) term32455).add(enum111);
        HashMap term32471 = new HashMap();
        term32330 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term32330, term32330.getClass(), "printFormat", enum108);
        setBooleanField(term32330, term32330.getClass(), "printHeader", true);
        setField(term32330, term32330.getClass(), "headerFormat", "VYkqXKVlAJ");
        setBooleanField(term32330, term32330.getClass(), "printTrailer", false);
        setField(term32330, term32330.getClass(), "trailerFormat", "XkIoWJRNwN");
        setField(term32330, term32330.getClass(), "rowFormat", "aNWLJdrZMq");
        setField(term32330, term32330.getClass(), "sectionHeaderFormat", "HHmNoYxIGj");
        setBooleanField(term32330, term32330.getClass(), "printSectionSummary", false);
        setField(term32330, term32330.getClass(), "sectionSummaryRowFormat", "PtirvZmsGt");
        setBooleanField(term32330, term32330.getClass(), "printSectionTrailer", true);
        setField(term32330, term32330.getClass(), "sectionTrailerFormat", "HWkpTmtlrc");
        setField(term32330, term32330.getClass(), "durationFormat", enum109);
        setBooleanField(term32330, term32330.getClass(), "printLegend", true);
        setField(term32330, term32330.getClass(), "simpleLine", "hMmaoREuCK");
        setField(term32330, term32330.getClass(), "alternativeLine", "VeDtgDzGAN");
        setField(term32330, term32330.getClass(), "excludedTypes", term32455);
        setField(term32330, term32330.getClass(), "customCounterNames", term32471);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Object[] args = new Object[1];
        args[0] = term32330;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


