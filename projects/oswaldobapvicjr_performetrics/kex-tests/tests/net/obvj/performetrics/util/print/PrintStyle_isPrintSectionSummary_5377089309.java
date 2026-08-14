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

public class PrintStyle_isPrintSectionSummary_5377089309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42070;

    public PrintStyle_isPrintSectionSummary_5377089309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term42213 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term42212 = ((Class) term42213).getDeclaredField((String) "DETAILED");
        ((Field) term42212).setAccessible(true);
        Object enum141 = ((Field) term42212).get((Object) null);
        Class<? extends Object> term42529 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term42528 = ((Class) term42529).getDeclaredField((String) "SHORT");
        ((Field) term42528).setAccessible(true);
        Object enum142 = ((Field) term42528).get((Object) null);
        Class<? extends Object> term42781 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term42780 = ((Class) term42781).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term42780).setAccessible(true);
        Object enum143 =  ((Field) term42780).get((Object) null);
        ArrayList term42193 = new ArrayList();
        ((ArrayList) term42193).add(enum143);
        HashMap term42201 = new HashMap();
        term42070 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term42070, term42070.getClass(), "printFormat", enum141);
        setBooleanField(term42070, term42070.getClass(), "printHeader", false);
        setField(term42070, term42070.getClass(), "headerFormat", "zcorEihhLK");
        setBooleanField(term42070, term42070.getClass(), "printTrailer", true);
        setField(term42070, term42070.getClass(), "trailerFormat", "GrqozDKFOk");
        setField(term42070, term42070.getClass(), "rowFormat", "CFyoseFGLF");
        setField(term42070, term42070.getClass(), "sectionHeaderFormat", "SFqCrhEWLm");
        setBooleanField(term42070, term42070.getClass(), "printSectionSummary", true);
        setField(term42070, term42070.getClass(), "sectionSummaryRowFormat", "GZdcJyZntS");
        setBooleanField(term42070, term42070.getClass(), "printSectionTrailer", false);
        setField(term42070, term42070.getClass(), "sectionTrailerFormat", "OIHoJeysUi");
        setField(term42070, term42070.getClass(), "durationFormat", enum142);
        setBooleanField(term42070, term42070.getClass(), "printLegend", false);
        setField(term42070, term42070.getClass(), "simpleLine", "WXMWFDGcLB");
        setField(term42070, term42070.getClass(), "alternativeLine", "wKWbJssZuG");
        setField(term42070, term42070.getClass(), "excludedTypes", term42193);
        setField(term42070, term42070.getClass(), "customCounterNames", term42201);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPrintSectionSummary", argTypes, term42070, args);
    }

};


