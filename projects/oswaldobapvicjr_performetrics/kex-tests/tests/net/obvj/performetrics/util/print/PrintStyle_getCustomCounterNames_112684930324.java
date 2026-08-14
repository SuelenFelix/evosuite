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

public class PrintStyle_getCustomCounterNames_112684930324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47449;

    public PrintStyle_getCustomCounterNames_112684930324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term47598 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term47597 = ((Class) term47598).getDeclaredField((String) "DETAILED");
        ((Field) term47597).setAccessible(true);
        Object enum159 = ((Field) term47597).get((Object) null);
        Class<? extends Object> term47914 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term47913 = ((Class) term47914).getDeclaredField((String) "SHORT");
        ((Field) term47913).setAccessible(true);
        Object enum160 = ((Field) term47913).get((Object) null);
        Class<? extends Object> term48166 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term48165 = ((Class) term48166).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term48165).setAccessible(true);
        Object enum161 =  ((Field) term48165).get((Object) null);
        Class<? extends Object> term48393 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term48392 = ((Class) term48393).getDeclaredField((String) "USER_TIME");
        ((Field) term48392).setAccessible(true);
        Object enum162 =  ((Field) term48392).get((Object) null);
        Class<? extends Object> term48602 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term48601 = ((Class) term48602).getDeclaredField((String) "CPU_TIME");
        ((Field) term48601).setAccessible(true);
        Object enum163 =  ((Field) term48601).get((Object) null);
        ArrayList term47572 = new ArrayList();
        ((ArrayList) term47572).add(enum161);
        ((ArrayList) term47572).add(enum161);
        ((ArrayList) term47572).add(enum162);
        ((ArrayList) term47572).add(enum162);
        ((ArrayList) term47572).add(enum162);
        ((ArrayList) term47572).add(enum161);
        ((ArrayList) term47572).add(enum162);
        ((ArrayList) term47572).add(enum163);
        HashMap term47588 = new HashMap();
        term47449 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term47449, term47449.getClass(), "printFormat", enum159);
        setBooleanField(term47449, term47449.getClass(), "printHeader", false);
        setField(term47449, term47449.getClass(), "headerFormat", "GJVkUrCVdD");
        setBooleanField(term47449, term47449.getClass(), "printTrailer", true);
        setField(term47449, term47449.getClass(), "trailerFormat", "zNdorvdUgu");
        setField(term47449, term47449.getClass(), "rowFormat", "oPxuZbkYio");
        setField(term47449, term47449.getClass(), "sectionHeaderFormat", "vKitydDVnM");
        setBooleanField(term47449, term47449.getClass(), "printSectionSummary", true);
        setField(term47449, term47449.getClass(), "sectionSummaryRowFormat", "urCiQnUFBM");
        setBooleanField(term47449, term47449.getClass(), "printSectionTrailer", true);
        setField(term47449, term47449.getClass(), "sectionTrailerFormat", "EKjQdtKxAM");
        setField(term47449, term47449.getClass(), "durationFormat", enum160);
        setBooleanField(term47449, term47449.getClass(), "printLegend", false);
        setField(term47449, term47449.getClass(), "simpleLine", "TXZAIPQJHt");
        setField(term47449, term47449.getClass(), "alternativeLine", "DIbeDHICho");
        setField(term47449, term47449.getClass(), "excludedTypes", term47572);
        setField(term47449, term47449.getClass(), "customCounterNames", term47588);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCustomCounterNames", argTypes, term47449, args);
    }

};


