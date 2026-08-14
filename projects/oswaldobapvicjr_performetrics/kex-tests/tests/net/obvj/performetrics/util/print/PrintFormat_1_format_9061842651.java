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

public class PrintFormat_1_format_9061842651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum22;
     Object term6377;

    public PrintFormat_1_format_9061842651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6531 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term6530 = ((Class) term6531).getDeclaredField((String) "SUMMARIZED");
        ((Field) term6530).setAccessible(true);
        enum22 = ((Field) term6530).get((Object) null);
        Class<? extends Object> term6793 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term6792 = ((Class) term6793).getDeclaredField((String) "SUMMARIZED");
        ((Field) term6792).setAccessible(true);
        Object enum23 = ((Field) term6792).get((Object) null);
        Class<? extends Object> term7115 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term7114 = ((Class) term7115).getDeclaredField((String) "FULL");
        ((Field) term7114).setAccessible(true);
        Object enum24 = ((Field) term7114).get((Object) null);
        Class<? extends Object> term7364 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term7363 = ((Class) term7364).getDeclaredField((String) "USER_TIME");
        ((Field) term7363).setAccessible(true);
        Object enum25 =  ((Field) term7363).get((Object) null);
        Class<? extends Object> term7573 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term7572 = ((Class) term7573).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term7572).setAccessible(true);
        Object enum26 =  ((Field) term7572).get((Object) null);
        Class<? extends Object> term7788 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term7787 = ((Class) term7788).getDeclaredField((String) "CPU_TIME");
        ((Field) term7787).setAccessible(true);
        Object enum27 =  ((Field) term7787).get((Object) null);
        Class<? extends Object> term7994 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term7993 = ((Class) term7994).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term7993).setAccessible(true);
        Object enum28 =  ((Field) term7993).get((Object) null);
        ArrayList term6501 = new ArrayList();
        ((ArrayList) term6501).add(enum25);
        ((ArrayList) term6501).add(enum26);
        ((ArrayList) term6501).add(enum26);
        ((ArrayList) term6501).add(enum27);
        ((ArrayList) term6501).add(enum28);
        ((ArrayList) term6501).add(enum28);
        ((ArrayList) term6501).add(enum25);
        HashMap term6521 = new HashMap();
        term6377 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyle"));
        setField(term6377, term6377.getClass(), "printFormat", enum23);
        setBooleanField(term6377, term6377.getClass(), "printHeader", false);
        setField(term6377, term6377.getClass(), "headerFormat", "SbAoxhfrkn");
        setBooleanField(term6377, term6377.getClass(), "printTrailer", true);
        setField(term6377, term6377.getClass(), "trailerFormat", "kuTXqwMtDB");
        setField(term6377, term6377.getClass(), "rowFormat", "Ghbwtircqb");
        setField(term6377, term6377.getClass(), "sectionHeaderFormat", "xrwlQZdwCp");
        setBooleanField(term6377, term6377.getClass(), "printSectionSummary", true);
        setField(term6377, term6377.getClass(), "sectionSummaryRowFormat", "IDCWpPLRkE");
        setBooleanField(term6377, term6377.getClass(), "printSectionTrailer", false);
        setField(term6377, term6377.getClass(), "sectionTrailerFormat", "nyiiPDVjAc");
        setField(term6377, term6377.getClass(), "durationFormat", enum24);
        setBooleanField(term6377, term6377.getClass(), "printLegend", false);
        setField(term6377, term6377.getClass(), "simpleLine", "aKnKipADSo");
        setField(term6377, term6377.getClass(), "alternativeLine", "wSQxaModmm");
        setField(term6377, term6377.getClass(), "excludedTypes", term6501);
        setField(term6377, term6377.getClass(), "customCounterNames", term6521);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintFormat$1");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("net.obvj.performetrics.TimingSessionContainer");
        argTypes[1] = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term6377;
        callMethod(klass, "format", argTypes, enum22, args);
    }

};


