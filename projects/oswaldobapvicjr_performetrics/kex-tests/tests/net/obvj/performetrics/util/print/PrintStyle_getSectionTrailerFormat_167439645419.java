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

public class PrintStyle_getSectionTrailerFormat_167439645419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40449;

    public PrintStyle_getSectionTrailerFormat_167439645419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term40603 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term40602 = ((Class) term40603).getDeclaredField((String) "SUMMARIZED");
        ((Field) term40602).setAccessible(true);
        Object enum134 = ((Field) term40602).get((Object) null);
        Class<? extends Object> term40925 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term40924 = ((Class) term40925).getDeclaredField((String) "ISO_8601");
        ((Field) term40924).setAccessible(true);
        Object enum135 = ((Field) term40924).get((Object) null);
        Class<? extends Object> term41186 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term41185 = ((Class) term41186).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term41185).setAccessible(true);
        Object enum136 =  ((Field) term41185).get((Object) null);
        Class<? extends Object> term41401 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term41400 = ((Class) term41401).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term41400).setAccessible(true);
        Object enum137 =  ((Field) term41400).get((Object) null);
        Class<? extends Object> term41628 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term41627 = ((Class) term41628).getDeclaredField((String) "CPU_TIME");
        ((Field) term41627).setAccessible(true);
        Object enum138 =  ((Field) term41627).get((Object) null);
        ArrayList term40577 = new ArrayList();
        ((ArrayList) term40577).add(enum136);
        ((ArrayList) term40577).add(enum137);
        ((ArrayList) term40577).add(enum138);
        ((ArrayList) term40577).add(enum138);
        ((ArrayList) term40577).add(enum136);
        ((ArrayList) term40577).add(enum138);
        ((ArrayList) term40577).add(enum137);
        ((ArrayList) term40577).add(enum136);
        ((ArrayList) term40577).add(enum136);
        HashMap term40593 = new HashMap();
        term40449 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term40449, term40449.getClass(), "printFormat", enum134);
        setBooleanField(term40449, term40449.getClass(), "printHeader", true);
        setField(term40449, term40449.getClass(), "headerFormat", "WBAOTqErtm");
        setBooleanField(term40449, term40449.getClass(), "printTrailer", true);
        setField(term40449, term40449.getClass(), "trailerFormat", "PqtVXXZMqK");
        setField(term40449, term40449.getClass(), "rowFormat", "rYbtIDVdnd");
        setField(term40449, term40449.getClass(), "sectionHeaderFormat", "UKAReurpHG");
        setBooleanField(term40449, term40449.getClass(), "printSectionSummary", false);
        setField(term40449, term40449.getClass(), "sectionSummaryRowFormat", "WVRMUmrljA");
        setBooleanField(term40449, term40449.getClass(), "printSectionTrailer", true);
        setField(term40449, term40449.getClass(), "sectionTrailerFormat", "NTlKJDDWlk");
        setField(term40449, term40449.getClass(), "durationFormat", enum135);
        setBooleanField(term40449, term40449.getClass(), "printLegend", true);
        setField(term40449, term40449.getClass(), "simpleLine", "vOuMEpOQAg");
        setField(term40449, term40449.getClass(), "alternativeLine", "SIODFGaQhr");
        setField(term40449, term40449.getClass(), "excludedTypes", term40577);
        setField(term40449, term40449.getClass(), "customCounterNames", term40593);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSectionTrailerFormat", argTypes, term40449, args);
    }

};


