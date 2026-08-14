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

public class PrintStyle_getTrailerFormat_159677508515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34190;

    public PrintStyle_getTrailerFormat_159677508515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term34497 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term34496 = ((Class) term34497).getDeclaredField((String) "DETAILED");
        ((Field) term34496).setAccessible(true);
        Object enum111 = ((Field) term34496).get((Object) null);
        Class<? extends Object> term34813 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term34812 = ((Class) term34813).getDeclaredField((String) "LINUX");
        ((Field) term34812).setAccessible(true);
        Object enum112 = ((Field) term34812).get((Object) null);
        Class<? extends Object> term35065 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term35064 = ((Class) term35065).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term35064).setAccessible(true);
        Object enum113 =  ((Field) term35064).get((Object) null);
        Class<? extends Object> term35292 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term35291 = ((Class) term35292).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term35291).setAccessible(true);
        Object enum114 =  ((Field) term35291).get((Object) null);
        Class<? extends Object> term35507 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term35506 = ((Class) term35507).getDeclaredField((String) "CPU_TIME");
        ((Field) term35506).setAccessible(true);
        Object enum115 =  ((Field) term35506).get((Object) null);
        Class<? extends Object> term35713 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term35712 = ((Class) term35713).getDeclaredField((String) "USER_TIME");
        ((Field) term35712).setAccessible(true);
        Object enum116 =  ((Field) term35712).get((Object) null);
        ArrayList term34467 = new ArrayList();
        ((ArrayList) term34467).add(enum113);
        ((ArrayList) term34467).add(enum114);
        ((ArrayList) term34467).add(enum115);
        ((ArrayList) term34467).add(enum113);
        ((ArrayList) term34467).add(enum114);
        ((ArrayList) term34467).add(enum116);
        ((ArrayList) term34467).add(enum113);
        ((ArrayList) term34467).add(enum113);
        HashMap term34487 = new HashMap();
        term34190 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term34190, term34190.getClass(), "printFormat", enum111);
        setBooleanField(term34190, term34190.getClass(), "printHeader", true);
        setField(term34190, term34190.getClass(), "headerFormat", "tlzpzIjMib");
        setBooleanField(term34190, term34190.getClass(), "printTrailer", true);
        setField(term34190, term34190.getClass(), "trailerFormat", "AZdLeSugwv");
        setField(term34190, term34190.getClass(), "rowFormat", "RMsXuyzKJV");
        setField(term34190, term34190.getClass(), "sectionHeaderFormat", "FwPbDZcHmB");
        setBooleanField(term34190, term34190.getClass(), "printSectionSummary", false);
        setField(term34190, term34190.getClass(), "sectionSummaryRowFormat", "hOncybyCAH");
        setBooleanField(term34190, term34190.getClass(), "printSectionTrailer", false);
        setField(term34190, term34190.getClass(), "sectionTrailerFormat", "QduALnDSVo");
        setField(term34190, term34190.getClass(), "durationFormat", enum112);
        setBooleanField(term34190, term34190.getClass(), "printLegend", true);
        setField(term34190, term34190.getClass(), "simpleLine", "izPpKDErnQ");
        setField(term34190, term34190.getClass(), "alternativeLine", "NnpwZBUTvx");
        setField(term34190, term34190.getClass(), "excludedTypes", term34467);
        setField(term34190, term34190.getClass(), "customCounterNames", term34487);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrailerFormat", argTypes, term34190, args);
    }

};


