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

public class PrintStyle_getSectionSummaryRowFormat_85114707915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88079;

    public PrintStyle_getSectionSummaryRowFormat_85114707915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term88231 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term88230 = ((Class) term88231).getDeclaredField((String) "DETAILED");
        ((Field) term88230).setAccessible(true);
        Object enum297 = ((Field) term88230).get((Object) null);
        Class<? extends Object> term88547 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term88546 = ((Class) term88547).getDeclaredField((String) "FULL");
        ((Field) term88546).setAccessible(true);
        Object enum298 = ((Field) term88546).get((Object) null);
        Class<? extends Object> term88796 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term88795 = ((Class) term88796).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term88795).setAccessible(true);
        Object enum299 =  ((Field) term88795).get((Object) null);
        Class<? extends Object> term89023 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term89022 = ((Class) term89023).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term89022).setAccessible(true);
        Object enum300 =  ((Field) term89022).get((Object) null);
        Class<? extends Object> term89238 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term89237 = ((Class) term89238).getDeclaredField((String) "CPU_TIME");
        ((Field) term89237).setAccessible(true);
        Object enum301 =  ((Field) term89237).get((Object) null);
        Class<? extends Object> term89444 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term89443 = ((Class) term89444).getDeclaredField((String) "USER_TIME");
        ((Field) term89443).setAccessible(true);
        Object enum302 =  ((Field) term89443).get((Object) null);
        ArrayList term88201 = new ArrayList();
        ((ArrayList) term88201).add(enum299);
        ((ArrayList) term88201).add(enum300);
        ((ArrayList) term88201).add(enum300);
        ((ArrayList) term88201).add(enum301);
        ((ArrayList) term88201).add(enum300);
        ((ArrayList) term88201).add(enum302);
        ((ArrayList) term88201).add(enum301);
        HashMap term88221 = new HashMap();
        term88079 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term88079, term88079.getClass(), "printFormat", enum297);
        setBooleanField(term88079, term88079.getClass(), "printHeader", true);
        setField(term88079, term88079.getClass(), "headerFormat", "nRvKihUSPj");
        setBooleanField(term88079, term88079.getClass(), "printTrailer", false);
        setField(term88079, term88079.getClass(), "trailerFormat", "BbNeQJpYPr");
        setField(term88079, term88079.getClass(), "rowFormat", "riMtzCoxNj");
        setField(term88079, term88079.getClass(), "sectionHeaderFormat", "YAXkVjQZcV");
        setBooleanField(term88079, term88079.getClass(), "printSectionSummary", true);
        setField(term88079, term88079.getClass(), "sectionSummaryRowFormat", "pumvwBWvpy");
        setBooleanField(term88079, term88079.getClass(), "printSectionTrailer", true);
        setField(term88079, term88079.getClass(), "sectionTrailerFormat", "HwLHeGLyhe");
        setField(term88079, term88079.getClass(), "durationFormat", enum298);
        setBooleanField(term88079, term88079.getClass(), "printLegend", true);
        setField(term88079, term88079.getClass(), "simpleLine", "RDnkgWkcbz");
        setField(term88079, term88079.getClass(), "alternativeLine", "IBpaxltauX");
        setField(term88079, term88079.getClass(), "excludedTypes", term88201);
        setField(term88079, term88079.getClass(), "customCounterNames", term88221);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSectionSummaryRowFormat", argTypes, term88079, args);
    }

};


