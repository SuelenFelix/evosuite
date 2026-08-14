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

public class PrintFormat_2_format_9061842961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum0;
     Object term39;

    public PrintFormat_2_format_9061842961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term220 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term219 = ((Class) term220).getDeclaredField((String) "DETAILED");
        ((Field) term219).setAccessible(true);
        enum0 = ((Field) term219).get((Object) null);
        Class<? extends Object> term476 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term475 = ((Class) term476).getDeclaredField((String) "SUMMARIZED");
        ((Field) term475).setAccessible(true);
        Object enum1 = ((Field) term475).get((Object) null);
        Class<? extends Object> term1021 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term1020 = ((Class) term1021).getDeclaredField((String) "SHORTER");
        ((Field) term1020).setAccessible(true);
        Object enum2 = ((Field) term1020).get((Object) null);
        Class<? extends Object> term1389 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term1388 = ((Class) term1389).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term1388).setAccessible(true);
        Object enum3 =  ((Field) term1388).get((Object) null);
        Class<? extends Object> term1616 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term1615 = ((Class) term1616).getDeclaredField((String) "CPU_TIME");
        ((Field) term1615).setAccessible(true);
        Object enum4 =  ((Field) term1615).get((Object) null);
        Class<? extends Object> term1822 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term1821 = ((Class) term1822).getDeclaredField((String) "USER_TIME");
        ((Field) term1821).setAccessible(true);
        Object enum5 =  ((Field) term1821).get((Object) null);
        ArrayList term166 = new ArrayList();
        ((ArrayList) term166).add(enum3);
        ((ArrayList) term166).add(enum4);
        ((ArrayList) term166).add(enum4);
        ((ArrayList) term166).add(enum3);
        ((ArrayList) term166).add(enum5);
        HashMap term182 = new HashMap();
        term39 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term39, term39.getClass(), "printFormat", enum1);
        setBooleanField(term39, term39.getClass(), "printHeader", false);
        setField(term39, term39.getClass(), "headerFormat", "MuLcgQHgqz");
        setBooleanField(term39, term39.getClass(), "printTrailer", false);
        setField(term39, term39.getClass(), "trailerFormat", "xxtlPwDYFs");
        setField(term39, term39.getClass(), "rowFormat", "jJCZpVmanW");
        setField(term39, term39.getClass(), "sectionHeaderFormat", "EGtDIRbSSb");
        setBooleanField(term39, term39.getClass(), "printSectionSummary", false);
        setField(term39, term39.getClass(), "sectionSummaryRowFormat", "SzjVpOQTyS");
        setBooleanField(term39, term39.getClass(), "printSectionTrailer", false);
        setField(term39, term39.getClass(), "sectionTrailerFormat", "MjGYSRKTNF");
        setField(term39, term39.getClass(), "durationFormat", enum2);
        setBooleanField(term39, term39.getClass(), "printLegend", true);
        setField(term39, term39.getClass(), "simpleLine", "hRNSzYYIrc");
        setField(term39, term39.getClass(), "alternativeLine", "RMFIsYGgne");
        setField(term39, term39.getClass(), "excludedTypes", term166);
        setField(term39, term39.getClass(), "customCounterNames", term182);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintFormat$2");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("net.obvj.performetrics.TimingSessionContainer");
        argTypes[1] = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term39;
        callMethod(klass, "format", argTypes, enum0, args);
    }

};


