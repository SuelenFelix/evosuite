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

public class PrintStyleBuilder_isPrintHeader_147865603928 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93593;

    public PrintStyleBuilder_isPrintHeader_147865603928() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term93741 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term93740 = ((Class) term93741).getDeclaredField((String) "DETAILED");
        ((Field) term93740).setAccessible(true);
        Object enum317 = ((Field) term93740).get((Object) null);
        Class<? extends Object> term94057 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term94056 = ((Class) term94057).getDeclaredField((String) "ISO_8601");
        ((Field) term94056).setAccessible(true);
        Object enum318 = ((Field) term94056).get((Object) null);
        Class<? extends Object> term94318 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term94317 = ((Class) term94318).getDeclaredField((String) "USER_TIME");
        ((Field) term94317).setAccessible(true);
        Object enum319 =  ((Field) term94317).get((Object) null);
        Class<? extends Object> term94527 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term94526 = ((Class) term94527).getDeclaredField((String) "CPU_TIME");
        ((Field) term94526).setAccessible(true);
        Object enum320 =  ((Field) term94526).get((Object) null);
        ArrayList term93719 = new ArrayList();
        ((ArrayList) term93719).add(enum319);
        ((ArrayList) term93719).add(enum320);
        ((ArrayList) term93719).add(enum319);
        ((ArrayList) term93719).add(enum319);
        HashMap term93731 = new HashMap();
        term93593 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term93593, term93593.getClass(), "printFormat", enum317);
        setBooleanField(term93593, term93593.getClass(), "printHeader", false);
        setField(term93593, term93593.getClass(), "headerFormat", "awDQVEVIKi");
        setBooleanField(term93593, term93593.getClass(), "printTrailer", true);
        setField(term93593, term93593.getClass(), "trailerFormat", "HJwNgUzZZR");
        setField(term93593, term93593.getClass(), "rowFormat", "FvUCZgTXhq");
        setField(term93593, term93593.getClass(), "sectionHeaderFormat", "wWWidPCHzx");
        setBooleanField(term93593, term93593.getClass(), "printSectionSummary", false);
        setField(term93593, term93593.getClass(), "sectionSummaryRowFormat", "OwPIiBRuKK");
        setBooleanField(term93593, term93593.getClass(), "printSectionTrailer", true);
        setField(term93593, term93593.getClass(), "sectionTrailerFormat", "sgfGySMODT");
        setField(term93593, term93593.getClass(), "durationFormat", enum318);
        setBooleanField(term93593, term93593.getClass(), "printLegend", true);
        setField(term93593, term93593.getClass(), "simpleLine", "ndAITnOsny");
        setField(term93593, term93593.getClass(), "alternativeLine", "CVZnTiJucs");
        setField(term93593, term93593.getClass(), "excludedTypes", term93719);
        setField(term93593, term93593.getClass(), "customCounterNames", term93731);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPrintHeader", argTypes, term93593, args);
    }

};


