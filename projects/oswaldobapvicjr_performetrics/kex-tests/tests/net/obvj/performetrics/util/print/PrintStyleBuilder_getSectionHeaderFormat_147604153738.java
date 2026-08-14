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

public class PrintStyleBuilder_getSectionHeaderFormat_147604153738 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95356;

    public PrintStyleBuilder_getSectionHeaderFormat_147604153738() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term95513 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term95512 = ((Class) term95513).getDeclaredField((String) "SUMMARIZED");
        ((Field) term95512).setAccessible(true);
        Object enum326 = ((Field) term95512).get((Object) null);
        Class<? extends Object> term95835 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term95834 = ((Class) term95835).getDeclaredField((String) "SHORTER");
        ((Field) term95834).setAccessible(true);
        Object enum327 = ((Field) term95834).get((Object) null);
        Class<? extends Object> term96093 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term96092 = ((Class) term96093).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term96092).setAccessible(true);
        Object enum328 =  ((Field) term96092).get((Object) null);
        Class<? extends Object> term96320 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term96319 = ((Class) term96320).getDeclaredField((String) "CPU_TIME");
        ((Field) term96319).setAccessible(true);
        Object enum329 =  ((Field) term96319).get((Object) null);
        Class<? extends Object> term96526 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term96525 = ((Class) term96526).getDeclaredField((String) "USER_TIME");
        ((Field) term96525).setAccessible(true);
        Object enum330 =  ((Field) term96525).get((Object) null);
        Class<? extends Object> term96735 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term96734 = ((Class) term96735).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term96734).setAccessible(true);
        Object enum331 =  ((Field) term96734).get((Object) null);
        ArrayList term95483 = new ArrayList();
        ((ArrayList) term95483).add(enum328);
        ((ArrayList) term95483).add(enum328);
        ((ArrayList) term95483).add(enum329);
        ((ArrayList) term95483).add(enum330);
        ((ArrayList) term95483).add(enum331);
        HashMap term95503 = new HashMap();
        term95356 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term95356, term95356.getClass(), "printFormat", enum326);
        setBooleanField(term95356, term95356.getClass(), "printHeader", false);
        setField(term95356, term95356.getClass(), "headerFormat", "JmnWRJUxGr");
        setBooleanField(term95356, term95356.getClass(), "printTrailer", false);
        setField(term95356, term95356.getClass(), "trailerFormat", "wgRGBNrTGP");
        setField(term95356, term95356.getClass(), "rowFormat", "FIdNVptZpW");
        setField(term95356, term95356.getClass(), "sectionHeaderFormat", "rQjxAhisjm");
        setBooleanField(term95356, term95356.getClass(), "printSectionSummary", false);
        setField(term95356, term95356.getClass(), "sectionSummaryRowFormat", "ZDhASPHjDG");
        setBooleanField(term95356, term95356.getClass(), "printSectionTrailer", false);
        setField(term95356, term95356.getClass(), "sectionTrailerFormat", "HNVOAXYNEZ");
        setField(term95356, term95356.getClass(), "durationFormat", enum327);
        setBooleanField(term95356, term95356.getClass(), "printLegend", true);
        setField(term95356, term95356.getClass(), "simpleLine", "gbbYBYyfvr");
        setField(term95356, term95356.getClass(), "alternativeLine", "SrWMUlbtWV");
        setField(term95356, term95356.getClass(), "excludedTypes", term95483);
        setField(term95356, term95356.getClass(), "customCounterNames", term95503);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSectionHeaderFormat", argTypes, term95356, args);
    }

};


