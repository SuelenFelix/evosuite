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

public class PrintStyle_getSectionHeaderFormat_2671835017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37279;

    public PrintStyle_getSectionHeaderFormat_2671835017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term37434 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term37433 = ((Class) term37434).getDeclaredField((String) "SUMMARIZED");
        ((Field) term37433).setAccessible(true);
        Object enum122 = ((Field) term37433).get((Object) null);
        Class<? extends Object> term37756 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term37755 = ((Class) term37756).getDeclaredField((String) "SHORT");
        ((Field) term37755).setAccessible(true);
        Object enum123 = ((Field) term37755).get((Object) null);
        Class<? extends Object> term38008 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term38007 = ((Class) term38008).getDeclaredField((String) "USER_TIME");
        ((Field) term38007).setAccessible(true);
        Object enum124 =  ((Field) term38007).get((Object) null);
        Class<? extends Object> term38217 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term38216 = ((Class) term38217).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term38216).setAccessible(true);
        Object enum125 =  ((Field) term38216).get((Object) null);
        Class<? extends Object> term38444 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term38443 = ((Class) term38444).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term38443).setAccessible(true);
        Object enum126 =  ((Field) term38443).get((Object) null);
        Class<? extends Object> term38659 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term38658 = ((Class) term38659).getDeclaredField((String) "CPU_TIME");
        ((Field) term38658).setAccessible(true);
        Object enum127 =  ((Field) term38658).get((Object) null);
        ArrayList term37404 = new ArrayList();
        ((ArrayList) term37404).add(enum124);
        ((ArrayList) term37404).add(enum125);
        ((ArrayList) term37404).add(enum125);
        ((ArrayList) term37404).add(enum126);
        ((ArrayList) term37404).add(enum127);
        HashMap term37424 = new HashMap();
        term37279 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term37279, term37279.getClass(), "printFormat", enum122);
        setBooleanField(term37279, term37279.getClass(), "printHeader", true);
        setField(term37279, term37279.getClass(), "headerFormat", "NzBMMhkhpT");
        setBooleanField(term37279, term37279.getClass(), "printTrailer", true);
        setField(term37279, term37279.getClass(), "trailerFormat", "qCpEbQDHdF");
        setField(term37279, term37279.getClass(), "rowFormat", "AHbZyFOmlo");
        setField(term37279, term37279.getClass(), "sectionHeaderFormat", "TwfWVQGiIj");
        setBooleanField(term37279, term37279.getClass(), "printSectionSummary", false);
        setField(term37279, term37279.getClass(), "sectionSummaryRowFormat", "gUvcueTURF");
        setBooleanField(term37279, term37279.getClass(), "printSectionTrailer", true);
        setField(term37279, term37279.getClass(), "sectionTrailerFormat", "EwQBhZjCIT");
        setField(term37279, term37279.getClass(), "durationFormat", enum123);
        setBooleanField(term37279, term37279.getClass(), "printLegend", false);
        setField(term37279, term37279.getClass(), "simpleLine", "aSkmSwTnEw");
        setField(term37279, term37279.getClass(), "alternativeLine", "xvkbvaEGYd");
        setField(term37279, term37279.getClass(), "excludedTypes", term37404);
        setField(term37279, term37279.getClass(), "customCounterNames", term37424);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSectionHeaderFormat", argTypes, term37279, args);
    }

};


