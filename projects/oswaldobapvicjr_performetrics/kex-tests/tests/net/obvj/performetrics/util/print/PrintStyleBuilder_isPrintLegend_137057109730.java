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

public class PrintStyleBuilder_isPrintLegend_137057109730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83870;

    public PrintStyleBuilder_isPrintLegend_137057109730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term84018 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term84017 = ((Class) term84018).getDeclaredField((String) "SUMMARIZED");
        ((Field) term84017).setAccessible(true);
        Object enum284 = ((Field) term84017).get((Object) null);
        Class<? extends Object> term84340 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term84339 = ((Class) term84340).getDeclaredField((String) "FULL");
        ((Field) term84339).setAccessible(true);
        Object enum285 = ((Field) term84339).get((Object) null);
        Class<? extends Object> term84589 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term84588 = ((Class) term84589).getDeclaredField((String) "CPU_TIME");
        ((Field) term84588).setAccessible(true);
        Object enum286 =  ((Field) term84588).get((Object) null);
        Class<? extends Object> term84795 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term84794 = ((Class) term84795).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term84794).setAccessible(true);
        Object enum287 =  ((Field) term84794).get((Object) null);
        ArrayList term83994 = new ArrayList();
        ((ArrayList) term83994).add(enum286);
        ((ArrayList) term83994).add(enum287);
        HashMap term84006 = new HashMap();
        term83870 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term83870, term83870.getClass(), "printFormat", enum284);
        setBooleanField(term83870, term83870.getClass(), "printHeader", true);
        setField(term83870, term83870.getClass(), "headerFormat", "jcWKHRWhyj");
        setBooleanField(term83870, term83870.getClass(), "printTrailer", false);
        setField(term83870, term83870.getClass(), "trailerFormat", "nrQjODRMLD");
        setField(term83870, term83870.getClass(), "rowFormat", "PNoWXrsFic");
        setField(term83870, term83870.getClass(), "sectionHeaderFormat", "QZBHZqZope");
        setBooleanField(term83870, term83870.getClass(), "printSectionSummary", true);
        setField(term83870, term83870.getClass(), "sectionSummaryRowFormat", "VBUahCvyxC");
        setBooleanField(term83870, term83870.getClass(), "printSectionTrailer", false);
        setField(term83870, term83870.getClass(), "sectionTrailerFormat", "MlzTkzKMCX");
        setField(term83870, term83870.getClass(), "durationFormat", enum285);
        setBooleanField(term83870, term83870.getClass(), "printLegend", false);
        setField(term83870, term83870.getClass(), "simpleLine", "UqKUbMyPMJ");
        setField(term83870, term83870.getClass(), "alternativeLine", "QpYltHAdyY");
        setField(term83870, term83870.getClass(), "excludedTypes", term83994);
        setField(term83870, term83870.getClass(), "customCounterNames", term84006);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPrintLegend", argTypes, term83870, args);
    }

};


