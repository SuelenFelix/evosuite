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

public class PrintStyleBuilder_isPrintLegend_137057109727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92438;

    public PrintStyleBuilder_isPrintLegend_137057109727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term92587 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term92586 = ((Class) term92587).getDeclaredField((String) "SUMMARIZED");
        ((Field) term92586).setAccessible(true);
        Object enum313 = ((Field) term92586).get((Object) null);
        Class<? extends Object> term92909 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term92908 = ((Class) term92909).getDeclaredField((String) "SHORT");
        ((Field) term92908).setAccessible(true);
        Object enum314 = ((Field) term92908).get((Object) null);
        Class<? extends Object> term93161 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term93160 = ((Class) term93161).getDeclaredField((String) "CPU_TIME");
        ((Field) term93160).setAccessible(true);
        Object enum315 =  ((Field) term93160).get((Object) null);
        Class<? extends Object> term93367 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term93366 = ((Class) term93367).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term93366).setAccessible(true);
        Object enum316 =  ((Field) term93366).get((Object) null);
        ArrayList term92563 = new ArrayList();
        ((ArrayList) term92563).add(enum315);
        ((ArrayList) term92563).add(enum316);
        HashMap term92575 = new HashMap();
        term92438 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term92438, term92438.getClass(), "printFormat", enum313);
        setBooleanField(term92438, term92438.getClass(), "printHeader", true);
        setField(term92438, term92438.getClass(), "headerFormat", "EWFbEDAVrE");
        setBooleanField(term92438, term92438.getClass(), "printTrailer", true);
        setField(term92438, term92438.getClass(), "trailerFormat", "EMiMtYgfvr");
        setField(term92438, term92438.getClass(), "rowFormat", "OyYyYYnJuF");
        setField(term92438, term92438.getClass(), "sectionHeaderFormat", "aYLvcxZohT");
        setBooleanField(term92438, term92438.getClass(), "printSectionSummary", false);
        setField(term92438, term92438.getClass(), "sectionSummaryRowFormat", "mnHyQbMyld");
        setBooleanField(term92438, term92438.getClass(), "printSectionTrailer", true);
        setField(term92438, term92438.getClass(), "sectionTrailerFormat", "KHtaDOIcJZ");
        setField(term92438, term92438.getClass(), "durationFormat", enum314);
        setBooleanField(term92438, term92438.getClass(), "printLegend", true);
        setField(term92438, term92438.getClass(), "simpleLine", "vgdwrCZczl");
        setField(term92438, term92438.getClass(), "alternativeLine", "gKMNrpKBpu");
        setField(term92438, term92438.getClass(), "excludedTypes", term92563);
        setField(term92438, term92438.getClass(), "customCounterNames", term92575);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPrintLegend", argTypes, term92438, args);
    }

};


