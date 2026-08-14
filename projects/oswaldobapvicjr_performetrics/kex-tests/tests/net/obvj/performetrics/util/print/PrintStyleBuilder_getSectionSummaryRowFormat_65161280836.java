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

public class PrintStyleBuilder_getSectionSummaryRowFormat_65161280836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104311;

    public PrintStyleBuilder_getSectionSummaryRowFormat_65161280836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term104461 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term104460 = ((Class) term104461).getDeclaredField((String) "SUMMARIZED");
        ((Field) term104460).setAccessible(true);
        Object enum354 = ((Field) term104460).get((Object) null);
        Class<? extends Object> term104783 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term104782 = ((Class) term104783).getDeclaredField((String) "FULL");
        ((Field) term104782).setAccessible(true);
        Object enum355 = ((Field) term104782).get((Object) null);
        Class<? extends Object> term105032 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term105031 = ((Class) term105032).getDeclaredField((String) "CPU_TIME");
        ((Field) term105031).setAccessible(true);
        Object enum356 =  ((Field) term105031).get((Object) null);
        Class<? extends Object> term105238 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term105237 = ((Class) term105238).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term105237).setAccessible(true);
        Object enum357 =  ((Field) term105237).get((Object) null);
        Class<? extends Object> term105453 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term105452 = ((Class) term105453).getDeclaredField((String) "USER_TIME");
        ((Field) term105452).setAccessible(true);
        Object enum358 =  ((Field) term105452).get((Object) null);
        ArrayList term104435 = new ArrayList();
        ((ArrayList) term104435).add(enum356);
        ((ArrayList) term104435).add(enum357);
        ((ArrayList) term104435).add(enum357);
        ((ArrayList) term104435).add(enum356);
        ((ArrayList) term104435).add(enum358);
        ((ArrayList) term104435).add(enum356);
        ((ArrayList) term104435).add(enum358);
        HashMap term104451 = new HashMap();
        term104311 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term104311, term104311.getClass(), "printFormat", enum354);
        setBooleanField(term104311, term104311.getClass(), "printHeader", true);
        setField(term104311, term104311.getClass(), "headerFormat", "yIWXcOQTgy");
        setBooleanField(term104311, term104311.getClass(), "printTrailer", false);
        setField(term104311, term104311.getClass(), "trailerFormat", "xAWekqanqc");
        setField(term104311, term104311.getClass(), "rowFormat", "GSOWFHMlbF");
        setField(term104311, term104311.getClass(), "sectionHeaderFormat", "vpZIqpFbKM");
        setBooleanField(term104311, term104311.getClass(), "printSectionSummary", false);
        setField(term104311, term104311.getClass(), "sectionSummaryRowFormat", "dAbwpJCDif");
        setBooleanField(term104311, term104311.getClass(), "printSectionTrailer", true);
        setField(term104311, term104311.getClass(), "sectionTrailerFormat", "ATSXJPySio");
        setField(term104311, term104311.getClass(), "durationFormat", enum355);
        setBooleanField(term104311, term104311.getClass(), "printLegend", true);
        setField(term104311, term104311.getClass(), "simpleLine", "XZkOUcbfFg");
        setField(term104311, term104311.getClass(), "alternativeLine", "TGiJfagfky");
        setField(term104311, term104311.getClass(), "excludedTypes", term104435);
        setField(term104311, term104311.getClass(), "customCounterNames", term104451);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSectionSummaryRowFormat", argTypes, term104311, args);
    }

};


