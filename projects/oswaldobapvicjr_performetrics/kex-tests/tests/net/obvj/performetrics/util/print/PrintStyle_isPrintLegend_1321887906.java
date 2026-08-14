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

public class PrintStyle_isPrintLegend_1321887906 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37225;

    public PrintStyle_isPrintLegend_1321887906() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term37528 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term37527 = ((Class) term37528).getDeclaredField((String) "DETAILED");
        ((Field) term37527).setAccessible(true);
        Object enum124 = ((Field) term37527).get((Object) null);
        Class<? extends Object> term37844 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term37843 = ((Class) term37844).getDeclaredField((String) "LINUX");
        ((Field) term37843).setAccessible(true);
        Object enum125 = ((Field) term37843).get((Object) null);
        Class<? extends Object> term38096 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term38095 = ((Class) term38096).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term38095).setAccessible(true);
        Object enum126 =  ((Field) term38095).get((Object) null);
        Class<? extends Object> term38323 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term38322 = ((Class) term38323).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term38322).setAccessible(true);
        Object enum127 =  ((Field) term38322).get((Object) null);
        Class<? extends Object> term38538 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term38537 = ((Class) term38538).getDeclaredField((String) "USER_TIME");
        ((Field) term38537).setAccessible(true);
        Object enum128 =  ((Field) term38537).get((Object) null);
        ArrayList term37502 = new ArrayList();
        ((ArrayList) term37502).add(enum126);
        ((ArrayList) term37502).add(enum127);
        ((ArrayList) term37502).add(enum128);
        ((ArrayList) term37502).add(enum127);
        ((ArrayList) term37502).add(enum126);
        HashMap term37518 = new HashMap();
        term37225 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term37225, term37225.getClass(), "printFormat", enum124);
        setBooleanField(term37225, term37225.getClass(), "printHeader", false);
        setField(term37225, term37225.getClass(), "headerFormat", "vKQukfbJUd");
        setBooleanField(term37225, term37225.getClass(), "printTrailer", false);
        setField(term37225, term37225.getClass(), "trailerFormat", "lFRJFUMVbx");
        setField(term37225, term37225.getClass(), "rowFormat", "sZdUNdggUW");
        setField(term37225, term37225.getClass(), "sectionHeaderFormat", "OqbwYQfvAe");
        setBooleanField(term37225, term37225.getClass(), "printSectionSummary", false);
        setField(term37225, term37225.getClass(), "sectionSummaryRowFormat", "tRxZafjqIx");
        setBooleanField(term37225, term37225.getClass(), "printSectionTrailer", true);
        setField(term37225, term37225.getClass(), "sectionTrailerFormat", "DhjNLmRMCu");
        setField(term37225, term37225.getClass(), "durationFormat", enum125);
        setBooleanField(term37225, term37225.getClass(), "printLegend", true);
        setField(term37225, term37225.getClass(), "simpleLine", "PgPzMSEjjX");
        setField(term37225, term37225.getClass(), "alternativeLine", "wzsPSPcRdj");
        setField(term37225, term37225.getClass(), "excludedTypes", term37502);
        setField(term37225, term37225.getClass(), "customCounterNames", term37518);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPrintLegend", argTypes, term37225, args);
    }

};


