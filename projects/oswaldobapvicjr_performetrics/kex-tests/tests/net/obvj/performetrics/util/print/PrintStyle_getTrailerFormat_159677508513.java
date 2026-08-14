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

public class PrintStyle_getTrailerFormat_159677508513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45756;

    public PrintStyle_getTrailerFormat_159677508513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term46055 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term46054 = ((Class) term46055).getDeclaredField((String) "DETAILED");
        ((Field) term46054).setAccessible(true);
        Object enum154 = ((Field) term46054).get((Object) null);
        Class<? extends Object> term46371 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term46370 = ((Class) term46371).getDeclaredField((String) "LINUX");
        ((Field) term46370).setAccessible(true);
        Object enum155 = ((Field) term46370).get((Object) null);
        Class<? extends Object> term46623 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term46622 = ((Class) term46623).getDeclaredField((String) "CPU_TIME");
        ((Field) term46622).setAccessible(true);
        Object enum156 =  ((Field) term46622).get((Object) null);
        Class<? extends Object> term46829 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term46828 = ((Class) term46829).getDeclaredField((String) "USER_TIME");
        ((Field) term46828).setAccessible(true);
        Object enum157 =  ((Field) term46828).get((Object) null);
        ArrayList term46033 = new ArrayList();
        ((ArrayList) term46033).add(enum156);
        ((ArrayList) term46033).add(enum157);
        ((ArrayList) term46033).add(enum157);
        ((ArrayList) term46033).add(enum157);
        HashMap term46045 = new HashMap();
        term45756 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term45756, term45756.getClass(), "printFormat", enum154);
        setBooleanField(term45756, term45756.getClass(), "printHeader", false);
        setField(term45756, term45756.getClass(), "headerFormat", "PqtVXXZMqK");
        setBooleanField(term45756, term45756.getClass(), "printTrailer", false);
        setField(term45756, term45756.getClass(), "trailerFormat", "rYbtIDVdnd");
        setField(term45756, term45756.getClass(), "rowFormat", "UKAReurpHG");
        setField(term45756, term45756.getClass(), "sectionHeaderFormat", "WVRMUmrljA");
        setBooleanField(term45756, term45756.getClass(), "printSectionSummary", true);
        setField(term45756, term45756.getClass(), "sectionSummaryRowFormat", "NTlKJDDWlk");
        setBooleanField(term45756, term45756.getClass(), "printSectionTrailer", false);
        setField(term45756, term45756.getClass(), "sectionTrailerFormat", "vOuMEpOQAg");
        setField(term45756, term45756.getClass(), "durationFormat", enum155);
        setBooleanField(term45756, term45756.getClass(), "printLegend", false);
        setField(term45756, term45756.getClass(), "simpleLine", "SIODFGaQhr");
        setField(term45756, term45756.getClass(), "alternativeLine", "qYzsiuXOgS");
        setField(term45756, term45756.getClass(), "excludedTypes", term46033);
        setField(term45756, term45756.getClass(), "customCounterNames", term46045);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrailerFormat", argTypes, term45756, args);
    }

};


