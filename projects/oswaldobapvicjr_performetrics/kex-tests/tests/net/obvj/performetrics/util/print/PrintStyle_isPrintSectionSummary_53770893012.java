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

public class PrintStyle_isPrintSectionSummary_53770893012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30232;

    public PrintStyle_isPrintSectionSummary_53770893012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30529 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term30528 = ((Class) term30529).getDeclaredField((String) "DETAILED");
        ((Field) term30528).setAccessible(true);
        Object enum98 = ((Field) term30528).get((Object) null);
        Class<? extends Object> term30845 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term30844 = ((Class) term30845).getDeclaredField((String) "LINUX");
        ((Field) term30844).setAccessible(true);
        Object enum99 = ((Field) term30844).get((Object) null);
        Class<? extends Object> term31097 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term31096 = ((Class) term31097).getDeclaredField((String) "CPU_TIME");
        ((Field) term31096).setAccessible(true);
        Object enum100 =  ((Field) term31096).get((Object) null);
        ArrayList term30509 = new ArrayList();
        ((ArrayList) term30509).add(enum100);
        HashMap term30517 = new HashMap();
        term30232 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term30232, term30232.getClass(), "printFormat", enum98);
        setBooleanField(term30232, term30232.getClass(), "printHeader", false);
        setField(term30232, term30232.getClass(), "headerFormat", "igCAtimmYB");
        setBooleanField(term30232, term30232.getClass(), "printTrailer", false);
        setField(term30232, term30232.getClass(), "trailerFormat", "DyiXbeYIaN");
        setField(term30232, term30232.getClass(), "rowFormat", "VGizxZnyHX");
        setField(term30232, term30232.getClass(), "sectionHeaderFormat", "kVEZMHmRtR");
        setBooleanField(term30232, term30232.getClass(), "printSectionSummary", true);
        setField(term30232, term30232.getClass(), "sectionSummaryRowFormat", "ekxGuOYIwi");
        setBooleanField(term30232, term30232.getClass(), "printSectionTrailer", true);
        setField(term30232, term30232.getClass(), "sectionTrailerFormat", "RbVQXSpxXy");
        setField(term30232, term30232.getClass(), "durationFormat", enum99);
        setBooleanField(term30232, term30232.getClass(), "printLegend", false);
        setField(term30232, term30232.getClass(), "simpleLine", "YpJbIgJWWv");
        setField(term30232, term30232.getClass(), "alternativeLine", "JppkknKVOw");
        setField(term30232, term30232.getClass(), "excludedTypes", term30509);
        setField(term30232, term30232.getClass(), "customCounterNames", term30517);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPrintSectionSummary", argTypes, term30232, args);
    }

};


