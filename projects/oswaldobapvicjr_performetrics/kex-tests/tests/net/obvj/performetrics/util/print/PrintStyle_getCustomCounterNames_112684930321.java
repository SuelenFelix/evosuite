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

public class PrintStyle_getCustomCounterNames_112684930321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95241;

    public PrintStyle_getCustomCounterNames_112684930321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term95389 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term95388 = ((Class) term95389).getDeclaredField((String) "DETAILED");
        ((Field) term95388).setAccessible(true);
        Object enum321 = ((Field) term95388).get((Object) null);
        Class<? extends Object> term95705 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term95704 = ((Class) term95705).getDeclaredField((String) "FULL");
        ((Field) term95704).setAccessible(true);
        Object enum322 = ((Field) term95704).get((Object) null);
        Class<? extends Object> term95954 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term95953 = ((Class) term95954).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term95953).setAccessible(true);
        Object enum323 =  ((Field) term95953).get((Object) null);
        Class<? extends Object> term96181 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term96180 = ((Class) term96181).getDeclaredField((String) "CPU_TIME");
        ((Field) term96180).setAccessible(true);
        Object enum324 =  ((Field) term96180).get((Object) null);
        Class<? extends Object> term96387 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term96386 = ((Class) term96387).getDeclaredField((String) "USER_TIME");
        ((Field) term96386).setAccessible(true);
        Object enum325 =  ((Field) term96386).get((Object) null);
        ArrayList term95363 = new ArrayList();
        ((ArrayList) term95363).add(enum323);
        ((ArrayList) term95363).add(enum323);
        ((ArrayList) term95363).add(enum324);
        ((ArrayList) term95363).add(enum323);
        ((ArrayList) term95363).add(enum323);
        ((ArrayList) term95363).add(enum325);
        ((ArrayList) term95363).add(enum325);
        ((ArrayList) term95363).add(enum325);
        ((ArrayList) term95363).add(enum323);
        HashMap term95379 = new HashMap();
        term95241 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term95241, term95241.getClass(), "printFormat", enum321);
        setBooleanField(term95241, term95241.getClass(), "printHeader", true);
        setField(term95241, term95241.getClass(), "headerFormat", "lBOokzEPfe");
        setBooleanField(term95241, term95241.getClass(), "printTrailer", true);
        setField(term95241, term95241.getClass(), "trailerFormat", "dtGZCsKXbW");
        setField(term95241, term95241.getClass(), "rowFormat", "bdyhHbDAmJ");
        setField(term95241, term95241.getClass(), "sectionHeaderFormat", "BBXiTNHqGE");
        setBooleanField(term95241, term95241.getClass(), "printSectionSummary", true);
        setField(term95241, term95241.getClass(), "sectionSummaryRowFormat", "IEYhJmgCVd");
        setBooleanField(term95241, term95241.getClass(), "printSectionTrailer", true);
        setField(term95241, term95241.getClass(), "sectionTrailerFormat", "KSJeYkkvpk");
        setField(term95241, term95241.getClass(), "durationFormat", enum322);
        setBooleanField(term95241, term95241.getClass(), "printLegend", true);
        setField(term95241, term95241.getClass(), "simpleLine", "qUtkFGMNUV");
        setField(term95241, term95241.getClass(), "alternativeLine", "mGRiYhnMcR");
        setField(term95241, term95241.getClass(), "excludedTypes", term95363);
        setField(term95241, term95241.getClass(), "customCounterNames", term95379);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCustomCounterNames", argTypes, term95241, args);
    }

};


