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

public class PrintStyle_getSectionHeaderFormat_2671835014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86707;

    public PrintStyle_getSectionHeaderFormat_2671835014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term86858 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term86857 = ((Class) term86858).getDeclaredField((String) "DETAILED");
        ((Field) term86857).setAccessible(true);
        Object enum292 = ((Field) term86857).get((Object) null);
        Class<? extends Object> term87174 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term87173 = ((Class) term87174).getDeclaredField((String) "SHORTER");
        ((Field) term87173).setAccessible(true);
        Object enum293 = ((Field) term87173).get((Object) null);
        Class<? extends Object> term87432 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term87431 = ((Class) term87432).getDeclaredField((String) "CPU_TIME");
        ((Field) term87431).setAccessible(true);
        Object enum294 =  ((Field) term87431).get((Object) null);
        Class<? extends Object> term87638 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term87637 = ((Class) term87638).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term87637).setAccessible(true);
        Object enum295 =  ((Field) term87637).get((Object) null);
        Class<? extends Object> term87853 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term87852 = ((Class) term87853).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term87852).setAccessible(true);
        Object enum296 =  ((Field) term87852).get((Object) null);
        ArrayList term86832 = new ArrayList();
        ((ArrayList) term86832).add(enum294);
        ((ArrayList) term86832).add(enum295);
        ((ArrayList) term86832).add(enum296);
        ((ArrayList) term86832).add(enum294);
        ((ArrayList) term86832).add(enum294);
        ((ArrayList) term86832).add(enum295);
        HashMap term86848 = new HashMap();
        term86707 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term86707, term86707.getClass(), "printFormat", enum292);
        setBooleanField(term86707, term86707.getClass(), "printHeader", true);
        setField(term86707, term86707.getClass(), "headerFormat", "OeQLvhVERT");
        setBooleanField(term86707, term86707.getClass(), "printTrailer", false);
        setField(term86707, term86707.getClass(), "trailerFormat", "IlvgFINwIa");
        setField(term86707, term86707.getClass(), "rowFormat", "GEJABPlHSI");
        setField(term86707, term86707.getClass(), "sectionHeaderFormat", "aQFUvuaYxd");
        setBooleanField(term86707, term86707.getClass(), "printSectionSummary", false);
        setField(term86707, term86707.getClass(), "sectionSummaryRowFormat", "zNFLXMifnS");
        setBooleanField(term86707, term86707.getClass(), "printSectionTrailer", true);
        setField(term86707, term86707.getClass(), "sectionTrailerFormat", "HHQcYMSBVc");
        setField(term86707, term86707.getClass(), "durationFormat", enum293);
        setBooleanField(term86707, term86707.getClass(), "printLegend", false);
        setField(term86707, term86707.getClass(), "simpleLine", "wdoqITnaAP");
        setField(term86707, term86707.getClass(), "alternativeLine", "rIPMBcrNqB");
        setField(term86707, term86707.getClass(), "excludedTypes", term86832);
        setField(term86707, term86707.getClass(), "customCounterNames", term86848);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSectionHeaderFormat", argTypes, term86707, args);
    }

};


