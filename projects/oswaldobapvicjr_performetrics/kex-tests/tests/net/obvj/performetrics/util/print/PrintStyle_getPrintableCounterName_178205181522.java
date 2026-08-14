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

public class PrintStyle_getPrintableCounterName_178205181522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96595;
     Object enum329;

    public PrintStyle_getPrintableCounterName_178205181522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term96741 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term96740 = ((Class) term96741).getDeclaredField((String) "DETAILED");
        ((Field) term96740).setAccessible(true);
        Object enum326 = ((Field) term96740).get((Object) null);
        Class<? extends Object> term97057 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term97056 = ((Class) term97057).getDeclaredField((String) "ISO_8601");
        ((Field) term97056).setAccessible(true);
        Object enum327 = ((Field) term97056).get((Object) null);
        Class<? extends Object> term97318 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term97317 = ((Class) term97318).getDeclaredField((String) "CPU_TIME");
        ((Field) term97317).setAccessible(true);
        Object enum328 =  ((Field) term97317).get((Object) null);
        ArrayList term96721 = new ArrayList();
        ((ArrayList) term96721).add(enum328);
        HashMap term96729 = new HashMap();
        term96595 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term96595, term96595.getClass(), "printFormat", enum326);
        setBooleanField(term96595, term96595.getClass(), "printHeader", false);
        setField(term96595, term96595.getClass(), "headerFormat", "KarbTXFmUU");
        setBooleanField(term96595, term96595.getClass(), "printTrailer", true);
        setField(term96595, term96595.getClass(), "trailerFormat", "jiUSjqwSIQ");
        setField(term96595, term96595.getClass(), "rowFormat", "MgLCedQfoj");
        setField(term96595, term96595.getClass(), "sectionHeaderFormat", "zgKiINdgNu");
        setBooleanField(term96595, term96595.getClass(), "printSectionSummary", true);
        setField(term96595, term96595.getClass(), "sectionSummaryRowFormat", "zLMTXDQHYH");
        setBooleanField(term96595, term96595.getClass(), "printSectionTrailer", false);
        setField(term96595, term96595.getClass(), "sectionTrailerFormat", "PqywFWJlpE");
        setField(term96595, term96595.getClass(), "durationFormat", enum327);
        setBooleanField(term96595, term96595.getClass(), "printLegend", false);
        setField(term96595, term96595.getClass(), "simpleLine", "OzXRsFGTIp");
        setField(term96595, term96595.getClass(), "alternativeLine", "TjWpyghUWN");
        setField(term96595, term96595.getClass(), "excludedTypes", term96721);
        setField(term96595, term96595.getClass(), "customCounterNames", term96729);
        Class<? extends Object> term97524 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term97523 = ((Class) term97524).getDeclaredField((String) "USER_TIME");
        ((Field) term97523).setAccessible(true);
        enum329 = ((Field) term97523).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.obvj.performetrics.Counter$Type");
        Object[] args = new Object[1];
        args[0] = enum329;
        callMethod(klass, "getPrintableCounterName", argTypes, term96595, args);
    }

};


