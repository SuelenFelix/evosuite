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

public class PrintStyleBuilder_getRowFormat_16308320937 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94069;

    public PrintStyleBuilder_getRowFormat_16308320937() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term94368 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term94367 = ((Class) term94368).getDeclaredField((String) "DETAILED");
        ((Field) term94367).setAccessible(true);
        Object enum322 = ((Field) term94367).get((Object) null);
        Class<? extends Object> term94684 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term94683 = ((Class) term94684).getDeclaredField((String) "LINUX");
        ((Field) term94683).setAccessible(true);
        Object enum323 = ((Field) term94683).get((Object) null);
        Class<? extends Object> term94936 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term94935 = ((Class) term94936).getDeclaredField((String) "CPU_TIME");
        ((Field) term94935).setAccessible(true);
        Object enum324 =  ((Field) term94935).get((Object) null);
        Class<? extends Object> term95142 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term95141 = ((Class) term95142).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term95141).setAccessible(true);
        Object enum325 =  ((Field) term95141).get((Object) null);
        ArrayList term94346 = new ArrayList();
        ((ArrayList) term94346).add(enum324);
        ((ArrayList) term94346).add(enum325);
        HashMap term94358 = new HashMap();
        term94069 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term94069, term94069.getClass(), "printFormat", enum322);
        setBooleanField(term94069, term94069.getClass(), "printHeader", false);
        setField(term94069, term94069.getClass(), "headerFormat", "aZKOWhHMEh");
        setBooleanField(term94069, term94069.getClass(), "printTrailer", true);
        setField(term94069, term94069.getClass(), "trailerFormat", "YfkhviKZwl");
        setField(term94069, term94069.getClass(), "rowFormat", "DcOhhAfJTI");
        setField(term94069, term94069.getClass(), "sectionHeaderFormat", "gYTIkBFOoS");
        setBooleanField(term94069, term94069.getClass(), "printSectionSummary", false);
        setField(term94069, term94069.getClass(), "sectionSummaryRowFormat", "xmzSoVgiED");
        setBooleanField(term94069, term94069.getClass(), "printSectionTrailer", true);
        setField(term94069, term94069.getClass(), "sectionTrailerFormat", "pdSvedKgPq");
        setField(term94069, term94069.getClass(), "durationFormat", enum323);
        setBooleanField(term94069, term94069.getClass(), "printLegend", true);
        setField(term94069, term94069.getClass(), "simpleLine", "epPTwvcoyb");
        setField(term94069, term94069.getClass(), "alternativeLine", "UBPHmOICBs");
        setField(term94069, term94069.getClass(), "excludedTypes", term94346);
        setField(term94069, term94069.getClass(), "customCounterNames", term94358);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRowFormat", argTypes, term94069, args);
    }

};


