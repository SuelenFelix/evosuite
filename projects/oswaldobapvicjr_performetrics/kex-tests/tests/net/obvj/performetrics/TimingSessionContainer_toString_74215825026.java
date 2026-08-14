package net.obvj.performetrics;

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
import static net.obvj.performetrics.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class TimingSessionContainer_toString_74215825026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120328;

    public TimingSessionContainer_toString_74215825026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term120478 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term120477 = ((Class) term120478).getDeclaredField((String) "SUMMARIZED");
        ((Field) term120477).setAccessible(true);
        Object enum414 = ((Field) term120477).get((Object) null);
        Class<? extends Object> term120800 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term120799 = ((Class) term120800).getDeclaredField((String) "FULL");
        ((Field) term120799).setAccessible(true);
        Object enum415 = ((Field) term120799).get((Object) null);
        Class<? extends Object> term121049 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term121048 = ((Class) term121049).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term121048).setAccessible(true);
        Object enum416 =  ((Field) term121048).get((Object) null);
        Class<? extends Object> term121276 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term121275 = ((Class) term121276).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term121275).setAccessible(true);
        Object enum417 =  ((Field) term121275).get((Object) null);
        Class<? extends Object> term121491 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term121490 = ((Class) term121491).getDeclaredField((String) "CPU_TIME");
        ((Field) term121490).setAccessible(true);
        Object enum418 =  ((Field) term121490).get((Object) null);
        ArrayList term120452 = new ArrayList();
        ((ArrayList) term120452).add(enum416);
        ((ArrayList) term120452).add(enum417);
        ((ArrayList) term120452).add(enum416);
        ((ArrayList) term120452).add(enum416);
        ((ArrayList) term120452).add(enum418);
        ((ArrayList) term120452).add(enum418);
        ((ArrayList) term120452).add(enum417);
        ((ArrayList) term120452).add(enum418);
        ((ArrayList) term120452).add(enum416);
        HashMap term120468 = new HashMap();
        term120328 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term120328, term120328.getClass(), "printFormat", enum414);
        setBooleanField(term120328, term120328.getClass(), "printHeader", true);
        setField(term120328, term120328.getClass(), "headerFormat", "FlHzxEfFzI");
        setBooleanField(term120328, term120328.getClass(), "printTrailer", false);
        setField(term120328, term120328.getClass(), "trailerFormat", "aSATgQUpoe");
        setField(term120328, term120328.getClass(), "rowFormat", "VkPSXewZfB");
        setField(term120328, term120328.getClass(), "sectionHeaderFormat", "ubodzJoMGW");
        setBooleanField(term120328, term120328.getClass(), "printSectionSummary", true);
        setField(term120328, term120328.getClass(), "sectionSummaryRowFormat", "weddIktxOA");
        setBooleanField(term120328, term120328.getClass(), "printSectionTrailer", false);
        setField(term120328, term120328.getClass(), "sectionTrailerFormat", "uSlMeISsDD");
        setField(term120328, term120328.getClass(), "durationFormat", enum415);
        setBooleanField(term120328, term120328.getClass(), "printLegend", false);
        setField(term120328, term120328.getClass(), "simpleLine", "WdCiTDUKqn");
        setField(term120328, term120328.getClass(), "alternativeLine", "PSizQDoxxe");
        setField(term120328, term120328.getClass(), "excludedTypes", term120452);
        setField(term120328, term120328.getClass(), "customCounterNames", term120468);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.TimingSessionContainer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Object[] args = new Object[1];
        args[0] = term120328;
        callMethod(klass, "toString", argTypes, null, args);
    }

};


