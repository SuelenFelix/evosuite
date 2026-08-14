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

public class PrintStyle_isPrintHeader_131355137010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27771;

    public PrintStyle_isPrintHeader_131355137010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term27928 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term27927 = ((Class) term27928).getDeclaredField((String) "SUMMARIZED");
        ((Field) term27927).setAccessible(true);
        Object enum90 = ((Field) term27927).get((Object) null);
        Class<? extends Object> term28250 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term28249 = ((Class) term28250).getDeclaredField((String) "SHORTER");
        ((Field) term28249).setAccessible(true);
        Object enum91 = ((Field) term28249).get((Object) null);
        Class<? extends Object> term28508 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term28507 = ((Class) term28508).getDeclaredField((String) "USER_TIME");
        ((Field) term28507).setAccessible(true);
        Object enum92 =  ((Field) term28507).get((Object) null);
        Class<? extends Object> term28717 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term28716 = ((Class) term28717).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term28716).setAccessible(true);
        Object enum93 =  ((Field) term28716).get((Object) null);
        Class<? extends Object> term28944 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term28943 = ((Class) term28944).getDeclaredField((String) "CPU_TIME");
        ((Field) term28943).setAccessible(true);
        Object enum94 =  ((Field) term28943).get((Object) null);
        Class<? extends Object> term29150 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term29149 = ((Class) term29150).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term29149).setAccessible(true);
        Object enum95 =  ((Field) term29149).get((Object) null);
        ArrayList term27898 = new ArrayList();
        ((ArrayList) term27898).add(enum92);
        ((ArrayList) term27898).add(enum92);
        ((ArrayList) term27898).add(enum93);
        ((ArrayList) term27898).add(enum94);
        ((ArrayList) term27898).add(enum95);
        ((ArrayList) term27898).add(enum92);
        ((ArrayList) term27898).add(enum95);
        ((ArrayList) term27898).add(enum93);
        ((ArrayList) term27898).add(enum95);
        HashMap term27918 = new HashMap();
        term27771 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term27771, term27771.getClass(), "printFormat", enum90);
        setBooleanField(term27771, term27771.getClass(), "printHeader", true);
        setField(term27771, term27771.getClass(), "headerFormat", "aWYOWZFyaX");
        setBooleanField(term27771, term27771.getClass(), "printTrailer", true);
        setField(term27771, term27771.getClass(), "trailerFormat", "BRIVNtfUWU");
        setField(term27771, term27771.getClass(), "rowFormat", "DbiCVtPPCT");
        setField(term27771, term27771.getClass(), "sectionHeaderFormat", "WzFopsaDuG");
        setBooleanField(term27771, term27771.getClass(), "printSectionSummary", true);
        setField(term27771, term27771.getClass(), "sectionSummaryRowFormat", "PapWxkhEWe");
        setBooleanField(term27771, term27771.getClass(), "printSectionTrailer", false);
        setField(term27771, term27771.getClass(), "sectionTrailerFormat", "smnHEqRFRx");
        setField(term27771, term27771.getClass(), "durationFormat", enum91);
        setBooleanField(term27771, term27771.getClass(), "printLegend", true);
        setField(term27771, term27771.getClass(), "simpleLine", "XYtryyobou");
        setField(term27771, term27771.getClass(), "alternativeLine", "OYbzXylRWW");
        setField(term27771, term27771.getClass(), "excludedTypes", term27898);
        setField(term27771, term27771.getClass(), "customCounterNames", term27918);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPrintHeader", argTypes, term27771, args);
    }

};


