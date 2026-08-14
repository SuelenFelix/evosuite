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

public class PrintStyleBuilder_getPrintFormat_95833074625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89679;

    public PrintStyleBuilder_getPrintFormat_95833074625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term89834 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term89833 = ((Class) term89834).getDeclaredField((String) "SUMMARIZED");
        ((Field) term89833).setAccessible(true);
        Object enum303 = ((Field) term89833).get((Object) null);
        Class<? extends Object> term90156 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat");
        Field term90155 = ((Class) term90156).getDeclaredField((String) "SHORT");
        ((Field) term90155).setAccessible(true);
        Object enum304 = ((Field) term90155).get((Object) null);
        Class<? extends Object> term90408 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term90407 = ((Class) term90408).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term90407).setAccessible(true);
        Object enum305 =  ((Field) term90407).get((Object) null);
        Class<? extends Object> term90635 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term90634 = ((Class) term90635).getDeclaredField((String) "USER_TIME");
        ((Field) term90634).setAccessible(true);
        Object enum306 =  ((Field) term90634).get((Object) null);
        Class<? extends Object> term90844 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term90843 = ((Class) term90844).getDeclaredField((String) "CPU_TIME");
        ((Field) term90843).setAccessible(true);
        Object enum307 =  ((Field) term90843).get((Object) null);
        Class<? extends Object> term91050 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term91049 = ((Class) term91050).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term91049).setAccessible(true);
        Object enum308 =  ((Field) term91049).get((Object) null);
        ArrayList term89804 = new ArrayList();
        ((ArrayList) term89804).add(enum305);
        ((ArrayList) term89804).add(enum306);
        ((ArrayList) term89804).add(enum307);
        ((ArrayList) term89804).add(enum308);
        ((ArrayList) term89804).add(enum307);
        ((ArrayList) term89804).add(enum305);
        HashMap term89824 = new HashMap();
        term89679 = newInstance(Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder"));
        setField(term89679, term89679.getClass(), "printFormat", enum303);
        setBooleanField(term89679, term89679.getClass(), "printHeader", false);
        setField(term89679, term89679.getClass(), "headerFormat", "PaCpFXGzdX");
        setBooleanField(term89679, term89679.getClass(), "printTrailer", true);
        setField(term89679, term89679.getClass(), "trailerFormat", "FftYCNbnks");
        setField(term89679, term89679.getClass(), "rowFormat", "lJoltmsadS");
        setField(term89679, term89679.getClass(), "sectionHeaderFormat", "mvfDtZNEHr");
        setBooleanField(term89679, term89679.getClass(), "printSectionSummary", false);
        setField(term89679, term89679.getClass(), "sectionSummaryRowFormat", "bvSgmFUDOU");
        setBooleanField(term89679, term89679.getClass(), "printSectionTrailer", true);
        setField(term89679, term89679.getClass(), "sectionTrailerFormat", "XMHwbfiHRl");
        setField(term89679, term89679.getClass(), "durationFormat", enum304);
        setBooleanField(term89679, term89679.getClass(), "printLegend", true);
        setField(term89679, term89679.getClass(), "simpleLine", "bucTnYicnp");
        setField(term89679, term89679.getClass(), "alternativeLine", "EkgprvqZlM");
        setField(term89679, term89679.getClass(), "excludedTypes", term89804);
        setField(term89679, term89679.getClass(), "customCounterNames", term89824);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintStyleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrintFormat", argTypes, term89679, args);
    }

};


