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

public class PrintStyleBuilder_getCustomCounterNames_37591058444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104095;

    public PrintStyleBuilder_getCustomCounterNames_37591058444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term104241 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term104240 = ((Class) term104241).getDeclaredField((String) "SUMMARIZED");
        ((Field) term104240).setAccessible(true);
        Object enum357 = ((Field) term104240).get((Object) null);
        Class<? extends Object> term104563 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term104562 = ((Class) term104563).getDeclaredField((String) "FULL");
        ((Field) term104562).setAccessible(true);
        Object enum358 = ((Field) term104562).get((Object) null);
        Class<? extends Object> term104812 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term104811 = ((Class) term104812).getDeclaredField((String) "USER_TIME");
        ((Field) term104811).setAccessible(true);
        Object enum359 =  ((Field) term104811).get((Object) null);
        Class<? extends Object> term105021 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term105020 = ((Class) term105021).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term105020).setAccessible(true);
        Object enum360 =  ((Field) term105020).get((Object) null);
        ArrayList term104219 = new ArrayList();
        ((ArrayList) term104219).add(enum359);
        ((ArrayList) term104219).add(enum360);
        HashMap term104231 = new HashMap();
        term104095 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term104095, term104095.getClass(), "printFormat", enum357);
        setBooleanField(term104095, term104095.getClass(), "printHeader", false);
        setField(term104095, term104095.getClass(), "headerFormat", "BJklinBmhN");
        setBooleanField(term104095, term104095.getClass(), "printTrailer", true);
        setField(term104095, term104095.getClass(), "trailerFormat", "IOddzvEWcl");
        setField(term104095, term104095.getClass(), "rowFormat", "bIrtpkYJWT");
        setField(term104095, term104095.getClass(), "sectionHeaderFormat", "VuLLXpvPpZ");
        setBooleanField(term104095, term104095.getClass(), "printSectionSummary", false);
        setField(term104095, term104095.getClass(), "sectionSummaryRowFormat", "UEdzEKEEEV");
        setBooleanField(term104095, term104095.getClass(), "printSectionTrailer", false);
        setField(term104095, term104095.getClass(), "sectionTrailerFormat", "BcENaQFYSd");
        setField(term104095, term104095.getClass(), "durationFormat", enum358);
        setBooleanField(term104095, term104095.getClass(), "printLegend", false);
        setField(term104095, term104095.getClass(), "simpleLine", "POPYycoDBy");
        setField(term104095, term104095.getClass(), "alternativeLine", "LuWMOXdAPA");
        setField(term104095, term104095.getClass(), "excludedTypes", term104219);
        setField(term104095, term104095.getClass(), "customCounterNames", term104231);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCustomCounterNames", argTypes, term104095, args);
    }

};


