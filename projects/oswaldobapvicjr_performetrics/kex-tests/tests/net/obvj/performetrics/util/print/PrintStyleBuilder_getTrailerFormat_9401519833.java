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

public class PrintStyleBuilder_getTrailerFormat_9401519833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100945;

    public PrintStyleBuilder_getTrailerFormat_9401519833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term101088 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term101087 = ((Class) term101088).getDeclaredField((String) "DETAILED");
        ((Field) term101087).setAccessible(true);
        Object enum343 = ((Field) term101087).get((Object) null);
        Class<? extends Object> term101404 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term101403 = ((Class) term101404).getDeclaredField((String) "SHORT");
        ((Field) term101403).setAccessible(true);
        Object enum344 = ((Field) term101403).get((Object) null);
        Class<? extends Object> term101656 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term101655 = ((Class) term101656).getDeclaredField((String) "CPU_TIME");
        ((Field) term101655).setAccessible(true);
        Object enum345 =  ((Field) term101655).get((Object) null);
        ArrayList term101068 = new ArrayList();
        ((ArrayList) term101068).add(enum345);
        ((ArrayList) term101068).add(enum345);
        ((ArrayList) term101068).add(enum345);
        HashMap term101076 = new HashMap();
        term100945 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term100945, term100945.getClass(), "printFormat", enum343);
        setBooleanField(term100945, term100945.getClass(), "printHeader", true);
        setField(term100945, term100945.getClass(), "headerFormat", "fcCAsvfBbe");
        setBooleanField(term100945, term100945.getClass(), "printTrailer", true);
        setField(term100945, term100945.getClass(), "trailerFormat", "mUNcKUxghj");
        setField(term100945, term100945.getClass(), "rowFormat", "lnvLKbtveE");
        setField(term100945, term100945.getClass(), "sectionHeaderFormat", "FfrrEhTHzQ");
        setBooleanField(term100945, term100945.getClass(), "printSectionSummary", false);
        setField(term100945, term100945.getClass(), "sectionSummaryRowFormat", "LXnDNrMsqT");
        setBooleanField(term100945, term100945.getClass(), "printSectionTrailer", true);
        setField(term100945, term100945.getClass(), "sectionTrailerFormat", "ZLQamJFBmu");
        setField(term100945, term100945.getClass(), "durationFormat", enum344);
        setBooleanField(term100945, term100945.getClass(), "printLegend", true);
        setField(term100945, term100945.getClass(), "simpleLine", "ZWcOCwKNvd");
        setField(term100945, term100945.getClass(), "alternativeLine", "GTmoNrziyc");
        setField(term100945, term100945.getClass(), "excludedTypes", term101068);
        setField(term100945, term100945.getClass(), "customCounterNames", term101076);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrailerFormat", argTypes, term100945, args);
    }

};


