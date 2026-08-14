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

public class PrintStyle_isPrintSectionTrailer_114852126911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43013;

    public PrintStyle_isPrintSectionTrailer_114852126911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term43162 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term43161 = ((Class) term43162).getDeclaredField((String) "DETAILED");
        ((Field) term43161).setAccessible(true);
        Object enum144 = ((Field) term43161).get((Object) null);
        Class<? extends Object> term43478 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term43477 = ((Class) term43478).getDeclaredField((String) "SHORT");
        ((Field) term43477).setAccessible(true);
        Object enum145 = ((Field) term43477).get((Object) null);
        Class<? extends Object> term43730 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term43729 = ((Class) term43730).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term43729).setAccessible(true);
        Object enum146 =  ((Field) term43729).get((Object) null);
        Class<? extends Object> term43957 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term43956 = ((Class) term43957).getDeclaredField((String) "CPU_TIME");
        ((Field) term43956).setAccessible(true);
        Object enum147 =  ((Field) term43956).get((Object) null);
        Class<? extends Object> term44163 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term44162 = ((Class) term44163).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term44162).setAccessible(true);
        Object enum148 =  ((Field) term44162).get((Object) null);
        ArrayList term43136 = new ArrayList();
        ((ArrayList) term43136).add(enum146);
        ((ArrayList) term43136).add(enum147);
        ((ArrayList) term43136).add(enum147);
        ((ArrayList) term43136).add(enum146);
        ((ArrayList) term43136).add(enum146);
        ((ArrayList) term43136).add(enum148);
        ((ArrayList) term43136).add(enum147);
        HashMap term43152 = new HashMap();
        term43013 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term43013, term43013.getClass(), "printFormat", enum144);
        setBooleanField(term43013, term43013.getClass(), "printHeader", true);
        setField(term43013, term43013.getClass(), "headerFormat", "qCpEbQDHdF");
        setBooleanField(term43013, term43013.getClass(), "printTrailer", false);
        setField(term43013, term43013.getClass(), "trailerFormat", "AHbZyFOmlo");
        setField(term43013, term43013.getClass(), "rowFormat", "TwfWVQGiIj");
        setField(term43013, term43013.getClass(), "sectionHeaderFormat", "gUvcueTURF");
        setBooleanField(term43013, term43013.getClass(), "printSectionSummary", true);
        setField(term43013, term43013.getClass(), "sectionSummaryRowFormat", "EwQBhZjCIT");
        setBooleanField(term43013, term43013.getClass(), "printSectionTrailer", false);
        setField(term43013, term43013.getClass(), "sectionTrailerFormat", "aSkmSwTnEw");
        setField(term43013, term43013.getClass(), "durationFormat", enum145);
        setBooleanField(term43013, term43013.getClass(), "printLegend", false);
        setField(term43013, term43013.getClass(), "simpleLine", "xvkbvaEGYd");
        setField(term43013, term43013.getClass(), "alternativeLine", "HBGNxdNURv");
        setField(term43013, term43013.getClass(), "excludedTypes", term43136);
        setField(term43013, term43013.getClass(), "customCounterNames", term43152);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPrintSectionTrailer", argTypes, term43013, args);
    }

};


