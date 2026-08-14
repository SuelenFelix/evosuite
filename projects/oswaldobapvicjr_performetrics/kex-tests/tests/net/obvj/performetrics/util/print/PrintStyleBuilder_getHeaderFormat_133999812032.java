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

public class PrintStyleBuilder_getHeaderFormat_133999812032 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99587;

    public PrintStyleBuilder_getHeaderFormat_133999812032() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term99736 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term99735 = ((Class) term99736).getDeclaredField((String) "DETAILED");
        ((Field) term99735).setAccessible(true);
        Object enum338 = ((Field) term99735).get((Object) null);
        Class<? extends Object> term100052 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term100051 = ((Class) term100052).getDeclaredField((String) "SHORT");
        ((Field) term100051).setAccessible(true);
        Object enum339 = ((Field) term100051).get((Object) null);
        Class<? extends Object> term100304 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term100303 = ((Class) term100304).getDeclaredField((String) "USER_TIME");
        ((Field) term100303).setAccessible(true);
        Object enum340 =  ((Field) term100303).get((Object) null);
        Class<? extends Object> term100513 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term100512 = ((Class) term100513).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term100512).setAccessible(true);
        Object enum341 =  ((Field) term100512).get((Object) null);
        Class<? extends Object> term100740 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term100739 = ((Class) term100740).getDeclaredField((String) "CPU_TIME");
        ((Field) term100739).setAccessible(true);
        Object enum342 =  ((Field) term100739).get((Object) null);
        ArrayList term99710 = new ArrayList();
        ((ArrayList) term99710).add(enum340);
        ((ArrayList) term99710).add(enum341);
        ((ArrayList) term99710).add(enum340);
        ((ArrayList) term99710).add(enum342);
        ((ArrayList) term99710).add(enum340);
        HashMap term99726 = new HashMap();
        term99587 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term99587, term99587.getClass(), "printFormat", enum338);
        setBooleanField(term99587, term99587.getClass(), "printHeader", true);
        setField(term99587, term99587.getClass(), "headerFormat", "mNgDshwZNc");
        setBooleanField(term99587, term99587.getClass(), "printTrailer", false);
        setField(term99587, term99587.getClass(), "trailerFormat", "pDqgDbJoFw");
        setField(term99587, term99587.getClass(), "rowFormat", "iVOvTzOxwt");
        setField(term99587, term99587.getClass(), "sectionHeaderFormat", "BjZQdecXvB");
        setBooleanField(term99587, term99587.getClass(), "printSectionSummary", false);
        setField(term99587, term99587.getClass(), "sectionSummaryRowFormat", "iUkOOQhEkw");
        setBooleanField(term99587, term99587.getClass(), "printSectionTrailer", false);
        setField(term99587, term99587.getClass(), "sectionTrailerFormat", "wmVoFoUVmU");
        setField(term99587, term99587.getClass(), "durationFormat", enum339);
        setBooleanField(term99587, term99587.getClass(), "printLegend", false);
        setField(term99587, term99587.getClass(), "simpleLine", "lLiSiPCciB");
        setField(term99587, term99587.getClass(), "alternativeLine", "PsMKIIEwdR");
        setField(term99587, term99587.getClass(), "excludedTypes", term99710);
        setField(term99587, term99587.getClass(), "customCounterNames", term99726);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHeaderFormat", argTypes, term99587, args);
    }

};


