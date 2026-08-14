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

public class PrintFormat_checkCompatibility_19556481395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum36;
     Object term10375;

    public PrintFormat_checkCompatibility_19556481395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10516 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term10515 = ((Class) term10516).getDeclaredField((String) "DETAILED");
        ((Field) term10515).setAccessible(true);
        enum36 = ((Field) term10515).get((Object) null);
        Class<? extends Object> term10832 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term10831 = ((Class) term10832).getDeclaredField((String) "SHORT");
        ((Field) term10831).setAccessible(true);
        Object enum37 = ((Field) term10831).get((Object) null);
        Class<? extends Object> term11084 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term11083 = ((Class) term11084).getDeclaredField((String) "USER_TIME");
        ((Field) term11083).setAccessible(true);
        Object enum38 =  ((Field) term11083).get((Object) null);
        Class<? extends Object> term11293 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term11292 = ((Class) term11293).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term11292).setAccessible(true);
        Object enum39 =  ((Field) term11292).get((Object) null);
        Class<? extends Object> term11508 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term11507 = ((Class) term11508).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term11507).setAccessible(true);
        Object enum40 =  ((Field) term11507).get((Object) null);
        Class<? extends Object> term11735 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term11734 = ((Class) term11735).getDeclaredField((String) "CPU_TIME");
        ((Field) term11734).setAccessible(true);
        Object enum41 =  ((Field) term11734).get((Object) null);
        ArrayList term10486 = new ArrayList();
        ((ArrayList) term10486).add(enum38);
        ((ArrayList) term10486).add(enum38);
        ((ArrayList) term10486).add(enum39);
        ((ArrayList) term10486).add(enum38);
        ((ArrayList) term10486).add(enum40);
        ((ArrayList) term10486).add(enum41);
        ((ArrayList) term10486).add(enum40);
        ((ArrayList) term10486).add(enum39);
        HashMap term10506 = new HashMap();
        term10375 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term10375, term10375.getClass(), "printFormat", enum36);
        setBooleanField(term10375, term10375.getClass(), "printHeader", false);
        setField(term10375, term10375.getClass(), "headerFormat", "ffYhPOzlUs");
        setBooleanField(term10375, term10375.getClass(), "printTrailer", false);
        setField(term10375, term10375.getClass(), "trailerFormat", "MLqYREekMl");
        setField(term10375, term10375.getClass(), "rowFormat", "ytSBIKXogI");
        setField(term10375, term10375.getClass(), "sectionHeaderFormat", "nHXjMycHlU");
        setBooleanField(term10375, term10375.getClass(), "printSectionSummary", false);
        setField(term10375, term10375.getClass(), "sectionSummaryRowFormat", "ieCtQFdkii");
        setBooleanField(term10375, term10375.getClass(), "printSectionTrailer", true);
        setField(term10375, term10375.getClass(), "sectionTrailerFormat", "dEnhdmILtU");
        setField(term10375, term10375.getClass(), "durationFormat", enum37);
        setBooleanField(term10375, term10375.getClass(), "printLegend", true);
        setField(term10375, term10375.getClass(), "simpleLine", "hoicvmsovO");
        setField(term10375, term10375.getClass(), "alternativeLine", "eqJfYWRaEL");
        setField(term10375, term10375.getClass(), "excludedTypes", term10486);
        setField(term10375, term10375.getClass(), "customCounterNames", term10506);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Object[] args = new Object[1];
        args[0] = term10375;
        callMethod(klass, "checkCompatibility", argTypes, enum36, args);
    }

};


