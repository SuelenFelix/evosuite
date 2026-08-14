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

public class PrintStyleBuilder_getTrailerFormat_9401519836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92480;

    public PrintStyleBuilder_getTrailerFormat_9401519836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term92636 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term92635 = ((Class) term92636).getDeclaredField((String) "DETAILED");
        ((Field) term92635).setAccessible(true);
        Object enum316 = ((Field) term92635).get((Object) null);
        Class<? extends Object> term92952 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term92951 = ((Class) term92952).getDeclaredField((String) "ISO_8601");
        ((Field) term92951).setAccessible(true);
        Object enum317 = ((Field) term92951).get((Object) null);
        Class<? extends Object> term93213 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term93212 = ((Class) term93213).getDeclaredField((String) "CPU_TIME");
        ((Field) term93212).setAccessible(true);
        Object enum318 =  ((Field) term93212).get((Object) null);
        Class<? extends Object> term93419 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term93418 = ((Class) term93419).getDeclaredField((String) "USER_TIME");
        ((Field) term93418).setAccessible(true);
        Object enum319 =  ((Field) term93418).get((Object) null);
        Class<? extends Object> term93628 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term93627 = ((Class) term93628).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term93627).setAccessible(true);
        Object enum320 =  ((Field) term93627).get((Object) null);
        Class<? extends Object> term93843 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term93842 = ((Class) term93843).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term93842).setAccessible(true);
        Object enum321 =  ((Field) term93842).get((Object) null);
        ArrayList term92606 = new ArrayList();
        ((ArrayList) term92606).add(enum318);
        ((ArrayList) term92606).add(enum318);
        ((ArrayList) term92606).add(enum319);
        ((ArrayList) term92606).add(enum319);
        ((ArrayList) term92606).add(enum320);
        ((ArrayList) term92606).add(enum321);
        ((ArrayList) term92606).add(enum320);
        ((ArrayList) term92606).add(enum319);
        ((ArrayList) term92606).add(enum320);
        HashMap term92626 = new HashMap();
        term92480 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term92480, term92480.getClass(), "printFormat", enum316);
        setBooleanField(term92480, term92480.getClass(), "printHeader", true);
        setField(term92480, term92480.getClass(), "headerFormat", "ecHEQufXoq");
        setBooleanField(term92480, term92480.getClass(), "printTrailer", false);
        setField(term92480, term92480.getClass(), "trailerFormat", "btBLMvHzJg");
        setField(term92480, term92480.getClass(), "rowFormat", "JdOMfNWgLP");
        setField(term92480, term92480.getClass(), "sectionHeaderFormat", "uWqXrwAsDU");
        setBooleanField(term92480, term92480.getClass(), "printSectionSummary", true);
        setField(term92480, term92480.getClass(), "sectionSummaryRowFormat", "hgFbWAUtsu");
        setBooleanField(term92480, term92480.getClass(), "printSectionTrailer", true);
        setField(term92480, term92480.getClass(), "sectionTrailerFormat", "HqoTWlkbwF");
        setField(term92480, term92480.getClass(), "durationFormat", enum317);
        setBooleanField(term92480, term92480.getClass(), "printLegend", true);
        setField(term92480, term92480.getClass(), "simpleLine", "CwNELDTAPP");
        setField(term92480, term92480.getClass(), "alternativeLine", "GSzQdbHLHw");
        setField(term92480, term92480.getClass(), "excludedTypes", term92606);
        setField(term92480, term92480.getClass(), "customCounterNames", term92626);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrailerFormat", argTypes, term92480, args);
    }

};


