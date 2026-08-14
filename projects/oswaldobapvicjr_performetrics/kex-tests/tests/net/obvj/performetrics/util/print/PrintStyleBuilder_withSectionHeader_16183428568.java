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

public class PrintStyleBuilder_withSectionHeader_16183428568 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68910;

    public PrintStyleBuilder_withSectionHeader_16183428568() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term69065 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term69064 = ((Class) term69065).getDeclaredField((String) "DETAILED");
        ((Field) term69064).setAccessible(true);
        Object enum232 = ((Field) term69064).get((Object) null);
        Class<? extends Object> term69381 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term69380 = ((Class) term69381).getDeclaredField((String) "SHORT");
        ((Field) term69380).setAccessible(true);
        Object enum233 = ((Field) term69380).get((Object) null);
        Class<? extends Object> term69633 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term69632 = ((Class) term69633).getDeclaredField((String) "USER_TIME");
        ((Field) term69632).setAccessible(true);
        Object enum234 =  ((Field) term69632).get((Object) null);
        ArrayList term69033 = new ArrayList();
        ((ArrayList) term69033).add(enum234);
        HashMap term69041 = new HashMap();
        term68910 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term68910, term68910.getClass(), "printFormat", enum232);
        setBooleanField(term68910, term68910.getClass(), "printHeader", false);
        setField(term68910, term68910.getClass(), "headerFormat", "IENRuqmwUU");
        setBooleanField(term68910, term68910.getClass(), "printTrailer", true);
        setField(term68910, term68910.getClass(), "trailerFormat", "GsWxOwXvSu");
        setField(term68910, term68910.getClass(), "rowFormat", "bKBSncrMEZ");
        setField(term68910, term68910.getClass(), "sectionHeaderFormat", "yeSXGqQExb");
        setBooleanField(term68910, term68910.getClass(), "printSectionSummary", true);
        setField(term68910, term68910.getClass(), "sectionSummaryRowFormat", "uXYcXVYJZM");
        setBooleanField(term68910, term68910.getClass(), "printSectionTrailer", true);
        setField(term68910, term68910.getClass(), "sectionTrailerFormat", "BJhjdJUhkz");
        setField(term68910, term68910.getClass(), "durationFormat", enum233);
        setBooleanField(term68910, term68910.getClass(), "printLegend", true);
        setField(term68910, term68910.getClass(), "simpleLine", "cdHYQDgUZR");
        setField(term68910, term68910.getClass(), "alternativeLine", "KAORSSPSeV");
        setField(term68910, term68910.getClass(), "excludedTypes", term69033);
        setField(term68910, term68910.getClass(), "customCounterNames", term69041);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "huVIXUWLtI";
        callMethod(klass, "withSectionHeader", argTypes, term68910, args);
    }

};


