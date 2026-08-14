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

public class PrintStyle_getDurationFormat_5851245815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36288;

    public PrintStyle_getDurationFormat_5851245815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term36434 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term36433 = ((Class) term36434).getDeclaredField((String) "DETAILED");
        ((Field) term36433).setAccessible(true);
        Object enum121 = ((Field) term36433).get((Object) null);
        Class<? extends Object> term36750 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term36749 = ((Class) term36750).getDeclaredField((String) "ISO_8601");
        ((Field) term36749).setAccessible(true);
        Object enum122 = ((Field) term36749).get((Object) null);
        Class<? extends Object> term37011 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term37010 = ((Class) term37011).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term37010).setAccessible(true);
        Object enum123 =  ((Field) term37010).get((Object) null);
        ArrayList term36414 = new ArrayList();
        ((ArrayList) term36414).add(enum123);
        HashMap term36422 = new HashMap();
        term36288 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term36288, term36288.getClass(), "printFormat", enum121);
        setBooleanField(term36288, term36288.getClass(), "printHeader", true);
        setField(term36288, term36288.getClass(), "headerFormat", "DyiXbeYIaN");
        setBooleanField(term36288, term36288.getClass(), "printTrailer", true);
        setField(term36288, term36288.getClass(), "trailerFormat", "VGizxZnyHX");
        setField(term36288, term36288.getClass(), "rowFormat", "kVEZMHmRtR");
        setField(term36288, term36288.getClass(), "sectionHeaderFormat", "ekxGuOYIwi");
        setBooleanField(term36288, term36288.getClass(), "printSectionSummary", true);
        setField(term36288, term36288.getClass(), "sectionSummaryRowFormat", "RbVQXSpxXy");
        setBooleanField(term36288, term36288.getClass(), "printSectionTrailer", false);
        setField(term36288, term36288.getClass(), "sectionTrailerFormat", "YpJbIgJWWv");
        setField(term36288, term36288.getClass(), "durationFormat", enum122);
        setBooleanField(term36288, term36288.getClass(), "printLegend", true);
        setField(term36288, term36288.getClass(), "simpleLine", "JppkknKVOw");
        setField(term36288, term36288.getClass(), "alternativeLine", "iljANwuEjk");
        setField(term36288, term36288.getClass(), "excludedTypes", term36414);
        setField(term36288, term36288.getClass(), "customCounterNames", term36422);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDurationFormat", argTypes, term36288, args);
    }

};


