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

public class PrintStyleBuilder_getExcludedTypes_60303964843 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102946;

    public PrintStyleBuilder_getExcludedTypes_60303964843() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term103092 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term103091 = ((Class) term103092).getDeclaredField((String) "SUMMARIZED");
        ((Field) term103091).setAccessible(true);
        Object enum353 = ((Field) term103091).get((Object) null);
        Class<? extends Object> term103414 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term103413 = ((Class) term103414).getDeclaredField((String) "FULL");
        ((Field) term103413).setAccessible(true);
        Object enum354 = ((Field) term103413).get((Object) null);
        Class<? extends Object> term103663 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term103662 = ((Class) term103663).getDeclaredField((String) "CPU_TIME");
        ((Field) term103662).setAccessible(true);
        Object enum355 =  ((Field) term103662).get((Object) null);
        Class<? extends Object> term103869 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term103868 = ((Class) term103869).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term103868).setAccessible(true);
        Object enum356 =  ((Field) term103868).get((Object) null);
        ArrayList term103070 = new ArrayList();
        ((ArrayList) term103070).add(enum355);
        ((ArrayList) term103070).add(enum356);
        ((ArrayList) term103070).add(enum355);
        ((ArrayList) term103070).add(enum356);
        ((ArrayList) term103070).add(enum356);
        HashMap term103082 = new HashMap();
        term102946 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term102946, term102946.getClass(), "printFormat", enum353);
        setBooleanField(term102946, term102946.getClass(), "printHeader", false);
        setField(term102946, term102946.getClass(), "headerFormat", "EAIAAStlTz");
        setBooleanField(term102946, term102946.getClass(), "printTrailer", true);
        setField(term102946, term102946.getClass(), "trailerFormat", "yIWXcOQTgy");
        setField(term102946, term102946.getClass(), "rowFormat", "xAWekqanqc");
        setField(term102946, term102946.getClass(), "sectionHeaderFormat", "GSOWFHMlbF");
        setBooleanField(term102946, term102946.getClass(), "printSectionSummary", true);
        setField(term102946, term102946.getClass(), "sectionSummaryRowFormat", "vpZIqpFbKM");
        setBooleanField(term102946, term102946.getClass(), "printSectionTrailer", true);
        setField(term102946, term102946.getClass(), "sectionTrailerFormat", "dAbwpJCDif");
        setField(term102946, term102946.getClass(), "durationFormat", enum354);
        setBooleanField(term102946, term102946.getClass(), "printLegend", false);
        setField(term102946, term102946.getClass(), "simpleLine", "ATSXJPySio");
        setField(term102946, term102946.getClass(), "alternativeLine", "XZkOUcbfFg");
        setField(term102946, term102946.getClass(), "excludedTypes", term103070);
        setField(term102946, term102946.getClass(), "customCounterNames", term103082);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExcludedTypes", argTypes, term102946, args);
    }

};


