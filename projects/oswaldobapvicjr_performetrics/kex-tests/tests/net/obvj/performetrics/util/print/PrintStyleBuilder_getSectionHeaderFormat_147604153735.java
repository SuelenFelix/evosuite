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

public class PrintStyleBuilder_getSectionHeaderFormat_147604153735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102940;

    public PrintStyleBuilder_getSectionHeaderFormat_147604153735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term103090 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term103089 = ((Class) term103090).getDeclaredField((String) "SUMMARIZED");
        ((Field) term103089).setAccessible(true);
        Object enum349 = ((Field) term103089).get((Object) null);
        Class<? extends Object> term103412 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term103411 = ((Class) term103412).getDeclaredField((String) "FULL");
        ((Field) term103411).setAccessible(true);
        Object enum350 = ((Field) term103411).get((Object) null);
        Class<? extends Object> term103661 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term103660 = ((Class) term103661).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term103660).setAccessible(true);
        Object enum351 =  ((Field) term103660).get((Object) null);
        Class<? extends Object> term103888 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term103887 = ((Class) term103888).getDeclaredField((String) "USER_TIME");
        ((Field) term103887).setAccessible(true);
        Object enum352 =  ((Field) term103887).get((Object) null);
        Class<? extends Object> term104097 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term104096 = ((Class) term104097).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term104096).setAccessible(true);
        Object enum353 =  ((Field) term104096).get((Object) null);
        ArrayList term103064 = new ArrayList();
        ((ArrayList) term103064).add(enum351);
        ((ArrayList) term103064).add(enum352);
        ((ArrayList) term103064).add(enum353);
        HashMap term103080 = new HashMap();
        term102940 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term102940, term102940.getClass(), "printFormat", enum349);
        setBooleanField(term102940, term102940.getClass(), "printHeader", true);
        setField(term102940, term102940.getClass(), "headerFormat", "AhOHzCsHKW");
        setBooleanField(term102940, term102940.getClass(), "printTrailer", false);
        setField(term102940, term102940.getClass(), "trailerFormat", "UqgLPaaAHi");
        setField(term102940, term102940.getClass(), "rowFormat", "xypryEkUPF");
        setField(term102940, term102940.getClass(), "sectionHeaderFormat", "zyZTzHNjQr");
        setBooleanField(term102940, term102940.getClass(), "printSectionSummary", true);
        setField(term102940, term102940.getClass(), "sectionSummaryRowFormat", "YSrFKQQwXE");
        setBooleanField(term102940, term102940.getClass(), "printSectionTrailer", false);
        setField(term102940, term102940.getClass(), "sectionTrailerFormat", "qxhOsmyyjm");
        setField(term102940, term102940.getClass(), "durationFormat", enum350);
        setBooleanField(term102940, term102940.getClass(), "printLegend", false);
        setField(term102940, term102940.getClass(), "simpleLine", "DuKcNfVVYR");
        setField(term102940, term102940.getClass(), "alternativeLine", "fRujHWvXjJ");
        setField(term102940, term102940.getClass(), "excludedTypes", term103064);
        setField(term102940, term102940.getClass(), "customCounterNames", term103080);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSectionHeaderFormat", argTypes, term102940, args);
    }

};


