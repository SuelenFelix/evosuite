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

public class PrintStyleBuilder_isPrintTrailer_179232157529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94732;

    public PrintStyleBuilder_isPrintTrailer_179232157529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term95037 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term95036 = ((Class) term95037).getDeclaredField((String) "DETAILED");
        ((Field) term95036).setAccessible(true);
        Object enum321 = ((Field) term95036).get((Object) null);
        Class<? extends Object> term95353 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term95352 = ((Class) term95353).getDeclaredField((String) "LINUX");
        ((Field) term95352).setAccessible(true);
        Object enum322 = ((Field) term95352).get((Object) null);
        Class<? extends Object> term95605 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term95604 = ((Class) term95605).getDeclaredField((String) "USER_TIME");
        ((Field) term95604).setAccessible(true);
        Object enum323 =  ((Field) term95604).get((Object) null);
        Class<? extends Object> term95814 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term95813 = ((Class) term95814).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term95813).setAccessible(true);
        Object enum324 =  ((Field) term95813).get((Object) null);
        Class<? extends Object> term96041 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term96040 = ((Class) term96041).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term96040).setAccessible(true);
        Object enum325 =  ((Field) term96040).get((Object) null);
        ArrayList term95009 = new ArrayList();
        ((ArrayList) term95009).add(enum323);
        ((ArrayList) term95009).add(enum323);
        ((ArrayList) term95009).add(enum324);
        ((ArrayList) term95009).add(enum325);
        HashMap term95025 = new HashMap();
        term94732 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term94732, term94732.getClass(), "printFormat", enum321);
        setBooleanField(term94732, term94732.getClass(), "printHeader", false);
        setField(term94732, term94732.getClass(), "headerFormat", "btBLMvHzJg");
        setBooleanField(term94732, term94732.getClass(), "printTrailer", true);
        setField(term94732, term94732.getClass(), "trailerFormat", "JdOMfNWgLP");
        setField(term94732, term94732.getClass(), "rowFormat", "uWqXrwAsDU");
        setField(term94732, term94732.getClass(), "sectionHeaderFormat", "hgFbWAUtsu");
        setBooleanField(term94732, term94732.getClass(), "printSectionSummary", false);
        setField(term94732, term94732.getClass(), "sectionSummaryRowFormat", "HqoTWlkbwF");
        setBooleanField(term94732, term94732.getClass(), "printSectionTrailer", false);
        setField(term94732, term94732.getClass(), "sectionTrailerFormat", "CwNELDTAPP");
        setField(term94732, term94732.getClass(), "durationFormat", enum322);
        setBooleanField(term94732, term94732.getClass(), "printLegend", false);
        setField(term94732, term94732.getClass(), "simpleLine", "GSzQdbHLHw");
        setField(term94732, term94732.getClass(), "alternativeLine", "IkfarsYNJO");
        setField(term94732, term94732.getClass(), "excludedTypes", term95009);
        setField(term94732, term94732.getClass(), "customCounterNames", term95025);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPrintTrailer", argTypes, term94732, args);
    }

};


