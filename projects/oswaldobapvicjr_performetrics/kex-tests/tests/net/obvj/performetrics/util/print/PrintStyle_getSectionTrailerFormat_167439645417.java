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

public class PrintStyle_getSectionTrailerFormat_167439645417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51148;

    public PrintStyle_getSectionTrailerFormat_167439645417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term51303 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term51302 = ((Class) term51303).getDeclaredField((String) "SUMMARIZED");
        ((Field) term51302).setAccessible(true);
        Object enum173 = ((Field) term51302).get((Object) null);
        Class<? extends Object> term51625 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term51624 = ((Class) term51625).getDeclaredField((String) "SHORT");
        ((Field) term51624).setAccessible(true);
        Object enum174 = ((Field) term51624).get((Object) null);
        Class<? extends Object> term51877 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term51876 = ((Class) term51877).getDeclaredField((String) "CPU_TIME");
        ((Field) term51876).setAccessible(true);
        Object enum175 =  ((Field) term51876).get((Object) null);
        Class<? extends Object> term52083 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term52082 = ((Class) term52083).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term52082).setAccessible(true);
        Object enum176 =  ((Field) term52082).get((Object) null);
        Class<? extends Object> term52298 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term52297 = ((Class) term52298).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term52297).setAccessible(true);
        Object enum177 =  ((Field) term52297).get((Object) null);
        Class<? extends Object> term52525 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term52524 = ((Class) term52525).getDeclaredField((String) "USER_TIME");
        ((Field) term52524).setAccessible(true);
        Object enum178 =  ((Field) term52524).get((Object) null);
        ArrayList term51273 = new ArrayList();
        ((ArrayList) term51273).add(enum175);
        ((ArrayList) term51273).add(enum176);
        ((ArrayList) term51273).add(enum175);
        ((ArrayList) term51273).add(enum177);
        ((ArrayList) term51273).add(enum176);
        ((ArrayList) term51273).add(enum176);
        ((ArrayList) term51273).add(enum175);
        ((ArrayList) term51273).add(enum176);
        ((ArrayList) term51273).add(enum178);
        HashMap term51293 = new HashMap();
        term51148 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term51148, term51148.getClass(), "printFormat", enum173);
        setBooleanField(term51148, term51148.getClass(), "printHeader", false);
        setField(term51148, term51148.getClass(), "headerFormat", "TweMFhxNdj");
        setBooleanField(term51148, term51148.getClass(), "printTrailer", true);
        setField(term51148, term51148.getClass(), "trailerFormat", "NBrvVzvQHe");
        setField(term51148, term51148.getClass(), "rowFormat", "FjOiNAfBOc");
        setField(term51148, term51148.getClass(), "sectionHeaderFormat", "iCCsaLHohG");
        setBooleanField(term51148, term51148.getClass(), "printSectionSummary", true);
        setField(term51148, term51148.getClass(), "sectionSummaryRowFormat", "NJhGgctbdj");
        setBooleanField(term51148, term51148.getClass(), "printSectionTrailer", false);
        setField(term51148, term51148.getClass(), "sectionTrailerFormat", "MYWYUeLGOp");
        setField(term51148, term51148.getClass(), "durationFormat", enum174);
        setBooleanField(term51148, term51148.getClass(), "printLegend", true);
        setField(term51148, term51148.getClass(), "simpleLine", "tsTGdgQYUL");
        setField(term51148, term51148.getClass(), "alternativeLine", "TtGbVmKcnX");
        setField(term51148, term51148.getClass(), "excludedTypes", term51273);
        setField(term51148, term51148.getClass(), "customCounterNames", term51293);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSectionTrailerFormat", argTypes, term51148, args);
    }

};


