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

public class PrintStyleBuilder_getSectionSummaryRowFormat_65161280839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96949;

    public PrintStyleBuilder_getSectionSummaryRowFormat_65161280839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term97250 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term97249 = ((Class) term97250).getDeclaredField((String) "SUMMARIZED");
        ((Field) term97249).setAccessible(true);
        Object enum332 = ((Field) term97249).get((Object) null);
        Class<? extends Object> term97572 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term97571 = ((Class) term97572).getDeclaredField((String) "LINUX");
        ((Field) term97571).setAccessible(true);
        Object enum333 = ((Field) term97571).get((Object) null);
        Class<? extends Object> term97824 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term97823 = ((Class) term97824).getDeclaredField((String) "CPU_TIME");
        ((Field) term97823).setAccessible(true);
        Object enum334 =  ((Field) term97823).get((Object) null);
        Class<? extends Object> term98030 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term98029 = ((Class) term98030).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term98029).setAccessible(true);
        Object enum335 =  ((Field) term98029).get((Object) null);
        ArrayList term97228 = new ArrayList();
        ((ArrayList) term97228).add(enum334);
        ((ArrayList) term97228).add(enum334);
        ((ArrayList) term97228).add(enum334);
        ((ArrayList) term97228).add(enum335);
        ((ArrayList) term97228).add(enum335);
        HashMap term97240 = new HashMap();
        term96949 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term96949, term96949.getClass(), "printFormat", enum332);
        setBooleanField(term96949, term96949.getClass(), "printHeader", true);
        setField(term96949, term96949.getClass(), "headerFormat", "DPwIqlszZo");
        setBooleanField(term96949, term96949.getClass(), "printTrailer", false);
        setField(term96949, term96949.getClass(), "trailerFormat", "mNgDshwZNc");
        setField(term96949, term96949.getClass(), "rowFormat", "pDqgDbJoFw");
        setField(term96949, term96949.getClass(), "sectionHeaderFormat", "iVOvTzOxwt");
        setBooleanField(term96949, term96949.getClass(), "printSectionSummary", true);
        setField(term96949, term96949.getClass(), "sectionSummaryRowFormat", "BjZQdecXvB");
        setBooleanField(term96949, term96949.getClass(), "printSectionTrailer", true);
        setField(term96949, term96949.getClass(), "sectionTrailerFormat", "iUkOOQhEkw");
        setField(term96949, term96949.getClass(), "durationFormat", enum333);
        setBooleanField(term96949, term96949.getClass(), "printLegend", true);
        setField(term96949, term96949.getClass(), "simpleLine", "wmVoFoUVmU");
        setField(term96949, term96949.getClass(), "alternativeLine", "lLiSiPCciB");
        setField(term96949, term96949.getClass(), "excludedTypes", term97228);
        setField(term96949, term96949.getClass(), "customCounterNames", term97240);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSectionSummaryRowFormat", argTypes, term96949, args);
    }

};


