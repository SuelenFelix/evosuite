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

public class PrintStyleBuilder_withoutLegends_178235200319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82499;

    public PrintStyleBuilder_withoutLegends_178235200319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term82651 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term82650 = ((Class) term82651).getDeclaredField((String) "SUMMARIZED");
        ((Field) term82650).setAccessible(true);
        Object enum278 = ((Field) term82650).get((Object) null);
        Class<? extends Object> term82973 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term82972 = ((Class) term82973).getDeclaredField((String) "ISO_8601");
        ((Field) term82972).setAccessible(true);
        Object enum279 = ((Field) term82972).get((Object) null);
        Class<? extends Object> term83234 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term83233 = ((Class) term83234).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term83233).setAccessible(true);
        Object enum280 =  ((Field) term83233).get((Object) null);
        Class<? extends Object> term83461 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term83460 = ((Class) term83461).getDeclaredField((String) "USER_TIME");
        ((Field) term83460).setAccessible(true);
        Object enum281 =  ((Field) term83460).get((Object) null);
        ArrayList term82627 = new ArrayList();
        ((ArrayList) term82627).add(enum280);
        ((ArrayList) term82627).add(enum280);
        ((ArrayList) term82627).add(enum281);
        HashMap term82639 = new HashMap();
        term82499 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term82499, term82499.getClass(), "printFormat", enum278);
        setBooleanField(term82499, term82499.getClass(), "printHeader", true);
        setField(term82499, term82499.getClass(), "headerFormat", "HknsTajwxJ");
        setBooleanField(term82499, term82499.getClass(), "printTrailer", true);
        setField(term82499, term82499.getClass(), "trailerFormat", "XtiurrVYKw");
        setField(term82499, term82499.getClass(), "rowFormat", "rsumfoDNHa");
        setField(term82499, term82499.getClass(), "sectionHeaderFormat", "ceCWHUTQUM");
        setBooleanField(term82499, term82499.getClass(), "printSectionSummary", true);
        setField(term82499, term82499.getClass(), "sectionSummaryRowFormat", "LrqwfrKKtS");
        setBooleanField(term82499, term82499.getClass(), "printSectionTrailer", false);
        setField(term82499, term82499.getClass(), "sectionTrailerFormat", "ZUdnQXfzCI");
        setField(term82499, term82499.getClass(), "durationFormat", enum279);
        setBooleanField(term82499, term82499.getClass(), "printLegend", false);
        setField(term82499, term82499.getClass(), "simpleLine", "EULDrUNQvw");
        setField(term82499, term82499.getClass(), "alternativeLine", "BtvAvsJSei");
        setField(term82499, term82499.getClass(), "excludedTypes", term82627);
        setField(term82499, term82499.getClass(), "customCounterNames", term82639);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "withoutLegends", argTypes, term82499, args);
    }

};


