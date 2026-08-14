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

public class PrintStyle_getSectionTrailerFormat_167439645416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89652;

    public PrintStyle_getSectionTrailerFormat_167439645416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term89790 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term89789 = ((Class) term89790).getDeclaredField((String) "DETAILED");
        ((Field) term89789).setAccessible(true);
        Object enum303 = ((Field) term89789).get((Object) null);
        Class<? extends Object> term90106 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term90105 = ((Class) term90106).getDeclaredField((String) "FULL");
        ((Field) term90105).setAccessible(true);
        Object enum304 = ((Field) term90105).get((Object) null);
        ArrayList term89774 = new ArrayList();
        HashMap term89778 = new HashMap();
        term89652 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term89652, term89652.getClass(), "printFormat", enum303);
        setBooleanField(term89652, term89652.getClass(), "printHeader", false);
        setField(term89652, term89652.getClass(), "headerFormat", "PJcSNDruWd");
        setBooleanField(term89652, term89652.getClass(), "printTrailer", true);
        setField(term89652, term89652.getClass(), "trailerFormat", "VVNNlAePXF");
        setField(term89652, term89652.getClass(), "rowFormat", "jnwVnmKAFv");
        setField(term89652, term89652.getClass(), "sectionHeaderFormat", "TXyHhqeCjR");
        setBooleanField(term89652, term89652.getClass(), "printSectionSummary", false);
        setField(term89652, term89652.getClass(), "sectionSummaryRowFormat", "lZIgPZPgTu");
        setBooleanField(term89652, term89652.getClass(), "printSectionTrailer", true);
        setField(term89652, term89652.getClass(), "sectionTrailerFormat", "iuCxnHGMoW");
        setField(term89652, term89652.getClass(), "durationFormat", enum304);
        setBooleanField(term89652, term89652.getClass(), "printLegend", false);
        setField(term89652, term89652.getClass(), "simpleLine", "GPSEWEDSTo");
        setField(term89652, term89652.getClass(), "alternativeLine", "RCOqfVsRHt");
        setField(term89652, term89652.getClass(), "excludedTypes", term89774);
        setField(term89652, term89652.getClass(), "customCounterNames", term89778);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSectionTrailerFormat", argTypes, term89652, args);
    }

};


