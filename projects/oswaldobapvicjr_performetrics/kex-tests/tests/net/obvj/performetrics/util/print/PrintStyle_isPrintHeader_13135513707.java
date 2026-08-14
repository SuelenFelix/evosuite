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

public class PrintStyle_isPrintHeader_13135513707 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38746;

    public PrintStyle_isPrintHeader_13135513707() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term39055 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term39054 = ((Class) term39055).getDeclaredField((String) "SUMMARIZED");
        ((Field) term39054).setAccessible(true);
        Object enum129 = ((Field) term39054).get((Object) null);
        Class<? extends Object> term39377 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term39376 = ((Class) term39377).getDeclaredField((String) "LINUX");
        ((Field) term39376).setAccessible(true);
        Object enum130 = ((Field) term39376).get((Object) null);
        Class<? extends Object> term39629 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term39628 = ((Class) term39629).getDeclaredField((String) "USER_TIME");
        ((Field) term39628).setAccessible(true);
        Object enum131 =  ((Field) term39628).get((Object) null);
        Class<? extends Object> term39838 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term39837 = ((Class) term39838).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term39837).setAccessible(true);
        Object enum132 =  ((Field) term39837).get((Object) null);
        Class<? extends Object> term40065 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term40064 = ((Class) term40065).getDeclaredField((String) "CPU_TIME");
        ((Field) term40064).setAccessible(true);
        Object enum133 =  ((Field) term40064).get((Object) null);
        Class<? extends Object> term40271 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term40270 = ((Class) term40271).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term40270).setAccessible(true);
        Object enum134 =  ((Field) term40270).get((Object) null);
        ArrayList term39025 = new ArrayList();
        ((ArrayList) term39025).add(enum131);
        ((ArrayList) term39025).add(enum132);
        ((ArrayList) term39025).add(enum133);
        ((ArrayList) term39025).add(enum134);
        ((ArrayList) term39025).add(enum131);
        ((ArrayList) term39025).add(enum134);
        ((ArrayList) term39025).add(enum132);
        ((ArrayList) term39025).add(enum134);
        HashMap term39045 = new HashMap();
        term38746 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term38746, term38746.getClass(), "printFormat", enum129);
        setBooleanField(term38746, term38746.getClass(), "printHeader", false);
        setField(term38746, term38746.getClass(), "headerFormat", "XJJNClzHRf");
        setBooleanField(term38746, term38746.getClass(), "printTrailer", false);
        setField(term38746, term38746.getClass(), "trailerFormat", "HDaezxQfQR");
        setField(term38746, term38746.getClass(), "rowFormat", "iikZEapDlu");
        setField(term38746, term38746.getClass(), "sectionHeaderFormat", "nhoHrZfnIN");
        setBooleanField(term38746, term38746.getClass(), "printSectionSummary", false);
        setField(term38746, term38746.getClass(), "sectionSummaryRowFormat", "ZkMALXpEAZ");
        setBooleanField(term38746, term38746.getClass(), "printSectionTrailer", false);
        setField(term38746, term38746.getClass(), "sectionTrailerFormat", "tXfQjSqDzN");
        setField(term38746, term38746.getClass(), "durationFormat", enum130);
        setBooleanField(term38746, term38746.getClass(), "printLegend", false);
        setField(term38746, term38746.getClass(), "simpleLine", "BjugTaMcxJ");
        setField(term38746, term38746.getClass(), "alternativeLine", "vGiuZVPJNH");
        setField(term38746, term38746.getClass(), "excludedTypes", term39025);
        setField(term38746, term38746.getClass(), "customCounterNames", term39045);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPrintHeader", argTypes, term38746, args);
    }

};


