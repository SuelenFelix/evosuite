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

public class PrintStyleBuilder_isPrintSectionSummary_96505095730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96255;

    public PrintStyleBuilder_isPrintSectionSummary_96505095730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term96412 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term96411 = ((Class) term96412).getDeclaredField((String) "SUMMARIZED");
        ((Field) term96411).setAccessible(true);
        Object enum326 = ((Field) term96411).get((Object) null);
        Class<? extends Object> term96734 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term96733 = ((Class) term96734).getDeclaredField((String) "SHORTER");
        ((Field) term96733).setAccessible(true);
        Object enum327 = ((Field) term96733).get((Object) null);
        Class<? extends Object> term96992 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term96991 = ((Class) term96992).getDeclaredField((String) "USER_TIME");
        ((Field) term96991).setAccessible(true);
        Object enum328 =  ((Field) term96991).get((Object) null);
        Class<? extends Object> term97201 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term97200 = ((Class) term97201).getDeclaredField((String) "CPU_TIME");
        ((Field) term97200).setAccessible(true);
        Object enum329 =  ((Field) term97200).get((Object) null);
        Class<? extends Object> term97407 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term97406 = ((Class) term97407).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term97406).setAccessible(true);
        Object enum330 =  ((Field) term97406).get((Object) null);
        Class<? extends Object> term97622 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term97621 = ((Class) term97622).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term97621).setAccessible(true);
        Object enum331 =  ((Field) term97621).get((Object) null);
        ArrayList term96382 = new ArrayList();
        ((ArrayList) term96382).add(enum328);
        ((ArrayList) term96382).add(enum328);
        ((ArrayList) term96382).add(enum329);
        ((ArrayList) term96382).add(enum330);
        ((ArrayList) term96382).add(enum331);
        HashMap term96402 = new HashMap();
        term96255 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term96255, term96255.getClass(), "printFormat", enum326);
        setBooleanField(term96255, term96255.getClass(), "printHeader", true);
        setField(term96255, term96255.getClass(), "headerFormat", "YfkhviKZwl");
        setBooleanField(term96255, term96255.getClass(), "printTrailer", true);
        setField(term96255, term96255.getClass(), "trailerFormat", "DcOhhAfJTI");
        setField(term96255, term96255.getClass(), "rowFormat", "gYTIkBFOoS");
        setField(term96255, term96255.getClass(), "sectionHeaderFormat", "xmzSoVgiED");
        setBooleanField(term96255, term96255.getClass(), "printSectionSummary", false);
        setField(term96255, term96255.getClass(), "sectionSummaryRowFormat", "pdSvedKgPq");
        setBooleanField(term96255, term96255.getClass(), "printSectionTrailer", true);
        setField(term96255, term96255.getClass(), "sectionTrailerFormat", "epPTwvcoyb");
        setField(term96255, term96255.getClass(), "durationFormat", enum327);
        setBooleanField(term96255, term96255.getClass(), "printLegend", true);
        setField(term96255, term96255.getClass(), "simpleLine", "UBPHmOICBs");
        setField(term96255, term96255.getClass(), "alternativeLine", "IDJUVPgUJf");
        setField(term96255, term96255.getClass(), "excludedTypes", term96382);
        setField(term96255, term96255.getClass(), "customCounterNames", term96402);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPrintSectionSummary", argTypes, term96255, args);
    }

};


