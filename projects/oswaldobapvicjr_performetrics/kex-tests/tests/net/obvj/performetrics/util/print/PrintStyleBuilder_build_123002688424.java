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

public class PrintStyleBuilder_build_123002688424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88296;

    public PrintStyleBuilder_build_123002688424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term88449 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term88448 = ((Class) term88449).getDeclaredField((String) "SUMMARIZED");
        ((Field) term88448).setAccessible(true);
        Object enum298 = ((Field) term88448).get((Object) null);
        Class<? extends Object> term88771 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term88770 = ((Class) term88771).getDeclaredField((String) "SHORTER");
        ((Field) term88770).setAccessible(true);
        Object enum299 = ((Field) term88770).get((Object) null);
        Class<? extends Object> term89029 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term89028 = ((Class) term89029).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term89028).setAccessible(true);
        Object enum300 =  ((Field) term89028).get((Object) null);
        Class<? extends Object> term89256 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term89255 = ((Class) term89256).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term89255).setAccessible(true);
        Object enum301 =  ((Field) term89255).get((Object) null);
        Class<? extends Object> term89471 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term89470 = ((Class) term89471).getDeclaredField((String) "USER_TIME");
        ((Field) term89470).setAccessible(true);
        Object enum302 =  ((Field) term89470).get((Object) null);
        ArrayList term88423 = new ArrayList();
        ((ArrayList) term88423).add(enum300);
        ((ArrayList) term88423).add(enum301);
        ((ArrayList) term88423).add(enum300);
        ((ArrayList) term88423).add(enum300);
        ((ArrayList) term88423).add(enum302);
        ((ArrayList) term88423).add(enum302);
        ((ArrayList) term88423).add(enum302);
        ((ArrayList) term88423).add(enum302);
        HashMap term88439 = new HashMap();
        term88296 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term88296, term88296.getClass(), "printFormat", enum298);
        setBooleanField(term88296, term88296.getClass(), "printHeader", false);
        setField(term88296, term88296.getClass(), "headerFormat", "fhZgTouhCC");
        setBooleanField(term88296, term88296.getClass(), "printTrailer", true);
        setField(term88296, term88296.getClass(), "trailerFormat", "wrikqJwXvL");
        setField(term88296, term88296.getClass(), "rowFormat", "UiWhvbypdr");
        setField(term88296, term88296.getClass(), "sectionHeaderFormat", "CgleElJNje");
        setBooleanField(term88296, term88296.getClass(), "printSectionSummary", false);
        setField(term88296, term88296.getClass(), "sectionSummaryRowFormat", "ZrchvNGMtd");
        setBooleanField(term88296, term88296.getClass(), "printSectionTrailer", true);
        setField(term88296, term88296.getClass(), "sectionTrailerFormat", "WaEcyVlcIx");
        setField(term88296, term88296.getClass(), "durationFormat", enum299);
        setBooleanField(term88296, term88296.getClass(), "printLegend", false);
        setField(term88296, term88296.getClass(), "simpleLine", "ONcbPCQnHd");
        setField(term88296, term88296.getClass(), "alternativeLine", "AobDaplFLl");
        setField(term88296, term88296.getClass(), "excludedTypes", term88423);
        setField(term88296, term88296.getClass(), "customCounterNames", term88439);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term88296, args);
    }

};


