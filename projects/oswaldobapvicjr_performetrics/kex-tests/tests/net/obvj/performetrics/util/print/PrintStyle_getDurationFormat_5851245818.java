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

public class PrintStyle_getDurationFormat_5851245818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24894;

    public PrintStyle_getDurationFormat_5851245818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25047 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term25046 = ((Class) term25047).getDeclaredField((String) "DETAILED");
        ((Field) term25046).setAccessible(true);
        Object enum80 = ((Field) term25046).get((Object) null);
        Class<? extends Object> term25363 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term25362 = ((Class) term25363).getDeclaredField((String) "SHORTER");
        ((Field) term25362).setAccessible(true);
        Object enum81 = ((Field) term25362).get((Object) null);
        Class<? extends Object> term25621 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term25620 = ((Class) term25621).getDeclaredField((String) "CPU_TIME");
        ((Field) term25620).setAccessible(true);
        Object enum82 =  ((Field) term25620).get((Object) null);
        Class<? extends Object> term25827 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term25826 = ((Class) term25827).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term25826).setAccessible(true);
        Object enum83 =  ((Field) term25826).get((Object) null);
        Class<? extends Object> term26042 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term26041 = ((Class) term26042).getDeclaredField((String) "USER_TIME");
        ((Field) term26041).setAccessible(true);
        Object enum84 =  ((Field) term26041).get((Object) null);
        ArrayList term25019 = new ArrayList();
        ((ArrayList) term25019).add(enum82);
        ((ArrayList) term25019).add(enum82);
        ((ArrayList) term25019).add(enum83);
        ((ArrayList) term25019).add(enum84);
        ((ArrayList) term25019).add(enum84);
        ((ArrayList) term25019).add(enum83);
        ((ArrayList) term25019).add(enum83);
        HashMap term25035 = new HashMap();
        term24894 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term24894, term24894.getClass(), "printFormat", enum80);
        setBooleanField(term24894, term24894.getClass(), "printHeader", false);
        setField(term24894, term24894.getClass(), "headerFormat", "pXOkjyeIRb");
        setBooleanField(term24894, term24894.getClass(), "printTrailer", false);
        setField(term24894, term24894.getClass(), "trailerFormat", "GgZWSjxjyE");
        setField(term24894, term24894.getClass(), "rowFormat", "EeBVbzjcCI");
        setField(term24894, term24894.getClass(), "sectionHeaderFormat", "UfQtPRyWRC");
        setBooleanField(term24894, term24894.getClass(), "printSectionSummary", true);
        setField(term24894, term24894.getClass(), "sectionSummaryRowFormat", "FPvxVzzSvD");
        setBooleanField(term24894, term24894.getClass(), "printSectionTrailer", true);
        setField(term24894, term24894.getClass(), "sectionTrailerFormat", "WHcwFgsGFC");
        setField(term24894, term24894.getClass(), "durationFormat", enum81);
        setBooleanField(term24894, term24894.getClass(), "printLegend", true);
        setField(term24894, term24894.getClass(), "simpleLine", "HzqpegHiRq");
        setField(term24894, term24894.getClass(), "alternativeLine", "jwsfVjMoJT");
        setField(term24894, term24894.getClass(), "excludedTypes", term25019);
        setField(term24894, term24894.getClass(), "customCounterNames", term25035);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDurationFormat", argTypes, term24894, args);
    }

};


