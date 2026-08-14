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

public class PrintStyleBuilder_withAlternativeLine_153547444119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69264;

    public PrintStyleBuilder_withAlternativeLine_153547444119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term69423 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term69422 = ((Class) term69423).getDeclaredField((String) "SUMMARIZED");
        ((Field) term69422).setAccessible(true);
        Object enum233 = ((Field) term69422).get((Object) null);
        Class<? extends Object> term69745 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term69744 = ((Class) term69745).getDeclaredField((String) "SHORTER");
        ((Field) term69744).setAccessible(true);
        Object enum234 = ((Field) term69744).get((Object) null);
        Class<? extends Object> term70003 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term70002 = ((Class) term70003).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term70002).setAccessible(true);
        Object enum235 =  ((Field) term70002).get((Object) null);
        ArrayList term69391 = new ArrayList();
        ((ArrayList) term69391).add(enum235);
        HashMap term69399 = new HashMap();
        term69264 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term69264, term69264.getClass(), "printFormat", enum233);
        setBooleanField(term69264, term69264.getClass(), "printHeader", false);
        setField(term69264, term69264.getClass(), "headerFormat", "PSizQDoxxe");
        setBooleanField(term69264, term69264.getClass(), "printTrailer", true);
        setField(term69264, term69264.getClass(), "trailerFormat", "mKaHyMybrK");
        setField(term69264, term69264.getClass(), "rowFormat", "AyrEXuGrEj");
        setField(term69264, term69264.getClass(), "sectionHeaderFormat", "yevIIoVYHq");
        setBooleanField(term69264, term69264.getClass(), "printSectionSummary", false);
        setField(term69264, term69264.getClass(), "sectionSummaryRowFormat", "UuYWMTqWTV");
        setBooleanField(term69264, term69264.getClass(), "printSectionTrailer", false);
        setField(term69264, term69264.getClass(), "sectionTrailerFormat", "DSFGlcaXUb");
        setField(term69264, term69264.getClass(), "durationFormat", enum234);
        setBooleanField(term69264, term69264.getClass(), "printLegend", false);
        setField(term69264, term69264.getClass(), "simpleLine", "sHMXNUzNeM");
        setField(term69264, term69264.getClass(), "alternativeLine", "gPzGDOEPPw");
        setField(term69264, term69264.getClass(), "excludedTypes", term69391);
        setField(term69264, term69264.getClass(), "customCounterNames", term69399);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VUkRVwROTl";
        callMethod(klass, "withAlternativeLine", argTypes, term69264, args);
    }

};


