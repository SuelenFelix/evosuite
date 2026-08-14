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

public class PrintStyle_getPrintFormat_5444291414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34780;

    public PrintStyle_getPrintFormat_5444291414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term35085 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term35084 = ((Class) term35085).getDeclaredField((String) "SUMMARIZED");
        ((Field) term35084).setAccessible(true);
        Object enum116 = ((Field) term35084).get((Object) null);
        Class<? extends Object> term35407 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term35406 = ((Class) term35407).getDeclaredField((String) "LINUX");
        ((Field) term35406).setAccessible(true);
        Object enum117 = ((Field) term35406).get((Object) null);
        Class<? extends Object> term35659 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term35658 = ((Class) term35659).getDeclaredField((String) "CPU_TIME");
        ((Field) term35658).setAccessible(true);
        Object enum118 =  ((Field) term35658).get((Object) null);
        Class<? extends Object> term35865 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term35864 = ((Class) term35865).getDeclaredField((String) "USER_TIME");
        ((Field) term35864).setAccessible(true);
        Object enum119 =  ((Field) term35864).get((Object) null);
        Class<? extends Object> term36074 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term36073 = ((Class) term36074).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term36073).setAccessible(true);
        Object enum120 =  ((Field) term36073).get((Object) null);
        ArrayList term35059 = new ArrayList();
        ((ArrayList) term35059).add(enum118);
        ((ArrayList) term35059).add(enum119);
        ((ArrayList) term35059).add(enum118);
        ((ArrayList) term35059).add(enum118);
        ((ArrayList) term35059).add(enum120);
        ((ArrayList) term35059).add(enum119);
        ((ArrayList) term35059).add(enum119);
        HashMap term35075 = new HashMap();
        term34780 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term34780, term34780.getClass(), "printFormat", enum116);
        setBooleanField(term34780, term34780.getClass(), "printHeader", false);
        setField(term34780, term34780.getClass(), "headerFormat", "rLHAoqXgPh");
        setBooleanField(term34780, term34780.getClass(), "printTrailer", true);
        setField(term34780, term34780.getClass(), "trailerFormat", "zUlRdimJtU");
        setField(term34780, term34780.getClass(), "rowFormat", "vwbEQQNQrx");
        setField(term34780, term34780.getClass(), "sectionHeaderFormat", "xtftXXMbem");
        setBooleanField(term34780, term34780.getClass(), "printSectionSummary", true);
        setField(term34780, term34780.getClass(), "sectionSummaryRowFormat", "cudZvLMQon");
        setBooleanField(term34780, term34780.getClass(), "printSectionTrailer", true);
        setField(term34780, term34780.getClass(), "sectionTrailerFormat", "lihXWlGDxk");
        setField(term34780, term34780.getClass(), "durationFormat", enum117);
        setBooleanField(term34780, term34780.getClass(), "printLegend", false);
        setField(term34780, term34780.getClass(), "simpleLine", "JmcmxoGhIK");
        setField(term34780, term34780.getClass(), "alternativeLine", "jXzmYyrnnT");
        setField(term34780, term34780.getClass(), "excludedTypes", term35059);
        setField(term34780, term34780.getClass(), "customCounterNames", term35075);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrintFormat", argTypes, term34780, args);
    }

};


