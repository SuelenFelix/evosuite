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

public class PrintStyleBuilder_isPrintSectionTrailer_35423861834 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89537;

    public PrintStyleBuilder_isPrintSectionTrailer_35423861834() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term89691 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term89690 = ((Class) term89691).getDeclaredField((String) "SUMMARIZED");
        ((Field) term89690).setAccessible(true);
        Object enum305 = ((Field) term89690).get((Object) null);
        Class<? extends Object> term90013 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term90012 = ((Class) term90013).getDeclaredField((String) "ISO_8601");
        ((Field) term90012).setAccessible(true);
        Object enum306 = ((Field) term90012).get((Object) null);
        Class<? extends Object> term90274 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term90273 = ((Class) term90274).getDeclaredField((String) "USER_TIME");
        ((Field) term90273).setAccessible(true);
        Object enum307 =  ((Field) term90273).get((Object) null);
        Class<? extends Object> term90483 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term90482 = ((Class) term90483).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term90482).setAccessible(true);
        Object enum308 =  ((Field) term90482).get((Object) null);
        Class<? extends Object> term90698 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term90697 = ((Class) term90698).getDeclaredField((String) "CPU_TIME");
        ((Field) term90697).setAccessible(true);
        Object enum309 =  ((Field) term90697).get((Object) null);
        ArrayList term89665 = new ArrayList();
        ((ArrayList) term89665).add(enum307);
        ((ArrayList) term89665).add(enum308);
        ((ArrayList) term89665).add(enum307);
        ((ArrayList) term89665).add(enum309);
        HashMap term89681 = new HashMap();
        term89537 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term89537, term89537.getClass(), "printFormat", enum305);
        setBooleanField(term89537, term89537.getClass(), "printHeader", true);
        setField(term89537, term89537.getClass(), "headerFormat", "EEYmuwyVDP");
        setBooleanField(term89537, term89537.getClass(), "printTrailer", false);
        setField(term89537, term89537.getClass(), "trailerFormat", "EWFbEDAVrE");
        setField(term89537, term89537.getClass(), "rowFormat", "EMiMtYgfvr");
        setField(term89537, term89537.getClass(), "sectionHeaderFormat", "OyYyYYnJuF");
        setBooleanField(term89537, term89537.getClass(), "printSectionSummary", true);
        setField(term89537, term89537.getClass(), "sectionSummaryRowFormat", "aYLvcxZohT");
        setBooleanField(term89537, term89537.getClass(), "printSectionTrailer", true);
        setField(term89537, term89537.getClass(), "sectionTrailerFormat", "mnHyQbMyld");
        setField(term89537, term89537.getClass(), "durationFormat", enum306);
        setBooleanField(term89537, term89537.getClass(), "printLegend", false);
        setField(term89537, term89537.getClass(), "simpleLine", "KHtaDOIcJZ");
        setField(term89537, term89537.getClass(), "alternativeLine", "vgdwrCZczl");
        setField(term89537, term89537.getClass(), "excludedTypes", term89665);
        setField(term89537, term89537.getClass(), "customCounterNames", term89681);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPrintSectionTrailer", argTypes, term89537, args);
    }

};


