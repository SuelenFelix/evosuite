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

public class PrintStyleBuilder_withLegends_125232057521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71425;

    public PrintStyleBuilder_withLegends_125232057521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term71566 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term71565 = ((Class) term71566).getDeclaredField((String) "DETAILED");
        ((Field) term71565).setAccessible(true);
        Object enum240 = ((Field) term71565).get((Object) null);
        Class<? extends Object> term71882 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term71881 = ((Class) term71882).getDeclaredField((String) "SHORT");
        ((Field) term71881).setAccessible(true);
        Object enum241 = ((Field) term71881).get((Object) null);
        Class<? extends Object> term72134 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term72133 = ((Class) term72134).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term72133).setAccessible(true);
        Object enum242 =  ((Field) term72133).get((Object) null);
        ArrayList term71548 = new ArrayList();
        ((ArrayList) term71548).add(enum242);
        ((ArrayList) term71548).add(enum242);
        HashMap term71556 = new HashMap();
        term71425 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term71425, term71425.getClass(), "printFormat", enum240);
        setBooleanField(term71425, term71425.getClass(), "printHeader", true);
        setField(term71425, term71425.getClass(), "headerFormat", "fIZsWucfXz");
        setBooleanField(term71425, term71425.getClass(), "printTrailer", false);
        setField(term71425, term71425.getClass(), "trailerFormat", "IApvtmfhnq");
        setField(term71425, term71425.getClass(), "rowFormat", "VSaNnhMpRc");
        setField(term71425, term71425.getClass(), "sectionHeaderFormat", "QNjNTLlUaV");
        setBooleanField(term71425, term71425.getClass(), "printSectionSummary", true);
        setField(term71425, term71425.getClass(), "sectionSummaryRowFormat", "hIYsRyOZxk");
        setBooleanField(term71425, term71425.getClass(), "printSectionTrailer", true);
        setField(term71425, term71425.getClass(), "sectionTrailerFormat", "RjNoEywJbC");
        setField(term71425, term71425.getClass(), "durationFormat", enum241);
        setBooleanField(term71425, term71425.getClass(), "printLegend", false);
        setField(term71425, term71425.getClass(), "simpleLine", "RTTvrwwhou");
        setField(term71425, term71425.getClass(), "alternativeLine", "lRORwXipuk");
        setField(term71425, term71425.getClass(), "excludedTypes", term71548);
        setField(term71425, term71425.getClass(), "customCounterNames", term71556);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "withLegends", argTypes, term71425, args);
    }

};


