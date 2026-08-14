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

public class PrintStyleBuilder_isPrintTrailer_179232157532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86586;

    public PrintStyleBuilder_isPrintTrailer_179232157532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term86737 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term86736 = ((Class) term86737).getDeclaredField((String) "DETAILED");
        ((Field) term86736).setAccessible(true);
        Object enum294 = ((Field) term86736).get((Object) null);
        Class<? extends Object> term87053 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term87052 = ((Class) term87053).getDeclaredField((String) "SHORTER");
        ((Field) term87052).setAccessible(true);
        Object enum295 = ((Field) term87052).get((Object) null);
        Class<? extends Object> term87311 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term87310 = ((Class) term87311).getDeclaredField((String) "USER_TIME");
        ((Field) term87310).setAccessible(true);
        Object enum296 =  ((Field) term87310).get((Object) null);
        Class<? extends Object> term87520 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term87519 = ((Class) term87520).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term87519).setAccessible(true);
        Object enum297 =  ((Field) term87519).get((Object) null);
        Class<? extends Object> term87747 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term87746 = ((Class) term87747).getDeclaredField((String) "CPU_TIME");
        ((Field) term87746).setAccessible(true);
        Object enum298 =  ((Field) term87746).get((Object) null);
        ArrayList term86711 = new ArrayList();
        ((ArrayList) term86711).add(enum296);
        ((ArrayList) term86711).add(enum297);
        ((ArrayList) term86711).add(enum296);
        ((ArrayList) term86711).add(enum298);
        HashMap term86727 = new HashMap();
        term86586 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term86586, term86586.getClass(), "printFormat", enum294);
        setBooleanField(term86586, term86586.getClass(), "printHeader", false);
        setField(term86586, term86586.getClass(), "headerFormat", "pDkMNnAGgv");
        setBooleanField(term86586, term86586.getClass(), "printTrailer", true);
        setField(term86586, term86586.getClass(), "trailerFormat", "PaCpFXGzdX");
        setField(term86586, term86586.getClass(), "rowFormat", "FftYCNbnks");
        setField(term86586, term86586.getClass(), "sectionHeaderFormat", "lJoltmsadS");
        setBooleanField(term86586, term86586.getClass(), "printSectionSummary", true);
        setField(term86586, term86586.getClass(), "sectionSummaryRowFormat", "mvfDtZNEHr");
        setBooleanField(term86586, term86586.getClass(), "printSectionTrailer", false);
        setField(term86586, term86586.getClass(), "sectionTrailerFormat", "bvSgmFUDOU");
        setField(term86586, term86586.getClass(), "durationFormat", enum295);
        setBooleanField(term86586, term86586.getClass(), "printLegend", true);
        setField(term86586, term86586.getClass(), "simpleLine", "XMHwbfiHRl");
        setField(term86586, term86586.getClass(), "alternativeLine", "bucTnYicnp");
        setField(term86586, term86586.getClass(), "excludedTypes", term86711);
        setField(term86586, term86586.getClass(), "customCounterNames", term86727);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPrintTrailer", argTypes, term86586, args);
    }

};


