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

public class PrintStyleBuilder_getCustomCounterNames_37591058441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110925;

    public PrintStyleBuilder_getCustomCounterNames_37591058441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term111077 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term111076 = ((Class) term111077).getDeclaredField((String) "SUMMARIZED");
        ((Field) term111076).setAccessible(true);
        Object enum378 = ((Field) term111076).get((Object) null);
        Class<? extends Object> term111399 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term111398 = ((Class) term111399).getDeclaredField((String) "FULL");
        ((Field) term111398).setAccessible(true);
        Object enum379 = ((Field) term111398).get((Object) null);
        Class<? extends Object> term111648 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term111647 = ((Class) term111648).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term111647).setAccessible(true);
        Object enum380 =  ((Field) term111647).get((Object) null);
        Class<? extends Object> term111875 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term111874 = ((Class) term111875).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term111874).setAccessible(true);
        Object enum381 =  ((Field) term111874).get((Object) null);
        Class<? extends Object> term112090 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term112089 = ((Class) term112090).getDeclaredField((String) "USER_TIME");
        ((Field) term112089).setAccessible(true);
        Object enum382 =  ((Field) term112089).get((Object) null);
        ArrayList term111049 = new ArrayList();
        ((ArrayList) term111049).add(enum380);
        ((ArrayList) term111049).add(enum381);
        ((ArrayList) term111049).add(enum382);
        ((ArrayList) term111049).add(enum381);
        ((ArrayList) term111049).add(enum382);
        HashMap term111065 = new HashMap();
        term110925 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term110925, term110925.getClass(), "printFormat", enum378);
        setBooleanField(term110925, term110925.getClass(), "printHeader", false);
        setField(term110925, term110925.getClass(), "headerFormat", "bVbexZPmwW");
        setBooleanField(term110925, term110925.getClass(), "printTrailer", false);
        setField(term110925, term110925.getClass(), "trailerFormat", "tvxYdqiyGc");
        setField(term110925, term110925.getClass(), "rowFormat", "ZEXFoMSKeG");
        setField(term110925, term110925.getClass(), "sectionHeaderFormat", "HvxahUfZcJ");
        setBooleanField(term110925, term110925.getClass(), "printSectionSummary", true);
        setField(term110925, term110925.getClass(), "sectionSummaryRowFormat", "WkLpmqoQxy");
        setBooleanField(term110925, term110925.getClass(), "printSectionTrailer", true);
        setField(term110925, term110925.getClass(), "sectionTrailerFormat", "XiNoscmYhd");
        setField(term110925, term110925.getClass(), "durationFormat", enum379);
        setBooleanField(term110925, term110925.getClass(), "printLegend", true);
        setField(term110925, term110925.getClass(), "simpleLine", "asMqnMNrZp");
        setField(term110925, term110925.getClass(), "alternativeLine", "pqFUMTCKJd");
        setField(term110925, term110925.getClass(), "excludedTypes", term111049);
        setField(term110925, term110925.getClass(), "customCounterNames", term111065);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCustomCounterNames", argTypes, term110925, args);
    }

};


